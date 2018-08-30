package com.revisao.dh.android.aplicacaorevisao.view.activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.revisao.dh.android.aplicacaorevisao.R;
import com.revisao.dh.android.aplicacaorevisao.adapter.AdapterCategory;
import com.revisao.dh.android.aplicacaorevisao.adapter.AdapterCompany;
import com.revisao.dh.android.aplicacaorevisao.helpers.ClickListener;
import com.revisao.dh.android.aplicacaorevisao.model.ModelCompany;
import com.revisao.dh.android.aplicacaorevisao.model.ModelTemp;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity implements ClickListener {
    List<ModelCompany> modelCompanyList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ModelCompany ea = new ModelCompany("EA", "@drawable/ea");
        ModelCompany bethesda = new ModelCompany("Bethesda", "@drawable/bethesda");
        ModelCompany rockstar = new ModelCompany("Rockstar", "@drawable/rockstar");
        ModelCompany ubsoft = new ModelCompany("Ubsoft", "@drawable/ubsoft");

        modelCompanyList = new ArrayList<>();

        modelCompanyList.add(ea);
        modelCompanyList.add(bethesda);
        modelCompanyList.add(rockstar);
        modelCompanyList.add(ubsoft);
        modelCompanyList.add(ea);
        modelCompanyList.add(bethesda);
        modelCompanyList.add(rockstar);
        modelCompanyList.add(ubsoft);
        modelCompanyList.add(ea);
        modelCompanyList.add(bethesda);
        modelCompanyList.add(rockstar);
        modelCompanyList.add(ubsoft);


        RecyclerView recyclerView = findViewById(R.id.recycle);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        AdapterCompany adapterCompany = new AdapterCompany(modelCompanyList,MainActivity.this);
        adapterCompany.setClickListener(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapterCompany);
    }


    @Override
    public void onClick(View view, int position) {
        ModelCompany modelCompany = modelCompanyList.get(position);
        
        Intent intent = new Intent(MainActivity.this, ActivityList.class);
        startActivity(intent);
    }
}
