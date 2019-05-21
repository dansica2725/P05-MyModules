package c346.rp.edu.sg.mymodules;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView modDescTV;
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_module);

        modDescTV = findViewById(R.id.modDescTv);

        back = findViewById(R.id.backBtn);

        Intent getDesc = getIntent();
        String desc = getDesc.getStringExtra("Desc");

        modDescTV.setText(desc);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
