/*
4- Se realizará un casting para un programa de TV. El casting durará a lo sumo 5 días y en
cada día se entrevistarán a 8 personas en distinto turno.
a) Simular el proceso de inscripción de personas al casting. A cada persona se le pide
nombre, DNI y edad y se la debe asignar en un día y turno de la siguiente manera: las
personas primero completan el primer día en turnos sucesivos, luego el segundo día y así
siguiendo. La inscripción finaliza al llegar una persona con nombre “ZZZ” o al cubrirse los
40 cupos de casting.
Una vez finalizada la inscripción:
b) Informar para cada día y turno el nombre de la persona a entrevistar.
NOTA: utilizar la clase Persona y pensar en la estructura de datos a utilizar. 
 */
package tema2;

/**
 *
 * @author Javier
 */
import PaqueteLectura.GeneradorAleatorio;

public class ejercicio4 {
    public static void main(String[] args){
        GeneradorAleatorio.iniciar();
        String nom;
        int edad,dni,dimF,dimC,i,j,dimLT,dimLT2;
        dimF =0;
        dimLT = 0;
        dimLT2 = 0;      
        i = 0;
        Persona [][] m = new Persona[4][8];
        nom = GeneradorAleatorio.generarString(10);
        while(!(nom.equals("ZZZ")) && (dimF < 4)){
            dimC=0;
            while(!(nom.equals("ZZZ")) && (dimC < 8)){
                edad = GeneradorAleatorio.generarInt(99);
                dni = GeneradorAleatorio.generarInt(9999);
                Persona p = new Persona(nom,dni,edad);
                m[dimF][dimC] = p;
                System.out.println("Nombre: "+nom+", dni: "+dni+", edad: "+edad);
                nom = GeneradorAleatorio.generarString(10);
                dimC++;
                dimLT++;
            }
            dimF++;
        }
        
        while((dimLT2 < dimLT) && (i < 4)){
            j = 0;
            while((dimLT2 < dimLT) && (j < 8)){
                System.out.println("DIa: "+i+", Turno: "+j+", Persona entrevistada: "+m[i][j].getEdad());
                j++;
            }
            i++;
        }
    }
}
