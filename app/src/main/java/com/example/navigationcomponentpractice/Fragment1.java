package com.example.navigationcomponentpractice;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavAction;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

/**
 * Created by Abhinav Singh on 06,June,2020
 */
public class Fragment1 extends Fragment {
    private TextView textView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable final Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        textView = view.findViewById(R.id.textView);
        view.setBackgroundColor(Color.RED);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Fragment1Directions.ActionFragment1ToFragment2 action = Fragment1Directions.actionFragment1ToFragment2();
               action.setSomething(16);
                Navigation.findNavController(view).navigate(action);
            }
        });
    }
}
