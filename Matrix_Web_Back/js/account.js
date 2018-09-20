layui.use(['table', 'laypage', 'layer'], function () {
    var table = layui.table;
    var element = layui.element;
    var layer = layui.layer;
    var laydate = layui.laydate;
    var laypage = layui.laypage;
    layui.$.support.cors = true;
    table.render({
        elem: '#data-table'
        , height: 'full-20'
        , url: 'http://localhost:10060/back/account/getPageByExample'
        , page: true
        , toolbar: 'default'
        , request: {
            pageName: 'page'
            , limitName: 'rows'
        }
        , cols: [[
            { type: 'checkbox', fixed: 'left' }
            , { field: 'id', title: 'ID', width: '50' }
            , { field: 'username', title: '用户名', width: '100' }
            , { field: 'nickname', title: '昵称', width: '100' }
            , { field: 'roleid', title: '权限', width: '100' }
            , { field: 'realname', title: '真实姓名', width: '100' }
            , {
                field: 'idcardtype', title: '证件类型', width: '100', templet: function (data) {
                    if (data.idcardtype == 1)
                        return '身份证'
                    else if (data.idcardtype == 2)
                        return '护照'
                    else if (data.idcardtype == 3)
                        return '军官证'
                    else
                        return ''
                }
            }
            , { field: 'idcard', title: '证件号码', width: '175' }
            , { field: 'address', title: '地址', width: '130' }
            , { field: 'zipcode', title: '邮政编码', width: '100' }
            , {
                field: 'birthday', title: '生日', width: '140', templet: function (data) {
                    var date = new Date(data.birthday);
                    var Y = date.getFullYear() + '年';
                    var M = (date.getMonth() + 1 < 10 ? '0' + (date.getMonth() + 1) : date.getMonth() + 1) + '月';
                    var D = date.getDate() + '日';
                    var dateStr = Y + M + D;
                    return dateStr;
                }
            }
            , {
                field: 'gender', title: '性别', width: '60', templet: function (data) {
                    if (data.gender == 1)
                        return '男'
                    else if (data.gender == 2)
                        return '女'
                    else
                        return ''
                }
            }
            , { field: 'mobile', title: '手机号', width: '100' }
            , { field: 'email', title: '邮箱', width: '100' }
            , { field: 'qq', title: 'QQ', width: '100' }
            , { field: 'wechat', title: '微信', width: '100' }
            , { field: 'weibo', title: '微博', width: '100' }
            , { field: 'signature', title: '个性签名', width: '100' }
            , { field: 'company', title: '公司', width: '100' }
            , { field: 'occupation', title: '职业', width: '100' }
            , { field: 'education', title: '学历', width: '100' }
            , { field: 'graduateschool', title: '毕业学校', width: '100' }
            , {
                field: 'from', title: '来源', width: '100', templet: function (data) {
                    if (data.from == 1)
                        return '后台添加'
                    else if (data.from == 2)
                        return '自行注册'
                    else
                        return ''
                }
            }
            , {
                field: 'createtime', title: '创建时间', width: '150', templet: function (data) {
                    var date = new Date(data.createtime);
                    var Y = date.getFullYear() + '年';
                    var M = (date.getMonth() + 1 < 10 ? '0' + (date.getMonth() + 1) : date.getMonth() + 1) + '月';
                    var D = date.getDate() + '日';
                    var h = date.getHours() + '时';
                    var m = date.getMinutes() + '分';
                    var s = date.getSeconds() + '秒';
                    var dateStr = Y + M + D + h + m + s;
                    return dateStr;
                }
            }
            , {
                field: 'logged', title: '上次登录', width: '150', templet: function (data) {
                    var date = new Date(data.logged);
                    var Y = date.getFullYear() + '年';
                    var M = (date.getMonth() + 1 < 10 ? '0' + (date.getMonth() + 1) : date.getMonth() + 1) + '月';
                    var D = date.getDate() + '日';
                    var h = date.getHours() + '时';
                    var m = date.getMinutes() + '分';
                    var s = date.getSeconds() + '秒';
                    var dateStr = Y + M + D + h + m + s;
                    return dateStr;
                }
            }
            , {
                field: 'status', title: '状态', width: '100', templet: function (data) {
                    if (data.status == 1)
                        return '正常'
                    else if (data.status == 2)
                        return '冻结'
                    else if (data.status == 3)
                        return '删除'
                    else if (data.status == 4)
                        return '未激活'
                    else
                        return ''
                }
            }
            , { field: 'avatar', title: '头像', width: '100' }
        ]]
    });

    table.on('toolbar(data-table)', function (obj) {
        var checkStatus = table.checkStatus(obj.config.id)
        var data = checkStatus.data;
        switch (obj.event) {
            case 'add':
                layer.msg('添加');
                break;
            case 'update':
                if (data.length === 0) {
                    layer.msg('请选择一行');
                } else if (data.length > 1) {
                    layer.msg('只能同时编辑一个');
                } else {
                    layer.alert('编辑 [id]：' + checkStatus.data[0].id);
                }
                break;
            case 'delete':
                if (data.length === 0) {
                    layer.msg('请选择一行');
                } else {
                    layer.msg('删除' + checkStatus.data[0].id);
                }
                break;
        };
    });
});