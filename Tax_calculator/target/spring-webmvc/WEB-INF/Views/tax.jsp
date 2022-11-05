<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 11/1/2022
  Time: 10:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table class="table-view">
    <tr>
        <th>Tax Details</th>
        <th>Amount</th>
    </tr>
    <tr>
        <td>Total amount of taxable income for year</td>
        <td> &nbsp;&nbsp; ${max}</td>
    </tr>
    <tr>
        <td>Total amount of tax_year</td>
        <td> &nbsp;&nbsp; ${total}</td>
    </tr>
    <tr>
        <td>The amount of tax need to be given every month</td>
        <td> &nbsp;&nbsp; ${tax}</td>
    </tr>

</table>

</body>
</html>
