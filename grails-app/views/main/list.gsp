<html>
	<head>
		<title>Administrador de Ventas</title>
	</head>
	<body>
		
			<h1>Datos enviados correctamente</h1>
			<fieldset>
			<div class="action">
			<ol class="credit-card-form"> 

				<g:each in="${slist}">
				
					
					
			
					<li class="field-box">
						<label for="CardHolderName" class="required">
							${it.name }  ${it.surname } - DNI ${it.docNumber } - ${it.itemNumber } - $${it.price } 
						</label>
						
						
					</li>
					<br>
				</g:each>
			</ol>
			<br><br><br>
	            <div class="buttons">
	            <form action="/ItemsAdmin/main">
	                <div class="button">
						<input type="submit" class="btn primary" value="Cargar otra venta">
	                </div> 
	                </form> 
	
	            </div>	
	        </div>
	    </fieldset>
	</body>
</html>
