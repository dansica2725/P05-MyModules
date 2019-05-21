package c346.rp.edu.sg.mymodules;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView c346, c349;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        c346 = findViewById(R.id.c346);
        c349 = findViewById(R.id.c349);

        c346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ModuleDetailActivity.class).putExtra("Desc", "Module Code: C346 \nModule Name: Android Programming \nAcademic Year: 2018 \nSemester: 1 \nModule Credit: 4 \nVenue: W66M"));
            }
        });

        c349.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ModuleDetailActivity.class).putExtra("Desc", "Module Code: C349 \nModule Name: iPad Programming \nAcademic Year: 2018 \nSemester: 2 \nModule Credit: 4 \nVenue: W66E"));
            }
        });
    }
}
