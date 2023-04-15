package org.example.HW1;
import java.util.ArrayList;
import java.util.Scanner;

public class User {
    Scanner scanner = new Scanner(System.in);
    private String login;
    private String password;
    private Basket basket;

    public User(String login, String password, Basket basket){
        this.login = login;
        this.password = password;
        this.basket = basket;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public Basket getBasket() {
        return basket;
    }



    public void buyGood(Good good, Catalogue catalogue) {
        for (Category c: catalogue.getCategoriesList()) {
            for (Good g: c.getGoodsList()) {
                if (good.equals(g)) {
                    //basket.add
                    c.getGoodsList().remove(g);
                }
            }
        }



//        System.out.println("Вывод каталога магазина:" + catalogue.getCategoriesList());
//        System.out.println("Введите название желаемого товара: ");
//        String buyedGood = scanner.nextLine();
//        for (Category item: categoriesList) {
//            for (Good product: item.getGoodsList()) {
//                if (buyedGood.equals(product.getName())){
//                    userr.getBasket().
//                }
//            }
//
//        }
    }

    public void buyGood(Category category, Good good) {

    }

//
////        System.out.println("\n Введите название категории, в который вы бы хотели купить товар: ");
////        String buyedItem = scanner.nextLine();
//        scanner.close();

}
