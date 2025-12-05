# Airport Cargo Arrival Management System -- Java

Sistema de gestión de cargas y arribos para un aeropuerto, desarrollado
en **Java**, bajo una arquitectura MVC, con persistencia en
archivos, interfaz gráfica (Swing) y uso de Programación
Orientada a Objetos (herencia y polimorfismo).

------------------------------------------------------------------------

## Descripción General

El sistema permite gestionar el inventario de cargas que arriban a un
aeropuerto, incluyendo:

-   Carga regular\
-   Material peligroso\
-   Mercancía perecedera\
-   Registro de empleados responsables

Toda la información se almacena en archivos `.dat`, garantizando
persistencia incluso al cerrar la aplicación.

------------------------------------------------------------------------

## Tecnologías Utilizadas

  Área           Herramientas
  -------------- -----------------
  Lenguaje       Java SE
  IDE            NetBeans
  GUI            Swing / JFrame
  Persistencia   Archivos `.dat`
  Arquitectura   MVC
  Paradigma      POO

------------------------------------------------------------------------

## Características Principales

### Gestión de Cargas

Incluye diferentes tipos de carga heredados de una clase base `Carga`.

### Gestión de Empleados

Registro y control de empleados del aeropuerto.

### Persistencia de Datos

Serialización de objetos a archivos `.dat`.

### Interfaz Gráfica

Construida en Swing con formularios sencillos y funcionales.

------------------------------------------------------------------------

## Arquitectura MVC

### Modelo

Clases del dominio: `Carga`, `CargaRegular`, `MaterialPeligroso`,
`MercanciaPerecedera`, `Aeropuerto`, `Empleado`.

### Vista

Interfaces gráficas en Swing.

### Controlador

Gestiona eventos y vincula la vista con el modelo.

------------------------------------------------------------------------

## Estructura del Proyecto

    AEROPUERTO/
    │
    ├─ modelo/
    ├─ controlador/
    ├─ vista/
    └─ datos/

------------------------------------------------------------------------

## Cómo Ejecutarlo

1.  Abrir el proyecto en NetBeans.\
2.  Verificar la carpeta `datos/`.\
3.  Ejecutar `Main.java`.\
4.  Usar la interfaz para gestionar cargas y empleados.

------------------------------------------------------------------------

## Screenshots

### Pantalla Principal
![Main Window](img/INICIO.png)

### Registro de Carga
![Registro](img/REGISTRO_CARGAS.png)

### Lista de Cargas
![Tabla de Cargas](img/MOSTRAR_CARGAS.png)

### Lista de Cargas
![Codigo](img/CODING.png)

------------------------------------------------------------------------

## Posibles Mejoras Futuras

-   Migrar persistencia a base de datos.
-   Validaciones avanzadas.
-   Reportes PDF.
-   Mejor interfaz con JavaFX.
-   Autenticación de usuarios.
-   Extender el sistema a vuelos y salidas.

------------------------------------------------------------------------

## Autor

**Keila García**\
Proyecto final -- Sistema de Gestión de Arribos en Java.
