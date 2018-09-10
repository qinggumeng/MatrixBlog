<template>
  <div id="accountManager">
    <div id="top">
      <el-table
        :header-cell-style="handlerStyle"
        :data="tableData"
        height="100%">
        <el-table-column width="100" prop="avatar" label="头像" fixed></el-table-column>
        <el-table-column width="100" prop="username" label="登录名" fixed></el-table-column>
        <el-table-column width="100" prop="nickname" label="昵称" fixed></el-table-column>
        <el-table-column width="100" prop="realname" label="实名" fixed></el-table-column>
        <el-table-column width="100" prop="roleid" label="角色" fixed></el-table-column>

        <el-table-column width="100" prop="gender" label="性别"></el-table-column>
        <el-table-column width="100" prop="zipcode" label="邮政编码"></el-table-column>
        <el-table-column width="130" prop="birthday" label="生日"></el-table-column>
        <el-table-column width="150" prop="address" label="地址"></el-table-column>

        <el-table-column width="130" prop="mobile" label="手机号码"></el-table-column>
        <el-table-column width="130" prop="email" label="邮箱"></el-table-column>
        <el-table-column width="100" prop="signature" label="QQ号码"></el-table-column>
        <el-table-column width="100" prop="qq" label="微信"></el-table-column>
        <el-table-column width="100" prop="wechat" label="微博"></el-table-column>
        <el-table-column width="100" prop="weibo" label="FaceBook"></el-table-column>
        <el-table-column width="100" prop="linkedin" label="Linkedin"></el-table-column>

        <el-table-column width="150" prop="company" label="公司"></el-table-column>
        <el-table-column width="100" prop="occupation" label="职业"></el-table-column>
        <el-table-column width="100" prop="education" label="学历"></el-table-column>
        <el-table-column width="100" prop="graduateschool" label="毕业学校"></el-table-column>
        <el-table-column width="100" prop="idcardtype" label="证件类型"></el-table-column>
        <el-table-column width="130" prop="idcard" label="证件号码"></el-table-column>
        <el-table-column width="100" prop="status" label="用户状态"></el-table-column>
        <el-table-column width="100" prop="from" label="注册来源"></el-table-column>
        <el-table-column width="130" prop="createtime" label="创建时间"></el-table-column>
        <el-table-column width="130" prop="logged" label="最后登陆"></el-table-column>
      </el-table>
    </div>
    <div id="bottom">
      <el-pagination
        background
        layout="prev, pager, next"
        :total="1000">
      </el-pagination>
    </div>
  </div>
</template>

<script>
  export default {
    name: "AccountManager",
    data() {
      return {
        tableData: []
      }
    },
    mounted: function () {
      this.loadAccountData()
    },
    methods: {
      handlerStyle: function () {
        return {
          'line-height': '25px',
          'text-align': 'center'
        }
      },
      loadAccountData: function () {
        // this.$http.get('http://localhost:8088/').then(response => {
        //   console.log(response.data);
        // });
      }
    }
  }
</script>

<style scoped>
  #accountManager {
    height: 100%;
    position: relative;
  }

  #bottom {
    position:absolute;
    bottom:0;
    height:32px;
    width:100%;
  }

  #top {
    position:absolute;
    width:100%;
    overflow:auto;
    bottom:32px;
    top:0;
  }

  .el-table {
    width: 100%;
    height: auto;
  }
</style>
