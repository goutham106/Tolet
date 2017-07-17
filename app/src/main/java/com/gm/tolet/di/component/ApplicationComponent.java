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

import android.app.Application;
import android.content.Context;

import com.gm.tolet.ToletApp;
import com.gm.tolet.di.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Name       : Gowtham
 * Created on : 17/7/17.
 * Email      : goutham.gm11@gmail.com
 */

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(ToletApp app);

//    void inject(SyncService service);
//
//    @ApplicationContext
//    Context context();
//
//    Application application();
//
//    DataManager getDataManager();
}