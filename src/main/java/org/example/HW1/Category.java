package org.example.HW1;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Category {

    private String name;
    private ArrayList<Good> goodsList;

    public Category(String name, ArrayList<Good> goodsList) {
        this.name = name;
        this.goodsList = goodsList;
    }

    public void addGood(Good good){
        this.goodsList.add(good);
    }

//    @Override
//    public String toString() {
//        return "Category{" +
//                "name='" + name + '\'' +
//                ", goodsList=" + goodsList +
//                '}';
//    }

    @Override
    public String toString() {
        return "\n------------------------------ \n" + "Категория: " + name + "\n" + goodsList;
    }

    public void deleteGood(ArrayList<Good> goodsList, Good good){
        goodsList.remove(good);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Good> getGoodsList() {
        return goodsList;
    }
}
