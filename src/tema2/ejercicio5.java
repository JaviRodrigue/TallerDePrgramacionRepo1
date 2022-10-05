/*
5- Se dispone de la clase Partido (en la carpeta tema2). Un objeto partido representa un
encuentro entre dos equipos (local y visitante). Un objeto partido puede crearse sin
valores iniciales o enviando en el mensaje de creación el nombre del equipo local, el
nombre del visitante, la cantidad de goles del local y del visitante (en ese orden). Un objeto
partido sabe responder a los siguientes mensajes:
getLocal() retorna el nombre (String) del equipo local
getVisitante() retorna el nombre (String) del equipo visitante
getGolesLocal() retorna la cantidad de goles (int) del equipo local
getGolesVisitante() retorna la cantidad de goles (int) del equipo visitante
setLocal(X) modifica el nombre del equipo local al “String” X
setVisitante(X) modifica el nombre del equipo visitante al “String” X
setGolesLocal(X) modifica la cantidad de goles del equipo local al “int” X
setGolesVisitante(X) modifica la cantidad de goles del equipo visitante al “int” X
hayGanador() retorna un boolean que indica si hubo (true) o no hubo (false) ganador
getGanador() retorna el nombre (String) del ganador del partido (si no hubo retorna
un String vacío).
hayEmpate() retorna un boolean que indica si hubo (true) o no hubo (false) empate

Implemente un programa que cargue un vector con a lo sumo 20 partidos disputados en
el campeonato. La información de cada partido se lee desde teclado hasta ingresar uno con
nombre de visitante “ZZZ” o alcanzar los 20 partidos. Luego de la carga:
- Para cada partido, armar e informar una representación String del estilo:
{EQUIPO-LOCAL golesLocal VS EQUIPO-VISITANTE golesVisitante }
- Calcular e informar la cantidad de partidos que ganó River.
- Calcular e informar el total de goles que realizó Boca jugando de local.
 */
package tema2;

/**
 *
 * @author Javier
 */
import PaqueteLectura.Lector;

public class ejercicio5 {
    public static void main(String[] args){
        Partido [] v = new Partido[20];
        String local, visitante;
        int golLocal, golVisitante,dimL,cantLocal,cantVisitante;
        cantLocal = 0;
        cantVisitante = 0;
        dimL = 0;
        
        System.out.println("Ingrese Nombre del equipo visitante;");
        visitante = Lector.leerString();
        while((dimL < 20) && !(visitante.equals("ZZZ"))){
            System.out.println("Ingrese los goles del equipo visitante: ");
            golVisitante = Lector.leerInt();
            System.out.println("Ingrese el nombre del equipo local:");
            local = Lector.leerString();
            System.out.println("Ingrese los goles del equipo local;");
            golLocal = Lector.leerInt();
            Partido p = new Partido(local,visitante,golLocal,golVisitante);
            v[dimL] = p;
            dimL++;
            System.out.println("Ingrese Nombre del equipo visitante;");
            visitante = Lector.leerString();
        }
        
        for(int j = 0; j < dimL; j++){
            System.out.println("Fecha numero "+(j+1));
            System.out.println("|"+v[j].getLocal()+"| goles:"+v[j].getGolesLocal()+" VS |"+v[j].getVisitante()+"| goles:"+v[j].getGolesVisitante());
            if(v[j].getGanador().equals(v[j].getLocal())){
                cantLocal++;
            }
            else if(v[j].getGanador().equals(v[j].getVisitante())){
                    cantVisitante++;        
            }
        }
        
        System.out.println("La cantidad de veces que gano el equipo de local fue: "+cantLocal);
        System.out.println("La cantidad de veces que gano el equipo de visitante fue: "+cantVisitante);
    }
}
