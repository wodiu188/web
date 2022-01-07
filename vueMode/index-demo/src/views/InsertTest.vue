<template>
  <div>
    <a-input v-model:value="formTable.a_name" placeholder="标题" />
    <a-input v-model:value="formTable.description" placeholder="描述" />
    <el-select v-model="formTable.value1" multiple placeholder="Select">
      <el-option
          v-for="item in options"
          :key="item.type_id"
          :label="item.type_name"
          :value="item.type_id"
      >
      </el-option>
    </el-select>
    <a-textarea auto-size v-model:value="formTable.content" placeholder="内容" />
    <a-button type="primary" @click="insertAricle" block>Primary</a-button>
  </div>
</template>

<script>
// import request from "../utils/request";
import axios from "axios";
import request from "@/utils/request";

export default {
  name: "aaa",
  data(){
    return{
      formTable:{
        a_name:"",
        content:"",
        description:"",
        value1:[],
        options:[],
      }
    }
  },methods:{
      insertAricle(){

        var urls=new URLSearchParams();
        urls.append("a_name",this.formTable.a_name)
        urls.append("content",this.formTable.content)
        urls.append("description",this.formTable.description)
        urls.append("value",this.formTable.value1)
        console.log(this.formTable)
        // request.post("/Article/aaaa",
        //     urls).then(res=>{
        //   console.log(res)
        // })

        axios.post("/api/Article/aaaa",urls).then(res=>{
          console.log(res['data']);
          if(res['data']['code']==='0'){
            alert("成功")
          }else{
            alert("失败")
          }

          this.formTable.a_name=""
          this.formTable.content=""
          this.formTable.description=""
        })

      }
  },
  beforeCreate() {
    request.get("/Type/getAllType").then(res=>{
      this.options = res.data
      console.log(res.data)
    })
  }
}
</script>


<style scoped>

</style>