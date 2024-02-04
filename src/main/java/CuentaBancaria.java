/**
 * Esta clase representa una cuenta bancaria que permite realizar operaciones como depósitos, retiros y aplicar intereses.
 */
public class CuentaBancaria {
    private double saldo;         // Saldo actual en la cuenta
    private double tasaInteres;   // Tasa de interés aplicada a la cuenta

    /**
     * Constructor de la clase CuentaBancaria. Inicializa la cuenta con un saldo inicial y una tasa de interés.
     *
     * @param saldoInicial El saldo inicial de la cuenta.
     * @param tasaInteres  La tasa de interés aplicada a la cuenta.
     */
    public CuentaBancaria(double saldoInicial, double tasaInteres) {
        this.saldo = saldoInicial;
        this.tasaInteres = tasaInteres;
    }

    /**
     * Realiza un depósito en la cuenta.
     *
     * @param monto El monto a depositar en la cuenta.
     * @throws IllegalArgumentException Si el monto es menor o igual a cero.
     */
    public void deposito(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto debe ser mayor a cero.");
        }
        this.saldo += monto;
    }

    /**
     * Realiza un retiro de la cuenta.
     *
     * @param monto El monto a retirar de la cuenta.
     * @throws IllegalArgumentException Si el monto es menor o igual a cero o si el monto excede el saldo disponible.
     */
    public void retiro(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto debe ser mayor a cero.");
        }
        if (monto > this.saldo) {
            throw new IllegalArgumentException("El monto excede el saldo disponible.");
        }
        this.saldo -= monto;
    }

    /**
     * Aplica la tasa de interés a la cuenta.
     */
    public void aplicarInteres() {
        this.saldo += this.saldo * this.tasaInteres;
    }

    /**
     * Obtiene el saldo actual de la cuenta.
     *
     * @return El saldo actual de la cuenta.
     */
    public double getSaldo() {
        return this.saldo;
    }

    /**
     * Obtiene la tasa de interés de la cuenta.
     *
     * @return La tasa de interés de la cuenta.
     */
    public double getTasaInteres() {
        return this.tasaInteres;
    }
}
