package com.springboot.designpatterns.behavioral.visitor;

/**
 * @author prabhakar, @Date 05-07-2025
 */
// Concrete Visitor (Price Calculator)
public class ShoppingCartPriceCalculator implements ShoppingCartVisitor{

    private int totalCost = 0;

    @Override
    public void visit(Book book) {
        int cost = book.getPrice();
        System.out.println("Book ISBN::" + book.getIsbnNumber() + " cost =" + cost);
        totalCost += cost;
    }

    @Override
    public void visit(Fruit fruit) {
        int cost = fruit.getPricePerKg() * fruit.getWeight();
        System.out.println(fruit.getName() + " costs " + cost + " (Weight: " + fruit.getWeight() + "kg)");
        totalCost += cost;
    }

    public int getTotalCost() {
        return totalCost;
    }
}

// Usage
// public class VisitorDemo {
//     public static void main(String[] args) {
//         List<ItemElement> items = new ArrayList<>();
//         items.add(new Book(20, "12345"));
//         items.add(new Book(100, "98765"));
//         items.add(new Fruit(10, 2, "Apple"));
//         items.add(new Fruit(5, 5, "Orange"));
//
//         ShoppingCartPriceCalculator calculator = new ShoppingCartPriceCalculator();
//
//         for (ItemElement item : items) {
//             item.accept(calculator);
//         }
//
//         System.out.println("\nTotal Cost of Shopping Cart: " + calculator.getTotalCost());
//     }
// }