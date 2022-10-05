/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

/**
 *
 * @author Javier
 */
public class Circulo extends Figura{
    private double radio;

    public Circulo(double radio, String Relleno, String Borde) {
        super(Relleno, Borde);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    @Override
    public double calcularPerimetro(){
        return (2*2.1431*this.radio);
    }
    
    @Override
    public double calcularArea(){
        return (2.1431*(this.radio * this.radio));
    }
    
    @Override
    public String toString(){
        String aux = "Radio: "+this.radio
                    +super.toString();
        return aux;
    }
}
