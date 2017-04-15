package com.aneloa.widgetsavanzado.view.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aneloa.widgetsavanzado.R;
import com.aneloa.widgetsavanzado.adapter.PictureAdapterRecyclerView;
import com.aneloa.widgetsavanzado.model.Picture;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        /*View view=inflater.inflate(R.layout.fragment_home, container, false);
        //showToolbar("Home",false,view);
        RecyclerView picturesRecycler= (RecyclerView) view.findViewById(R.id.pictureRecycler);

        LinearLayoutManager linearLayoutManager= new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        picturesRecycler.setLayoutManager(linearLayoutManager);

        PictureAdapterRecyclerView pictureAdapterRecyclerView=new PictureAdapterRecyclerView(buidPictures(),R.layout.cardview_picture,getActivity());
        picturesRecycler.setAdapter(pictureAdapterRecyclerView);*/
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    public ArrayList<Picture> buidPictures(){
        ArrayList<Picture> pictures= new ArrayList<>();
        pictures.add(new Picture("http://www.novalandtours.com/images/guide/guilin.jpg","Marco Aneloa","4 dias","3"));
        pictures.add(new Picture("http://www.novalandtours.com/images/guide/guilin.jpg","Juan Pablo","3 dias","10"));
        pictures.add(new Picture("http://www.novalandtours.com/images/guide/guilin.jpg","Ximena Mangia","4 dias","15"));
        return pictures;
    }

    public void showToolbar(String tittle,boolean upButton, View view){
        Toolbar toolbar=(Toolbar) view.findViewById(R.id.toolbar);
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle(tittle);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);
    }
}
