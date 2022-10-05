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
import PaqueteLectura.Lector;

public class Ejercicio1 {
    private double lado1, lado2, lado3;
    private String relleno, borde;
    
    public Ejercicio1(double lad1, double lad2, double lad3, String rell, String bord){
        this.lado1 = lad1;
        this.lado2 = lad2;
        this.lado3 = lad3;
        this.relleno = rell;
        this.borde = bord;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    public String getRelleno() {
        return relleno;
    }

    public void setRelleno(String relleno) {
        this.relleno = relleno;
    }

    public String getBorde() {
        return borde;
    }

    public void setBorde(String borde) {
        this.borde = borde;
    }
    
    
    public double calcularPerimetro(){
        double sum = this.lado1 + this.lado2 + this.lado3;
        return sum;
    }
    
    public double calcularArea(){
        double s = calcularPerimetro() / 2;
        double a = Math.sqrt(s*(s - this.lado1)*(s - this.lado2)*(s - this.lado3));
        return a;
    }
    
    @Override
    public String toString(){
        String aux = ("Lado 1: "+this.lado1+", Lado 2: "+this.lado2+", Lado 3: "+this.lado3+", perimetro: "+calcularPerimetro()+", Area: "+calcularArea());
        return aux;
    }
    
    
    public static void main(String[] args){
        int lad1, lad2, lad3;
        String relleno, borde;
        
        System.out.println("Ingrese el primer lado: ");
        lad1 = Lector.leerInt();
        System.out.println("Ingrese el segundo lado: ");
        lad2 = Lector.leerInt();
        System.out.println("Ingrese el tercer lado: ");
        lad3 = Lector.leerInt();
        System.out.println("Ingrese ek color de relleno: ");
        relleno = Lector.leerString();
        System.out.println("Ingrese el borde: ");
        borde = Lector.leerString();
        
        Ejercicio1 triangulo = new Ejercicio1(lad1,lad2,lad3,relleno,borde);
        System.out.println(triangulo);
    }
}
