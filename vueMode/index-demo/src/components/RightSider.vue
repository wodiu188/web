<template>
  <div>
    <a-row :gutter="[16,32]">
      <a-col :span="24">
        <a-card title="Card title" :bordered="false" :hoverable="true">
          <p>card cont enta dsfhaisu fhadsi bauisfhias udhfkjasdb kfjgasdg fnas dvmd hasgf jhsak jdfh kas djfh</p>
        </a-card>
      </a-col>
    </a-row>

    <a-row :gutter="[16,32]" >
      <a-col :span="24">
        <a-card :bordered="false" :hoverable="true">
          <a-button type="primary" size="large" shape="round">
            Download
          </a-button>
        </a-card>
      </a-col>
    </a-row>
  </div>
</template>

<script>
export default {
  name: "RightSider"
}
</script>

<style scoped>

</style>