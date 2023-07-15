package com.example.examenfinal;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdaptadorPersonajes extends RecyclerView.Adapter<AdaptadorPersonajes.ViewHolderPersonajes>{

    ArrayList<PersonajeVo> listPersonajes;

    public AdaptadorPersonajes(ArrayList<PersonajeVo> listPersonajes){
        this.listPersonajes = listPersonajes;
    }

    @Override
    public ViewHolderPersonajes onCreateViewHolder( ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ien_list_personajes,null,false);

        return new ViewHolderPersonajes(view) ;
    }

    @Override
    public void onBindViewHolder( ViewHolderPersonajes holder, int position) {

        holder.etiNombre.setText(listPersonajes.get(position).getNombre());
        holder.etiInformacion.setText(listPersonajes.get(position).getInfo());
        holder.foto.setImageResource(listPersonajes.get(position).getFoto());

    }

    @Override
    public int getItemCount() {
        return listPersonajes.size();
    }

    public class ViewHolderPersonajes extends RecyclerView.ViewHolder {

        TextView etiNombre,etiInformacion;
        ImageView foto;
        public ViewHolderPersonajes(View itemView) {
            super(itemView);
            etiNombre= (TextView) itemView.findViewById(R.id.idNombre);
            etiInformacion= (TextView) itemView.findViewById(R.id.idInfo);
            foto= (ImageView) itemView.findViewById(R.id.idImagen);
        }
    }
}
