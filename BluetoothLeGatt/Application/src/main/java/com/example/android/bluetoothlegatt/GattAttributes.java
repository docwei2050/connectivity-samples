/*
 * Copyright (C) 2013 The Android Open Source Project
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

package com.example.android.bluetoothlegatt;

import java.util.HashMap;

/**
 * This class includes a small subset of standard GATT attributes for demonstration purposes.
 */
public class GattAttributes {

    public static String ORIGAMI_SERVICE = "00003434-70c0-11e9-adc0-fa7ae01bbebc";


    //旋转角度可读可写
    public static String ORIGAMI_ROTATE = "00003435-70c0-11e9-adc0-fa7ae01bbebc";
    //启动电机 可读可写
    public static String ORIGAMI_ENABLE_MACHINE = "00003438-70c0-11e9-adc0-fa7ae01bbebc";
    //当前角度
    public static String ORIGAMI_CURRENT_ANGLE = "00003437-70c0-11e9-adc0-fa7ae01bbebc";
    //当前电压
    public static String ORIGAMI_CURRENT_VOLTAGE = "00003436-70c0-11e9-adc0-fa7ae01bbebc";

}
