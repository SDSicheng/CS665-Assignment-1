/**
 * Name: Sicheng Yu
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/07/2024
 * File Name: Coffee.java
 * Description: Similar class as Tea class, but a different kind of beverage so write in two class so if anything new
 * came up we can always add new feature or change price new method does not affect original code.
 */
public class Coffee implements Beverage {
    String kind;

    /***constructor */
    Coffee(String kind){
        this.kind = kind;
    }

    final double price = 2;

    /***interface method getter */
    @Override
    public double getPrice() {
        return price;
    }

    /***calculate price after customer choice*/
    public double coffeePriceAddCondiment(int milkNum, int sugarNum) {
        Condiment condiment = new Condiment(milkNum, sugarNum);
        double coffeePrice = getPrice() + condiment.getCondimentPrice();
        return coffeePrice;
    }

}
