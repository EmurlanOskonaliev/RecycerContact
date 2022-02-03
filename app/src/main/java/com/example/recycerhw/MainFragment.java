package com.example.recycerhw;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class MainFragment extends Fragment {

	private RecyclerView recyclerView;
	private ContactAdapter adapter;
	private ArrayList<Contact> list;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

	@Override
	public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);

		loadData();
		recyclerView=view.findViewById(R.id.recycler_view);
		adapter=new ContactAdapter(list);
		recyclerView.setAdapter(adapter);
	}
	private void loadData(){
    	list=new ArrayList<>();
    	list.add(new Contact("Nrdin", "996501396999", ""));
    	list.add(new Contact("Bakyt", "996501234526", ""));
    	list.add(new Contact("Maks", "996502345678", ""));
    	list.add(new Contact("Beka", "996501123456", ""));
    	list.add(new Contact("Bema", "996501098765", ""));
    	list.add(new Contact("Mom", "996501566789", ""));
    	list.add(new Contact("Emo", "996501879908", ""));
    	list.add(new Contact("Toli", "996501675467", ""));
    	list.add(new Contact("Beka", "996501123456", ""));
    	list.add(new Contact("Nrdin", "996501396999", ""));
    	list.add(new Contact("Sancho", "996501678978", ""));
    	list.add(new Contact("Aikol", "996501678976", ""));
    	list.add(new Contact("Dancho", "996501456467", ""));
    	list.add(new Contact("Toli", "996501675467", ""));
    	list.add(new Contact("Alish", "996501234565", ""));
    	list.add(new Contact("Uli", "996501356767", ""));
	}
}