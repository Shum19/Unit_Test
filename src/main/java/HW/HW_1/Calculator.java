package HW.HW_1;

public class Calculator {
    public static double calculateDiscount(double purchaseAmount, int discountAmount){
        assert 0 <= discountAmount: "Negative discount";
        assert 0 <= purchaseAmount: "Negative purchase amount";
        assert purchaseAmount - (purchaseAmount * discountAmount/100) <= purchaseAmount: "Something wrong";
        return purchaseAmount - (purchaseAmount * discountAmount/100);

    }
}
