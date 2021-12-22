<template>
  <router-view/>
</template>
<script>
export default {
  name: "App",
  beforeCreate() {
    document.querySelector("body").setAttribute("style","background:#E2E2E2FF")
  }
}
</script>
<style lang="stylus">


</style>
