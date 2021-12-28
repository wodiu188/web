<template>
  <div >
    <a-row :gutter="16">
      <a-col :span="23">
        <a-card :bordered="false" >
          <div v-html="htms" class="markdown-body"></div>
        </a-card>
      </a-col>
    </a-row>
  </div>
</template>

<script>
import request from "../utils/request"
import showdown from "showdown"

let converter = new showdown.Converter();
converter.setOption('tables', true);    // 将表格显示出来
export default {
  name: "ContentPage",
  data(){
    return{
      htms: ""
    }
  },

  beforeCreate() {
    var data = this.$route.query.name
    console.log("----------------");
    console.log(data)

    request.get("/Article/queryByName?name="+data).then(res=>{
      if(res['msg']=="success"){
        console.log("----------------");
        console.log(this.htms);
        this.htms=converter.makeHtml(res['data']['content'])
        console.log(this.htms);
        this.$forceUpdate();
      }
    })
  }
  ,methods:{
  }

}




</script>

<style scoped>
@import '../css/markdown.css';
</style>