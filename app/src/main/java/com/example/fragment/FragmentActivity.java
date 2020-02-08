package com.example.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentActivity extends Fragment {
    private static final String KEY_TEXT = "text";
    private static final String KEY_NUMBER = "number";

    public static FragmentActivity newInstance(String text, int number) {
        FragmentActivity fragmentActivity = new FragmentActivity();

        Bundle bundle = new Bundle();

        bundle.putString(KEY_TEXT, text);
        bundle.putInt(KEY_NUMBER, number);
        fragmentActivity.setArguments(bundle);

        return fragmentActivity;

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_iklan, container, false);

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Bundle bundle = getArguments();

        if (bundle != null) {
            String text = bundle.getString(KEY_TEXT);
            int number = bundle.getInt(KEY_NUMBER);

            TextView textView = view.findViewById(R.id.iklanText);
            textView.setText(text + " " + String.valueOf(number));
        }
    }
}
