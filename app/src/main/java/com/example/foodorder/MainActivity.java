package com.example.foodorder;
import com.example.foodorder.Fragments.*;

import android.app.Fragment;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.view.Menu;
import android.support.v4.widget.DrawerLayout;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import android.app.FragmentTransaction;
import android.widget.ShareActionProvider;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity
{
    private DrawerLayout drawerLayout;
    private ListView drawerList;
    private String[] titles;
    private Fragment fragment;

    private class DrawerItemClickListener implements ListView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//Code to run when an item in the navigation drawer gets clicked
            selectItem(position);
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        titles = getResources().getStringArray(R.array.titles);
        drawerList = (ListView)findViewById(R.id.drawer);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        //Populate the ListView
        drawerList.setAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_activated_1, titles));
        drawerList.setOnItemClickListener(new DrawerItemClickListener());
        if (savedInstanceState == null) {
            selectItem(0);
        }
    }



    private void selectItem(int position) 
    {
// update the main content by replacing fragments
        PizzaFragment fragment1;
        PastaFragment fragment2;
        
       
        switch(position) 
        {
            case 1:
                fragment1 = new PizzaFragment();
                break;
            case 2:
                fragment2 = new PastaFragment();
                break;
            default:

        }
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.content_frame, fragment);
        ft.addToBackStack(null);
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        ft.commit();
//Set the action bar title
        setActionBarTitle(position);
//Close drawer
        drawerLayout.closeDrawer(drawerList);
    }


    private void setActionBarTitle(int position) {
        String title;
        if (position == 0){
            title = getResources().getString(R.string.app_name);
        } else {
            title = titles[position];
        }
        getActionBar().setTitle(title);
    }








    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
// Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        MenuItem menuItem = menu.findItem(R.id.action_share);
        ShareActionProvider shareActionProvider = (ShareActionProvider) menuItem.getActionProvider();
        setIntent("This is example text");
        return super.onCreateOptionsMenu(menu);
    }


    private void setIntent(String text) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, text);
        ShareActionProvider shareActionProvider = null;
        shareActionProvider.setShareIntent(intent);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item)
    {
        int id= item.getItemId();

        if(id==R.id.menu_home)
            Toast.makeText(this,"Home",Toast.LENGTH_SHORT).show();
        if(id==R.id.menu_mail)
            Toast.makeText(this,"mail",Toast.LENGTH_SHORT).show();
        if(id==R.id.menu_close)
            Toast.makeText(this,"close",Toast.LENGTH_SHORT).show();
        finish();

        return super.onOptionsItemSelected(item);
    }


}
