package com.example.displaytoken.ui.home;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import com.example.displaytoken.R;

public class HomeFragment extends Fragment implements  View.OnClickListener {
    private TextView one, two, three, four, five, six, seven, eight, nine, zero, div, multi, sub, plus, dot, equals, display, clear;
    private ImageButton backDelete;
    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        one = root.findViewById(R.id.one);
        two = root.findViewById(R.id.two);
        three = root.findViewById(R.id.three);
        four = root.findViewById(R.id.four);
        five = root.findViewById(R.id.five);
        six = root.findViewById(R.id.six);
        seven = root.findViewById(R.id.seven);
        eight = root.findViewById(R.id.eight);
        nine = root.findViewById(R.id.nine);
        zero = root.findViewById(R.id.zero);
        display = root.findViewById(R.id.display);
        clear = root.findViewById(R.id.clear);
        backDelete = root.findViewById(R.id.backDelete);

        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);
        zero.setOnClickListener(this);
        display.setOnClickListener(this);
        clear.setOnClickListener(this);
        backDelete.setOnClickListener(this);
        return root;
    }


    @Override
    public void onClick(View v) {

        if (v.findViewById(R.id.one) == one) {
            if (!display.getText().equals("")) {
                display.append("1");
            } else {
                display.setText("1");
            }
        } else if (v.findViewById(R.id.two) == two) {
            if (!display.getText().equals("")) {
                display.append("2");
            } else {
                display.setText("2");
            }
        } else if (v.findViewById(R.id.three) == three) {
            if (!display.getText().equals("")) {
                display.append("3");
            } else {
                display.setText("3");
            }
        } else if (v.findViewById(R.id.four) == four) {
            if (!display.getText().equals("")) {
                display.append("4");
            } else {
                display.setText("4");
            }
        } else if (v.findViewById(R.id.five) == five) {
            if (!display.getText().equals("")) {
                display.append("5");
            } else {
                display.setText("5");
            }
        } else if (v.findViewById(R.id.six) == six) {
            if (!display.getText().equals("")) {
                display.append("6");
            } else {
                display.setText("6");
            }
        } else if (v.findViewById(R.id.seven) == seven) {
            if (!display.getText().equals("")) {
                display.append("7");
            } else {
                display.setText("7");
            }
        } else if (v.findViewById(R.id.eight) == eight) {
            if (!display.getText().equals("")) {
                display.append("8");
            } else {
                display.setText("8");
            }
        } else if (v.findViewById(R.id.nine) == nine) {
            if (!display.getText().equals("")) {
                display.append("9");
            } else {
                display.setText("9");
            }
        } else if (v.findViewById(R.id.zero) == zero) {
            if (!display.getText().equals("")) {
                display.append("0");
            } else {
                display.setText("0");
            }
        } else if (v.findViewById(R.id.display) == display) {

        } else if (v.findViewById(R.id.clear) == clear) {
            display.setText(null);
        } else if (v.findViewById(R.id.backDelete) == backDelete) {
            if (!display.getText().equals("")) {
                String s = display.getText().toString();
                if (s.length() > 0) {
                    display.setText(s.substring(0, s.length() - 1));
                } else {
                    // Toast.makeText(this, "Nothing to remove", Toast.LENGTH_SHORT).show();
                }
            } else {
                //Toast.makeText(this, "nothing to remove", Toast.LENGTH_SHORT).show();
            }

        }
    }

    }