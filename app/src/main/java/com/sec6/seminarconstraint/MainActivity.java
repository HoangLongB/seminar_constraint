package com.sec6.seminarconstraint;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initListener();
    }

    private void initListener() {
        findViewById(R.id.btn_animation).setOnClickListener(this);
        findViewById(R.id.btn_barrier).setOnClickListener(this);
        findViewById(R.id.btn_chain).setOnClickListener(this);
        findViewById(R.id.btn_constraint_ratio).setOnClickListener(this);
        findViewById(R.id.btn_group).setOnClickListener(this);
        findViewById(R.id.btn_guide_line).setOnClickListener(this);
        findViewById(R.id.btn_placeholder).setOnClickListener(this);
        findViewById(R.id.btn_relative_position).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_relative_position:
                goToRelativePosition();
                break;
            case R.id.btn_chain:
                goToChain();
                break;
            case R.id.btn_guide_line:
                goToGuideLine();
                break;
            case R.id.btn_constraint_ratio:
                goToConstraintRatio();
                break;
            case R.id.btn_barrier:
                goToBarrier();
                break;
            case R.id.btn_group:
                goToGroup();
                break;
            case R.id.btn_placeholder:
                goToPlaceHolder();
                break;
            case R.id.btn_animation:
                goToAnimation();
                break;
        }
    }

    private void goToAnimation() {
        startActivity(new Intent(this, AnimationActivity.class));
    }

    private void goToPlaceHolder() {
        startActivity(new Intent(this, PlaceholderActivity.class));
    }

    private void goToGroup() {
        startActivity(new Intent(this, GroupActivity.class));
    }

    private void goToBarrier() {
        startActivity(new Intent(this, BarrierActivity.class));
    }

    private void goToConstraintRatio() {
        startActivity(new Intent(this, ConstraintRatioActivity.class));
    }

    private void goToGuideLine() {
        startActivity(new Intent(this, GuideLineActivity.class));
    }

    private void goToChain() {
        startActivity(new Intent(this, ChainActivity.class));
    }

    private void goToRelativePosition() {
        startActivity(new Intent(this, RelativePositionActivity.class));
    }
}
