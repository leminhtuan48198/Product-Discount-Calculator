<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>DiscountCalculator</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<h2>Discount Calculator</h2>
<form action="/calculate" method="post">
    <label>Product Description: </label><br/>
    <input type="text" name="description" placeholder="description" value=""/><br/>
    <label>List Price </label><br/>
    <input type="text" name="listPrice" placeholder="100000" value="100000"/><br/>
    <label>Discount Percent: </label><br/>
    <input type="text" name="discountPercent" placeholder="0" value="0"/><br/>
    <input type = "submit" id = "submit" value = "Calculate"/>
</form>
</body>
</html>