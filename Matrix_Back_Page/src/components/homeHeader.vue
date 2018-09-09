<template>
  <div id="homeHeader">
    <label id="title">Matrix 博客后台管理系统</label>
    <div id="nowTime">{{ now.nowDate }} {{ now.nowTime }} {{ now.nowWeek }}</div>
    <img id="portrait" src="/static/img/user_jason.png"/>
    <el-dropdown id="loginUser">
      <span class="el-dropdown-link">
        JasonFu
        <i class="el-icon-arrow-down el-icon--right"></i>
      </span>
      <el-dropdown-menu slot="dropdown">
        <el-dropdown-item>注销</el-dropdown-item>
        <el-dropdown-item>重新登陆</el-dropdown-item>
        <el-dropdown-item>修改密码</el-dropdown-item>
      </el-dropdown-menu>
    </el-dropdown>
  </div>
</template>

<script>
  export default {
    name: "homeHeader",
    data() {
      return {
        now: {
          nowDate: '2000年01月14日',
          nowTime: '20时13分14秒',
          nowWeek: '星期五'
        }
      }
    },
    mounted: function () {
      this.changeNowTime();
    },
    methods: {
      changeNowTime() {
        const _this = this;
        setInterval(function () {
          const nowDate = new Date();
          const date = nowDate.getFullYear() + "年" + _this.padDate(nowDate.getMonth()) + "月" + _this.padDate(nowDate.getDate()) + "日";
          const time = _this.padDate(nowDate.getHours()) + "时" + _this.padDate(nowDate.getMinutes()) + "分" + _this.padDate(nowDate.getSeconds()) + "秒";
          const week = ["星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"][nowDate.getDay()];
          _this.$set(_this.now, 'nowDate', date);
          _this.$set(_this.now, 'nowTime', time);
          _this.$set(_this.now, 'nowWeek', week);
        }, 500);
      },
      padDate(pad) {
        if (pad < 10) {
          return "0" + pad;
        }
        return pad;
      }
    }
  };
</script>

<style scoped>
  #homeHeader {
    height: 100%;
    align-items: center;
    display: flex;
  }

  #title {
    font-size: 20px;
    font-weight: bold;
  }

  #loginUser {
    margin-left: 5px;
  }

  #portrait {
    width: 30px;
    height: 30px;
    border-radius: 100px;
    margin-left: 20px;
  }

  #nowTime {
    margin-left: auto;
  }

  .el-dropdown, #nowTime {
    font-size: 15px;
    color: #EBEEF5;
  }
</style>
