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
public abstract class Empleados {
    private String nombre;
    private double sueldo;
    private int antigurdad;

    public Empleados(String nombre, double sueldo, int antigurdad) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.antigurdad = antigurdad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getAntigurdad() {
        return antigurdad;
    }

    public void setAntigurdad(int antigurdad) {
        this.antigurdad = antigurdad;
    }
    
    public abstract double calcularEfectividad();
    
    public double calcularSueldoACobrar(){
        double aux = (this.sueldo+((this.sueldo * 0.10)*this.antigurdad));
        return aux;
    }
    
    @Override
    public String toString(){
        String aux = "Nombre: "+this.nombre+", años de antiguedad: "+this.antigurdad;
        return aux;
    }
}
