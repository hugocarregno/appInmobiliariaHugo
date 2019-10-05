package com.example.appinmobiliariahugo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.appinmobiliariahugo.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ContratosFragment extends Fragment {

    private ExpandableListView listView;
    private ContratoAdapter adapter;
    private List<String> listaHeaderPropiedad;
    private HashMap<String,List<ContratoItem>> listaContrato;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_contratos, container, false);
        listView = view.findViewById(R.id.expandableContratos);
        initData();
        adapter = new ContratoAdapter(getActivity(),listaHeaderPropiedad,listaContrato);

        listView.setAdapter(adapter);



        ((NavigationDrawer) getActivity()).getSupportActionBar().setTitle("Contratos");
        return view;
    }
    private  void initData() {
        listaHeaderPropiedad = new ArrayList<>();
        listaContrato = new HashMap<>();

        listaHeaderPropiedad.add("Los Alamos 254");
        listaHeaderPropiedad.add("Esteban aguero 36");
        List<ContratoItem> losAlamos254 = new ArrayList<>();
        losAlamos254.add(new ContratoItem("1/05/2019","20/10/2020",15000));
        losAlamos254.add(new ContratoItem("20/10/2020","20/05/2021",35000));

        List<ContratoItem> estebanAguero36 = new ArrayList<>();
        estebanAguero36.add(new ContratoItem("19/06/2019","19/05/2020",14000));
        estebanAguero36.add(new ContratoItem("15/07/2019","19/09/2019",20000));

        listaContrato.put(listaHeaderPropiedad.get(0),losAlamos254);
        listaContrato.put(listaHeaderPropiedad.get(1),estebanAguero36);
    }
}