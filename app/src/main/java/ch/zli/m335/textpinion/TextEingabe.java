package ch.zli.m335.textpinion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import org.apache.http.HttpResponse;

public class TextEingabe extends AppCompatActivity {

    EditText textEingabe;
    Button txtPinion;
    ImageButton imageButton;
    String text;

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

        text = textEingabe.getText().toString();
        txtPinion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HttpResponse<String> response = Unirest.post("https://japerk-text-processing.p.rapidapi.com/sentiment/")
                        .header("x-rapidapi-host", "japerk-text-processing.p.rapidapi.com")
                        .header("x-rapidapi-key", "5e78ad8ab1msh63ac50e7684f80cp17b9e5jsn496fc924a48c")
                        .header("content-type", "application/x-www-form-urlencoded")
                        .body("language=english&" + text)
                        .asString();
                Intent intentTxtPinion = new Intent(TextEingabe.this, TextPinion.class);
                startActivity(intentTxtPinion);
            }
        });

    }
}