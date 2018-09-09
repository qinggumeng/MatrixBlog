<template>
  <el-container>
    <el-header>
      <mainHeader></mainHeader>
    </el-header>
    <el-container>
      <el-aside width="200px">
        <main-aside></main-aside>
      </el-aside>
      <el-container>
        <el-main>
          <main-content></main-content>
        </el-main>
        <el-footer height="20px">
          <main-footer></main-footer>
        </el-footer>
      </el-container>
    </el-container>
  </el-container>
</template>

<script>
import MainHeader from './components/homeHeader'
import MainFooter from './components/homeFooter'
import MainContent from  './components/homeContent'
import MainAside from './components/homeAside'
export default {
  name: 'App',
  components: {
    mainHeader: MainHeader,
    mainFooter: MainFooter,
    mainContent: MainContent,
    mainAside: MainAside
  }
}
</script>

<style>
  .el-container {
    height: 100%;
    margin: 0px;
    padding: 0px;
  }

  .el-header {
    background-color: #303133;
    color: #EBEEF5;
    text-align: center;
  }

  .el-aside {
    background-color: #303133;
    color: #EBEEF5;
    text-align: left;
  }

  .el-main {
    background-color: #E9EEF3;
    color: #333;
    text-align: center;
    line-height: 160px;
  }

  .el-footer {
    background-color: #E9EEF3;
    color: #333;
    text-align: center;
  }
</style>
