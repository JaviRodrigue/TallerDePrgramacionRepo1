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
public class Autor {
    private String nombre, bio, origen;
    
    public Autor(String nombre, String bio, String origen){
        this.nombre = nombre;
        this.bio = bio;
        this.origen = origen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }
    
    
    public String totString(){
        String aux = ("Nombre: "+this.nombre+", Biografia: "+this.bio+", origen: "+this.origen);
        return aux;
    }
    
    
}
