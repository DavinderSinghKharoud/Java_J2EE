<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"
url="jdbc:mysql://localhost:3307/mario" user = "root" password=""/>

<sql:query var="rs" dataSource="${db}">
<c:forEach items="${rs.rows}" var = "gadget">

<c:out value="${gadget.gid}"></c:out>
</c:forEach>

select * from gadgets</sql:query>



</body>
</html>