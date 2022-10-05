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
public class Ejercicio1 {
    public static void main(String[] args){
        
        Circulo cir = new Circulo(65,"morado","naranja");
        Triangulo tri = new Triangulo(25,41,65,"azul","lila");
        
        System.out.println(cir);
        System.out.println(tri);
        
        cir.despintar();
        tri.despintar();
        
        System.out.println(cir);
        System.out.println(tri);
        
        
    }
}
