package org.example.HW1;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Good good = (Good) o;
        return price == good.price && Objects.equals(name, good.name) && Objects.equals(rating, good.rating);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, rating);
    }
}
