<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${name}

.<%String name = (String)request.getAttribute("name"); %>
<%= name%>
<c:forEach var="i" begin="1" end="5" step="1">
<c:out value="${i}"/><br/>
</c:forEach>
</body>
</html>