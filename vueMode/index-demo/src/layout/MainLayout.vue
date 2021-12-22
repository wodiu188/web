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

            <a-menu-item key="1">nav 1</a-menu-item>
            <a-menu-item key="2">nav 2</a-menu-item>
            <a-menu-item key="3">nav 3</a-menu-item>
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
          <router-view name="left"/>
        </div>
        <div style="float: left;width: 30%;">
          <router-view name="right"/>
        </div>
      </div>

    </a-layout>
  </div>
</template>

<script>
export default {
  name: "MainLayout"
}
</script>

<style scoped>
.out-layout{
  height: 100%;
}


</style>