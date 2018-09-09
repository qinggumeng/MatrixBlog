<template>
  <div id="homeContent">
    <div id="top">
      <el-breadcrumb separator-class="el-icon-arrow-right">
        <el-breadcrumb-item :to="{ path: '/' }">首页</el-breadcrumb-item>
      </el-breadcrumb>
    </div>
    <div id="bottom">
      <router-view></router-view>
    </div>
  </div>
</template>

<script>
  export default {
    name: "homeContent"
  }
</script>

<style scoped>
  #homeContent {
    height: 100%;
    padding: 50px 0 0;
    box-sizing: border-box;
  }

  #top {
    height: 50px;
    margin: -50px 0 0;
  }

  #bottom {
    height: 100%;
  }

  .el-breadcrumb {
    padding: 15px;
  }
</style>
