package com.example.assignment2;


public class DataModel {

    String name;
    String descriptionArray;
    int id_;
    int image;

    public DataModel(String name, String descriptionArray, int id_, int image) {
        this.name = name;
        this.descriptionArray = descriptionArray;
        this.id_ = id_;
        this.image=image;
    }


    public String getName() {
        return name;
    }


    public String getDescriptionArray() {
        return descriptionArray;
    }

    public int getImage() {
        return image;
    }

    public int getId() {
        return id_;
    }
}