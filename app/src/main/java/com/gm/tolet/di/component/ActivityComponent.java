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

package com.gm.tolet.di.component;

import com.gm.tolet.di.PerActivity;
import com.gm.tolet.di.module.ActivityModule;

import dagger.Component;

/**
 * Name       : Gowtham
 * Created on : 17/7/17.
 * Email      : goutham.gm11@gmail.com
 */

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

//    void inject(MainActivity activity);
//
//    void inject(LoginActivity activity);
//
//    void inject(SplashActivity activity);
//
//    void inject(FeedActivity activity);
//
//    void inject(AboutFragment fragment);
//
//    void inject(OpenSourceFragment fragment);
//
//    void inject(BlogFragment fragment);
//
//    void inject(RateUsDialog dialog);

}
