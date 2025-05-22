<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<h1>hello</h1>

<form action="${pageContext.request.contextPath}/systemPage" method="get" style="display:inline;">
<button type="submit">go to systemPage</button>
</form>

<form action="${pageContext.request.contextPath}/adminPage" method="get" style="display:inline;">
<button type="submit">go to adminPage</button>
</form>

</body>

</html>