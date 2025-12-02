# Curso de Java — De Cero a Spring Boot + JPA

Este repositorio contiene el material del curso de Java en el que trabajamos desde los fundamentos del lenguaje hasta el desarrollo de APIs REST con Spring Boot y persistencia de datos con JPA sobre SQL.

El objetivo es que al finalizar el curso puedas desarrollar aplicaciones Java completas, estructuradas en capas, con acceso a base de datos y listas para desplegarse en un entorno real.

---

## Objetivos del curso

- Entender la sintaxis y los fundamentos básicos de Java.
- Aplicar correctamente los principios de Programación Orientada a Objetos (POO).
- Trabajar con colecciones, genéricos y manejo de excepciones.
- Utilizar herramientas habituales en proyectos Java (Maven/Gradle, JUnit, etc.).
- Conectar aplicaciones Java con bases de datos relacionales usando JDBC y SQL.
- Modelar entidades de negocio y mapearlas con JPA/Hibernate.
- Construir servicios REST con Spring Boot.
- Integrar todas las piezas en un proyecto final completo.

---

## Contenidos

> La organización exacta por carpetas/módulos puede variar; este listado resume los bloques temáticos que cubrimos en el curso.

### 1. Fundamentos de Java

- Historia y características de Java.
- Instalación de JDK y configuración del entorno.
- Estructura básica de un programa Java.
- Tipos de datos primitivos y referencias.
- Operadores, entrada/salida por consola.

### 2. Control de flujo

- Sentencias condicionales: `if/else`, `switch`.
- Bucles: `for`, `while`, `do-while`.
- Buenas prácticas de legibilidad y nombres de variables.

### 3. Programación Orientada a Objetos (POO)

- Clases, objetos y métodos.
- Encapsulación, getters y setters.
- Herencia y polimorfismo.
- Clases abstractas e interfaces.
- Principios básicos de diseño (SOLID a alto nivel).

### 4. Colecciones y genéricos

- Arrays vs colecciones.
- `List`, `Set`, `Map` y sus implementaciones más comunes.
- Iteradores y bucles mejorados.
- Genéricos: definición y uso en clases y métodos.
- Introducción a `Streams` (si aplica en el curso).

### 5. Manejo de excepciones

- Tipos de excepciones (checked vs unchecked).
- `try/catch/finally`, `throw` y `throws`.
- Excepciones personalizadas.
- Buenas prácticas en manejo de errores.

### 6. Entrada/Salida y ficheros

- Lectura y escritura de ficheros.
- Uso de `InputStream`, `OutputStream`, `Reader`, `Writer`.
- Manejo de recursos con `try-with-resources`.

### 7. Testing con JUnit

- Conceptos básicos de pruebas unitarias.
- Estructura de un test con JUnit.
- Asserts y pruebas parametrizadas (si aplica).
- Introducción a TDD (nivel conceptual).

### 8. Herramientas del ecosistema Java

- Gestión de dependencias con Maven (y/o Gradle).
- Estructura estándar de un proyecto.
- Ciclo de vida de build, test y empaquetado.
- Buenas prácticas de organización del código.

### 9. JDBC y SQL

- Conceptos básicos de bases de datos relacionales.
- Fundamentos de SQL: `SELECT`, `INSERT`, `UPDATE`, `DELETE`, `JOIN`.
- Conexión a BD con JDBC.
- Prepared statements y manejo de resultados.
- Gestión de transacciones a nivel básico.

### 10. JPA e Hibernate

- ¿Qué es JPA? ¿Qué es Hibernate?
- Entidades y mapeo a tablas.
- Anotaciones básicas: `@Entity`, `@Id`, `@GeneratedValue`, etc.
- Relaciones: `@OneToMany`, `@ManyToOne`, `@ManyToMany`.
- Consultas con JPQL y métodos de repositorio.
- Gestión del contexto de persistencia.

### 11. Spring y Spring Boot

- Introducción a Spring Framework.
- Inversión de control (IoC) y contenedor de beans.
- Inyección de dependencias (DI).
- Spring Boot: auto-configuración y arranque de aplicaciones.
- Estructura típica de un proyecto Spring Boot.

### 12. APIs REST con Spring Boot

- Controladores REST (`@RestController`).
- Mapeo de endpoints (`@GetMapping`, `@PostMapping`, etc.).
- DTOs y mapeo entre capas.
- Manejo de errores y códigos HTTP.
- Validación de datos de entrada.

### 13. Persistencia con Spring Data JPA

- Repositorios (`CrudRepository`, `JpaRepository`).
- Métodos de consulta derivados (query methods).
- Integración entre capa REST, servicios y repositorios.
- Paginação y ordenación básicas (si aplica).

### 14. Proyecto final

- Definición de un dominio de negocio (ej. gestión de tareas, tienda online, etc.).
- Diseño de entidades y relaciones.
- Implementación de servicios y controladores.
- Persistencia con JPA y Spring Data.
- (Opcional) Seguridad básica con Spring Security.
- (Opcional) Documentación de API (OpenAPI/Swagger).

---

## Requisitos previos

No es estrictamente necesario tener experiencia en programación, pero ayuda estar familiarizado con:

- Conceptos básicos de lógica (condiciones, bucles, funciones).
- Uso de la línea de comandos.
- Conceptos básicos de bases de datos (tablas, filas, columnas).

---

## Tecnologías y versiones (orientativo)

- Java (versión 17 o superior).
- Maven o Gradle para la gestión de dependencias.
- Spring Boot (versión 2.x/3.x, según el proyecto).
- Spring Data JPA.
- Base de datos relacional (H2, MySQL, PostgreSQL, etc.).
- JUnit (para pruebas unitarias).

Ajustar las versiones concretas según la configuración real del proyecto.

---

## Cómo utilizar este repositorio

Un posible esquema de uso (adaptar a cómo esté organizado vuestro código):

- Cada módulo/tema puede estar en una carpeta independiente, por ejemplo:
  - `01-fundamentos-java/`
  - `02-poo/`
  - `03-colecciones/`
  - `...`
  - `10-spring-boot-jpa/`
- Dentro de cada carpeta:
  - Código de ejemplo visto en clase.
  - Ejercicios propuestos.
  - (Opcional) Soluciones de referencia.

### Ejecución de ejemplos

1. Clonar el repositorio:
   ```bash
   git clone <URL_DEL_REPOSITORIO>
   cd <NOMBRE_DEL_REPOSITORIO>

