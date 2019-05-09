//试卷界面

//加载页面
$(document).ready(function (){
    selectExam();
    $("#p9").css('display','none');//隐藏
    $("#p10").css('display','none');//隐藏
});

function createExam() {
    $("#allQuestion").textbox('setValue',"");
    $("#examName").textbox('setValue',"");
    $("#subject").textbox('setValue',"");
    $("#book").textbox('setValue',"");
    $("#chapter").textbox('setValue',"");
    $("#singleScore").textbox('setValue',"");
    $("#p9").css('display','block');
}

function addQuestion() {
    $("#mytab").text("");
    $.ajax({
        url: "seekAll.action",
        type: "post",
        dataType: "json",
        success: function (data) {
            var dataObj = eval(data);//json为接收的后台返回的数据；
            var $tab1 = $("#mytab");
            for (i = 0; i < dataObj.length; i++) {
                $("#mytab").append(
                    "<tr>" +
                    "<td><input type=\"checkbox\" name=\"id\" value="+dataObj[i].id+" /></td><td>"+dataObj[i].id+"</td>" +
                    "<td>"+dataObj[i].question+"</td>" +
                    "<td>"+dataObj[i].subject+"</td>" +
                    "<td>"+dataObj[i].book+"</td>" +
                    "<td>"+dataObj[i].chapter+"</td>" +
                    "<td>"+dataObj[i].difficulty+"</td></tr>");
            }
        },
        error: function () {
            alert("error");
        }
    });
    $("#p10").css('display','block');
}

function closeQuestion() {
    $("#p10").css('display','none');
}

function closeExam() {
    $("#p9").css('display','none');
}

function addQuestion2() {
    var s='';
    $('input[name="id"]:checked').each(function(){
        s+=$(this).val()+',';
    });
    $.messager.confirm('温馨提示','确定把试题添加到试卷中?',function(r){
        if (r){
            s = s.substring(0, s.length - 1);
            $("#allQuestion").textbox('setValue',s)//赋值
            $("#p10").css('display','none');
        }
    });
}

function sureQuestion() {
    var examName = $("#examName").val();
    var subject = $("#subject").val();
    var book = $("#book").val();
    var chapter = $("#chapter").val();
    var singleScore = $("#singleScore").val();
    var allQuestion = $("#allQuestion").val();

    var data = {    "name":examName,
                    "singleScore":singleScore,
                    "subject":subject,
                    "book":book,
                    "chapter":chapter,
                    "question":allQuestion,
                };

    $.ajax({
        url: "addExam.action",
        type: "post",
        data: JSON.stringify(data),
        contentType:"application/json",
        dataType: "json",
        success: function (data) {
            $.messager.alert('温馨提示','添加成功');
        },
        error: function () {
            alert("error");
        }
    });
}

function selectExam() {
    $("#mytab1").text("");
    var selectExam = $("#selectExam").val();
    var data = {    "selectExam":selectExam
                };
    $.ajax({
        url: "selectExam.action",
        type: "post",
        data: JSON.stringify(data),
        contentType:"application/json",
        dataType: "json",
        success: function (data) {
            var dataObj = eval(data);//json为接收的后台返回的数据；
            var $tab1 = $("#mytab1");
            for (i = 0; i < dataObj.length; i++) {
                $("#mytab1").append(
                    "<tr>" +
                    "<td>"+dataObj[i].id+"</td>" +
                    "<td>"+dataObj[i].name+"</td>" +
                    "<td>"+dataObj[i].createDate+"</td>" +
                    "<td>"+dataObj[i].totalScore+"</td>" +
                    "<td>"+dataObj[i].person+"</td>" +
                    "<td>"+dataObj[i].subject+"</td>" +
                    "<td>"+dataObj[i].book+"</td>" +
                    "<td>"+dataObj[i].chapter+"</td>" +
                    "<td>"+dataObj[i].question+"</td>" +
                    "<td>"+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<button class=\"layui-btn\" onclick=\"addQuestion()\">修改</button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" +
                    "<button class=\"layui-btn layui-btn-warm\" onclick=\"addQuestion()\">删除</button>"+"</td></tr>");
            }
        },
        error: function () {
            alert("error");
        }
    });
}
