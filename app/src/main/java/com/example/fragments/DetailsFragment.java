package com.example.fragments;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DetailsFragment extends Fragment {
    TextView name, mobileNo;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.details_info, container, false);
        name = view.findViewById(R.id.Name);
        mobileNo = view.findViewById(R.id.MobileNo); // Update the ID reference
        return view;
    }

    public void change(String uname, String umobileNo) {
        name.setText(uname);
        mobileNo.setText(umobileNo);
    }
}
