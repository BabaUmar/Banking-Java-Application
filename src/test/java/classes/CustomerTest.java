package classes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {
    Customer customer;

    @Before
    public void setUp() throws Exception {
        //       Creating new customer
        customer = new Customer("Prince", 250.06);
    }

    @Test
    public void getName() {
        //test result should return the Prince
        assertEquals("Prince", customer.getName());
    }


    @Test
    public void getTransactions() {

        assertEquals(250.06,(double) customer.getTransactions().get(0), 0.00);
    }

    @Test
    public void addTransaction() {
        // Add Transaction
        customer.addTransaction(400);

        //   Test
        assertEquals(2, customer.getTransactions().size());
    }
    }
