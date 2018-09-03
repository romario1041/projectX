package com.revisao.dh.android.aplicacaorevisao.view.activity.Fragments;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.revisao.dh.android.aplicacaorevisao.controler.adapter.AdapterCategory;
import com.revisao.dh.android.aplicacaorevisao.R;
import com.revisao.dh.android.aplicacaorevisao.helpers.ClickListener;
import com.revisao.dh.android.aplicacaorevisao.model.ModelTemp;
import com.revisao.dh.android.aplicacaorevisao.view.activity.ActivityDetail;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_horror extends Fragment implements ClickListener {

    List<ModelTemp> lista;
    public Fragment_horror() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_fragment_horror, container, false);

        ModelTemp modelTemp1 = new ModelTemp("Titulo", "@drawable/mario", getResources().getString(R.string.content));
        ModelTemp modelTemp2 = new ModelTemp("Titulo", "@drawable/mario", getResources().getString(R.string.content));
        ModelTemp modelTemp3 = new ModelTemp("Titulo", "@drawable/mario", getResources().getString(R.string.content));
        ModelTemp modelTemp4 = new ModelTemp("Titulo", "@drawable/mario", getResources().getString(R.string.content));
        ModelTemp modelTemp5 = new ModelTemp("Titulo", "@drawable/mario", getResources().getString(R.string.content));
        ModelTemp modelTemp6 = new ModelTemp("Titulo", "@drawable/mario", getResources().getString(R.string.content));
        ModelTemp modelTemp7 = new ModelTemp("Titulo", "@drawable/mario", getResources().getString(R.string.content));
        ModelTemp modelTemp8 = new ModelTemp("Titulo", "@drawable/mario", getResources().getString(R.string.content));
        ModelTemp modelTemp9 = new ModelTemp("Titulo", "@drawable/mario", getResources().getString(R.string.content));
        ModelTemp modelTemp0 = new ModelTemp("Titulo", "@drawable/mario", getResources().getString(R.string.content));
        ModelTemp modelTemp11 = new ModelTemp("Titulo", "@drawable/mario", getResources().getString(R.string.content));
        ModelTemp modelTemp12 = new ModelTemp("Titulo", "@drawable/mario", getResources().getString(R.string.content));
        ModelTemp modelTemp13 = new ModelTemp("Titulo", "@drawable/mario", getResources().getString(R.string.content));
        ModelTemp modelTemp14 = new ModelTemp("Titulo", "@drawable/mario", getResources().getString(R.string.content));

        lista = new ArrayList<>();
        lista.add(modelTemp1);
        lista.add(modelTemp2);
        lista.add(modelTemp3);
        lista.add(modelTemp4);
        lista.add(modelTemp5);
        lista.add(modelTemp6);
        lista.add(modelTemp7);
        lista.add(modelTemp8);
        lista.add(modelTemp9);
        lista.add(modelTemp0);
        lista.add(modelTemp11);
        lista.add(modelTemp12);
        lista.add(modelTemp13);
        lista.add(modelTemp14);



        Context context = getContext();
        RecyclerView recyclerView = v.findViewById(R.id.recycle);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(v.getContext());
        AdapterCategory adapterCategory = new AdapterCategory(lista,v.getContext());
        adapterCategory.setClickListener(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapterCategory);
        return v;
    }


    @Override
    public void onClick(View view, int position) {
        ModelTemp modelTemp = lista.get(position);
        Intent intent = new Intent(view.getContext(), ActivityDetail.class);
        startActivity(intent);
    }
}
