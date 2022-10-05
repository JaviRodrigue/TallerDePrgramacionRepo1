/**1- Analice el programa Ej01Tabla2.java, que carga un vector que representa la
tabla del 2. Luego escriba las instrucciones necesarias para:
- generar enteros aleatorios hasta obtener el número 11. Para cada número
muestre el resultado de multiplicarlo por 2 (accediendo al vector).**/
package tema1;

/**
 *
 * @author Javier
 */
import PaqueteLectura.GeneradorAleatorio;

public class ejercicio1 {
    
    public static void main(String[] args){
        GeneradorAleatorio.iniciar();
        int [] v = new int[11];
        int i;
        for(i = 0;i < 11 ; i++){
            v[i] = GeneradorAleatorio.generarInt(10);
            System.out.println("2 * "+v[i]+"="+v[i]*2);
        }
        
    }
}
