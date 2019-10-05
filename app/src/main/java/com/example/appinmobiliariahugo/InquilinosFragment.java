package com.example.appinmobiliariahugo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.appinmobiliariahugo.R;

import java.util.ArrayList;

public class InquilinosFragment extends Fragment {

    private ArrayList<InquilinoItem> inquilinos_list=new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view =inflater.inflate(R.layout.fragment_inquilinos, container, false);
        ListView listView= view.findViewById(R.id.listView);

        inquilinos_list.add(new InquilinoItem("21124587","Raul","Perez","Los alamos 254","2662477495"));
        inquilinos_list.add( new InquilinoItem("34505068","Franco","Funes","Esteban Aguero 36","2664601494"));
        ArrayAdapter<InquilinoItem> adapter = new InquilinoAdapter(getContext(),R.layout.inquilinoitem,inquilinos_list,getLayoutInflater());
        listView.setAdapter(adapter);
        ((NavigationDrawer) getActivity()).getSupportActionBar().setTitle("Inquilinos");
        return view ;
    }
}