/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;

/**
 *
 * @author Javier
 */
public class Estantes {
    private Libro [] vector;
    private int cantLibros;
    
    public Estantes(){
        this.vector = new Libro[20];
        this.cantLibros = 0;
    }

    public Libro[] getVector() {
        return vector;
    }

    public void setVector(Libro[] vector) {
        this.vector = vector;
    }

    public int getCantLibros() {
        return cantLibros;
    }

    public void setCantLibros(int cantLibros) {
        this.cantLibros = cantLibros;
    }
    
    public boolean estanteLleno(){
        return (cantLibros == this.vector.length);
    }
    
    public void agregarUnLibro(Libro unLibro){
        this.vector[this.cantLibros] = unLibro;
    }
    
    public Libro buscarLibro(Libro unLibro){
        boolean ok = false;
        int i = 0;
        int pos = -1;
        while(!(ok) && (i < this.cantLibros)){
            if(this.vector[i].equals(unLibro)){
                ok = true;
                pos = i;   
            }
            i++;
        }
        if(ok)
            return this.vector[pos];
        else
            return null;
    }
    
    
}
