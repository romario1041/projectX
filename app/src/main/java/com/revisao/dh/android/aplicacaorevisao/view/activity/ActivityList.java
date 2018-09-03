package com.revisao.dh.android.aplicacaorevisao.view.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;

import com.revisao.dh.android.aplicacaorevisao.R;
import com.revisao.dh.android.aplicacaorevisao.view.activity.Fragments.Fragment_action;
import com.revisao.dh.android.aplicacaorevisao.view.activity.Fragments.Fragment_fight;
import com.revisao.dh.android.aplicacaorevisao.view.activity.Fragments.Fragment_horror;
import com.revisao.dh.android.aplicacaorevisao.view.activity.Fragments.Fragment_party;
import com.revisao.dh.android.aplicacaorevisao.controler.adapter.FragmentPageAdapter;

import java.util.ArrayList;
import java.util.List;

public class ActivityList extends BaseActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        //Lista de fragmentos
        List<Fragment> fragmentList = new ArrayList<>();
        //Lista de titulos
        List<String> fragmentTitle = new ArrayList<>();

        //Titulos
        String fragmentAction = getResources().getString(R.string.action);
        String fragmentFight = getResources().getString(R.string.fight);
        String fragmentHorror = getResources().getString(R.string.horror);
        String fragmentParty = getResources().getString(R.string.party);

        //Fragmentos
        Fragment_action fragment_action = new Fragment_action();
        Fragment_fight fragment_fight = new Fragment_fight();
        Fragment_horror fragment_horror = new Fragment_horror();
        Fragment_party fragment_party = new Fragment_party();

        //Passando os fragmentos e seus respectivos titulos pras listas
        fragmentList.add(fragment_action);
        fragmentTitle.add(fragmentAction);

        fragmentList.add(fragment_fight);
        fragmentTitle.add(fragmentFight);

        fragmentList.add(fragment_horror);
        fragmentTitle.add(fragmentHorror);

        fragmentList.add(fragment_party);
        fragmentTitle.add(fragmentParty);

        //recuperando a tabLayout
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);

        //Criando o adapter do ViewPager
        FragmentPageAdapter fragmentPageAdapter = new FragmentPageAdapter(getSupportFragmentManager(),fragmentList, fragmentTitle);
        //Recuperando o ViewPager
        ViewPager viewPager = findViewById(R.id.viewPager);
        //Setando o Adapter do ViewPager
        viewPager.setAdapter(fragmentPageAdapter);
        //Setando o viewPager no tabLayout
        tabLayout.setupWithViewPager(viewPager);
    }

}
