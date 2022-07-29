package com.example.example_toastimage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.btn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Context context = MainActivity.this;

                Toast toast = Toast.makeText(context,"Toast with Image",Toast.LENGTH_SHORT);

                toast.setGravity(Gravity.CENTER,0,0);

                LinearLayout layout = (LinearLayout) toast.getView();

                ImageView imageView = new ImageView(context);
                imageView.setImageResource(R.drawable.ic_launcher_background);

                layout.addView(imageView,0);
                toast.show();

            }
        });
    }
}