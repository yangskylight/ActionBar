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

public class ActivityOne extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        TextView title = (TextView) findViewById(R.id.activityTitle1);
        title.setText("This is ActivityOne");

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavView_Bar);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(1);
        menuItem.setChecked(true);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.ic_schedule:
                        Intent intent0 = new Intent(ActivityOne.this, ExamActivity.class);
                        startActivity(intent0);
                        break;

                    case R.id.ic_count:

                        break;

                    case R.id.ic_email:
                        Intent intent2 = new Intent(ActivityOne.this, ActivityTwo.class);
                        startActivity(intent2);
                        break;

                    case R.id.ic_person:
                        Intent intent3 = new Intent(ActivityOne.this, ActivityThree.class);
                        startActivity(intent3);
                        break;
                }


                return true;
            }
        });
    }
}
