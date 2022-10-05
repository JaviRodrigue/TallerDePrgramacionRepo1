/*
2- Escriba un programa que lea las alturas de los 15 jugadores de un equipo de
básquet y las almacene en un vector. Luego informe:
- la altura promedio
- la cantidad de jugadores con altura por encima del promedio
NOTA: Dispone de un esqueleto para este programa en Ej02Jugadores.java

 */
package tema1;

import PaqueteLectura.Lector;
/**
 *
 * @author Javier
 */
public class ejercicio2 {
    public static void main(String[] args){
        double [] v = new double[15];
        double sum,prom;
        int cant;
        cant = 0;
        sum = 0;
        for(int i = 0;i < 15;i++){
            v[i] = Lector.leerDouble();
            sum = sum + v[i];
        }
        
        prom = sum /15;
        
        for(int j = 0;j < 15;j++){
            if(v[j] > prom)
                cant++;
        }
        System.out.println("La cantidad de jugadores mayores al prom("+prom+") es de: "+cant);
    }
}
