//教师界面

//加载页面
$(document).ready(function (){
    GetStudentName();//拦截教师未登录*/
});

//检测是否登录
function GetStudentName() {
    $.ajax({
        url: "teacherName.action",
        type: "post",
        dataType: "json",
        success: function (data) {
            var json = eval(data);//json为接收的后台返回的数据；
            if(json.name =="no") {
                $.messager.alert('温馨提示','您还未登录!','info',function () {
                    window.location.href="../html/login.html";
                });
            } else {
                $("#teacherName").text('欢迎您,' + json.name);
            }
        },
        error: function () {
            alert("error");
        }
    });
}

function gotoIndex() {
    window.location.href="../html/login.html";
}
