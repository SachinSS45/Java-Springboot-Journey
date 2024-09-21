package com.sachin;

public class TextBook {
    //instance variable : encapsulated
    private int pages;

    //setter methods
    public void setPages(int pages){
        if(pages > 0)
            this.pages = pages;
        else
            this.pages = 0;
    }
    //Getter method
    public int getPages(){
        return pages;
    }
}
