<template>
  <div >
    <a-row :gutter="[16,32]" @click="gotoContentPage(this.iii)">
      <a-col :span="23">
        <a-card title="Card title" :bordered="false" :hoverable="true">
          <p>card content</p>
        </a-card>
      </a-col>
    </a-row>

    <a-row :gutter="[16,32]" @click="gotoContentPage(this.iii)">
      <a-col :span="23">
        <a-card title="Card title" :bordered="false" :hoverable="true">
          <p>card content</p>
        </a-card>
      </a-col>
    </a-row>

    <a-row :gutter="[16,32]" @click="gotoContentPage(this.iii)">
      <a-col :span="23">
        <a-card title="Card title" :bordered="false" :hoverable="true">
          <p>card content</p>
        </a-card>
      </a-col>
    </a-row>

    <a-row :gutter="[16,32]" @click="gotoContentPage(this.iii)">
      <a-col :span="23">
        <a-card title="Card title" :bordered="false" :hoverable="true">
          <p>card content</p>
        </a-card>
      </a-col>
    </a-row>

    <a-row :gutter="[16,32]" @click="gotoContentPage(this.iii)">
      <a-col :span="23">
        <a-card title="Card title" :bordered="false" :hoverable="true">
          <p>card content</p>
        </a-card>
      </a-col>
    </a-row>
    <a-row :gutter="[16,32]" @click="gotoContentPage(this.iii)">
      <a-col :span="23">
        <a-card title="Card title" :bordered="false" :hoverable="true">
          <p>card content</p>
        </a-card>
      </a-col>
    </a-row>
    <a-row :gutter="[16,32]" @click="gotoContentPage(this.iii)">
      <a-col :span="23">
        <a-card title="Card title" :bordered="false" :hoverable="true">
          <p>card content</p>
        </a-card>
      </a-col>
    </a-row>






    <DownOutlined :style="{fontSize:'22px',margin:'10px auto',display:'block'}"/>
  </div>
</template>

<script>
import {DownOutlined } from '@ant-design/icons-vue';

export default {
  name: "MainPage",
  setup(){
    return{
      iii:"121"
    }
  },
  components: {
    DownOutlined
  },
  methods:{
    gotoContentPage(iii){
      this.$router.push({path:"/content",query:{"id":iii}})
    }
  }
}
</script>

<style scoped>

</style>