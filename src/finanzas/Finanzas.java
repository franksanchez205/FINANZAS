package finanzas;

public class Finanzas {
    private double ingresos;
    private double gastos;
    private double presupuesto;
    public Finanzas(double ingresos, double gastos, double presupuesto) {
        this.ingresos = ingresos;
        this.gastos = gastos;
        this.presupuesto = presupuesto;
    }
    public double calcularBalance() {
        return ingresos - gastos;
    }
    public boolean estaDentroDelPresupuesto() {
        return calcularBalance() <= presupuesto;
    }
    

}
