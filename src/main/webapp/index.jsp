<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<% String pesoIngresado = (String) request.getAttribute("pesoIngresado"); %>

<% String respuesta = (String) request.getAttribute("respuesta"); %>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link rel="stylesheet" href="./styles/styles.css">
		<title>Tu peso en otro planeta</title>
	</head>
	<body>
	
		<div class="container">



        <section class="planetas">

			<form action="/ProyectoPlanetas/formularioPeso" method="post">
			
				<div class="info">
					
			       <h1>Tu peso en otro Planeta</h1>
			
			       <h5>Primero...</h5>
			
			
			       <input type="text" id="entrada" placeholder="ingresa tu peso" name="pesoIngresado"
			       
		       		<%if(pesoIngresado != null) {%>
		       		
		       			value="<%=pesoIngresado%>"
		       		
		       		<%} %>
			       
			       >
			       
			       <br>
			       <h5>Despues has Click en el nombre del planeta</h5>
				
				</div>
				
				
				<ul>

                <li>
                	<input type="submit" value="Mercurio" name="planeta">
                    <img src="img/mercurio.jpg" id="mercurio">
                </li>

                <li>
                	<input type="submit" value="Venus" name="planeta">
                    
                    <img src="img/venus.jpg" id="venus">
                </li>

                <li>
                	<input type="submit" value="Tierra" name="planeta">
                    <img src="img/tierra.jpg" id="tierra">
                </li>

                <li>
                	<input type="submit" value="Marte" name="planeta">
                    
                    <img src="img/marte.jpg" id="marte">
                </li>

                <li>
                	<input type="submit" value="Jupiter" name="planeta">

                    <img src="img/jupiter.jpg" id="jupiter">
                </li>

                <li>
                	<input type="submit" value="Saturno" name="planeta">
                    
                    <img src="img/saturno.jpg" id="saturno">
                </li>

                <li>
                	<input type="submit" value="Urano" name="planeta">

                    <img src="img/urano.jpg" id="urano">
                </li>

                <li>
                	<input type="submit" value="Neptuno" name="planeta">

                    <img src="img/neptuno.jpg" id="neptuno">
                </li>

                <li>
                	<input type="submit" value="Pluton" name="planeta">
                    
                    <img src="img/pluton.jpg" id="pluton">
                </li>

            </ul>
			
			
			</form>

            

            <h1 id="salida">
				<%if(respuesta != null) {
				
					out.print(respuesta);
				
				} %>            
            </h1>

        </section>

    </div>
	
	</body>
</html>