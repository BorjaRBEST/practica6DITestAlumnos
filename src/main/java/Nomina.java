import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Esta clase representa un programa de nómina que calcula salarios brutos, retenciones y salarios netos para un número de empleados.
 */
public class Nomina {

    /**
     * El método principal del programa.
     *
     * @param args Los argumentos de la línea de comandos. Se espera que los argumentos sean el número de empleados y el salario inicial en euros.
     */
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]); // número de empleados
        double salario = Double.parseDouble(args[1]); // Salario en euros
        Empleado[] empleados = new Empleado[n];
        empleados[0] = new Empleado(salario);
        for (int i = 1; i < empleados.length; i++) {
            salario *= 1.10;
            empleados[i] = new Empleado(salario);
        }
        double salariosBrutos = 0;
        double retenciones = 0;
        double salariosNetos = 0;
        for (int i = 0; i < empleados.length; i++) {
            salariosBrutos += empleados[i].getSalarioBruto();
            retenciones += empleados[i].getImpuesto();
            salariosNetos += empleados[i].getSalarioNeto();
            System.out.println("Empleado #" + (i + 1) + ":\n" + empleados[i]);
        }
        System.out.println("\n\nTotal en retenciones: " + retenciones
                + "\nTotal en salarios netos: " + salariosNetos
                + "\nTotal a pagar en nómina: " + salariosBrutos);
    }
}
