package com.amlcurran.messages.ui;

import android.view.View;

import com.amlcurran.messages.threads.ThreadFragment;

public interface UiController {
    void loadMessagesListFragment();

    void replaceFragment(ThreadFragment fragment);

    View getView();

    boolean backPressed();

    void loadEmptyFragment();

    void hideDisabledBanner();

    void showDisabledBanner();

    View getDisabledBanner();
}
