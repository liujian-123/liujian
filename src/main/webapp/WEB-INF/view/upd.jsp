<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%
	String path=request.getContextPath();
%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="<%=path%>/resource/mystyles.css"/> 
<script type="text/javascript" src="<%=path%>/resource/jquery-3.2.1.js"></script>
</head>
<body>
	<form action="">
		商品名称:<input type="text" name="gname"><br><br>
		商品名称:<input type="text" name="ename"><br><br>
		商品品牌:<select>
			<c:forEach items="${list }" var="s">
				<option value="${s.bid }">${s.bname }</option>
			</c:forEach>
		</select><br><br>
		商品种类:<select>
			<c:forEach items="${ss }" var="a">
				<option value="${a.tid }">${a.tname }</option>
			</c:forEach>
		</select><br><br>
		尺寸:<input type="text" name="size"><br><br>
		价格:<input type="text" name="price"><br><br>
		数量:<input type="text" name="num"><br><br>
		标签:<input type="text" name="bq"><br><br>
		<input type="button" value="提交"  onclick="add()">
	</form>
</body>
</html>