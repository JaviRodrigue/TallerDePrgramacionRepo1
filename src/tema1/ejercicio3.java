/*
3- Escriba un programa que defina una matriz de enteros de tamaño 5x5. Inicialice
la matriz con números aleatorios entre 0 y 30.
Luego realice las siguientes operaciones:
- Mostrar el contenido de la matriz en consola.
- Calcular e informar la suma de los elementos de la fila 1
- Generar un vector de 5 posiciones donde cada posición j contiene la suma
de los elementos de la columna j de la matriz. Luego, imprima el vector.
- Lea un valor entero e indique si se encuentra o no en la matriz. En caso de
encontrarse indique su ubicación (fila y columna) en caso contrario
imprima “No se encontró el elemento”.

 */
package tema1;

import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;
/**
 *
 * @author Javier
 */


public class ejercicio3 {
    public static void main(String[] args){
        
        int [][] m = new int[5][5];
        
        int x;
        int sum = 0,z = 0;
        
        boolean bus = false;
        
        int [] v = new int[5];
        GeneradorAleatorio.iniciar();
        for(int i = 0; i < 5;i++){
            for(int j = 0; j < 5;j++){
                m[i][j] = GeneradorAleatorio.generarInt(31);
                System.out.println("Fila "+i+" Columna "+j+" Valor: "+m[i][j]);
            }
        }
        
        for(int q = 0; q < 5;q++){
            for(int k = 0; k < 5;k++){
                sum = sum + m[q][k];
            }
            v[q] = sum;
            System.out.println("La suma de los valores de la fila "+q+" es: "+v[q]);
            sum = 0;
        }
        System.out.println("Ingrese valor a buscar");
        int valor = Lector.leerInt();
        
        while((z < 5) && !(bus)){
            x = 0;
            while((x < 5) && !(bus)){
                if(valor == m[z][x]){
                    bus = true;
                }
                x++;
            }
            z++;
        }
        if(bus)
            System.out.println("el valor "+valor+" si se encuentra en la matriz");
        else
            System.out.println("El valor "+valor+" No se encuentran en la matriz");
    }
}
