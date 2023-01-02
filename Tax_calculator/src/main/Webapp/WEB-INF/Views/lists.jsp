<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 11/7/2022
  Time: 10:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Tax_details</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <th>Id</th>
        <th>Taxable_income</th>
        <th>Tax</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${tax_details}" var="tax_detail">
        <tr>

            <td>${tax_detail.id}</td>
            <td>${tax_detail.taxable_income_year}</td>
            <td>${tax_detail.tax}</td>

        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
