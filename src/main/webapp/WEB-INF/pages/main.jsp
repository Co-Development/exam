<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>后台</title>
</head>
<body>
<c:if test="${exam_finish == true}">
你已经考完啦！<br>
分数：${exam_score}
</c:if>
<c:if test="${exam_finish == false}">
<input type="button" value="开始考试">
</c:if>
</body>
</html>