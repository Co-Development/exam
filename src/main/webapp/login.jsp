<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html" charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=Edge">
<title>登录</title>
<link href="login.css" rel="stylesheet" type="text/css" />
<script src="http://apps.bdimg.com/libs/jquery/1.10.2/jquery.min.js"></script>
</head>

<body>

<div class="top">
	
</div>
<div class="center">
  <form id="login_form">
          
       	 姓名:<input type="text" name="examen_name" id="examen_name" class="enter">
       	  所在部门:
        <select name="examen_dpm" class="exam_dpm">
          <option value="非党员干部">非党员干部</option>
          <option value="公共课教学部教工支部">公共课教学部教工支部</option>
          <option value="护理学院教工支部">护理学院教工支部</option>
          <option value="机电工程学院教工支部">机电工程学院教工支部</option>
          <option value="机关第一支部">机关第一支部</option>
          
          <option value="机关第二支部">机关第二支部</option>
          <option value="机关第三支部">机关第三支部</option>
          <option value="机关第四支部">机关第四支部</option>
          <option value="机关第五支部">机关第五支部</option>
          <option value="机关第六支部">机关第六支部</option>
          
          <option value="继续教育学院教工支部">继续教育学院教工支部</option>
          <option value="建筑工程学院教工支部">建筑工程学院教工支部</option>
          <option value="经济管理学院教工支部">经济管理学院教工支部</option>
          <option value="农业经济技术学院教工支部">农业经济技术学院教工支部</option>
          <option value="师范学院教工支部">师范学院教工支部</option>
          
          <option value="思想政治理论课教学科研部教工支部">思想政治理论课教学科研部教工支部</option>
          <option value="文化旅游学院教工支部">文化旅游学院教工支部</option>
          <option value="信息工程学院教工支部">信息工程学院教工支部</option>
          <option value="学前教育学院教工支部">学前教育学院教工支部</option>
          <option value="艺术学院教工支部">艺术学院教工支部</option>
          
          <option value="中专部教工支部">中专部教工支部</option>
        </select></br></br>
        	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        	<input type="button" value="登录" class="button" id="submit">
      </form>
</div>
<div class="blank">
</div>
<div class="bottom"></div>
<!-- <div class="main">
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
          <option value="非党员干部">非党员干部</option>
          <option value="公共课教学部教工支部">公共课教学部教工支部</option>
          <option value="护理学院教工支部">护理学院教工支部</option>
        </select>
        <input type="button" value="登录" class="button" id="submit">
      </form>
    </div>
  </div>
</div> -->

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