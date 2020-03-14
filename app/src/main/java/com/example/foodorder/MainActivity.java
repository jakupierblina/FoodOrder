package com.example.foodorder;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView mytitle= (TextView)findViewById(R.id.title);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        //setSupportActionBar(myToolbar);

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
