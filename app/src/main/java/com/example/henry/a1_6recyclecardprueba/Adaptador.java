package com.example.henry.a1_6recyclecardprueba;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Henry on 25/02/2018.
 */
public class Adaptador extends RecyclerView.Adapter<viewHolder> {

    List<Fuente> ListaObjeto;


    public Adaptador(List<Fuente> listaObjeto) {
        ListaObjeto = listaObjeto;
    }

    @Override
    public viewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        return new viewHolder(vista,ListaObjeto);
    }

    @Override
    public void onBindViewHolder(viewHolder holder, int position) {
        holder.nombre.setText(ListaObjeto.get(position).getNombre());
        holder.desc.setText(ListaObjeto.get(position).getDesc());
        holder.imagen.setImageResource(ListaObjeto.get(position).getImagen());
    }

    @Override
    public int getItemCount() {
        return ListaObjeto.size();
    }


}

