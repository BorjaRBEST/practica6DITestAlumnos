import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Esta clase representa un empleado con un salario bruto, impuestos y salario neto.
 */
public class Empleado {
    private double salarioBruto;   // Salario bruto del empleado
    private double impuesto;       // Impuestos y retenciones del salario bruto
    private double salarioNeto;    // Salario neto del empleado

    /**
     * Constructor de la clase Empleado. Inicializa el empleado con un salario bruto y calcula impuestos y salario neto.
     *
     * @param salarioBruto El salario bruto del empleado.
     */
    public Empleado(double salarioBruto) {
        this.salarioBruto = salarioBruto;
        impuesto = round2Decimals(salarioBruto * 0.14);  // Calcula los impuestos
        salarioNeto = salarioBruto - impuesto;          // Calcula el salario neto
    }

    /**
     * Método para redondear un número a 2 decimales.
     *
     * @param val El número a redondear.
     * @return El número redondeado a 2 decimales.
     */
    public static Double round2Decimals(Double val) {
        return new BigDecimal(val.toString()).setScale(2, RoundingMode.HALF_EVEN).doubleValue();
    }

    /**
     * Devuelve una representación en cadena del objeto Empleado.
     *
     * @return Una cadena que muestra el salario bruto, impuestos y salario neto del empleado.
     */
    @Override
    public String toString() {
        return "Salario Bruto: " + salarioBruto
                + "\nImpuestos y retenciones: " + impuesto
                + "\nSalario neto: " + salarioNeto;
    }

    /**
     * Obtiene el salario bruto del empleado.
     *
     * @return El salario bruto del empleado.
     */
    public double getSalarioBruto() {
        return salarioBruto;
    }

    /**
     * Establece el salario bruto del empleado.
     *
     * @param salarioBruto El nuevo salario bruto del empleado.
     */
    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    /**
     * Obtiene el monto de impuestos y retenciones aplicados al salario bruto.
     *
     * @return El monto de impuestos y retenciones.
     */
    public double getImpuesto() {
        return impuesto;
    }

    /**
     * Establece el monto de impuestos y retenciones.
     *
     * @param impuesto El nuevo monto de impuestos y retenciones.
     */
    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }

    /**
     * Obtiene el salario neto del empleado.
     *
     * @return El salario neto del empleado.
     */
    public double getSalarioNeto() {
        return salarioNeto;
    }

    /**
     * Establece el salario neto del empleado.
     *
     * @param salarioNeto El nuevo salario neto del empleado.
     */
    public void setSalarioNeto(double salarioNeto) {
        this.salarioNeto = salarioNeto;
    }
}
