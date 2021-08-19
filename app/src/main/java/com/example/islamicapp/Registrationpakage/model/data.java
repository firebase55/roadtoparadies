package com.example.islamicapp.Registrationpakage.model;

public class data
{
    String name , adress, email , pass;

    public data(String naem, String adress, String email, String pass) {
        this.name = naem;
        this.adress = adress;
        this.email = email;
        this.pass = pass;
    }

    public String getNaem() {
        return name;
    }

    public void setNaem(String naem) {
        this.name = naem;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
