<template>
  <div >
    <a-row v-for="item in dataList" v-bind:key="item.article_id" :gutter="[16,32]" @click="gotoContentPage(item.article_id)">
      <a-col :span="23">
        <a-card :title="item.a_name" :bordered="false" :hoverable="true">
          <p>{{item.description}}</p>
        </a-card>
      </a-col>
    </a-row>
<!--    <p v-for="(i,j) in dataList" v-bind:key="j">-->
<!--      {{i.a_name}}-&#45;&#45;&#45;&#45;{{j}}-->
<!--    </p>-->
    <DownOutlined @click="init" :style="{fontSize:'22px',margin:'10px auto',display:'block'}"/>
  </div>
</template>

<script>
import {DownOutlined } from '@ant-design/icons-vue';
import request from "../utils/request"
export default {
  name: "MainPage",
  setup(){
    return{
      iii:"121",
      dataList:[{
        "article_id":1,
        "description":'aaa',
        "a_name":"ccc"
      }],
      test:[1,2,3,4,5,6],
      value:"",
    }
  },
  beforeCreate() {
    this.init();
  },
  components: {
    DownOutlined
  },
  // computed:{
  //   a_List(){
  //     this.init();
  //     return this.dataList
  //   }
  // },
  methods:{
    gotoContentPage(iii){
      this.$router.push({path:"/content",query:{"id":iii}})
    },
    init(){
      request.get("/Article/query").then(res=>{
        console.log(res)
        if(res['msg']=="success"){
          for(let i in res['data']){
            this.dataList.push(res['data'][i])
          }
          console.log(this.dataList)
        }
      })
    }
  }
}
</script>

<style scoped>

</style>