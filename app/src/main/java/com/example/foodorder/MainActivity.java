package com.example.foodorder;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.my_options_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id= item.getItemId();

        if(id==R.id.menu_home)
            Toast.makeTest(this,"Home",Toast.LENGTH_SHORT).show();
        if(id==R.id.menu_mail)
            Toast.makeTest(this,"mail",Toast.LENGTH_SHORT).show();
        if(id==R.id.menu_close)
            Toast.makeTest(this,"close",Toast.LENGTH_SHORT).show();
            finish();

        return super.onOptionsItemSelected(item);
    }
}
