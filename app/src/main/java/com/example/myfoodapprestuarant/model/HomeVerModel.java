package com.example.myfoodapprestuarant.model;

public class HomeVerModel {
    private int image;
    private String name;
    private String timing;
    private String rating;
    private String price;

    public HomeVerModel(int image, String name, String timing, String rating, String price) {
        this.image = image;
        this.name = name;
        this.timing = timing;
        this.rating = rating;
        this.price = price;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTiming() {
        return timing;
    }

    public void setTiming(String timing) {
        this.timing = timing;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "HomeVerModel{" +
                "image=" + image +
                ", name='" + name + '\'' +
                ", timing='" + timing + '\'' +
                ", rating='" + rating + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
