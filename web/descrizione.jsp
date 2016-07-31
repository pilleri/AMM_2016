<%-- 
    Document   : descrizione
    Created on : 31-lug-2016, 16.37.50
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
            Questo e un sito di commercio per videogiochi
        </h1>

        <div>
            In questo sito potrete trovare il vostro videogioco
        </div>

        <h2>
            Funzionalita cliente
        </h2>

        <div>
            Nella pagina riservata al cliente potrete sceglire il vostro videogioco
        </div>

        <h3>
            Funzionalita venditore
        </h3>

        <div>
            Nella pagina venditore potrete aggiungere un gioco da voi desiderato
        </div>
        
        
        
        <jsp:include page="coda.jsp" />
        
    </body>
</html>
