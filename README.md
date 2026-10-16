# Gimnasio con Persistencia

Sistema de gestion de un gimnasio con registro de entrenamientos y personas con persistencia.

## Detalle

| | |
|---|---|
| Tipo | Consola (MVC) |
| Archivos Java | 10 |
| Version de Java | 21 |
| Patron | Arquitectura MVC con patron DAO |

## Funcionalidades

- Registro de entrenamientos
- Gestion de personas del gimnasio
- Persistencia DAO en archivo
- DataMapper entidad-DTO
- Consultas de rutina

## Estructura del proyecto

```
workoutPersistance/
|-- pom.xml       configuracion de Maven, importable desde cualquier IDE
|-- src/          codigo fuente
`-- README.md
```

## Como ejecutarlo

### Con Maven

```bash
mvn clean compile
mvn exec:java
```

### Con javac directamente

```bash
# Linux / macOS
javac -d bin $(find src -name "*.java")

# Windows (PowerShell)
javac -d bin (Get-ChildItem -Recurse -Filter *.java src).FullName
```

```bash
java -cp bin co.edu.unbosque.controller.AplMain
```

### Desde un IDE

Cualquier IDE con soporte de Java (Eclipse, IntelliJ IDEA, VS Code o NetBeans)
puede importar el proyecto directamente como **proyecto Maven**. Basta con abrir
o importar la carpeta: el IDE detecta el `pom.xml`, resuelve las dependencias y
compila sin configuracion adicional.

## Autor

Desarrollado por [Sergio Parra](https://github.com/P2X4A) como parte de su
formacion en Java.

## Licencia

Ver el archivo [LICENSE](LICENSE).