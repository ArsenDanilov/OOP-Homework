package org.example.HW1;
import java.util.ArrayList;

public class Catalogue {
    private ArrayList<Category> categoriesList;

    public Catalogue(ArrayList<Category> categoriesList) {
        this.categoriesList = categoriesList;
    }

    public void addCategory(Category category){
        this.categoriesList.add(category);
    }

//    @Override
//    public String toString() {
//        return "Catalogue{" +
//                "categoriesList=" + categoriesList +
//                '}';
//    }
    @Override
    public String toString() {
        return "КАТАЛОГ МАГАЗИНА: \n" + categoriesList;
    }

    public ArrayList<Category> getCategoriesList() {
        return categoriesList;
    }
}
