<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="show" method="post">
<table>
<tr>
<td>
Enter First Name 
</td>
<td>
<input type="text" name="fn">
</td>
</tr>

<tr>
<td>
Enter Last Name 
</td>
<td>
<input type="text" name="ln">
</td>
</tr>


<tr>
<td>
Enter City  
</td>
<td>
<input type="text" name="city">
</td>
</tr>

<tr>
<td>
Enter company Name
</td>
<td><select name="myCompany">
<option>TCS</option>
<option>INFOSYS</option>
<option>WIPRO</option>
</select>
</td>
</tr>
<tr>
<td>
<input type="submit" value="add a employee">
</td>
</tr>

</table>
</form>

</body>
</html>