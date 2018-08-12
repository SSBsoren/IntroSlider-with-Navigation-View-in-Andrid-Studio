package com.soren.sagen.introapplication.Tab;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.soren.sagen.introapplication.Fragment.BlankFragment;
import com.soren.sagen.introapplication.Fragment.BlankFragment2;
import com.soren.sagen.introapplication.Fragment.BlankFragment3;

/**
 * Created by saGen on 12-08-2018.
 */

public class tabsPager extends FragmentStatePagerAdapter {

    String[] titles=new String[]{"First","Second","Third"};

    @Override
    public CharSequence getPageTitle(int position){
        return titles[position];


    }

    public tabsPager(FragmentManager fm) {
        super(fm);
    }


    @Override
    public Fragment getItem(int position) {

        switch (position){
            case  0:
                BlankFragment blankFragment=new BlankFragment();
                return blankFragment;

            case 1:
                BlankFragment2 blankFragment2=new BlankFragment2();
                return blankFragment2;

            case 2:
                BlankFragment3 blankFragment3=new BlankFragment3();
                return blankFragment3;


         }
        return null;
    }

    @Override
    public int getCount() {
        return 0;
    }
}
