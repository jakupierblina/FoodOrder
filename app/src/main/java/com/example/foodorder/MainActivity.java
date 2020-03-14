package com.example.foodorder;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*
        private String[] titles;
        private ListView drawerList;
        @Override
        protected void onCreate(Bundle savedInstanceState)
        {
            titles = getResources().getStringArray(R.array.titles);
            drawerList = (ListView)findViewById(R.id.drawer);
            drawerList.setAdapter(new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_activated_1, titles));
        }
         */

    }
}
