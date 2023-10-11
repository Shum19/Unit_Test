package HW.HW_1;

public class Calculator {
    public static double calculateDiscount(double purchaseAmount, int discountAmount){
        if (discountAmount < 0 || purchaseAmount < 0 || discountAmount > 100){
            if (discountAmount < 0 || discountAmount > 100){throw new ArithmeticException("Invalid discount");}
            else {throw new ArithmeticException("Invalid purchase amount");}
        }

        return purchaseAmount - (purchaseAmount * discountAmount/100);

    }
}
