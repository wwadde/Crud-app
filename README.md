===================================
#            CRUD App
===================================
## Descripción:
...............................................................
Esta es una aplicación CRUD (Crear, Leer, Actualizar, Eliminar) 
desarrollada  con Spring Boot.  Permite gestionar  usuarios con 
información   básica   como   nombre,   edad,   género,  correo 
electrónico y fecha de registro.


## Tecnologías Utilizadas:
...............................................................
* Java 21
* Spring Boot 3.3.4
* Hibernate
* PostgreSQL ( cualquier   otra   base  de   datos  que elijas, 
  recomecomiendo revisar el apartado application.properties)
* Maven

## Requisitos Previos:
...............................................................
* JDK 21
* Maven
* PostgreSQL (u otra base de datos)
* Kaspersky ( si es  necesario, asegúrate  de que no bloquee el 
  puerto)

=================================
#        Configuración
=================================

## Clona el repositorio:
...............................................................
git clone <URL_DEL_REPOSITORIO>
cd App
...............................................................

## Configura la base de datos:
...............................................................
Asegúrate  de  tener  PostgreSQL instalado y en funcionamiento.
Crea   una   base   de   datos y  actualiza las credenciales en  
application.properties.

## Construye el proyecto:
...............................................................
mvn clean install
...............................................................

## Ejecuta la aplicación:
...............................................................
java -jar target/App-0.0.1-SNAPSHOT.jar
...............................................................

===========================
#        Endpoints
===========================
## Crear un Usuario:
...............................................................
* Método: POST
  URL: /api/users
  
  Body:
..............................................................
{
  "name": "John Doe",
  "age": 30,
  "gender": "Male",
  "email": "john.doe@example.com",
  "date": "2024-10-02"
}
...............................................................

## Obtener Todos los Usuarios:
...............................................................
* Método: GET
  URL: /api/users

* Obtener Usuario por ID
  Método: GET
  URL: /api/users/{id}

* Actualizar Usuario
  Método: PUT
  URL: /api/users/{id}

  Body:
  ...............................................................
{
  "name": "John Doe",
  "age": 30,
  "gender": "Male",
  "email": "john.doe@example.com",
  "date": "2024-10-02"
}
...............................................................

* Eliminar Usuario
  Método: DELETE
  URL: /api/users/{id}




# MIT License

## Copyright (c) [2024] [Y0i7]

Se concede permiso, de forma gratuita, a cualquier persona que obtenga una copia de este software y de los archivos de documentación asociados (el "Software"), para utilizar el Software sin restricciones, incluyendo, sin limitación, los derechos a usar, copiar, modificar, fusionar, publicar, distribuir, sublicenciar y/o vender copias del Software, y a permitir a las personas a quienes se les proporcione el Software a hacerlo, sujeto a las siguientes condiciones:

...

El software se proporciona "tal cual", sin garantía de ningún tipo, expresa o implícita, incluyendo pero no limitado a las garantías de comerciabilidad, idoneidad para un propósito particular y no infracción. En ningún caso los autores o titulares de derechos de autor serán responsables de cualquier reclamación, daños u otras responsabilidades, ya sea en una acción de contrato, agravio o de otro tipo, que surja de, o en conexión con, el software o el uso u otros tratos en el software.
