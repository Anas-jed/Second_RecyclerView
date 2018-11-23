package com.example.pc.second_recyclerview;

public class Flags { //My Flags class returning references with Setter And Getter

    private String title;
    private int img_url;

    public Flags(String title, int img_url) {
        this.title = title;
        this.img_url = img_url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImg_url() {
        return img_url;
    }

    public void setImg_url(int img_url) {
        this.img_url = img_url;
    }
}
