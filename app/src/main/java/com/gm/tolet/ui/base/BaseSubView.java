/*
 * Copyright (C) 2017  Gowtham Parimelazhagan.
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU Affero General Public License as published
 *     by the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU Affero General Public License for more details.
 *
 *     You should have received a copy of the GNU Affero General Public License
 *     along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package com.gm.tolet.ui.base;

import android.annotation.TargetApi;
import android.content.Context;
import android.support.annotation.StringRes;
import android.util.AttributeSet;
import android.view.ViewGroup;

/**
 * Created by janisharali on 27/01/17.
 */

public abstract class BaseSubView extends ViewGroup implements SubMvpView {

    private MvpView mParentMvpView;

    public BaseSubView(Context context) {
        super(context);
    }

    public BaseSubView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public BaseSubView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(21)
    public BaseSubView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    public void attachParentMvpView(MvpView mvpView) {
        mParentMvpView = mvpView;
    }

    @Override
    public void showLoading() {
        if (mParentMvpView != null) {
            mParentMvpView.showLoading();
        }
    }

    @Override
    public void hideLoading() {
        if (mParentMvpView != null) {
            mParentMvpView.hideLoading();
        }
    }

    @Override
    public void onError(@StringRes int resId) {
        if (mParentMvpView != null) {
            mParentMvpView.onError(resId);
        }
    }

    @Override
    public void onError(String message) {
        if (mParentMvpView != null) {
            mParentMvpView.onError(message);
        }
    }

    @Override
    public void showMessage(String message) {
        if (mParentMvpView != null) {
            mParentMvpView.showMessage(message);
        }
    }

    @Override
    public void showMessage(@StringRes int resId) {
        if (mParentMvpView != null) {
            mParentMvpView.showMessage(resId);
        }
    }

    @Override
    public void hideKeyboard() {
        if (mParentMvpView != null) {
            mParentMvpView.hideKeyboard();
        }
    }

    @Override
    public boolean isNetworkConnected() {
        if (mParentMvpView != null) {
            return mParentMvpView.isNetworkConnected();
        }
        return false;
    }

    @Override
    public void openActivityOnTokenExpire() {
        if (mParentMvpView != null) {
            mParentMvpView.openActivityOnTokenExpire();
        }
    }

    protected abstract void bindViewsAndSetOnClickListeners();

    protected abstract void setUp();
}
