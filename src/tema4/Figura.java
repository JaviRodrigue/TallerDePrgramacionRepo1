/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;


public abstract class Figura {
    private String Relleno;
    private String Borde;

    public Figura(String Relleno, String Borde) {
        this.Relleno = Relleno;
        this.Borde = Borde;
    }

    public String getRelleno() {
        return Relleno;
    }

    public void setRelleno(String Relleno) {
        this.Relleno = Relleno;
    }

    public String getBorde() {
        return Borde;
    }

    public void setBorde(String Borde) {
        this.Borde = Borde;
    }
    
    
    @Override
    public String toString(){
        String aux = "Area: " + this.calcularArea() +
                     " CR: "  + getRelleno() + 
                      " CL: " + getBorde();             
             return aux;
       }
    
    public abstract double calcularArea();
    public abstract double calcularPerimetro();
    
    public void despintar(){
        this.Relleno = "blanco";
        this.Borde = "negro";
    }
     
}
