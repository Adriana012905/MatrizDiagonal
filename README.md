# MatrizDiagonal

## Introducción

La ordenación es una aplicación fundamental en computación. La mayoría de los datos producidos por un programa están ordenados de alguna manera, y muchos de los cómputos que tiene que realizar un programa son más eficientes si los datos sobre los que operan están ordenados. Los procesos de búsqueda involucran recorrer un arreglo completo con el fin de encontrar algo. Por lo tanto, la velocidad de ejecución depende linealmente del tamaño del arreglo. Antes de considerar algoritmos específicos, debemos pensar en las operaciones que se pueden utilizar para analizar un proceso de ordenamiento. Primero, será necesario comparar dos valores para ver cuál es más pequeño (o más grande).  En segundo lugar, cuando los valores no están en la posición correcta con respecto a los otros, puede ser necesario intercambiarlos. Este intercambio es una operación costosa y el número total de intercambios también será importante para evaluar la eficiencia global del algoritmo.
En el siguiente informe se dará una explicación sobre la solución del problema propuesto, los detalles del algoritmo de solución, sus casos de prueba y así mismo la manera como se desarrolló la aplicación completa, con main y lectura de datos.


## Desarrollo
Una matriz diagonal es una línea diagonal de celdas que comienza en alguna celda en la fila superior o en la columna más a la izquierda y va en la dirección inferior derecha hasta llegar al final de la matriz. Por ejemplo, la matriz diagonal a partir de mat[2][0], donde mat es una matriz de 6 x 3, incluye las celdas mat[2][0], mat[3][1] y mat[4][2 ].
Dada una matriz m x n de enteros, ordene cada matriz diagonal en orden ascendente y devuelva la matriz resultante.
Ejemplo 1:

![image](https://user-images.githubusercontent.com/71104365/199130750-4fd2b05b-ce17-4b01-ae02-7e3212f158eb.png)

 

Entrada: mat = [[3,3,1,1],[2,2,1,2],[1,1,1,2]]
Salida: [[1,1,1,1],[1,2,2,2],[1,2,3,3]]

Solución
La solución fácil aquí es leer cada fila diagonal, luego ordenarla y luego volver a escribirla. Para leer la línea diagonal, puede ser mejor pensar que las filas se extienden hacia la izquierda y hacia la derecha.

![image](https://user-images.githubusercontent.com/71104365/199130760-a22462bb-466a-49ba-bac1-29ec55980698.png)


Para una matriz (M) de alto y y ancho x, para obtener todas las filas diagonales, necesitaríamos extender los valores de i a la izquierda por y - 1 (la celda de la esquina cuenta tanto en x como en y lados). Pero en este caso, podemos ignorar la primera y la última fila diagonal, ya que solo contienen una celda cada una y, por lo tanto, no es necesario ordenarlas. Eso significa que el rango de i debería ser 0 - (y - 2) <= i <= x - 1, o 2 - y <= i <= x - 1.
Luego, podemos iterar a través de estas diagonales y almacenar los valores de celda válidos en una matriz (diag). Después de ordenar diag, podemos iterar hacia atrás a través de la diagonal y reemplazar las celdas válidas con el valor ordenado apropiado.
Para evitar una lógica compleja que involucre límites de matriz, podemos usar una dimensión fija para diag junto con un índice, k. En este caso, y representa la longitud máxima de diag.

**METODO QUE DA SOLUCION AL PROBLEMA:
 

![image](https://user-images.githubusercontent.com/71104365/199130797-e239e1ec-e99f-4de8-b07d-33500a4424f7.png)







##GENERAR 100 CASOS DE PRUEBA ALEATORIOS

1.	Se creo una clase matriz con un constructor sin parámetros y un constructor con un parámetro booleano que indica si se desea crear una matriz cuadrada o rectangular, y se genera un numero aleatorio que indicará la cantidad de filas y columnas que tendrá la matriz. 

![image](https://user-images.githubusercontent.com/71104365/199130845-09f87054-712a-4c91-b73d-24186c7b5a3f.png)

 

2.	Se invoca al método crearMatriz() el cual verifica que la matriz no sea nula, y crea los elementos de manera aleatoria para las filas y columnas de la matriz.
 
![image](https://user-images.githubusercontent.com/71104365/199130874-6c81e50b-c848-4f4c-a8d2-0017f0eafc63.png)


3.	En nuestra clase de prueba generamos dos ciclos donde cada uno de ellos invoca a la clase matriz y 50 casos de prueba, de matrices cuadradas y rectangulares respectivamente. 

![image](https://user-images.githubusercontent.com/71104365/199130891-d56c10ff-0b51-4840-863f-9a112ffb0eaa.png)

 
4.	Creamos un archivo de texto plano en donde se podrán visualizar cada uno de los casos de prueba que fueron generados:

![image](https://user-images.githubusercontent.com/71104365/199130913-0c1bb1f8-3f6f-4b83-a4da-fb4833aa15e4.png)

 
## DESARROLLAR UNA APLICACIÓN COMPLETA, CON MAIN Y LECTURA DE DATOS

Se realizo una aplicación que indica al usuario los datos que debe ingresar para llevar a cabo una correcta ejecución del programa y visualizar la matriz ordenada en diagonal.
 

![image](https://user-images.githubusercontent.com/71104365/199130962-3bef40de-92d4-4c93-995c-4e95c42706d8.png)





## CONCLUSIONES

•	La búsqueda permite encontrar un elemento particular en el conjunto, mientras que el ordenamiento consiste en ubicar los datos atendiendo a un criterio de manera que sea más fácil encontrar el elemento que se requiere o identificar las relaciones entre los datos.

•		Se uso el método sort()  el cual ayudó  a ordenar los elementos de la matriz ya que  puede ordenar un determinado número de veces, con combinaciones entre ellos, de modo que pueda ponderar el orden, hasta quedar completamente ordenados los elementos.

•	Realizar el código en  Java  permite ahorrar tiempo al solo tener que ordenar una matriz parcial.

•	Con la utilización de casos de prueba medimos la funcionalidad de la aplicación a través de un conjunto de ciertas acciones o condiciones esto ayudó a verificar los resultados esperados.




## Referencias

Matriz Diagonal (2020) https://es.stackoverflow.com/questions/407618/c%C3%B3mo-puedo-recorrer-una-matriz-de-forma-diagonal-en-java

Visure (2022) https://visuresolutions.com/es/what-are-test-cases-how-to-write-software-related-test-cases/



