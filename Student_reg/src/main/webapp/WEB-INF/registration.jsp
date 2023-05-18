<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 >Student Registration page</h1>
<form action="reg" method="post">

     <label for="name">Enter Student name</label>
     <input type="text" name="name" id="name"> 
     <br>
     <br>
     
     <label for="course">Enter course name</label>
     <input type="text" name="course" id="course"> 
     
     <br>
     <br>
     
     <label for="rollno">Enter Student Roll Number</label>
     <input type="text" name="rollno" id="rollno"> 
     <br>
     <br>
     
     <button type="submit">Register</button>

</form>

</body>
</html>