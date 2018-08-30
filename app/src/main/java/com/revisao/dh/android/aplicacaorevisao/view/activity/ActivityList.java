package com.revisao.dh.android.aplicacaorevisao.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;

import com.revisao.dh.android.aplicacaorevisao.R;
import com.revisao.dh.android.aplicacaorevisao.helpers.ClickListener;
import com.revisao.dh.android.aplicacaorevisao.model.ModelTemp;
import com.revisao.dh.android.aplicacaorevisao.view.activity.Fragments.Fragment_action;
import com.revisao.dh.android.aplicacaorevisao.view.activity.Fragments.Fragment_fight;
import com.revisao.dh.android.aplicacaorevisao.view.activity.Fragments.Fragment_horror;
import com.revisao.dh.android.aplicacaorevisao.view.activity.Fragments.Fragment_party;
import com.revisao.dh.android.aplicacaorevisao.adapter.FragmentPageAdapter;

import java.util.ArrayList;
import java.util.List;

public class ActivityList extends BaseActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        List<Fragment> fragmentList = new ArrayList<>();
        List<String> fragmentTitle = new ArrayList<>();

        String fragmentAction = getResources().getString(R.string.action);
        String fragmentFight = getResources().getString(R.string.fight);
        String fragmentHorror = getResources().getString(R.string.horror);
        String fragmentParty = getResources().getString(R.string.party);

        Fragment_action fragment_action = new Fragment_action();
        Fragment_fight fragment_fight = new Fragment_fight();
        Fragment_horror fragment_horror = new Fragment_horror();
        Fragment_party fragment_party = new Fragment_party();

        fragmentList.add(fragment_action);
        fragmentTitle.add(fragmentAction);

        fragmentList.add(fragment_fight);
        fragmentTitle.add(fragmentFight);

        fragmentList.add(fragment_horror);
        fragmentTitle.add(fragmentHorror);

        fragmentList.add(fragment_party);
        fragmentTitle.add(fragmentParty);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);

        FragmentPageAdapter fragmentPageAdapter = new FragmentPageAdapter(getSupportFragmentManager(),fragmentList, fragmentTitle);
        ViewPager viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(fragmentPageAdapter);
        tabLayout.setupWithViewPager(viewPager);



    }

}
