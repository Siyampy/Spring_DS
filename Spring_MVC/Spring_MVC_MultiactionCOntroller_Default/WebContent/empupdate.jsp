<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>EMployee Update</h2>
	<form action="./empupdate.ds">
	ID:<input type="text" name="id" />
	NAME:<input type="text" name="name" />
	EMAIL:<input type="text" name="email" />
	Addresss:<textarea rows="1" cols="5" name="address"></textarea>
	<input type="submit" value="Update" />
	</form>
</body>
</html>