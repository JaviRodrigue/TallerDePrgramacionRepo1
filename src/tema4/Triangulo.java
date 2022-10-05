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
public class Triangulo extends Figura{
    private int lado1;
    private int lado2;
    private int lado3;

    public Triangulo(int lado1, int lado2, int lado3, String Relleno, String Borde) {
        super(Relleno, Borde);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public int getLado3() {
        return lado3;
    }

    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }
    
    @Override
    public double calcularPerimetro(){
        double aux = this.lado1 + this.lado2 + this.lado3;
        return aux;
    }
    
    @Override
    public double calcularArea(){
        double aux = this.calcularPerimetro() / 2;
        return(Math.sqrt(aux*(aux - lado1)*(aux - lado2)*(aux - lado3)));
        
    }
    
    @Override
    public String toString(){
        String aux = "Lado 1: "+this.lado1
                    +" Lado 2: "+this.lado2
                    +" Lado 3: "+this.lado3
                    +" Perimetro: "+this.calcularPerimetro()
                    +super.toString();
        return aux;
    }
    
}
