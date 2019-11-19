//List view using xml

package com.ved.materialdesignexample.listview;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bringing the view to app screen from source file of xml
        String [] States = getResources().getStringArray(R.array.nameOFStates);
    }
}
