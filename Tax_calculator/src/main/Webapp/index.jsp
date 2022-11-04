<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<html>

<h2>Income Tax Calculator Bangladesh Salary</h2>

<body>
<br>
<form action="taxable" method="post">
    <label> Chose Tax Payer Category</label><br><br>
    <select id="category" name="category">
        <option>General</option>
        <option>Female/Senior citizen</option>
        <option>Disabled</option>
        <option>Gazetted freedom fighter</option>
    </select>

    <br><br>

    <label>Choose zone</label><br><br>
    <select>
        <option>Dhaka/Chittagong</option>
        <option>Other city</option>
        <option>Rest of the country</option>
    </select><br><br>

    <label>Salary Breakdown</label><br><br>
    <table class="table table-view">
        <tr>
            <th>Area</th>
            <th>Amount</th>
        </tr>
        <tr>
            <td>Basic Salary</td>
            <td><input type="number" name="salary" id="salary" value="0"></td>
        </tr>
        <tr>
            <td>House Rent</td>
            <td><input type="number" name="rent" id="rent" value="0"></td>
        </tr>
        <tr>
            <td>Medical Allowance</td>
            <td><input type="number" name="allow" id="allow" value="0"></td>
        </tr>
        <tr>
            <td>Conveyance</td>
            <td><input type="number" name="conv" id="conv" value="0"></td>
        </tr>
        <tr>
            <td>Festival Bonus</td>
            <td><input type="number" name="bonus" id="bonus" value="0"></td>
        </tr>
        <tr>
            <td>Total</td>
            <td></td>
        </tr>
    </table><br>

    <input type="submit" value="Calculate">  <input type="button" value="Reset">
</form>
</body>
</html>
