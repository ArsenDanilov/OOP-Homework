package org.example.HW1;
import java.lang.reflect.Array;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Good> buyedGoods1 = new ArrayList<>();
        Basket basket1 = new Basket(buyedGoods1);
        User user1 = new User("userLogin1", "userPassword1", basket1);

        ArrayList<Good> buyedGoods2 = new ArrayList<>();
        Basket basket2 = new Basket(buyedGoods2);
        User user2 = new User("userLogin2", "userPassword2", basket2);

        ArrayList<Good> buyedGoods3 = new ArrayList<>();
        Basket basket3 = new Basket(buyedGoods3);
        User user3 = new User("userLogin3", "userPassword3", basket2);


        ArrayList<Good> vegetablesList = new ArrayList<>();

        Category vegetable = new Category("Vegetables", vegetablesList);
        Good tomato = new Good("Tomato", 120, 8.6);
        Good cucumber = new Good("Cucumber", 100, 8.0);
        Good potato = new Good("Potato", 60, 9.1);
        vegetable.addGood(tomato);
        vegetable.addGood(cucumber);
        vegetable.addGood(potato);

        ArrayList<Good> fruitsList = new ArrayList<>();
        Category fruit = new Category("Fruits", fruitsList);
        Good banana = new Good("Banana", 120, 8.6);
        Good melon = new Good("Melon", 100, 8.0);
        Good apple = new Good("Apple", 60, 9.1);
        fruit.addGood(banana);
        fruit.addGood(melon);
        fruit.addGood(apple);


        ArrayList<Category> categoriesList = new ArrayList<>();
        categoriesList.add(vegetable);

        Catalogue catalogue = new Catalogue(categoriesList);
        catalogue.addCategory(fruit);
        System.out.println(catalogue);








    }
}
