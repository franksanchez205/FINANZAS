package gastos;

public class Gastos {
    private String categoria;
    private double monto;
    public Gastos(String categoria, double monto) {
        this.categoria = categoria;
        this.monto = monto;
    }
    public String getCategoria() {
        return categoria;
    }
    public double getMonto() {
        return monto;
    }
    
}
