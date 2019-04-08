package com.tqky.loan.ui.home.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.tqky.loan.R;
import com.tqky.loan.ui.home.HomeActivity;

public class CallLogFragment extends Fragment {
    private View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_call_log, container, false);
        HomeActivity homeActivity = (HomeActivity) getActivity();
        TextView textView = view.findViewById(R.id.textViewCallLog);
        String s = homeActivity.getCallDetails();
        textView.setText(s);
        return view;
    }
}
