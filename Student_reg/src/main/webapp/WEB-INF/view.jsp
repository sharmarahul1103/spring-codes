<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@page isELIgnored="false" %>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
table, th, td {
  border: 1px solid black;
}

</style>
</head>
<body>
<h1 align="center">Student Record</h1>
  <table align="center">
        <tr>
         <td>Student Id</td>
         
         <td>Student course</td>
         <td>Student name</td>
         <td>Student roll No</td>
        </tr>
        <c:forEach items="${students }" var="s"> 
        <tr>
        <td> ${s.id}   </td>
        <td> ${s.course}   </td>
        <td> ${s.name}   </td>
        <td> ${s.rollno}   </td>
        </tr>
        </c:forEach>
     </table>

</body>
</html>