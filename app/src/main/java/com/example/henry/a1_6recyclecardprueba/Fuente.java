package com.example.henry.a1_6recyclecardprueba;

import android.widget.Button;

/**
 * Created by Henry on 25/02/2018.
 */

public class Fuente {

    public Fuente(String nombre, String desc, int imagen) {
        this.nombre = nombre;
        this.desc = desc;
        this.imagen = imagen;
    }

    String nombre;
    String desc;
    int imagen;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
