<html>
	<head>
		<title>Administrador de Ventas</title>
	</head>
	<body>
		<form action="/ItemsAdmin/main/sendData">
			<h1>Datos de la venta</h1>
			<fieldset>
				<p style="padding:14px;" class="required"> * Datos obligatorios</p> 
	            <ol class="credit-card-form"> 
					<li class="field-box">
						<label for="CardHolderName" class="required">
							<span>Nombre<em>*</em></span>
							<input type="text" name="name" id="name" required="required">
						</label>
					</li>
					<li class="field-box">
						<label for="CardHolderName" class="required">
							<span>Apellido<em>*</em></span>
							<input type="text" name="surname" id="surname" required="required">
						</label>
					</li>
					<li class="field-box">
						<label for="CardHolderName" class="required">
							<span>DNI<em>*</em></span>
							<input type="text" name="docNumber" id="docNumber" required="required">
						</label>
					</li>
					<li class="field-box">
						<label for="CardHolderName" class="required">
							<span>Item id<em>*</em></span>
							<input type="text" name="itemNumber" id="itemNumber" required="required">
						</label>
					</li>
					<li class="field-box">
						<label for="CardHolderName" class="required">
							<span>$<em>*</em></span>
							<input type="text" name="price" id="price" required="required">
						</label>
					</li>
				</ol>
				<div class="clearfix"></div>
	        </fieldset>	
			<div class="action">
	            <div class="buttons">
	                <div class="button">
						<input type="submit" class="btn primary" value="Enviar">
	                </div>  
	            </div>	
	        </div>
	    </form>
	</body>
</html>
