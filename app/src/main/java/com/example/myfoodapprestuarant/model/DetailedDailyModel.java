package com.example.myfoodapprestuarant.model;

public class DetailedDailyModel {
    private int image;
    private String name;
    private String description;
    private String rating ;
    private String price ;
    private String timing;

    public DetailedDailyModel(int image, String name, String description, String rating, String price, String timing) {
        this.image = image;
        this.name = name;
        this.description = description;
        this.rating = rating;
        this.price = price;
        this.timing = timing;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public String getTiming() {
        return timing;
    }

    public void setTiming(String timing) {
        this.timing = timing;
    }

    @Override
    public String toString() {
        return "DetailedDailyModel{" +
                "image=" + image +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", rating='" + rating + '\'' +
                ", price='" + price + '\'' +
                ", timing='" + timing + '\'' +
                '}';
    }
}
