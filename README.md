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
   

## Pautas que seguí para la resolución del ejercicio 2
Utilicé Netbeans como IDE versión 8.2 con el JDK 1.8

1) Diseño de las plantillas de los reports. 
   Las hice desde iReport y posteriormente las copie dentro del proyecto. iReport puede instalarse como plugin en Netbeans, también podríamos hacerlo de este forma.
   
2) Instalación del servidor HSQLDB versión 2.5

  https://sourceforge.net/projects/hsqldb/files/hsqldb/
  
3) Iniciar servidor desde la línea de comandos

   java -cp lib/hsqldb.jar org.hsqldb.Server -database.0 file:data/demo_db -dbname.0 xdb

   Este comando sería para lanzar la BD que trae de pruebas. El comando hay que lanzarlo una vez nos ubiquemos dentro de la carpeta donde hemos instalado HSQLDB, sino el sistema    no lo reconocerá.

   Para iniciar la BD de la tarea hay que copiar previamente el script dentro de la carpeta data de HSQLDB y ejecutar el comando:

   java -cp lib/hsqldb.jar org.hsqldb.Server -database.0 file:data/dbEjercicio -dbname.0 xdb
   
4) Agregar las librerías necesarias al proyecto. 
   Podéis localizarlas en: C:\Program Files (x86)\Jaspersoft\iReport-5.6.0\ireport\modules\ext
   
   Yo necesité:
   - commons-collections
   - common-digister
   - common-logging (esta no es necesaria, pero creo que si el sistema os falla os facilita información al respecto)
   - groovy-all (esta no viene en el temario pero Netbeans a mí me la pidió)
   - hsqldb
   - iText
   - jasperreports
   - spring

5) Desarrollar el código necesario para completar los requerimientos del ejercicio planteado
