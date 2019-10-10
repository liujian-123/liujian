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
	<table>
		<tr>
			<td>商品名称</td>
			<td>英文名称</td>
			<td>商品品牌</td>
			<td>商品种类</td>
			<td>尺寸</td>
			<td>单价</td>
			<td>数量</td>
			<td>标签</td>
			<td>图片</td>
		</tr>
		<c:forEach items="${list }" var="s">
			<tr>
				<td>${s.gname }</td>
				<td>${s.ename }</td>
				<td>${s.ename }</td>
				<td>${s.ename }</td>
				<td>${s.size }</td>
				<td>${s.price }</td>
				<td>${s.num }</td>
				<td>${s.bq }</td>
				<td>
					<input type="file" value="选择文件">
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>