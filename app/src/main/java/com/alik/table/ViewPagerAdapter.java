package com.alik.table;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.alik.table.model.Detail;
import com.alik.table.model.Model;

import java.util.ArrayList;

public class ViewPagerAdapter extends FragmentStateAdapter {


    ListFragment model_fragment;// = new ListFragment( new ModelAdapter( new ArrayList<Model>(  ) ) );
    ListFragment detail_fragment; // = new ListFragment( new DetailAdapter( new ArrayList<Detail>(  ) ) );



    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity, ListFragment model_fragment, ListFragment detail_fragment ) {
        super( fragmentActivity );
        this.model_fragment = model_fragment;
        this.detail_fragment = detail_fragment;
    }


    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return model_fragment;
            case 1:
                return detail_fragment;
        }
        return model_fragment;
    }

    @Override
    public int getItemCount() {
        return 2;
    }

}
