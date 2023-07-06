<%@page import="controller.BevandeController"%>
<%@page import="view.BevandeView"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Vending machine</h1>

	<h2><%= BevandeView.MSG_INPUT %></h2>
	
	<ul>
	
	<%
		for(String nomeBevanda : BevandeView.bevandeDisponibili){
			out.print("<li>"  + nomeBevanda + "</li>" );
		}
	%>
	
	</ul>
	
	<form action="">
	
		<input type="text" name="codice" placeholder="Seleziona">
		<button>Scegli</button>
	</form>
	
	<% if (request.getParameter("codice") != null){
		String codice = request.getParameter("codice");
		out.print("<h3>");
		out.print(BevandeController.getBevanda(codice));
		out.print("</h3>");
		
	}
		
		
		
		
		%>

</body>
</html>