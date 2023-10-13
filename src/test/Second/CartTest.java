package Second;
import HW.HW_2.Car;
import Practice.Second.Cart;
import Practice.Second.Main;
import Practice.Second.Shop;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.assertj.core.api.Assertions.*;

public class CartTest {

    @Test
    public void totatlPriceOfCartTest(){
        Shop shop = new Shop(new Main().getStoreItems());
        Cart cart = new Cart(shop);
        cart.addProductToCartByID(1);
        cart.addProductToCartByID(1);
        assertThat(cart.getTotalPrice()).isEqualTo(340);
    }
    @Test
    public void removeItemFromCart(){
        Shop shop = new Shop(new Main().getStoreItems());
        Cart cart = new Cart(shop);
        cart.addProductToCartByID(1);
        cart.addProductToCartByID(2);
        cart.addProductToCartByID(3);
        cart.addProductToCartByID(3);
        cart.removeProductByID(1);
        cart.removeProductByID(3);

        assertThat(cart.getTotalPrice()).isEqualTo(450);
    }
    @Test
    public void quantityProductTest(){
        Shop shop = new Shop(new Main().getStoreItems());
        Cart cart = new Cart(shop);
        cart.addProductToCartByID(1);
        cart.addProductToCartByID(1);
        cart.addProductToCartByID(1);
        cart.addProductToCartByID(1);
        assertThat(shop.getProductsShop().get(0).getQuantity()).isEqualTo(6);
        cart.removeProductByID(1);
        cart.removeProductByID(1);
        assertThat(shop.getProductsShop().get(0).getQuantity()).isEqualTo(8);
    }
    @Test
    public void productNotAvailbleTest(){
        Shop shop = new Shop(new Main().getStoreItems());
        Cart cart = new Cart(shop);
        for (int i = 0; i < 12; i++) {cart.addProductToCartByID(1);}
        assertThat(shop.getProductsShop().get(0).getQuantity()).isEqualTo(0);
        assertThat(cart.cartItems.get(0).getQuantity()).isEqualTo(10);
    }
    @ParameterizedTest
    @ValueSource(ints = {15, -10, 30 })
    public void testDelProd(int ids){
        Shop shop = new Shop(new Main().getStoreItems());
        Cart cart = new Cart(shop);
        assertThatThrownBy(() -> cart.addProductToCartByID(ids)).isInstanceOf(RuntimeException.class)
                .hasMessage("Не найден продукт с id: "  + ids);

    }

}
