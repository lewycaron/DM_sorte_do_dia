package br.com.up.sortedodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> messages = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonAction = findViewById(R.id.button_action);





        buttonAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textViewTitle = findViewById(R.id.text_title);

                messages.add("COmprar pizza para o professor");
                messages.add("Chamar o professor para o churrasco.");
                messages.add("Chamar o prof para andar de kart");
                messages.add("Levar o prof para o rodizio de pizza!");
                messages.add("Prof vai trazer chocolate!");


                int position = new Random().nextInt(messages.size());
                textViewTitle.setText(messages.get(position));
            }
        });
    }

}
