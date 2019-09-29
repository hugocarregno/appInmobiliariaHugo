package com.example.appinmobiliariahugo.ui.cerrarsesion;

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

public class CerrrarsesionFragment extends Fragment {

    private CerrarsesionViewModel cerrarsesionViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        cerrarsesionViewModel =
                ViewModelProviders.of(this).get(CerrarsesionViewModel.class);
        View root = inflater.inflate(R.layout.fragment_cerrarsesion, container, false);
        final TextView textView = root.findViewById(R.id.text_share);
        cerrarsesionViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}