package HW.HW_1;

import java.util.ArrayList;
import java.util.List;
import static org.assertj.core.api.Assertions.*;
public class ShopTest {

    public static void main(String[] args) {
        Product bread = new Product("Bread", 29);
        Product milk = new Product("Milk", 40);
        Product yogurt = new Product("Yogurt", 50 );// Самый дорогой который добавил в список
        Product rice = new Product("Rice", 3);
        Product oil = new Product("oil", 100);// Продукт добавлен для провеерки containExactlyAnyOrder()
        List<Product> productList = new ArrayList<>(List.of(bread, milk, yogurt, rice));
        Shop shop = new Shop();
        shop.setProducts(productList);

// 1. Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов (правильное количество продуктов,
//    верное содержимое корзины).
        assertThat(shop.getProducts()).hasSize(4);
        assertThat(shop.getProducts()).containsExactlyInAnyOrder(milk, bread, yogurt, rice);

//  2. Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.
        assertThat(shop.getMostExpensiveProduct()).isEqualTo(yogurt);

//  3. Напишите тесты для проверки корректности работы метода sortProductsByPrice (проверьте правильность сортировки).

        assertThat(shop.sortProductsByPrice()).isSorted();
    }


}
