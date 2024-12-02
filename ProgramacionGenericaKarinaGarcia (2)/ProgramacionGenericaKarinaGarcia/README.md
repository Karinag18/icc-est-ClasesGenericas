## Definición de datos y clases genéricas

Permiten escribir código flexible, reutilizable y que puede trabajar con distintos tipos de datos sin comprometer la seguridad de tipo.

## ¿Que son las clases genericas?

Son clases que usan un "comodín" (como `<T>`) para poder trabajar con diferentes tipos de datos sin duplicar código. Esto es súper útil debido a que puedes ahorrar mucho tiempo y puedes reutilizar codigo.
# Características principales
Reutilización de código: La misma clase puede trabajar con diferentes tipos.
Seguridad de tipo: Los errores de tipo se detectan en tiempo de compilación.
Flexibilidad: Facilita la implementación de algoritmos que funcionen con distintos tipos.

Un ejemplo practico es el de este proyecto donde almacenamos distintos tipos de datos en un contenedor, pero el contenedor es el mismo para todos, no usamos diferentes contenedores, usamos uno que es una clase generica y usa datos genericos para poder almacenar cualquier dato que necesitemos

## ¿Que son los datos genericos?

Los datos genéricos son los valores que se puede manejar usando clases genéricas. Por ejemplo, si se usa `Contenedor<String>`, el dato genérico sería un `String`, de igual manera si se utiliza otro tipo de dato. 

## Interpretación de las clases y datos genéricos
Abstracción: Proveen un mecanismo para trabajar con cualquier tipo de dato sin importar los detalles específicos del tipo.
Seguridad: El sistema de tipos asegura que el código sea consistente, reduciendo errores relacionados con conversiones de tipos.
Reutilización: Permiten implementar algoritmos y estructuras de datos independientes del tipo de dato, como listas, pilas, colas, y más.
Legibilidad: Aunque añaden complejidad inicial, hacen que el código sea más claro y menos redundante a largo plazo.
Este concepto es ampliamente utilizado en bibliotecas estándar como la colección de Java (List, Map, Set),etc.