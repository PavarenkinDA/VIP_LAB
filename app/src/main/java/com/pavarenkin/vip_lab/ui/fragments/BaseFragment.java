package com.pavarenkin.vip_lab.ui.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.View;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

/**
 * Created by Дмитрий Паваренкин on 28.02.2017.
 */

public class BaseFragment extends Fragment {

    protected EventBus eventBus = EventBus.getDefault();

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initControls();
        updateView();
    }

    protected void initControls() {
    }

    public void updateView() {
    }

    @Override
    public void onStart() {
        super.onStart();
        eventBus.register(this);
    }

    @Override
    public void onStop() {
        eventBus.unregister(this);
        super.onStop();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEvent(Object event) {

    }
}