package com.example.fragments;

import android.os.Bundle;
import android.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.ArrayAdapter;

public class ListMenuFragment extends ListFragment {
    String[] users = new String[] {
            "Omkar Raghu", "Rohini", "Trishya", "Praveen", "Sateesh", "Vaidehi", "Suraj", "Rahul", "Adwika", "Charv i" };
    String[] mobileNo = new String[] {
            "8788667043", "0987654321", "1122334455", "2233445566", "3344556677", "4455667788", "5566778899", "6677889900", "7788990011", "8899001122"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.list_items_info, container, false);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, users);
        setListAdapter(adapter);

        view.setBackgroundColor(getResources().getColor(android.R.color.holo_green_light));
        return view;
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        getListView().setSelector(android.R.color.holo_orange_light);
        DetailsFragment txt = (DetailsFragment) getFragmentManager().findFragmentById(R.id.fragment2);
        txt.change("Name: " + users[position], "Mobile No. : " + mobileNo[position]);
    }
}
