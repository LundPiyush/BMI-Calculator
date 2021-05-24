package com.example.chandan.bmicalculatordemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class ViewActivity extends AppCompatActivity {

    TextView tvViewData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        tvViewData=(TextView)findViewById(R.id.tvViewData);
        tvViewData.setMovementMethod(new ScrollingMovementMethod());

        String data= Activity2.db.viewBmiHistory();
        if (data.length()==0)
            tvViewData.setText("No records to show");
        else
            tvViewData.setText(data);


    }
}
