package classes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BranchTest {
    Branch branch;


    @Before
    public void setUp() throws Exception {
        // Creating new branch
        branch = new Branch("four");
        branch.newCustomer("Amina", 152.35);
    }

    @Test
    public void getName() {
        assertEquals("four",branch.getName());
    }


    @Test
    public void getCustomers() {
        assertEquals("Amina",branch.getCustomers().get(0).getName());
    }

    @Test
    public void newCustomer() {
        assertTrue(branch.newCustomer("Ali",62.23));
        assertFalse(branch.newCustomer("Amina",25.32));
    }


    @Test
    public void addCustomerTransaction() {
        //   test
        assertTrue( branch.addCustomerTransaction("Amina",35.22));
        assertFalse(branch.addCustomerTransaction("Ali",23.11));
    }


    @Test
    public void findCustomer() {
    }
}