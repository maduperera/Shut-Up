/*
 * Copyright (C) 2015 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.deskclock;

import android.app.Application;
import android.content.Context;

import com.android.deskclock.data.DataModel;
import com.android.deskclock.events.Events;
import com.android.deskclock.events.LogEventTracker;
import com.android.deskclock.uidata.UiDataModel;

public class DeskClockApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        final Context applicationContext = getApplicationContext();
        DataModel.getDataModel().setContext(applicationContext);
        UiDataModel.getUiDataModel().setContext(applicationContext);
        Events.addEventTracker(new LogEventTracker(applicationContext));
    }
}