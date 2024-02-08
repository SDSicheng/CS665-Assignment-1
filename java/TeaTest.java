import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * Name: Sicheng Yu
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/07/2024
 * File Name: TeaTest.java
 * Description: Test method in Tea.java Coffee.java is similar so only do Tea but write separately can add more
 * implementation later. 4 tests total in 2 test class
 */


class TeaTest {
    @Test
    void kindTest(){
        Tea tea = new Tea("Black");
        assertEquals("Black","Black");
    }

    @Test
    void teaPriceAddCondimentTest(){
        Tea tea = new Tea("Black");
        tea.teaPriceAddCondiment(1,2);
        assertEquals(4.5,4.5);
    }

}