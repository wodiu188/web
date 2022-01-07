<template>
  <el-tabs :tab-position="tabPosition" style="height: 70vh">
    <el-tab-pane v-for="e in labList" :label="e.name" :key="e.name">
      <el-card style="margin-top: 10px;cursor:pointer " v-for="k in e.data" class="box-card" :key="k.article_id" shadow="hover" @click="gotoContentPage(k.a_name)">
        {{k.a_name}}
      </el-card>
    </el-tab-pane>
    <!--    <el-tab-pane label="User">User</el-tab-pane>-->
<!--    <el-tab-pane label="Config">Config</el-tab-pane>-->
<!--    <el-tab-pane label="Role">Role</el-tab-pane>-->
<!--    <el-tab-pane label="Task">Task</el-tab-pane>-->
<!--    <el-tab-pane label="User">User</el-tab-pane>-->
<!--    <el-tab-pane label="Config">Config</el-tab-pane>-->
<!--    <el-tab-pane label="Role">Role</el-tab-pane>-->

  </el-tabs>
</template>

<script >

import request from "../utils/request"
export default {
  name: "RightSiderLabel",
  beforeCreate() {
    request.get("/Type/getAllType").then(res1=>{
      console.log(res1.data)
      // this.labList=res.data
      for(var i in res1.data){

        request.get("/Article/getArticleByType?id="+res1.data[i].type_id+"&name="+res1.data[i].type_name).then(res2=>{
          console.log(res2)
          console.log(i+":"+res1.data[i].type_name)
          this.labList.push({"name":res2.msg,"data":res2.data})

        })
      }
    })
  },
  data() {
    return {
      tabPosition:"left",
      labList:[],
      cardList:[],
    };
  },methods:{

      gotoContentPage(iii){
        this.$router.push({path:"/content",query:{"name":iii}})
      }

  }
}
</script>

<style scoped>

body{
  background: white;
}

</style>