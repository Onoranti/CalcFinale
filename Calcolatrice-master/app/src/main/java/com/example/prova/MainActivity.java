package com.example.prova;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText Numero;	//numero1
    private EditText Numerino;  //numero2
    private TextView Risultato; //stringa di risultato


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Numero = findViewById(R.id.Numero1);
        Numerino = findViewById(R.id.Numero2);
        Risultato = findViewById(R.id.Risultato);


        Button BtSomma = findViewById(R.id.BottoneSomma);
        BtSomma.setOnClickListener(v -> {
            // Code here executes on main thread after user presses button
            String strNum1 = Numero.getText().toString();
            String strNum2 = Numerino.getText().toString();
            int n1 = Integer.parseInt(strNum1);
            int n2 = Integer.parseInt(strNum2);
            int res = n1 + n2;
            String strStr = String.valueOf(res);
            Risultato.setText(strStr);
        });

        Button BtMeno = findViewById(R.id.BottoneDifferenza);
        BtMeno.setOnClickListener(v -> {
            String strNum1 = Numero.getText().toString();
            String strNum2 = Numerino.getText().toString();
            int n1 = Integer.parseInt(strNum1);
            int n2 = Integer.parseInt(strNum2);
            int res = n1 - n2;
            String strStr = String.valueOf(res);
            Risultato.setText(strStr);
        });

    }

}