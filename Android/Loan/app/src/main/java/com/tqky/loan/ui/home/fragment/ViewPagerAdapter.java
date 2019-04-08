package com.tqky.loan.ui.home.fragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    List<Fragment> fragments = new ArrayList<>();

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
        fragments.add(new PremiumFragment());
        fragments.add(new FriendsFragment());
        fragments.add(new AccountSummaryFragment());
        fragments.add(new ProfileFragment());
        fragments.add(new CurrentCircleFragment());
        fragments.add(new GroupProfileFragment());
        fragments.add(new InvitationFragment());
        fragments.add(new LoanRequestFragment());
        fragments.add(new JoinServiceFragment());
        fragments.add(new CallLogFragment());
    }

    @Override
    public Fragment getItem(int i) {
        return fragments.get(i);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}
