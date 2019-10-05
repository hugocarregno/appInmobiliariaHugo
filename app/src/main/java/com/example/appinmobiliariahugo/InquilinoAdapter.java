package com.example.appinmobiliariahugo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class InquilinoAdapter extends ArrayAdapter<InquilinoItem> {
    private Context context;
    private List<InquilinoItem> listaInquilino;
    private LayoutInflater inflater;
    public InquilinoAdapter(@NonNull Context context, int resource, @NonNull List<InquilinoItem> inquilinos, LayoutInflater inflater) {
        super(context, resource,inquilinos);
        this.context = context;
        this.listaInquilino=inquilinos;
        this.inflater=inflater;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View itemView=convertView;
        if(itemView==null){
            itemView=inflater.inflate(R.layout.inquilinoitem,parent,false);
        }
        InquilinoItem inquilino =listaInquilino.get(position);

        TextView tvDni = itemView.findViewById(R.id.tvDniInquilinoValor);
        TextView tvApellido = itemView.findViewById(R.id.tvApellidoInquilinoValor);
        TextView tvNombre = itemView.findViewById(R.id.tvNombreInquilinoValor);
        TextView tvDireccion = itemView.findViewById(R.id.tvDireccionInquilinoValor);
        TextView tvTelefono = itemView.findViewById(R.id.tvTelefonoInquilinoValor);

        tvDni.setText(inquilino.getDni());
        tvApellido.setText(inquilino.getApellido());
        tvNombre.setText(inquilino.getNombre());
        tvDireccion.setText(inquilino.getDireccion());
        tvTelefono.setText(inquilino.getTelefono());

        return itemView;


    }
}
