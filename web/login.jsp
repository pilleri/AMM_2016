<%-- 
    Document   : login
    Created on : 31-lug-2016, 16.38.25
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
       
        <h1>
            Log in page
        </h1>
        
        <form action="demo_form.asp" method="get">
           
             <label for="utente">Username</label>
             <input type="text" name="utente"
                   id="utente" value="username" />
                   <br />
             <label for="pswd">Password</label>
             <input type="password" name="pswd” "
                   id="pswd" value="oscurato" />
                   <br />
        </form>
        
        
        <jsp:include page="linker.jsp" />
        
        <jsp:include page="coda.jsp" />
        
    </body>
</html>
