package com.example.assignment2;
public class DataModel {

    String name;
    String descriptionArray;
    String fullDescriptionArray;
    int id_;
    int image;

    public DataModel(String name, String descriptionArray,String fullDescription, int id_, int image) {
        this.name = name;
        this.descriptionArray = descriptionArray;
        this.fullDescriptionArray = fullDescription;
        this.id_ = id_;
        this.image=image;
    }


    public String getName() {
        return name;
    }
    public String getDescriptionArray() {
        return descriptionArray;
    }
    public String getFullDescriptionArray() {
        return fullDescriptionArray;
    }
    public int getImage() {
        return image;
    }
    public int getId() {
        return id_;
    }
}