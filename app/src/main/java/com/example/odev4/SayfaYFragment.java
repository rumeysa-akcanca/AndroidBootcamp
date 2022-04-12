package com.example.odev4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.odev4.databinding.FragmentSayfaABinding;
import com.example.odev4.databinding.FragmentSayfaYBinding;


public class SayfaYFragment extends Fragment {

  private FragmentSayfaYBinding tasarim;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        tasarim = FragmentSayfaYBinding.inflate(inflater, container, false);

          tasarim.buttonSayfaYAnasayfa.setOnClickListener(view -> {
              Navigation.findNavController(view).navigate(R.id.Y_Anasayfa_Gecis);
          });

        return tasarim.getRoot();
    }
}