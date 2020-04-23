$(function () {
    //菜单栏
    dataRequest();
});


function dataRequest() {
    ajaxData("/sys/header");
}


function menuCallback(msg) {
    $.each(msg,function (key,value) {
        var text = "";
        if(value.menuStatus == 1){
            text = text + "<li class=\'have_second\'><a href=\'javascript:;\'>" + value.menuName + "</a><ul class=\'nav_second\'><i></i>";
            $.each(value.menuList,function (key,value1) {
                text = text + "<li><a href=" + value1.menuUrl +">" + value1.menuName  + "</a></li>"
            });
            text = text + "</ul></li>";
        }else{
            text = text +  "<li><a href=" + value.menuUrl +">" + value.menuName  + "</a></li>"
        }
        $(".data_clearfix").append(text);
    });
}


function ajaxData(url) {
    $.ajax({
        url: url,
        type: "get",
        dataType: "json",
        success: function (data) {
            if(data.status == "success"){
                //数据回调
                menuCallback(data.message);
            }
        }
    });
}