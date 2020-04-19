package com.example.gorceryapp;

public class Food_data {
    private String Foodname;
    private String category;
    private String Price;
    private int Amount;

    public Food_data(String foodname, String category, String price, int amount) {
        Foodname = foodname;
        this.category = category;
        Price = price;
        Amount = amount;
    }

    public String getFoodname() {
        return Foodname;
    }

    public String getCategory() {
        return category;
    }

    public String getPrice() {
        return Price;
    }

    public int getAmount() {
        return Amount;
    }

    public void setFoodname(String foodname) {
        Foodname = foodname;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public void setAmount(int amount) {
        Amount = amount;
    }
}
