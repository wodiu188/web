<template>

  <div >
    <a-row :gutter="16">
      <a-col :span="23">
        <a-card :bordered="false" >
<!--          <div v-html="htms" class="markdown-body"></div>-->
          <md-editor  v-model="value" previewOnly="true"/>
        </a-card>
      </a-col>
    </a-row>
  </div>
</template>

<script>
import request from "../utils/request"
//另一个markdown工具
// import showdown from "showdown"
//
// let converter = new showdown.Converter();
// converter.setOption('tables', true);    // 将表格显示出来
import MdEditor from 'md-editor-v3';
import 'md-editor-v3/lib/style.css';

export default {
  name: "ContentPage",
  data(){
    return{
      htms: "",
      value:"",
    }
  },
  components: { MdEditor },
  beforeCreate() {
    var data = this.$route.query.name
    request.get("/Article/queryByName?name="+data).then(res=>{
      if(res['msg']=="success"){
        this.value=res['data']['content']
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