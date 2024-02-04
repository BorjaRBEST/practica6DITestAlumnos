import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import static org.junit.Assert.*;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        CuentaBancariaTest.DepositoTest.class,
        CuentaBancariaTest.RetiroTest.class,
        CuentaBancariaTest.InteresTest.class
})
public class CuentaBancariaTest {

    public static class DepositoTest {
        private CuentaBancaria cuenta;

        @Before
        public void setUp() {
            cuenta = new CuentaBancaria(1000, 0.01);
        }


    }

    public static class RetiroTest {
        private CuentaBancaria cuenta;

        @Before
        public void setUp() {
            cuenta = new CuentaBancaria(1000, 0.01);
        }


    }

    public static class InteresTest {
        private CuentaBancaria cuenta;

        @Before
        public void setUp() {
            cuenta = new CuentaBancaria(1000, 0.01);
        }


    }
}
