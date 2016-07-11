package com.example.somsak.sneakers;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class SneakersView extends Fragment {


    public SneakersView() {
        // Required empty public constructor
    }

    /* Factory method */
    public static SneakersView getNewInstance() {
        return new SneakersView();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.sneakers_view, container, false);
    }

}
