<template>
  <el-select v-model="selected" placeholder="Select" @change="show" >
    <el-option
        v-for="item in options"
        :key="item.article_id"
        :label="item.a_name"
        :value="item.a_name"
        :disabled="item.disabled"
    >
    </el-option>
  </el-select>

    <md-editor  v-model="value" style="height: 95vh" @onSave="onSave"/>

</template>

<script>
import axios from "axios";
import MdEditor from 'md-editor-v3';
import 'md-editor-v3/lib/style.css';
import request from "@/utils/request";
export default {
  name: "EditorArticle",
  data(){
    return{
      value:"# asdfadsfjhaji",
      options:[],
      selected:"",
    }
  },
  components: { MdEditor },
  beforeCreate(){
    request.get("/Article/query").then(res=>{
      console.log(res.data)
      this.options = res.data
    })
  },
  methods:{

    onSave(){
      var urls=new URLSearchParams();
      urls.append("a_name",this.selected)
      urls.append("content",this.value)
      axios.post("/api/Article/updateArticleByName",urls).then(res=>{
        console.log(res)
        if(res['data']['code']==='0'){
          alert("成功")
          this.show();
        }
      })

      console.log("onSave")

    },

    show(){
      console.log("change")
      request.get("/Article/queryByName?name="+this.selected).then(res=>{
        if(res['msg']=="success"){
          this.value=res['data']['content']
          this.$forceUpdate();
        }
      })
    }
  }
}
</script>

<style scoped>

</style>