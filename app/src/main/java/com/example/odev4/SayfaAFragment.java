package com.example.odev4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.odev4.databinding.FragmentAnaSayfaBinding;
import com.example.odev4.databinding.FragmentSayfaABinding;


public class SayfaAFragment extends Fragment {

    private FragmentSayfaABinding tasarim;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        tasarim = FragmentSayfaABinding.inflate(inflater, container, false);

        tasarim.buttonSayfaAB.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.A_B_Gecis);
        });

        return tasarim.getRoot();
    }
}