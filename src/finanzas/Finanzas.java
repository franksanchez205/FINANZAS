package finanzas;

public class Finanzas {
   private double totalIngresos;
    private double totalGastos;
    private double presupuesto;
    public Finanzas(double totalIngresos, double totalGastos, double presupuesto) {
        this.totalIngresos = totalIngresos;
        this.totalGastos = totalGastos;
        this.presupuesto = presupuesto;
    }
    public double calcularBalance() {
        return totalIngresos - totalGastos;
    }
    public boolean estaDentroDelPresupuesto() {
        return totalGastos <= presupuesto;
    }
    

}
