<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>EMployee Save</h2>
	<form action="./empsave.ds">
	NAME:<input type="text" name="name" />
	EMAIL:<input type="text" name="email" />
	Addresss:<textarea rows="5" cols="15" name="address"></textarea>
	<input type="submit" value="save" />
	</form>
</body>
</html>