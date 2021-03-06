package com.example.lajunta_v_1.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lajunta_v_1.R;
import com.example.lajunta_v_1.models.Alimento;
import com.example.lajunta_v_1.models.Insumo;

import java.util.List;

public class RVInsumo extends RecyclerView.Adapter<RVInsumo.ListaViewHolder>{
    private final Context context;
    private List<Insumo> insumoList;

    public RVInsumo(Context context, List<Insumo> insumoList) {
        this.context = context;
        this.insumoList = insumoList;
    }


    public static class ListaViewHolder extends RecyclerView.ViewHolder {
        TextView txtIdI;
        TextView txtNomI;
        TextView txtcI;
        TextView txtmI;


      ;


        public ListaViewHolder(@NonNull View view) {
            super(view);
            txtIdI = view.findViewById(R.id.txtIdI);
                txtNomI = view.findViewById(R.id.txtNombreInsumo);
            txtcI = view.findViewById(R.id.txtCantidadInsumo);
            txtmI = view.findViewById(R.id.txtMedidaIns);


        }

    }

    @NonNull
    @Override
    public ListaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.rv_lista_insumos, parent, false);
        return new ListaViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull ListaViewHolder holder, int position) {
        Insumo insumo = insumoList.get(position);
        holder.txtIdI.setText(String.valueOf(insumo.getId()));
        holder.txtNomI.setText(String.valueOf(insumo.getNombre()));
        holder.txtcI.setText(String.valueOf(insumo.getCantidad()));
        holder.txtmI.setText(String.valueOf(insumo.getMedida()));




    }

    @Override
    public int getItemCount() {
        return insumoList.size();
    }

}

/*

public class RVRegistro extends RecyclerView.Adapter<RVRegistro.ListaViewHolder>{
    private final Context context;
    private List<Registro> registroList;

    public RVRegistro(Context context, List<Registro> registroList) {
        this.context = context;
        this.registroList = registroList;
    }

    public static class ListaViewHolder extends RecyclerView.ViewHolder {

        TextView txtNombre;
        TextView txtAepellido;
        ;


        public ListaViewHolder(@NonNull View view) {
            super(view);
            txtNombre = view.findViewById(R.id.txtNombre);
            txtAepellido = view.findViewById(R.id.txtApellido);

        }

    }

    @NonNull
    @Override
    public ListaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.rv_lista_registros, parent, false);
        return new ListaViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull ListaViewHolder holder, int position) {
        Registro registro = registroList.get(position);
        holder.txtNombre.setText(String.valueOf(registro.getNombre()));
        holder.txtAepellido.setText(String.valueOf(registro.getApellido()));

    }

    @Override
    public int getItemCount() {
        return registroList.size();
    }

}*/ //copia de respaldo del recyclerwView de arriba

