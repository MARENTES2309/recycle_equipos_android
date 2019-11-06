package com.example.recycle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecycleViewAdaptador extends RecyclerView.Adapter<RecycleViewAdaptador.ViewHolder> {

    public  class ViewHolder extends RecyclerView.ViewHolder{
        TextView nombre,lugar;
        ImageView fotoequipo;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nombre = itemView.findViewById(R.id.tvequipo);
            lugar =itemView.findViewById(R.id.tvlugar);
            fotoequipo =itemView.findViewById(R.id.imgEquipo);
        }
    }

            ArrayList<equipo> listaequipo;

    public RecycleViewAdaptador(ArrayList<equipo> listaequipo) {
        this.listaequipo = listaequipo;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_equipo,null,false);
        return  new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.nombre.setText(listaequipo.get(position).getNombre());
        holder.lugar.setText(listaequipo.get(position).getLugar());
        holder.fotoequipo.setImageResource(listaequipo.get(position).getImgequipo());
    }

    @Override
    public int getItemCount() {
        return listaequipo.size();
    }
}
