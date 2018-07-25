package edu.sti.task_performance_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MyActivity extends AppCompatActivity {

    public void sendMessage(View view)
    {
        EditText text = (EditText) findViewById(R.id.title);
        String title = text.getText().toString();
        EditText blogCo = (EditText) findViewById(R.id.blog);
        String blog = blogCo.getText().toString();

        Log.d("MyActivity", "You have just posted!");
        Log.d("MyActivity","Title: "+ title);
        Log.d("MyActivity","Blog: "+ blog);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
    }

}

