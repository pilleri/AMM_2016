<%-- 
    Document   : cliente
    Created on : 31-lug-2016, 16.36.51
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
        
        
        <h1>TABELLA ACQUISTI</h1>

        
        <div>
            Questa tabella espone i giochi in vendita
        </div>

        
 <table>

                <tr>

                <th>Nome articolo</th>

                <th>Foto</th>

                <th>Pezzi</th>

                <th>Prezzo</th>

                <th>Link</th>

                </tr>

            
    
                <tr>

                <td>One piece</td>

                <td> <image alt="Foto" src="http://onepiecegt.it/files/gallerie/utenti/usr-1/One%20Piece%20Pirate%20Warriors%2031.jpg" width="100" height="120"> </td>

                <td>10</td>

                <td>69,99</td>

                <td><a href="cliente.html">Aggiungi al carrello</a></td>

                </tr>


                <tr>

                <td>FIFA</td>

                <td><image alt="Foto" src="http://www.allon.it/wp-content/uploads/2016/06/FIFA-17-Cover-Jamie-Vardy.jpg" width="100" height="120"></td>

                <td>23</td>

                <td>69,99</td>

                <td><a href="cliente.html">Aggiungi al carrello</a></td>

                </tr>
 

           
     <tr>

                <td>Naruto</td>

                <td><image alt="Foto" src="https://upload.wikimedia.org/wikipedia/en/5/54/NSUNS4_game_cover.png" width="100" height="120"></td>

                <td>3</td>

                <td>69,98</td>

                <td><a href="cliente.html">Aggiungi al carrello</a></td>

                </tr>

     
           <tr>

                <td>Call of duty</td>

                <td><image alt="Foto" src="https://i.ytimg.com/vi/AmOQNLUB2Og/maxresdefault.jpg" width="100" height="120"></td>

                <td>56</td>

                <td>67,89</td>

                <td><a href="cliente.html">Aggiungi al carrello</a></td>

                </tr>


            
    <tr>

                <td>Code</td>

                <td><image alt="Foto" src="https://i.ytimg.com/vi/3vI_7os2V_o/maxresdefault.jpg" width="100" height="120"></td>

                <td>12</td>

                <td>75,87</td>

                <td><a href="cliente.html">Aggiungi al carrello</a></td>

                </tr>

        </table>
        
        
        
        
        
        <jsp:include page="coda.jsp" />
    </body>
</html>
