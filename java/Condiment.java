/**
 * Name: Sicheng Yu
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/07/2024
 * File Name: Condiment.java
 * Description: To simulate the condiment you add to your tea or coffee in the beverage vending machine and up to 3
 * for each choice is implementation detail so private
 */
public class Condiment {
    int milkNum;
    int sugarNum;
    final double condimentPrice = 0.5;

    /*** This is a constructor and you can add no more than 3, over will only give you 3*/
    Condiment(int milkNum, int sugarNum){
        if(In_milkLimit()) {
            this.milkNum = milkNum;
        }
        else this.milkNum = 3;
        if(In_sugarLimit()) {
            this.sugarNum = sugarNum;
        }
        else this.sugarNum = 3;
    }

    /***calculate the price of the condiment added*/
    public double getCondimentPrice(){
        return ( milkNum + sugarNum )* condimentPrice;
    }

    /***count limit is 3 */
    private boolean In_milkLimit(){
        return milkNum <= 3;
    }

    /***count limit is 3 */
    private boolean In_sugarLimit(){
        return sugarNum <= 3;
    }

}
