package ingresos;

public class Ingresos {
    private String fuente;
    private double monto;
    public Ingresos(String fuente, double monto) {
        this.fuente = fuente;
        this.monto = monto;
    }
    public String getFuente() {
        return fuente;
    }
    public double getMonto() {
        return monto;
    }
}
