package com.example.islamicapp.BoyGirlPanel.farzPakage.wazuQuiz;

public class GetData
{
    String name;
    int Image;

    public GetData(String name, int image) {
        this.name = name;
        Image = image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImage(int image) {
        Image = image;
    }

    public String getName() {
        return name;
    }

    public int getImage() {
        return Image;
    }
}
