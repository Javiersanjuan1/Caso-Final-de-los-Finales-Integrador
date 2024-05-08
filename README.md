# Caso-Final-de-los-Finales-Integrador
https://github.com/Javiersanjuan1/Caso-Final-de-los-Finales-Integrador.git
Ejercicio 1:
1---B
2---B
3---B
4---B
5---B
Ejercicio 2:
1---C
2:Una tabla Hash permite acceso rápido a los datos mediante una función de hash, ideal para búsquedas eficientes y sin necesidad de orden. Los árboles, como los árboles binarios de búsqueda, mantienen un orden entre los elementos, lo que facilita las operaciones de búsqueda, inserción y eliminación en tiempo logarítmico.Se puede utilizar una tabla Hash cuando se necesite rapidez promedio en operaciones y el orden no sea importante, mientras que los árboles son adecuados para estructurar datos de manera ordenada y eficiente.
3:Una pila sigue el principio LIFO, mientras que una cola sigue el principio FIFO. Las pilas son útiles para acceso rápido al último elemento agregado, como en el seguimiento de llamadas a funciones, mientras que las colas son ideales para gestionar tareas en espera en el orden de llegada, como en la impresión en cola. Ambas estructuras tienen una complejidad computacional constante, O(1), para operaciones básicas.
4:El método de ordenación por inserción implica tomar cada elemento de la lista y colocarlo en su posición correcta dentro de la porción ya ordenada de la lista. Para el conjunto de datos (50, 20, 84, 13, 22, 16, 89, 85), se realizarían las siguientes iteraciones:

1. [50, 20, 84, 13, 22, 16, 89, 85]
2. [20, 50, 84, 13, 22, 16, 89, 85]
3. [20, 50, 84, 13, 22, 16, 89, 85]
4. [13, 20, 50, 84, 22, 16, 89, 85]
5. [13, 20, 22, 50, 84, 16, 89, 85]
6. [13, 16, 20, 22, 50, 84, 89, 85]
7. [13, 16, 20, 22, 50, 84, 85, 89]
Ejercicio 3
a) Imprime el número 1
b) El código intenta calcular la potencia de un número 'a' elevado a 'b'. Emplea recursividad, donde la función recursiva utiliza la técnica de recursividad de cola (tail recursion). Sin embargo, la implementación falla al manejar adecuadamente el caso cuando 'b' es negativo, lo que provoca un bucle infinito debido a una recursión incorrecta.
Ejercicio 4
Este algoritmo utiliza recursividad lineal, ya que cada llamada recursiva solo realiza una operación y se hace exactamente una vez por cada dígito en el número. Por lo tanto, tiene una complejidad computacional O(d), donde 'd' es la cantidad de dígitos en el número.
Para el ejemplo dado, el número 102 tiene tres dígitos, por lo que el algoritmo realizará tres llamadas recursivas y su complejidad sería O(3), que es constante.
Ejercicio 5.1 explicacion:
Se seleccionaron las siguientes estructuras de datos para los atributos de la clase `UserAccount`: Se utilizó `String` para el `alias` del usuario debido a su naturaleza alfanumérica y los métodos útiles de manipulación de cadenas. Para representar el `email`, se empleó una clase personalizada `Email`, permitiendo la validación y manipulación eficiente de direcciones de correo electrónico. Las listas de `UserAccount` se eligieron para `followers` y `following`, facilitando que un usuario tenga múltiples seguidores y siga a otros usuarios. Además, se utilizó una lista de `Tweet` para `tweets`, posibilitando almacenar y acceder a los tweets de un usuario de manera efectiva. Estas decisiones proporcionan una estructura de datos adecuada para gestionar los atributos de la clase `UserAccount` de manera eficiente y organizada.
https://github.com/Javiersanjuan1/Caso-Final-de-los-Finales-Integrador.git
