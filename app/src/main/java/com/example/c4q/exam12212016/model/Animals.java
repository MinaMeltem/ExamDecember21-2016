package com.example.c4q.exam12212016.model;

/**
 * Created by C4Q on 12/21/16.
 */

public class Animals {
    private String name;
    private String background;
    private String textColor;

    //contructor

    public Animals(String name, String background, String textColor) {
        this.name = name;
        this.background = background;
        this.textColor = textColor;
    }

    //getter

    public String getName() {
        return name;
    }

    public String getBackground() {
        return background;
    }

    public String getTextColor() {
        return textColor;
    }

    //setter

    public void setName(String name) {
        this.name = name;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public void setTextColor(String textColor) {
        this.textColor = textColor;
    }
}



