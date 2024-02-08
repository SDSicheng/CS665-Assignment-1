/**
 * Name: Sicheng Yu
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/07/2024
 * File Name: BeverageVendingMachineTest.java
 * Description: Test method in BeverageVendingMachine.java
 * 4 tests total in 2 test class
 */
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BeverageVendingMachineTest {

    /***Test if the Tea price is right*/
    @Test
    void priceBrewTeaTest(){
        BeverageVendingMachine BVM = new BeverageVendingMachine();
        BVM.priceBrewTea("Black",2,3);
        assertEquals(4.5,4.5);
    }

    /***Test if the coffee price is right */
    @Test
    void priceBrewCoffeeTest(){
        BeverageVendingMachine BVM = new BeverageVendingMachine();
        BVM.priceBrewCoffee("Latte",5,3);
        assertEquals(6,6);
    }

}