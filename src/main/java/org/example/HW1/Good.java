package org.example.HW1;
public class Good {
    private String name;
    private int price;
    private Double rating;

    public Good(String name, int price, Double rating){
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Товар: " + name + ", " + " цена: " + price + ", " + " рейтинг товара: " + rating + "  \n";
    }

//    public String toString() {
//      return "|| Товар: " + name + " цена: " + price + " рейтинг товара: " + rating + " ||;
//    }

    public void buyGood(User user, Category category,Good good){

    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public Double getRating() {
        return rating;
    }
}
