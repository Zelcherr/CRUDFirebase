package com.example.crudfirebase;
public class MainModel {
    String Apellido,Email,Nombre,imgURL;
    public MainModel(){

    }

    public MainModel(String apellido, String email, String nombre, String imgURL) {
        Apellido = apellido;
        Email = email;
        Nombre = nombre;
        this.imgURL = imgURL;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }
}
