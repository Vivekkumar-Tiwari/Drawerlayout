package com.example.nav_drawer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    ImageButton imageButton;

    NavigationView navigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawerLayout = findViewById(R.id.drawerlayout);
        navigationView = findViewById(R.id.navigationvieww);
        imageButton = findViewById(R.id.btndrawertoggle);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.open();
            }
        });

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int itemid = item.getItemId();

                if(itemid == R.id.navmenu){
                    Toast.makeText(MainActivity.this, "Sorry isn't avilable :", Toast.LENGTH_SHORT).show();
                } else if (itemid == R.id.navcart) {
                    Toast.makeText(MainActivity.this, "Sorry isn't avilable :", Toast.LENGTH_SHORT).show();
                }
                else if (itemid == R.id.navhistory) {
                    Toast.makeText(MainActivity.this, "Sorry isn't avilable :", Toast.LENGTH_SHORT).show();
                }
                else if (itemid == R.id.navOrders) {
                    Toast.makeText(MainActivity.this, "Sorry isn't avilable :", Toast.LENGTH_SHORT).show();
                }
                else if (itemid == R.id.navfeedback) {
                    Toast.makeText(MainActivity.this, "Sorry isn't avilable :", Toast.LENGTH_SHORT).show();
                }
                else if (itemid == R.id.Favourite) {
                    Toast.makeText(MainActivity.this, "Sorry isn't avilable :", Toast.LENGTH_SHORT).show();
                }
                else if (itemid == R.id.navterms) {
                    Toast.makeText(MainActivity.this, "Sorry isn't avilable :", Toast.LENGTH_SHORT).show();
                }
                else if (itemid == R.id.contact) {
                    Toast.makeText(MainActivity.this, "Sorry isn't avilable :", Toast.LENGTH_SHORT).show();
                }
                else  {
                    Toast.makeText(MainActivity.this, "Sorry isn't avilable :", Toast.LENGTH_SHORT).show();
                }


                drawerLayout.close();
                return true;
            }
        });

    }

    }
