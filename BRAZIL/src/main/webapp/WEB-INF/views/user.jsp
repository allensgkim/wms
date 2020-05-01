<!doctype html>
<html land="en">
<head>
	<meta charset="UTF-8"/>
	<title>User</title>
</head>
<body>
	<h1>Thymeleaf Test Page!!!!!!!!</h1>
	<h3 th:text="${name}"></h3>
	<div th:text="${user}"></div>
	<div th:text="${user.name}"></div>
</body>
</html>