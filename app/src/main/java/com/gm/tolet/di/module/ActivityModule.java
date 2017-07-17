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

package com.gm.tolet.di.module;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;


import com.gm.tolet.di.ActivityContext;
import com.gm.tolet.di.PerActivity;

import dagger.Module;
import dagger.Provides;
import io.reactivex.disposables.CompositeDisposable;

/**
 * Name       : Gowtham
 * Created on : 17/7/17.
 * Email      : goutham.gm11@gmail.com
 */

@Module
public class ActivityModule {

    private AppCompatActivity mActivity;

    public ActivityModule(AppCompatActivity activity) {
        this.mActivity = activity;
    }

    @Provides
    @ActivityContext
    Context provideContext() {
        return mActivity;
    }

    @Provides
    AppCompatActivity provideActivity() {
        return mActivity;
    }

    @Provides
    CompositeDisposable provideCompositeDisposable() {
        return new CompositeDisposable();
    }

   /* @Provides
    SchedulerProvider provideSchedulerProvider() {
        return new AppSchedulerProvider();
    }

    @Provides
    @PerActivity
    SplashMvpPresenter<SplashMvpView> provideSplashPresenter(
            SplashPresenter<SplashMvpView> presenter) {
        return presenter;
    }

    @Provides
    AboutMvpPresenter<AboutMvpView> provideAboutPresenter(
            AboutPresenter<AboutMvpView> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    LoginMvpPresenter<LoginMvpView> provideLoginPresenter(
            LoginPresenter<LoginMvpView> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    MainMvpPresenter<MainMvpView> provideMainPresenter(
            MainPresenter<MainMvpView> presenter) {
        return presenter;
    }

    @Provides
    RatingDialogMvpPresenter<RatingDialogMvpView> provideRateUsPresenter(
            RatingDialogPresenter<RatingDialogMvpView> presenter) {
        return presenter;
    }

    @Provides
    FeedMvpPresenter<FeedMvpView> provideFeedPresenter(
            FeedPresenter<FeedMvpView> presenter) {
        return presenter;
    }

    @Provides
    OpenSourceMvpPresenter<OpenSourceMvpView> provideOpenSourcePresenter(
            OpenSourcePresenter<OpenSourceMvpView> presenter) {
        return presenter;
    }

    @Provides
    BlogMvpPresenter<BlogMvpView> provideBlogMvpPresenter(
            BlogPresenter<BlogMvpView> presenter) {
        return presenter;
    }

    @Provides
    FeedPagerAdapter provideFeedPagerAdapter(AppCompatActivity activity) {
        return new FeedPagerAdapter(activity.getSupportFragmentManager());
    }

    @Provides
    OpenSourceAdapter provideOpenSourceAdapter() {
        return new OpenSourceAdapter(new ArrayList<OpenSourceResponse.Repo>());
    }

    @Provides
    BlogAdapter provideBlogAdapter() {
        return new BlogAdapter(new ArrayList<BlogResponse.Blog>());
    }
*/
    @Provides
    LinearLayoutManager provideLinearLayoutManager(AppCompatActivity activity) {
        return new LinearLayoutManager(activity);
    }
}
