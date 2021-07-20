/*
 * Copyright (C) 2017 - present Instructure, Inc.
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 *
 */
package com.instructure.teacher.ui

import com.instructure.espresso.filters.P0
import com.instructure.teacher.ui.utils.TeacherTest
import dagger.hilt.android.testing.HiltAndroidTest
import org.junit.Test

@HiltAndroidTest
class DeviceTest : TeacherTest() {
    @Test
    @P0
    fun checkAnimationsOff() {
//        Device.verifyAnimationsDisabled();
    }

    @Test
    override fun displaysPageObjects() {
        // N/A
    }
}
