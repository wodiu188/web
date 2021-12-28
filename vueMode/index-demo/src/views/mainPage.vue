<template>
  <div >

    <a-row  v-for="item in dataList" v-bind:key="item.article_id" :gutter="[16,32]" @click="gotoContentPage(item.a_name)">
      <a-col :span="23">
        <a-card :title="item.a_name" :bordered="false" :hoverable="true">
          <p>{{item.description}}</p>
        </a-card>
      </a-col>
    </a-row>
<!--    <p v-for="(i,j) in dataList" v-bind:key="i.article_id" :f="flag">-->
<!--      {{i.a_name}}-&#45;&#45;&#45;&#45;{{j}}-->
<!--    </p>-->
<!--    <DownOutlined @click="putData" :style="{fontSize:'22px',margin:'10px auto',display:'block'}"/>-->
  </div>
</template>

<script>
// import {DownOutlined } from '@ant-design/icons-vue';
import request from "../utils/request"
export default {
  name: "MainPage",
  data(){
    return{
      iii:"121",
      dataList:[],
      test:[1,2,3,4,5,6],
      value:"",
      flag:0,
    }
  },
  watch:{
    $route:{
      handler(){
        console.log(this.$route.query)
        if(this.$route.query.name !== undefined&&this.$route.query.name != null && this.$route.query.name !== ''){
          this.getdataList("/Article/queryByDescription?name="+this.$route.query.name);
        }
      },deep:true
    }
  },
  mounted() {
    this.getdataList("/Article/query");
  },
  components: {
    // DownOutlined
  },
  // computed:{
  //   a_List(){
  //     this.init();
  //     return this.dataList
  //   }
  // },
  methods:{
    gotoContentPage(iii){
      this.$router.push({path:"/content",query:{"name":iii}})
    },
    getdataList(url){

      request.get(url).then(res=>{
        console.log(res)
        if(res['msg']=="success"&&res.data.length!==0){
          this.dataList=res['data']
          console.log(this.dataList)
          //让页面强制刷新
          this.$forceUpdate();
        }
        if(res.data.length===0){
          this.getdataList("/Article/query");
        }
      })

    }
    // , init_data(){
    //   request.get("/Article/query").then(res=>{
    //     console.log(res)
    //     if(res['msg']=="success"){
    //       for(let i in res['data']){
    //         this.dataList.push(res['data'][i])
    //       }
    //       console.log(this.dataList)
    //     }
    //   })
    //   this.$forceUpdate();
    // },
    // putData(){
    //   this.dataList.push({
    //     "article_id":2,
    //     "description":'aaa',
    //     "a_name":"ccc"
    //   })
    //   console.log(this.dataList)
    //   this.flag+=1
    //   this.$forceUpdate();
    // }
  }
}
</script>

<style scoped>

</style>