# JasperReport+iReport

Generación de informes con JasperReport + iReport

Trabajo correspondiente a la asignatura DI (Desarrollo de Interfaces) perteneciente a la titulación de Técnico Superior en el Desarrollo de aplicaciones multiplataforma.

La tarea consistía en la realización de 3 ejercicios cuyos enunciados paso a detallar.

## Ejercicio 1 
Crea un informe con el nombre “Facturas” que muestre las facturas adeudadas por los clientes e informe del total emitido a cada uno de ellos al final de la última factura listada para cada cliente. El informe debe tener orden ascendente por el Número de factura, y se debe visualizar la siguiente información:
- Número de factura
- Nombre
- Apellido
- Dirección
- Ciudad
- Línea de detalle(Subreporte con el nombre LineaDetalleFra)
  - Posición
  - Descripción
  - Cantidad
  - Precio unitario
  - Precio total
- Importe total por factura
- Importe total facturas adeudadas por cliente
  
Además, para favorecer la lectura, debe incluirse al principio del informe un resumen, utilizando subreporte (con el nombre TotalPorCliente), que muestre la siguiente información:
- Id cliente
- Nombre
- Apellido
- Cantidad de facturas adeudadas por Id cliente
- Importe total adeudado por Id cliente
- Importe total adeudado (De todos los clientes )

## Ejercicio 2
Crea una aplicación java que recopile el código de todos clientes y genere el informe de aquéllos que tienen facturas pendientes de pago.
En caso de que existan facturas pendientes, se debe visualizar el informe por pantalla ordenado de forma ascendente por el número de factura si existiera más de una, y generar el documento .pdf correspondiente que será almacenado en un soporte físico.
Si no hay facturas pendientes de pago para el cliente seleccionado, se deberá informar en la misma aplicación.

## Ejercicio 3
Crea un informe con el nombre Informe03 en el que se visualice gráficamente la cantidad total de ventas por producto en orden ascendente por código de artículo. Además, debe incluir un listado de texto mostrado en el mismo orden.
No debes usar ningún subinforme en este ejercicio.
Puedes utilizar el gráfico que consideres más oportuno.

## Pautas que seguí para la resolución de los ejercicios 1 y 3
Utilicé iReport de forma independiente. Es importante conocer que iReport integra el SGBD HSQLDB

1) Instalación de i-Report versión 5.6.0
    
    https://sourceforge.net/projects/ireport/files/iReport/
    
2) Lanzar el programa con permisos de administrador. Es importantísimo, sino no os funcionará.

3) Iniciar la BD de pruebas. Al iniciarla estaremos arrancando el servidor HSQLDB

   desde iReport -> Ayuda -> Samples -> Run Sample Database
   
4) Configurar la conexión a la BD de pruebas

   desde iReport -> Report Datasources (icono de un cilindro con un enchufe) -> Sample Databade -> Modificar
   
   - JDBC Driver: HSQLDB (server) (org.hsqldb.jdbcDriver)
   - JDBC URL: jdbc:hsqldb:hsql://127.0.0.1/
   - Username: sa
   - Password: (sin rellenar)
   - Save password: tildado
   
   Comprobar la conexión haciendo clic en el botón "Test"
   
5) Diseñar los diferentes informes
   

