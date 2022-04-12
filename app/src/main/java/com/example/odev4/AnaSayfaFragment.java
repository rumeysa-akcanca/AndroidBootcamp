package com.example.odev4;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.odev4.databinding.FragmentAnaSayfaBinding;


public class AnaSayfaFragment extends Fragment {
  private FragmentAnaSayfaBinding tasarim;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        tasarim = FragmentAnaSayfaBinding.inflate(inflater, container, false);


        tasarim.buttonAnasayfaA.setOnClickListener(view -> {
         Navigation.findNavController(view).navigate(R.id.Anasayfadan_A_Gecis);
        });

        tasarim.buttonAnasayfaX.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.Anasayfadan_X_Gecis);
        });

        return tasarim.getRoot();
    }
}