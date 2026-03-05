//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Crear instancias de Ingresos
        ingresos.Ingresos ingreso1 = new ingresos.Ingresos("Salario", 3000);
        ingresos.Ingresos ingreso2 = new ingresos.Ingresos("Freelance", 1500);

        // Crear instancias de Gastos
        gastos.Gastos gasto1 = new gastos.Gastos("Alquiler", 1000);
        gastos.Gastos gasto2 = new gastos.Gastos("Comida", 500);

        // Calcular finanzas
        finanzas.Finanzas finanzas = new finanzas.Finanzas(
                ingreso1.getMonto() + ingreso2.getMonto(),
                gasto1.getMonto() + gasto2.getMonto(),
                2000 // Presupuesto
        );

        // Mostrar resultados
        System.out.println("Balance: " + finanzas.calcularBalance());
        System.out.println("¿Está dentro del presupuesto? " + finanzas.estaDentroDelPresupuesto());
        



    }
}