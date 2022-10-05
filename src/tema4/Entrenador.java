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
public class Entrenador extends Empleados{
    private int cantChampionWin;

    public Entrenador(int cantChampionWin, String nombre, double sueldo, int antigurdad) {
        super(nombre, sueldo, antigurdad);
        this.cantChampionWin = cantChampionWin;
    }

    public int getCantChampionWin() {
        return cantChampionWin;
    }

    public void setCantChampionWin(int cantChampionWin) {
        this.cantChampionWin = cantChampionWin;
    }
    
    @Override
    public double calcularEfectividad(){
        double promedio =(double) this.cantChampionWin / super.getAntigurdad();
        return promedio;
    }
    
    public double calcularSueldo(){
        if((this.cantChampionWin >= 1) && (this.cantChampionWin <=4))
            return super.calcularSueldoACobrar() + 5000;
        else if((this.cantChampionWin >= 5) && (this.cantChampionWin <=10))
            return super.calcularSueldoACobrar() + 30000;
        else if(this.cantChampionWin > 10)
            return super.calcularSueldoACobrar() + 50000;
        else
            return super.calcularSueldoACobrar();
    }
    
    @Override
    public String toString(){
        String aux = super.toString() + ", la efectividad del entrenador es de: "+this.calcularEfectividad()+", el sueldo a cobrar del entrenador es de: "+this.calcularSueldo();
        return aux;
    }
}
