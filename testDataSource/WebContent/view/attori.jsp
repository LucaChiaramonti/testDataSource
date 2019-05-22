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
	
	<form action="../Controller" method="post" >
	<input type="hidden" name="cerca" value="cercaPerNome">
	<table border="1">
		<tr>
			<td> <input type="text" name="nomeAttore" > </td>
			<td> <b>inserisci il nome dell'attore</b></td>
		 </tr>
		 <tr>
		 	<td> <input type="submit"> </td>
		 	<td> <input type="reset"> </td>
		 </tr>
	</table>
	</form>
	<br>
	<form action="../Controller" method="post" >
	<input type="hidden" name="cerca" value="cercaPerId">
	<table border="1">
		<tr>
			<td> <input type="text" name="idAttore"> </td>
			<td> <b>inserisci l'id dell'attore</b></td>
		 </tr>
		 <tr>
		 	<td> <input type="submit"> </td>
		 	<td> <input type="reset"> </td>
		 </tr>
	</table>
	</form>
	<br>
	<form action="../Controller" method="post" >

	<table border="1">
		 <tr>
		 	<td> <input type="submit" value="Stampa Tutti"> </td>
		 </tr>
	</table>
	</form>
		<form action="../Controller" method="post" >
	<input type="hidden" name="cerca" value="cercaPerId">
	<table border="1">
		<tr>
			<td> <input type="text" name="idAttore"> </td>
			<td> <b>inserisci l'id dell'attore</b></td>
		 </tr>
		 <tr>
		 	<td> <input type="submit"> </td>
		 	<td> <input type="reset"> </td>
		 </tr>
	</table>
	</form>
	<br>
	<form action="../Controller" method="post" >
	<input type="hidden" name="cerca" value="aggiungiAttore">
	<table border="1">
		<tr>
			<td> <input type="text" name="aggNomeAttore" > </td>
			<td> <b>inserisci il nome dell'attore</b></td>
		 </tr>
		 <tr>
			<td> <input type="text" name="aggCognomeAttore" > </td>
			<td> <b>inserisci il cognome dell'attore</b></td>
		 </tr>
		 <tr>
		 	<td> <input type="submit" value="Aggiungi"> </td>
		 	<td> <input type="reset"> </td>
		 </tr>
	</table>
	</form>
	<br>
	<input type="hidden" name="cerca" value="cercaTutti">