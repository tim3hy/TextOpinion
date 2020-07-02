package ch.zli.m335.textpinion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

public class Optionen extends AppCompatActivity {

    ImageButton imageButton;
    TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_optionen);

        imageButton = (ImageButton) findViewById(R.id.imageButton);
        title = (TextView) findViewById(R.id.title);

    }
}