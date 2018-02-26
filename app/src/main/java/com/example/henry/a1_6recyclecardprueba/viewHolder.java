package com.example.henry.a1_6recyclecardprueba;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.List;

/**
 * Created by Henry on 25/02/2018.
 */

public class viewHolder extends RecyclerView.ViewHolder{


    ImageView imagen;
    TextView nombre;
    TextView desc;

    List<Fuente> ListaObjeto;

    public viewHolder(View v, List<Fuente> datos) {
        super(v);
        imagen = v.findViewById(R.id.imageView);
        nombre = v.findViewById(R.id.nombre);
        desc = v.findViewById(R.id.descripcion);
        ListaObjeto = datos;

    }


}