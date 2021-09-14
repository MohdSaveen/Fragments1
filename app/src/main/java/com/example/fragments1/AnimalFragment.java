package com.example.fragments1;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class AnimalFragment extends Fragment {

    private RecyclerView recyclerView;
    private ArrayList<AnimalModel> List=new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_animal, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews(view);
        buildList();
        setRecyclerView();
    }

    private void setRecyclerView() {
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getContext());
        AnimalAdapter animalAdapter=new AnimalAdapter(List);
        recyclerView.setAdapter(animalAdapter);
        recyclerView.setLayoutManager(linearLayoutManager);
    }

    private void buildList() {
        for(int i=0;i<100;i++){
            AnimalModel animalModel=new AnimalModel("Spider-Man",R.drawable.spiderman);
            List.add(animalModel);
        }
    }

    private void initViews(View view) {
        recyclerView=view.findViewById(R.id.recyclerView);

    }

}