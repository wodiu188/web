<template>
  <div>
    <a-row :gutter="[16,32]">
      <a-col :span="24">
        <a-card title="天道酬勤" :bordered="false">
          <p>{{code1}}</p>
          <p>{{code2}}</p>
          <p>{{code3}}</p>
        </a-card>
      </a-col>
    </a-row>

    <a-row :gutter="[16,32]" >
      <a-col :span="24">
        <a-card :bordered="false" :hoverable="true">
          <a-button type="primary buttonStyle" size="middle" shape="round">
            Java
          </a-button>
          <a-button type="primary buttonStyle" size="middle" shape="round">
            Python
          </a-button>
          <a-button type="primary buttonStyle" size="middle" shape="round">
            Spring
          </a-button>
          <a-button type="primary buttonStyle" size="middle" shape="round">
            Vue
          </a-button>
          <a-button type="primary buttonStyle" size="middle" shape="round">
            安全
          </a-button>

        </a-card>
      </a-col>
    </a-row>
  </div>
</template>

<script>
// import request from "@/utils/request";
import axios from "axios";

export default {
  name: "RightSider",
  data(){
    return{
      code1:"",
      code2:"",
      code3:"",
    }
  },mounted() {

    axios.get("/api/CodeApi").then(res=>{
      this.code1=res.data.data
    })
    axios.get("/api/CodeApi").then(res=>{
      this.code2=res.data.data
    })


  }
}
</script>

<style scoped>
.buttonStyle{
  margin:5px 5px;
}
</style>