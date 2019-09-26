package com.example.examen_josefconcepcion;

public class ListViewItem {

    private String title;
    private int imageSource;
    private int color;

    public ListViewItem (int imageSource, String title, int color){
        this.imageSource = imageSource;
        this.title = title;
        this.color = color;

    }

    public int getImageSource(){
        return imageSource;
    }

    public String getTitle (){
        return title;
    }

    public int getColor () {
        return color;
    }

}
