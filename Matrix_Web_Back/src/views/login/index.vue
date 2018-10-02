<template>
  <div id="login">
    <div id="login-form">
      <h3>Matrix后台管理系统</h3>
      <el-form>
        <el-input placeholder="请输入用户名" v-model="input_username" clearable type="text" />
        <el-input placeholder="请输入密码" v-model="input_password" clearable type="password" />
        <el-button type="primary" @click="doLogin()">登录</el-button>
      </el-form>
    </div>
  </div>
</template>

<script>
  export default {
    name: "login",
    data() {
      return {
        input_username: "",
        input_password: ""
      };
    },
    methods: {
      doLogin() {
        var username = this.input_username;
        var password = this.input_password;
        $.ajax({
          type: 'POST',
          url: "",
          async: false,
          cache: false,
          dataType: 'json',
          data: {
            username: username,
            password: password
          },
          success: function(response) {
            
          }
        });
      }
    }
  };
</script>

<style>
  input,
  button {
    margin-top: 5px;
    margin-bottom: 5px;
    width: 100%;
  }
  
  #login-form {
    text-align: center;
    position: absolute;
    width: 300px;
    height: 200px;
    top: 50%;
    left: 50%;
    margin-top: -200px;
    margin-left: -150px;
  }
</style>
