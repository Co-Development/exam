<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html" charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=Edge">
<title>登录</title>
<link href="login.css" rel="stylesheet" type="text/css" />
</head>

<body>
<div class="main">
  <div class="login">
    <div class="login-nav">
      <p>考生登录</p>
    </div>
    <div class="login-from">
      <form id="login_form">
        <div class="login-text">
          <p>姓名</p>
        </div>
        <input type="text" name="examen_name" id="examen_name" class="enter">
        <div class="login-text">
          <p>所在部门</p>
        </div>
        <select name="examen_dpm" class="exam_dpm">
          <option value="办公室">办公室</option>
          <option value="教务处">教务处</option>
          <option value="学生处">学生处</option>
        </select>
        <input type="button" value="Login" class="button" id="submit">
      </form>
    </div>
  </div>
</div>

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