package com.example.recycle;

public class equipo {
    private String nombre,lugar;
    private int imgequipo;

    public equipo() {
    }

    public equipo(String nombre, String lugar, int imgequipo) {
        this.nombre = nombre;
        this.lugar = lugar;
        this.imgequipo = imgequipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getImgequipo() {
        return imgequipo;
    }

    public void setImgequipo(int imgequipo) {
        this.imgequipo = imgequipo;
    }
}
