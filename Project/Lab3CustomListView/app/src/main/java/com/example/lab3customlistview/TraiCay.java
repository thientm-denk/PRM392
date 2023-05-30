package com.example.lab3customlistview;

public class TraiCay {

    private String Name;
    private String Des;
    private int Image;

    public TraiCay(String name, String des, int image) {
        Name = name;
        Des = des;
        Image = image;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDes() {
        return Des;
    }

    public void setDes(String des) {
        Des = des;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }
}
