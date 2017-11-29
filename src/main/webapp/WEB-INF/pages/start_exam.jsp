<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>考试中</title>
<script src="http://apps.bdimg.com/libs/jquery/1.10.2/jquery.min.js"></script>
</head>
<body>
<form id="exam_form">

<h3>单选题</h3>
<c:forEach items="${list1}" var="test1" varStatus="status">
	<h4>${status.count}、${test1.test_question}</h4>
	<input name="x1_${status.count}" type="radio" value="${test1.test_a}">A.${test1.test_a} 
	<input name="x1_${status.count}" type="radio" value="${test1.test_b}">B.${test1.test_b} 
	<input name="x1_${status.count}" type="radio" value="${test1.test_c}">C.${test1.test_c} <br><br>
	<input name="y1_${status.count}" type="hidden" value="${test1.test_right}">
</c:forEach>

<c:forEach items="${list2}" var="test2" varStatus="status">
	<h4>${status.count+35}、${test2.test_question}</h4>
	<input name="x1_${status.count+35}" type="radio" value="${test2.test_a}">A.${test2.test_a} 
	<input name="x1_${status.count+35}" type="radio" value="${test2.test_b}">B.${test2.test_b} 
	<input name="x1_${status.count+35}" type="radio" value="${test2.test_c}">C.${test2.test_c} 
	<input name="x1_${status.count+35}" type="radio" value="${test2.test_d}">D.${test2.test_d} <br><br>
	<input name="y1_${status.count+35}" type="hidden" value="${test2.test_right}">
</c:forEach>

<h3>多选题</h3>
<c:forEach items="${list3}" var="test3" varStatus="status">
	<h4>${status.count+45}、${test3.test_question}</h4>
	<input name="x2_${status.count+45}" type="checkbox" value="${test3.test_a}">A.${test3.test_a} 
	<input name="x2_${status.count+45}" type="checkbox" value="${test3.test_b}">B.${test3.test_b} 
	<input name="x2_${status.count+45}" type="checkbox" value="${test3.test_c}">C.${test3.test_c} 
	<input name="x2_${status.count+45}" type="checkbox" value="${test3.test_d}">D.${test3.test_d} <br><br>
	<input name="y2_${status.count+45}" type="hidden" value="${test3.test_right}">
</c:forEach>

<h3>判断题</h3>
<c:forEach items="${list4}" var="test4" varStatus="status">
	<h4>${status.count+65}、${test4.test_question} 
		<input name="x3_${status.count+65}" type="radio" value="1">√
		<input name="x3_${status.count+65}" type="radio" value="0">×
		<input name="y3_${status.count+65}" type="hidden" value="${test4.test_result}">
	</h4>
</c:forEach>

<br>
<input id="submit" type="button" value="交卷">

</form>
<!-- login request -->
<script type="text/javascript">
$('#submit').on('click', function(){
	// ajax提交表单
	$.ajax({
		type:'POST',
		async:false,
		url:'/examen/testSubmit',
		data:$('#exam_form').serialize(),
		dataType:'json',
		success:function(data){
			if(data.state == '1') {
				location.href=data.url;
			} else {
				alert('请做完每到题目！');
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