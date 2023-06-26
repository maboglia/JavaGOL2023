<%@page import="model.ListaSpesa"%>
<%@page import="model.Todo"%>
<%

//scriptlet

	String richiesta = request.getParameter("todo");

	Todo t = new Todo(richiesta); 
	t.setCompleto(true);
	ListaSpesa lista;
	
	if (session.getAttribute("miaLista")!= null){
		//la lista è già presente in sessione
		lista = (ListaSpesa) session.getAttribute("miaLista");
	
	} else {
		//è la prima volta
		lista = new ListaSpesa(); 
	}

	lista.addTodo(t);
	
	
	session.setAttribute("miaLista", lista);

	response.sendRedirect("index.jsp");
	
%>