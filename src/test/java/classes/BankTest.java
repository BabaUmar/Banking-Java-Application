package classes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BankTest {

    private Bank bank;

    @Before
    public void setUp() throws Exception {
        bank = new Bank("EasyBank");

        bank.addBranch("branch one");


        bank.addCustomer("branch one","Hawa",400.00);
    }

    @Test
    public void addBranch() {
        assertTrue(bank.addBranch("new branch"));

        //      Test should return false since branch one already exist
        assertFalse(bank.addBranch("branch one"));
    }

    @Test
    public void addCustomer() {
        //      Test should return true and will be able to add customer("Umar")
        assertTrue(bank.addCustomer("branch one","Umar",600.00));

        //      Test should return false since customer(Hawa) already exist
        assertFalse(bank.addCustomer("branch one", "Hawa",500.00));

    }

    @Test
    public void addCustomerTransaction() {
        //      Test should return true since customer(Hawa) already exist
        assertTrue(bank.addCustomerTransaction("branch one","Hawa",200.00));

        //      Test should return false since customer(Grace) does not exist
        assertFalse(bank.addCustomerTransaction("branch one", "Grace",200.00));

    }

    @Test
    public void findBranch() {
    }

    @Test
    public void listCustomers() {
        //      Test should return true since branch already exist
        assertTrue(bank.listCustomers("branch one", true));

        //      Test should return false since branch does not exist
        assertFalse(bank.listCustomers("new branch", false));
    }
}