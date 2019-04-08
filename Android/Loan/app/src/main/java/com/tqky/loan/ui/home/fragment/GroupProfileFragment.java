package com.tqky.loan.ui.home.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.tqky.loan.R;
import com.tqky.loan.models.User;
import com.tqky.loan.ui.home.adapter.CurrentCircleAdapter;
import com.tqky.loan.ui.home.adapter.GroupProfileAdapter;

import java.util.ArrayList;
import java.util.List;

public class GroupProfileFragment extends Fragment {
    private View view;
    private List<User> list = new ArrayList<>();
    private GroupProfileAdapter adapter;
    private RecyclerView recyclerView;
    private EditText editTextSearch;

    private void randomUser(String text) {
        list.clear();
        for (int i = 0; i < 20; i++) {
            if (TextUtils.isEmpty(text) || ("Name " + (i + 1)).contains(text)) {
                list.add(new User("Name " + (i + 1)));
            }
        }
        adapter.notifyDataSetChanged();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_friends, container, false);
        recyclerView = view.findViewById(R.id.recyclerView);
        editTextSearch = view.findViewById(R.id.editTextSearch);

        adapter = new GroupProfileAdapter(list);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));

        randomUser("");

        editTextSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                randomUser(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        return view;
    }
}
