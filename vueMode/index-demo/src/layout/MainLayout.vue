<template>
  <div >
    <a-layout class="out-layout" >

      <a-layout-header :style="{  width: '100%' ,background:'#ffffff'}">
        <div style="width: 94%;margin: auto">
          <a-menu
              theme="light"
              mode="horizontal"
              v-model:selectedKeys="selectedKeys"
              :style="{ lineHeight: '64px'}"
          >
            <a-menu-item disabled="false" key="0" style="cursor:default">
              <a-avatar  :size="40">
                <BugFilled style="color: #52c41a;font-size: 20px"/>
              </a-avatar>
            </a-menu-item>
            <a-menu-item key="1" @click="toMain">首页</a-menu-item>
            <a-menu-item key="2">关于我</a-menu-item>
            <a-menu-item key="3">归纳</a-menu-item>
            <a-menu-item key="4" selectable="false">
              <a-input-search
                v-model:value="vv"
                placeholder="input search text"
                style="width: 200px;margin-top: 15px"
                @search="onSearch"
              />
            </a-menu-item>
          </a-menu>
        </div>

      </a-layout-header>

      <div style="width: 84%;margin: 20px auto;">
<!--        <div style=" padding: 20px">-->
<!--          <a-row :gutter="16">-->
<!--            <a-col :span="16">-->
<!--              <a-card title="Card title" :bordered="false">-->
<!--                <p>card content</p>-->
<!--              </a-card>-->
<!--            </a-col>-->

<!--            <a-col :span="8">-->
<!--              <a-card title="Card title" :bordered="false">-->
<!--                <p>card content</p>-->
<!--                <p>card content</p>-->
<!--                <p>card content</p>-->

<!--              </a-card>-->
<!--            </a-col>-->

<!--          </a-row>-->
<!--        </div>-->
        <div style="float: left;width: 70%;">
          <router-view name="left" />
        </div>
        <div style="float: left;width: 30%;">
          <router-view name="right"/>
        </div>
      </div>

    </a-layout>
  </div>
</template>

<script>

import {
  BugFilled
} from '@ant-design/icons-vue';


export default {
  name: "MainLayout",
  data(){
    return{
      vv:"",
    }
  },
  methods:{
    toMain(){
      this.$router.push("/")
    },
    onSearch(){
      this.$router.push({path:"/MainPage",query:{"name":this.vv}})
    },
    unSelect(){
    }
  },
  components: {
    BugFilled
  },

}
</script>

<style scoped>
.out-layout{
  height: 100%;
}


</style>