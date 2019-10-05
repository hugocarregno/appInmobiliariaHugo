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

public class PagosFragment extends Fragment {

    private ExpandableListView listView;
    private PagoAdapter adapter;
    private List<String> listaHeaderPropiedad;
    private HashMap<String,List<PagoItem>> listaPago;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view =inflater.inflate(R.layout.fragment_pagos, container, false);
        listView = view.findViewById(R.id.expandablePagos);
        initData();
        adapter = new PagoAdapter(getActivity(),listaHeaderPropiedad,listaPago);

        listView.setAdapter(adapter);


        ((NavigationDrawer) getActivity()).getSupportActionBar().setTitle("Pagos");
        return view;
    }

    private  void initData() {
        listaHeaderPropiedad = new ArrayList<>();
        listaPago = new HashMap<>();

        listaHeaderPropiedad.add("Los Alamos 254");
        listaHeaderPropiedad.add("Esteban Aguero 36");
        List<PagoItem> losAlamos254 = new ArrayList<>();
        losAlamos254.add(new PagoItem(1,"19/05/2019",15000));
        losAlamos254.add(new PagoItem(2,"19/06/2019",15000));

        List<PagoItem> estebanAguero36 = new ArrayList<>();
        estebanAguero36.add(new PagoItem(1,"19/05/2019",14000));
        estebanAguero36.add(new PagoItem(2,"19/06/2019",14000));

        listaPago.put(listaHeaderPropiedad.get(0),losAlamos254);
        listaPago.put(listaHeaderPropiedad.get(1),estebanAguero36);
    }

}