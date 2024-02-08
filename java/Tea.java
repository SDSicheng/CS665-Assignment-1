/**
 * Name: Sicheng Yu
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/07/2024
 * File Name: Tea.java
 * Description: implement interface Beverage since tea is one and implement method, you can add condiment and calculate
 * the price, method will use later in Beverage vending machine class, clear hierarchy
 */
public class Tea implements Beverage {
    String color;

    /***constructor */
    Tea(String color){
        this.color = color;
    }
    final double price = 3;

    /***interface method getter */
    @Override
    public double getPrice() {
        return price;
    }

    /***calculate price after customer choice*/
    public double teaPriceAddCondiment(int milkNum, int sugarNum) {
        Condiment condiment = new Condiment(milkNum,sugarNum);
        double TeaPrice = getPrice() + condiment.getCondimentPrice();
        return TeaPrice;
    }
}
