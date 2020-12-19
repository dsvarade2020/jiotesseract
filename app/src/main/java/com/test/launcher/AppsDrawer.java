package com.test.launcher;

import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AppsDrawer extends Fragment {

    View view;
    private RecyclerView rview;
    RAdapter rAdapter;
    private List<AppInfo> appsList;
    RecyclerView recyclerView;

    public  AppsDrawer(){
        appsList = new ArrayList<>();
    }


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        view = inflater.inflate(R.layout.apps_drawer, container, false);



        rview = view.findViewById(R.id.RView);
        rview.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView = view.findViewById(R.id.RView);

        rAdapter = new RAdapter(getActivity(), R.layout.row, appsList);

        rview.setAdapter(rAdapter);

        rAdapter.notifyDataSetChanged();



        return view;
    }


}
