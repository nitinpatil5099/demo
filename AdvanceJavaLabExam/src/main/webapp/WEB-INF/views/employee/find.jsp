<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="displayByCompany" method="post">
		<table>
			<tr>
				<td><select name="myCompany">
						<option>TCS</option>
						<option>INFOSYS</option>
						<option>WIPRO</option>
				</select></td>
			</tr>
			<tr>
				<td><input type="submit" value="Find by comapany" /></td>
			</tr>
		</table>
	</form>
</body>
</html>