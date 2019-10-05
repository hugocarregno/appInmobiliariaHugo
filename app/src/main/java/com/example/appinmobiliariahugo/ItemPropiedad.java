package com.example.appinmobiliariahugo;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;


public class ItemPropiedad extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private static final String ARG_PARAM3 = "param3";
    private static final String ARG_PARAM4= "param4";
    private static final String ARG_PARAM5 = "param5";

    // TODO: Rename and change types of parameters
    private String domicilio;
    private String ambiente;
    private String tipo;
    private String uso;
    private String precio;

    private OnFragmentInteractionListener mListener;

    public ItemPropiedad() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static ItemPropiedad newInstance(String domicilio, String ambiente,String tipo,String uso,String precio) {
        ItemPropiedad fragment = new ItemPropiedad();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, domicilio);
        args.putString(ARG_PARAM2, ambiente);
        args.putString(ARG_PARAM3,  tipo);
        args.putString(ARG_PARAM4, uso);
        args.putString(ARG_PARAM5, precio);


        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            domicilio = getArguments().getString(ARG_PARAM1);
            ambiente = getArguments().getString(ARG_PARAM2);
            tipo = getArguments().getString(ARG_PARAM3);
            uso = getArguments().getString(ARG_PARAM4);
            precio = getArguments().getString(ARG_PARAM5);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vista=inflater.inflate(R.layout.fragment_item_propiedad, container, false);
        EditText etDomicilio = vista.findViewById(R.id.etDomicilioValor);
        EditText etAmbiente = vista.findViewById(R.id.etAmbiente);
        TextView tvTipo = vista.findViewById(R.id.tvTipo);
        TextView tvUso = vista.findViewById(R.id.tvUso);
        EditText etPrecio = vista.findViewById(R.id.etPrecio);

        etDomicilio.setText(domicilio);
        etAmbiente.setText(ambiente);
        tvTipo.setText(tipo);
        tvUso.setText(uso);
        etPrecio.setText(precio);

        return vista;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
