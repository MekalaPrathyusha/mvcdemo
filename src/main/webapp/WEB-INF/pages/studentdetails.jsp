<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page isELIgnored="false" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
STUDENT DETAILS<br>
STUDENT NAME: ${student.name }<br>
DEPARTMENT NAME :${student.department }<Br>
MARK 1 : ${student.mark1 }<br>
MARK 2 : ${student.mark2 }<br>
TOTAL : ${student.mark1 + student.mark2 }
</body>
</html>