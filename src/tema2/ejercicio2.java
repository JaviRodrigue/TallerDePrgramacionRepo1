/*
2- Utilizando la clase Persona. Realice un programa que almacene en un vector a lo sumo
15 personas. La información (nombre, DNI, edad) se debe generar aleatoriamente hasta
obtener edad 0. Luego de almacenar la información:
 - Informe la cantidad de personas mayores de 65 años.
 - Muestre la representación de la persona con menor DNI.
 */
package tema2;

/**
 *
 * @author Javier
 */
import PaqueteLectura.GeneradorAleatorio;
public class ejercicio2 {
    public static void main(String[] args){
        GeneradorAleatorio.iniciar();
        Persona [] v = new Persona[15];
        String nom;
        int edad,dni,dimL,cant,min,minPos;
        cant = 0;
        dimL = 0;
        min = 9999;
        minPos = -1;
        edad = GeneradorAleatorio.generarInt(99);
        while((edad != 0) && (dimL < 15)){
            dni = GeneradorAleatorio.generarInt(9999);
            nom = GeneradorAleatorio.generarString(10);
            Persona p = new Persona(nom,dni,edad);
            v[dimL] = p;
            System.out.println("Nombre: "+nom+", edad: "+edad+", dni: "+dni);
            if(edad > 65)
                cant++;
            dimL++;
            edad = GeneradorAleatorio.generarInt(99);
        }
        
        System.out.println("La cantidad de personas mayores de 65 años es: "+cant);
        
        for(int i = 0; i < dimL;i++){
            if(v[i].getDNI()< min){
                min = v[i].getDNI();
                minPos = i;
            }
        }
        System.out.println("La persona con el dni mas chico es.....");
        System.out.println(v[minPos]);
    }
}
