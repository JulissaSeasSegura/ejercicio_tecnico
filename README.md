# API Clientes

## Descripción:
Proyecto de API REST desarrollado con Java/Spring Boot para la gestión de clientes.

## Requisitos
- Git
- Java 21 (lts)
- Spring Boot 3.5.14
- Maven
- IDE compatible (Utilizado VSC)

## Clonar el repositorio
>git clone https://github.com/JulissaSeasSegura/ejercicio_tecnico.git

## Verificar la configuración
- El proyecto utiliza una base de datos H2 en memoria, por lo que no es 
necesario instalar ni configurar un motor de base de datos adicional.
- La configuración principal se encuentra en el archivo: src/main/resources/application.properties.
Dependencias: Spring Web, Sring Data JPA, h2 Database, Validation (Been Validation), OpenAPI/Swagger y Spring Boot DevTools.

## Endpints disponibles
Por defecto, la aplicación estará disponible en: http://localhost:8080.

- Listar clientes:
GET /api/clientes
http://localhost:8080/api/clientes

- Buscar el cliente por ID:
GET /api/clientes/{id}
http://localhost:8080/api/clientes/1

- Crear cliente:
POST /api/clientes
{
  "nombre": "Julissa",
  "correo": "julissa@email.com"
}

## Pruebas de la API:
- Postman
- Swagger: http://localhost:8080/swagger-ui.html
- Cualquier cliente HTTP compatible

## Notas adicionales:
La base de datos H2 se ejecuta en memoria, por lo que la información se pierde al detener la aplicación.
