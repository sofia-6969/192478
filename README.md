## Ejercicio 2 – **La Notablísima Prueba™**

> El Ministerio de Evaluaciones Sin Sentido ha encargado un sistema para evaluar estudiantes, pero el programador que lo hizo estaba más enfocado en su café que en la lógica. Este programa:
> 
1. Recibe **3 notas por estudiante**.
2. Calcula el promedio.
3. Si el promedio es **mayor o igual a 3.0**, el estudiante aprueba.
4. Se evalúan exactamente **4 estudiantes**.
5. Al final, se imprime cuántos aprobaron.

ejercicio2:
-empece con un for porque necesitaba un ciclo y en el ejercicio me decia hasta donde tenia que llegar el programa (4) por lo tanto me parecio mas facil usar el for
-en el ejercicio me decia que tenia que pedir tres notas entonce le meti 3 out con sus respectivos nextfloat (nextfloat porque los datos que entraban podian estar en decimales) para la entrada de datos
-como tengo que sacar el promedio de las tres notas que pedi anteriormente, hago una variable llamada promedio y hago directamente la operacion con los datos ingresados (para sacar el promedio de n notas se deben sumar las notas y dividir por la cantidad de notas ingresadas)
-en el ejercicio me pide que tengo que mirar si el estudiante aprueba con su promedio y me da la condicion de que el promedio tiene que ser mayor o igual a 3.0 y eso sale con un if
-en el if que hice puse la condicio de si promedio es mayor o igual a 3.0 entonces se tenia que sumar un aprobado
-me di de cuenta que para hacer que suba un aprobado tenia que poner un contador de aprobados, entonces, hice una variable llamada aprobados igual a 0 y cada vez que se cumpla el if esta variable sumara 1
-una vez fuera del for, para terminar hice un out en el cual diga cuantos estudiantes aprobaron y usando la variable aprobados.
-al final cerre el objeto imput y yap 
-fin


optimizar programa:
- primero le cambio el nombre al objeto de escaner por un input que es mas claro en comparacion a la porqueria esa
- cambie el nombre de la variable del numero de usuario por numUsuarios que lo hace mas claro a la hora de leerlo
- en el tipo de datos de numUsuario lo cambie por un byte ya que el numero que entra no es muy grande 
- cambie el nombre de la variable donde pide el nombre de usuario a nombreUsuario para una mejor lectura
- cambie el nombre de la valiable contador porque segun yo esa vaina esta contando algo por ahi
- cambie el tipo de dato de la variable contador por un int ya que cuando intente cambiarlo a un tipo de dato de menor rango a int me daba error :p
- cambie el nombre de las variables E1, E2, E3, por primeraEdad, segundaEdad y terceraEdad para facilitar la lectura
- a las variable primera, segunda y tercera edad el cambie el tipo de dato a un byte porque el rango de numeros que se utiliza no es muy grande
- cambie el nombre de la variable A por edadUsuario ya que de esta forma es mas claro
- cambie el nombre de la variable N1, N2 y N3 por primerNombre, segundoNombre y tercerNombre para mejorar la lectura
- cambie el tipo de dato de edadUsuario a un byte porque el rango de numero que utiliza esta variable es un rango bajo que entra en el byte

