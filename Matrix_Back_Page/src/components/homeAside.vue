<template>
    <div id="homeAside">
      <el-menu :default-openeds="['1']" background-color="#303133" text-color="#ffffff">
        <el-submenu index="1">
          <template slot="title"><i class="el-icon-tickets"></i>文章管理</template>
          <el-menu-item index="1-1">写文章</el-menu-item>
          <el-menu-item index="1-2">文章管理</el-menu-item>
        </el-submenu>
        <el-submenu index="2">
          <template slot="title"><i class="el-icon-menu"></i>分类管理</template>
          <el-menu-item index="2-1">分类管理</el-menu-item>
          <el-menu-item index="2-2">标签管理</el-menu-item>
        </el-submenu>
        <el-submenu index="3">
          <template slot="title"><i class="el-icon-service"></i>用户管理</template>
          <el-menu-item index="3-1">新增用户</el-menu-item>
          <el-menu-item index="3-2">角色维护</el-menu-item>
          <el-menu-item index="3-3" v-on:click="toAccountManager">用户维护</el-menu-item>
        </el-submenu>
        <el-submenu index="4">
          <template slot="title"><i class="el-icon-setting"></i>系统管理</template>
          <el-menu-item index="4-1">系统设置</el-menu-item>
          <el-menu-item index="4-2">。。。</el-menu-item>
          <el-menu-item index="4-3">。。。</el-menu-item>
        </el-submenu>
      </el-menu>
    </div>
</template>

<script>
    export default {
      name: "homeAside",
      methods: {
        toAccountManager: function () {
          this.$parent.navMenu = ["用户管理","用户维护"];
          this.$router.push({path:'/system/account'})
        }
      }
    }
</script>

<style scoped>
  ul {
    border: 0;
  }

  i {
    color: #ffffff;
  }
</style>
