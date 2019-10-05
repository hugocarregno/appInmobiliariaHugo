package com.example.appinmobiliariahugo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

import static android.content.Context.LAYOUT_INFLATER_SERVICE;

class ContratoAdapter extends BaseExpandableListAdapter {
    private Context context;
    private List<String> listaPropiedades;
    private HashMap<String,List<ContratoItem>> listHashMap;


    public ContratoAdapter(Context context, List<String> listaPropiedades, HashMap<String, List<ContratoItem>> listHashMap) {
        this.context = context;
        this.listaPropiedades = listaPropiedades;
        this.listHashMap = listHashMap;
    }

    @Override
    public int getGroupCount() {
        return listaPropiedades.size();
    }

    @Override
    public int getChildrenCount(int i) {
        return listHashMap.get(listaPropiedades.get(i)).size();
    }

    @Override
    public Object getGroup(int i) {
        return listaPropiedades.get(i);
    }

    @Override
    public Object getChild(int i, int  i1) {
        return listHashMap.get(listaPropiedades.get(i)).get(i1);
    }

    @Override
    public long getGroupId(int i) {
        return i;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View view, ViewGroup parent) {
        String headerPropiedad = (String)getGroup(groupPosition);
        if(view==null){
            LayoutInflater inflater = (LayoutInflater)this.context.getSystemService(LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.propiedades_header,null);
        }
        TextView textViewPropiedades = view.findViewById(R.id.propiedades_header);
        textViewPropiedades.setText(headerPropiedad);
        return view;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View view, ViewGroup parent) {
        ContratoItem contratoItem = (ContratoItem)getChild(groupPosition,childPosition);
        if(view==null){
            LayoutInflater inflater = (LayoutInflater)this.context.getSystemService(LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.contratoitem,null);
        }
        TextView tvFechaInicio = view.findViewById(R.id.tvFechaInicioValor);
        TextView tvFechaCierre = view.findViewById(R.id.tvFechaCierreValor);
        TextView tvPrecio = view.findViewById(R.id.tvPrecioValor);

        tvFechaInicio.setText(contratoItem.getFechaInicio());
        tvFechaCierre.setText(contratoItem.getFechaCierre());
        tvPrecio.setText(contratoItem.getImporte()+"");

        return view;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
