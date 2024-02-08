/**
 * Name: Sicheng Yu
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/07/2024
 * File Name: BeverageVendingMachine.java
 * Description: To simulate a real beverage vending machine so a customer will make a choice and chose the style of
 * coffee or the color(kind) of the tea just as a real one you make a choice then decide the number of condiment and
 * kind to add in your beverage and wait for the price to pay.
 */
public class BeverageVendingMachine {

    /***calculate price after customer choice of Coffee*/
    public double priceBrewCoffee(String kind,int milkNum, int sugarNum){
        Coffee coffee = new Coffee(kind);//select coffee kind
        return coffee.coffeePriceAddCondiment(milkNum, sugarNum);

    }

    /***calculate price after customer choice of Tea*/
    public double priceBrewTea(String color, int milkNum, int sugarNum){
        Tea tea = new Tea(color);
        return tea.teaPriceAddCondiment(milkNum, sugarNum);

    }

}
