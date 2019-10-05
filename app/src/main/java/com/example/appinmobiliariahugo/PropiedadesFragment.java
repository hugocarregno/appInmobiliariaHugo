package com.example.appinmobiliariahugo;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.viewpager.widget.ViewPager;

import com.example.appinmobiliariahugo.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class PropiedadesFragment extends Fragment implements ItemPropiedad.OnFragmentInteractionListener {

    ViewPager viewPager;
    TabLayout tabLayout;
    AppBarLayout appBarLayout;
    ViewPageAdapter viewPageAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootview = inflater.inflate(R.layout.fragment_propiedades, container, false);

        tabLayout=rootview.findViewById(R.id.tab_propiedad);


        viewPager= (ViewPager)rootview.findViewById(R.id.viewPager);


        viewPageAdapter =new  ViewPageAdapter(getChildFragmentManager());;


        viewPageAdapter.addFragment(ItemPropiedad.newInstance("Los Alamos 254","3 dormitorio,cocina,baño, comedor","Casa","Alquiler","$15000"),"Los Alamos");
        viewPageAdapter.addFragment(ItemPropiedad.newInstance("Esteban Aguero 36","4 dormitorio, cocina, baño, comedor","Casa","Alquiler","$40000"),"Esteban Aguero");

        viewPager.setAdapter(viewPageAdapter);
        tabLayout.setupWithViewPager(viewPager);
        ((NavigationDrawer) getActivity()).getSupportActionBar().setTitle("Propiedades");



        return rootview;
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }


    public class ViewPageAdapter extends FragmentPagerAdapter {
        private List<Fragment> fragmentList = new ArrayList<>();
        private List<String> titulosFragment = new ArrayList<>();

        public ViewPageAdapter(FragmentManager fm) {
            super(fm);
        }


        @Override
        public Fragment getItem(int position) {
            return fragmentList.get(position);
        }

        @Override
        public int getCount() {
            return fragmentList.size();
        }


        public CharSequence getPageTitle(int posicion) {
            return titulosFragment.get(posicion);
        }

        public void addFragment(Fragment fragment, String titulo) {
            fragmentList.add(fragment);
            titulosFragment.add(titulo);
        }
    }
}