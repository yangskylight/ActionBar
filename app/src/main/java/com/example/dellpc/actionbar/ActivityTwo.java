package com.example.dellpc.actionbar;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

/**
 * Created by User on 4/15/2017.
 */

public class ActivityTwo extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        TextView title = (TextView) findViewById(R.id.activityTitle2);
        title.setText("This is ActivityTwo");

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavView_Bar);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(2);
        menuItem.setChecked(true);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.ic_schedule:
                        Intent intent0 = new Intent(ActivityTwo.this, ExamActivity.class);
                        startActivity(intent0);
                        break;

                    case R.id.ic_count:
                        Intent intent1 = new Intent(ActivityTwo.this, ActivityOne.class);
                        startActivity(intent1);
                        break;

                    case R.id.ic_email:

                        break;

                    case R.id.ic_person:
                        Intent intent3 = new Intent(ActivityTwo.this, ActivityThree.class);
                        startActivity(intent3);
                        break;
                }


                return true;
            }
        });
    }
}