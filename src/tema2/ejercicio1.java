/*
1- Se dispone de la clase Persona (en la carpeta tema2). Un objeto persona puede crearse
sin valores iniciales o enviando en el mensaje de creación el nombre, DNI y edad (en ese
orden). Un objeto persona responde a los siguientes mensajes:
getNombre() retorna el nombre (String) de la persona
getDNI() retorna el dni (int) de la persona
getEdad() retorna la edad (int) de la persona
setNombre(X) modifica el nombre de la persona al “String” pasado por parámetro (X)
setDNI(X) modifica el DNI de la persona al “int” pasado por parámetro (X)
setEdad(X) modifica la edad de la persona al “int” pasado por parámetro (X)
toString() retorna un String que representa al objeto. Ej: “Mi nombre es Mauro,
mi DNI es 11203737 y tengo 70 años”
Realice un programa que cree un objeto persona con datos leídos desde teclado. Luego
muestre en consola la representación de ese objeto en formato String. 
 */
package tema2;

/**
 *
 * @author Javier
 */
import PaqueteLectura.Lector;

public class ejercicio1 {
    
    private String nom;
    private int dni;
    private int edad;
    
    public ejercicio1(String unNombre, int unDni, int unaEdad){
        nom = unNombre;
        dni = unDni;
        edad = unaEdad;
    }
    
    public int getDni(){
        return dni;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public String getNombre(){
        return nom;
    }
    
    public void setDni(int otroDni){
        dni = otroDni;
    }
    
    public void setEdad(int otraEdad){
        edad = otraEdad;
    }
    
    public void setNombre(String otroNombre){
        nom = otroNombre;
    }
    
    public String toString(){
        String aux;
        aux = "Mi nombre es "+nom+" Mi dni es "+dni+" y tengo "+edad;
        return aux;
    }
            
    public static void main(String[] args ){
        int dni,edad;
        String nom;
        System.out.println("Ingrese nombre:");
        nom = Lector.leerString();
        System.out.println("Ingrese dni:");
        edad = Lector.leerInt();
        System.out.println("ingres dni:");
        dni = Lector.leerInt();
       
        ejercicio1 intento = new ejercicio1(nom,dni,edad);
        System.out.println(intento.toString());
    }
}
