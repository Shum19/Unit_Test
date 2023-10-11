package HW.HW_1;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args){
//        System.out.println(Calculator.calculateDiscount(100, 10));
        Product bread = new Product("Bread", 29);
        Product milk = new Product("Milk", 40);
        Product yogurt = new Product("Yogurt", 50 );
        Product rice = new Product("Rice", 3);

        List<Product> productList = new ArrayList<>(List.of(bread, milk, yogurt, rice));
        Shop prod = new Shop();
        prod.setProducts(productList);
        System.out.println(prod);
        System.out.println(prod.getMostExpensiveProduct());
        System.out.println(prod);






    }
}
