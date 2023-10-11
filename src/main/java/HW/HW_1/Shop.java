package HW.HW_1;

import java.lang.reflect.Array;
import java.util.*;

public class Shop {
    private List<Product> products;

    // Геттеры, сеттеры:
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    // Метод должен вернуть отсортированный по возрастанию по цене список продуктов
    public List<Product> sortProductsByPrice() {
        this.products.sort(new ProductComparator());
        return this.products;
    }

    // Метод должен вернуть самый дорогой продукт
    public Product getMostExpensiveProduct() {
        List<Product> list = new ArrayList<Product>(this.products);
        int expensiveIndex = list.size() - 1;
        list.sort(Comparator.comparing(Product::getCost));
        return list.get(expensiveIndex);
    }

    @Override
    public String toString() {
        return this.products.toString();
    }
}
