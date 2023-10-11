package HW.HW_1;

public class Product implements Comparable<Product> {
    private Integer cost; // Стоимость продукта
    private String title; // Название
    public Product(String title, int cost){
        this.title = title;
        this.cost = cost;
    }

    // Геттеры, сеттеры:
    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public String toString(){
        String product = "Product Name - " + this.title + " Cost - " + this.cost;
        return product;
    }

    @Override
    public int compareTo(Product p) {
        if (this.cost > p.getCost()){return 1;}
        else if (this.cost < p.getCost()){return -1;}
        return 0;
    }
}
