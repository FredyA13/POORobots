# POO Robots
Este proyecto es una práctica de Programación Orientada a Objetos (POO) en Java utilizando un entorno de robots.
En el cual se crea un menu interactivo en donde se puede trabajar con diferentes robots, interactuar con sus atributos y métodos.

## Descripción
- Simulamos diferentes tipos de robots con diferentes habilidades y características:

    - Robot: Clase abtracta con base con atributos y métodos comunes.
    - RobotSubmarino, RobotTerrestre, RobotAnfibio: Clases hijas que heredan de Robot.

- Interfaces: 
    - Navegar: El robot que es capaz de navegar por el agua puede usar esta interfaz.
    - Rodar: El robot que es capaz de rodar o caminar por medio de ruedas terrestres puede usar esta interfaz.

- Cada robot implementa interfaces según sus capacidades:
    - RobotSubmarino: Navegar.
    - RobotTerrestre: Rodar.
    - RobotAnfibio: Navegar y Rodar.

## Funcionalidades
- Configuración de parámetros del robot.
- Lectura de Parámetros.
- Movimiento del robot.
- Carga de bateria del robot.

## Temas de Java Aplicados
- Programación orientada a objetos.
- Clases e interfaces.
- Abstracción y herencia.
- Encapsulamiento.
- Polimorfismo.

