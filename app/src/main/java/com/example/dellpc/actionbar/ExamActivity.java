package com.example.dellpc.actionbar;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import java.util.ArrayList;

public class ExamActivity extends AppCompatActivity {

    private static final String TAG = "ExamActivity";

    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam);
        ArrayList<Card> myValues = new ArrayList<Card>();

        //Populate the ArrayList with your own values
        for(int i=0; i<15;i++)
        {
           Card card = new Card("Exam"+(i+1),"Place;");
           myValues.add(card);
        }



        RecyclerViewAdapter adapter = new RecyclerViewAdapter(myValues,this);
        RecyclerView myView =  (RecyclerView)findViewById(R.id.recyclerview);
        myView.setHasFixedSize(true);
        myView.setAdapter(adapter);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        myView.setLayoutManager(llm);

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavView_bar);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);


        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(0);
        menuItem.setChecked(true);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.ic_schedule:

                        break;

                    case R.id.ic_count:
                        Intent intent1 = new Intent(ExamActivity.this, ActivityOne.class);
                        startActivity(intent1);
                        break;

                    case R.id.ic_email:
                        Intent intent2 = new Intent(ExamActivity.this, ActivityTwo.class);
                        startActivity(intent2);
                        break;

                    case R.id.ic_person:
                        Intent intent3 = new Intent(ExamActivity.this, ActivityThree.class);
                        startActivity(intent3);
                        break;


                }


                return true;
            }
        });


    }



}

