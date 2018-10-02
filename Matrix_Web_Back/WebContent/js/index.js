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
function setStyle() {
    $("#layui-body").css("height", $("#left-nav").css("height"));
    var height = parseInt($('#layui-body').css('height')) - parseInt($('.layui-tab-title').css('height')) - 1;
    $('.layui-tab-content').css('height', height);
    $('.layui-tab-item').css('height', height);
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
 * 浏览器窗口大小改变时更新样式
 */
window.onresize = function () {
    setStyle();
}
/**
 * 跳转到用户维护界面
 * 新增tab标签页
 */
function toAccountManager() {
    element.tabDelete('menu-tab', 'tab-account-manager');
    element.tabAdd('menu-tab', {
        title: '用户维护'
        , content: "<iframe src='page/account/list.html' name='main_body' id='main_body' width='100%'' height='100%'' scrolling='no' frameborder='0'></iframe>"
        , id: 'tab-account-manager'
    });
    setStyle();
    element.tabChange('menu-tab', 'tab-account-manager');
}