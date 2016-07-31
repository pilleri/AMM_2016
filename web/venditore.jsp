<%-- 
    Document   : venditore
    Created on : 31-lug-2016, 16.38.07
    Author     : Nicola
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title>JSP Page</title>
        
        <link rel="stylesheet" type="text/css" href="style.css"
               media="screen">
    </head>
    <body>
        <jsp:include page="linker.jsp" />
        
        <h1>
            Inserimento di un nuovo articolo
        </h1>

        
        <form>
            
                      <input type="text" value="Nome">

            
          <input type="text" value="URL img">

            
          <textarea rows="5" cols="20">                Descrizione dell img
            </textarea>

            
          <input type="text" value="Pezzi">

            
          <input type="text" value="Prezzo">

                </form>

        
        
        
        <jsp:include page="coda.jsp" />
    </body>
</html>
