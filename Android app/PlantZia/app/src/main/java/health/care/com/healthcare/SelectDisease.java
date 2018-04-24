package health.care.com.healthcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class SelectDisease extends AppCompatActivity {
    public Button button,button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_disease2);
        button = (Button) findViewById(R.id.button2);

        // Capture button clicks
        button.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(SelectDisease.this,
                        Main2Activity.class);
                startActivity(myIntent);
            }
        });
        button2 = (Button) findViewById(R.id.button6);

        // Capture button clicks
        button2.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent2 = new Intent(SelectDisease.this,
                        Corn.class);
                startActivity(myIntent2);
            }
        });

        button = (Button) findViewById(R.id.button4);

        // Capture button clicks
        button.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent2 = new Intent(SelectDisease.this,
                        Tomato.class);
                startActivity(myIntent2);
            }
        });

        button = (Button) findViewById(R.id.button5);

        // Capture button clicks
        button.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent2 = new Intent(SelectDisease.this,
                        Apple.class);
                startActivity(myIntent2);
            }
        });

        button = (Button) findViewById(R.id.button7);

        // Capture button clicks
        button.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent2 = new Intent(SelectDisease.this,
                        Strawberry.class);
                startActivity(myIntent2);
            }
        });


        button = (Button) findViewById(R.id.button8);

        // Capture button clicks
        button.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent2 = new Intent(SelectDisease.this,
                        Peach.class);
                startActivity(myIntent2);
            }
        });

        button = (Button) findViewById(R.id.button9);

        // Capture button clicks
        button.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent2 = new Intent(SelectDisease.this,
                        Cherry.class);
                startActivity(myIntent2);
            }
        });

        button = (Button) findViewById(R.id.button10);

        // Capture button clicks
        button.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent2 = new Intent(SelectDisease.this,
                        Grape.class);
                startActivity(myIntent2);
            }
        });
    }

    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }*/
}
