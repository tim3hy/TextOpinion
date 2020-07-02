package ch.zli.m335.textpinion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class TextEingabe extends AppCompatActivity {

    EditText textEingabe;
    Button txtPinion;
    ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_eingabe);

        textEingabe = (EditText) findViewById(R.id.textEingabe);
        txtPinion = (Button) findViewById(R.id.txtPinion);
        imageButton = (ImageButton) findViewById(R.id.imageButton);

        textEingabe.setHint("Text eingeben");
        //Image Button
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentMainActiv= new Intent(TextEingabe.this, MainActivity.class);
                startActivity(intentMainActiv);
            }
        });

        txtPinion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentTxtPinion = new Intent(TextEingabe.this, TextPinion.class);
                startActivity(intentTxtPinion);
            }
        });

    }
}