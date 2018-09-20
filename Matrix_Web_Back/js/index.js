/**
 * 初始化LayUi
 */
var element;
layui.use('element', function () {
    element = layui.element;
});
/**
 * 页面加载执行
 */
$(function () {
    refreshNowTime();
    setStyle();
});
/**
 * 动态设置样式
 */
function setStyle(){
    var maxIframeHeight = $("#layui-body").height() - 10;
    $("#main_body").attr("height", maxIframeHeight);
}
/**
 * 刷新右上角实时日期时间
 */
function refreshNowTime() {
    setInterval(function () {
        const nowDate = new Date();
        const date = nowDate.getFullYear() + "年" + this.padDate(nowDate.getMonth()) + "月" + this.padDate(nowDate.getDate()) + "日";
        const time = this.padDate(nowDate.getHours()) + "时" + this.padDate(nowDate.getMinutes()) + "分" + this.padDate(nowDate.getSeconds()) + "秒";
        const week = ["星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"][nowDate.getDay()];
        $("#nowTime").html(date + " " + time + " " + week);
    }, 100);
}
/**
 * 数字不足两位补零，用于格式化日期
 * @param {要转换的数字} pad 
 */
function padDate(pad) {
    if (pad < 10) {
        return "0" + pad;
    }
    return pad;
}
/**
 * 跳转到用户维护界面
 * 设置iframe路径并更改面包屑导航
 */
function toAccountManager() {
    $("#main_body").attr("src","page/account/list.html");
    $("#nav-breadcrumb").html("<a href=''>首页</a><a href=''>用户管理</a><a><cite>用户维护</cite></a>");
    element.render('breadcrumb', 'main-breadcrumb');
}