<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Pagina attori
	<form action="../Servlet" method="post">
	<table border="1">
		<tr>
			<td> <input type="text" name="nomeAttore"> </td>
			<td> <b>inserisci il nome dell'attore</b></td>
		 </tr>
		 <tr>
		 	<td> <input type="submit"> </td>
		 	<td> <input type="reset"> </td>
		 </tr>
	</table>
	</form>