package com.example.martin.charged.charged;

import android.app.Activity;
import android.os.Bundle;

import com.example.martin.charged.R;


/**
 * Created by chris on 3/7/16.
 */
public class Knowledge extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);
//        TextView t = (TextView)findViewById(R.id.listtext);
//        t.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(getBaseContext(), what_you_know.class));
//            }
//        });
    }
}
