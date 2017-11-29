<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>考试中</title>
</head>
<body>
<h3>单选题</h3>
<c:forEach items="${list1}" var="test1" varStatus="status">
	<h4>${status.count}、${test1.test_question}</h4>
	${test1.test_a} ${test1.test_b} ${test1.test_c} <br><br>
</c:forEach>
<c:forEach items="${list2}" var="test2" varStatus="status">
	<h4>${status.count+35}、${test2.test_question}</h4>
	${test2.test_a} ${test2.test_b} ${test2.test_c} ${test2.test_d}<br><br>
</c:forEach>
<h3>多选题</h3>
<c:forEach items="${list3}" var="test3" varStatus="status">
	<h4>${status.count+45}、${test3.test_question}</h4>
	${test3.test_a} ${test3.test_b} ${test3.test_c} ${test3.test_d}<br><br>
</c:forEach>
<h3>判断题</h3>
<c:forEach items="${list4}" var="test4" varStatus="status">
	<h4>${status.count+65}、${test4.test_question}（   ）</h4>
</c:forEach>
</body>
</html>