<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>考生登录</title>
<script src="http://apps.bdimg.com/libs/jquery/1.10.2/jquery.min.js"></script>
</head>
<body>
<form id="login_form">
姓名：<input id="examen_name" name="examen_name"><br>
所在部门：
<select name="examen_dpm">
	<option value="办公室">办公室</option>
	<option value="教务处">教务处</option>
	<option value="学生处">学生处</option>
</select>
<br>
<input id="submit" type="button" value="登录">
</form>
<!-- login request -->
<script type="text/javascript">
$('#submit').on('click', function(){
	// 验证登录数据
	var examen_name = $('#examen_name').val();
	if(examen_name == '') {
		alert("姓名不能为空！");
		$('#examen_name').focus();
		return;
	}
	// ajax提交表单
	$.ajax({
		type:'POST',
		async:false,
		url:'/examen/login',
		data:$('#login_form').serialize(),
		dataType:'json',
		success:function(data){
			if(data.state == '1') {
				location.href=data.url;
			} else {
				alert('登录信息有误！');
			}
		},
		error:function(XMLHttpRequest, textStatus, errorThrown){
			alert(textStatus+XMLHttpRequest.status);  
		}
	});
});
</script>
</body>
</html>