//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import javax.swing.JOptionPane;

import gastos.Gastos;
import ingresos.Ingresos;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de Ingresos
        String fuente1 = JOptionPane.showInputDialog("Ingrese la fuente de ingreso:");
        double monto1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto del ingreso:"));
        Ingresos ingreso1 = new Ingresos(fuente1, monto1);

        
        String fuente2 = JOptionPane.showInputDialog("Ingrese la fuente de ingreso:");
        double monto2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto del ingreso:"));
        Ingresos ingreso2 = new Ingresos(fuente2, monto2);

        // Mostrar los ingresos
        JOptionPane.showMessageDialog(null, "Ingreso 1: " + ingreso1.getFuente() + " - $" + ingreso1.getMonto());
        JOptionPane.showMessageDialog(null, "Ingreso 2: " + ingreso2.getFuente() + " - $" + ingreso2.getMonto());

        // Crear instancias de Gastos
        String categoria1 = JOptionPane.showInputDialog("Ingrese la categoría del gasto:");
        double monto1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto del gasto:"));
        Gastos gasto1 = new Gastos(categoria1, monto1);
        String categoria2 = JOptionPane.showInputDialog("Ingrese la categoría del gasto:");
        double monto2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto del gasto:"));
        Gastos gasto2 = new Gastos(categoria2, monto2);

        // Mostrar los gastos
        JOptionPane.showMessageDialog(null, "Gasto 1: " + gasto1.getCategoria() + " - $" + gasto1.getMonto());
        JOptionPane.showMessageDialog(null, "Gasto 2: " + gasto2.getCategoria() + " - $" + gasto2.getMonto());
        // Calcular el balance y verificar el presupuesto
        double totalIngresos = ingreso1.getMonto() + ingreso2.getMonto();
        double totalGastos = gasto1.getMonto() + gasto2.getMonto();
        double presupuesto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su presupuesto mensual:"));
        finanzas.Finanzas finanzas = new finanzas.Finanzas(totalIngresos, totalGastos, presupuesto);
        double balance = finanzas.calcularBalance();
        boolean dentroPresupuesto = finanzas.estaDentroDelPresupuesto();
        // Mostrar el balance y si está dentro del presupuesto
        JOptionPane.showMessageDialog(null, "Balance: $" + balance);
        if (dentroPresupuesto) {
            JOptionPane.showMessageDialog(null, "¡Estás dentro del presupuesto!");
        } else {
            JOptionPane.showMessageDialog(null, "¡Has excedido el presupuesto!");

        }
        gastos.Gastos gasto3 = new gastos.Gastos("Transporte", 50.0);
        JOptionPane.showMessageDialog(null, "Gasto 3: " + gasto3.getCategoria() + " - $" + gasto3.getMonto());
            ingresos.Ingresos ingreso3 = new ingresos.Ingresos("Freelance", 200.0);
        JOptionPane.showMessageDialog(null, "Ingreso 3: " + ingreso3.getFuente() + " - $" + ingreso3.getMonto());
        


        
    
      
        

      



    }
}