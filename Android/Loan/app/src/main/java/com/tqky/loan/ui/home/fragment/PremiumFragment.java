package com.tqky.loan.ui.home.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tqky.loan.R;
import com.tqky.loan.ui.circles.CirclesActivity;

public class PremiumFragment extends Fragment implements View.OnClickListener {
    private View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_premium, container, false);
        view.findViewById(R.id.imageViewMyCircle).setOnClickListener(this);
        view.findViewById(R.id.constraintLayoutMyCircle).setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        startActivity(new Intent(getActivity(), CirclesActivity.class));
    }
}
