package com.example.appinmobiliariahugo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.appinmobiliariahugo.R;

public class PerfilFragment extends Fragment {


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ((NavigationDrawer) getActivity()).getSupportActionBar().setTitle("Perfil");
        return inflater.inflate(R.layout.fragment_perfil, container, false);
    }
}