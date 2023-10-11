package HW.HW_1;
import static org.assertj.core.api.Assertions.*;



public class CalculatorTest {
    public static void main(String[] args) {
        assertThat(90.0).isEqualTo(Calculator.calculateDiscount(100, 10));
        assertThat(0.0).isEqualTo(Calculator.calculateDiscount(0, 25));
        assertThat(100.0).isEqualTo(Calculator.calculateDiscount(100, 0));
        // Проверка на то, что результирующая цена на продукт должнна быть равна или меньше начальнной суммы
        // если вычесть скидку даже если сеидка равна 0. Так как если ответ после рассчета скиидкии будет
        // больше чем начальная цена то знначит что то не так
        assertThat(100.0).isGreaterThanOrEqualTo
                (Calculator.calculateDiscount(100, 25));

        assertThatThrownBy(() -> Calculator.calculateDiscount(100, -10))
                .isInstanceOf(ArithmeticException.class).hasMessage("Invalid discount");

        assertThatThrownBy(() -> Calculator.calculateDiscount(-100, 10))
                .isInstanceOf(ArithmeticException.class).hasMessage("Invalid purchase amount");

        assertThatThrownBy(() -> Calculator.calculateDiscount(100, 110))
                .isInstanceOf(ArithmeticException.class).hasMessage("Invalid discount");

    }




}
