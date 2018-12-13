package com.abhigyan.user.customdailog;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showDailog(View view)
    {
        AlertDialog.Builder mBuilder = new AlertDialog.Builder(MainActivity.this);
        View dailogView = getLayoutInflater().inflate(R.layout.custom_dailog,null);
        final EditText passwordET = dailogView.findViewById(R.id.passwordText);
        final EditText emailET = dailogView.findViewById(R.id.emailText);
        Button button = dailogView.findViewById(R.id.button);

        mBuilder.setView(dailogView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!passwordET.getText().toString().isEmpty() && !emailET.getText().toString().isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Login successful!", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "All fields must be full!", Toast.LENGTH_SHORT).show();
                }
            }
        });
        mBuilder.show();
    }
}
