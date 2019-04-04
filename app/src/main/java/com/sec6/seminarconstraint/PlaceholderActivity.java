package com.sec6.seminarconstraint;

import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Placeholder;

public class PlaceholderActivity extends AppCompatActivity implements View.OnClickListener{

    Placeholder mPlaceholder;
    ConstraintLayout mConstraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_placeholder);
        TextView button_a = findViewById(R.id.a);
        TextView button_b = findViewById(R.id.b);
        TextView button_c = findViewById(R.id.c);
        TextView button_d = findViewById(R.id.d);

        button_a.setOnClickListener(this);
        button_b.setOnClickListener(this);
        button_c.setOnClickListener(this);
        button_d.setOnClickListener(this);

        mConstraintLayout = findViewById(R.id.constraint_layout);
        mPlaceholder = findViewById(R.id.placeholder);
    }

    @Override
    public void onClick(View v) {
        TransitionManager.beginDelayedTransition(mConstraintLayout);
        mPlaceholder.setContentId(v.getId());
    }
}
