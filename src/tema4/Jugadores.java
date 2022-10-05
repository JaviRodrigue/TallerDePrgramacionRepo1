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
public class Jugadores extends Empleados{
    private int nroPartidos;
    private int nroGoles;

    public Jugadores(int nroPartidos, int nroGoles, String nombre, double sueldo, int antigurdad) {
        super(nombre, sueldo, antigurdad);
        this.nroPartidos = nroPartidos;
        this.nroGoles = nroGoles;
    }

    public int getNroPartidos() {
        return nroPartidos;
    }

    public void setNroPartidos(int nroPartidos) {
        this.nroPartidos = nroPartidos;
    }

    public int getNroGoles() {
        return nroGoles;
    }

    public void setNroGoles(int nroGoles) {
        this.nroGoles = nroGoles;
    }
    
    @Override
    public double calcularEfectividad(){
        double promedio =(double) this.nroGoles / this.nroPartidos;
        return promedio;
    }
    
    public double calcularSueldo(){
        double promedio = this.calcularEfectividad();
        if(promedio > 0.5)
            return super.calcularSueldoACobrar() + super.getSueldo();
        else
            return super.calcularSueldoACobrar();
    }
    
    @Override
    public String toString(){
        String aux = super.toString() +", efectividad del jugador: "+this.calcularEfectividad()+", sueldo a cobrar del jugador: "+this.calcularSueldo();
        return aux;
    }
}
