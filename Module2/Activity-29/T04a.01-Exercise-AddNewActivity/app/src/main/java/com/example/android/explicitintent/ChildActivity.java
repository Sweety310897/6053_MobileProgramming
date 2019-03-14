/*
 * Copyright (C) 2016 The Android Open Source Project
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
package com.example.android.explicitintent;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ChildActivity extends AppCompatActivity {

    private TextView mDisplayText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);
        mDisplayText = (TextView) findViewById(R.id.tv_display);
    }
}

// TODO (1) Use Android Studio's Activity wizard to create a new Activity called ChildActivity

// Do steps 2 - 5 in activity_child.xml
// TODO (2) Change the ConstraintLayout to a FrameLayout and make appropriate adjustments
// TODO (3) Add a TextView with an id value of @id/tv_display
// TODO (4) Set the text to something that indicates this is default text being displayed
// TODO (5) Make the text size a little larger

// Do steps 6 & 7 in ChildActivity.java
// TODO (6) Create a TextView field to display your message
// TODO (7) Get a reference to your TextView in Java