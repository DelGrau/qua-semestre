package com.example.imc_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edAltura;
    private EditText edPeso;

    private Button btHomem;
    private Button btMulher;
    private Button btLimpar;

    private TextView tvPeso;
    private TextView tvIMC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edAltura = findViewById(R.id.edAltura);
        edPeso = findViewById(R.id.edPeso);
        btHomem = findViewById(R.id.btHomem);
        btMulher = findViewById(R.id.btMulher);
        btLimpar = findViewById(R.id.btLimpar);
        tvPeso = findViewById(R.id.tvPeso);
        tvIMC = findViewById(R.id.tvIMC);

        /* Botão Limpar, limpa todos os campos */
        btLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edAltura.setText("");
                edPeso.setText("");
                tvPeso.setText("");
                tvIMC.setText("");
            }
        });

        btHomem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double altura = Double.parseDouble(edAltura.getText().toString());
                double peso = Double.parseDouble(edPeso.getText().toString());

                double imc = calculaIMC(altura, peso);

                if (imc <= 20.6) {
                    tvPeso.setText("Você está abaixo do peso");
                } else if (imc > 20.6 && imc <= 26.3 ) {
                    tvPeso.setText("Seu peso está normal");
                } else if (imc > 26.3 && imc <= 27.7 ) {
                    tvPeso.setText("Você está levemente acima do peso");
                } else if (imc > 27.7 && imc <= 31 ) {
                    tvPeso.setText("Você está acima do peso ideal");
                } else {
                    tvPeso.setText("Você está obeso");
                }

                tvIMC.setText("IMC é de " + imc);
            }

            public double calculaIMC (double altura, double peso) {
                return peso / (altura*altura);
            }
        });

        btMulher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double altura = Double.parseDouble(edAltura.getText().toString());
                double peso = Double.parseDouble(edPeso.getText().toString());

                double imc = calculaIMC(altura, peso);

                if (imc <= 19) {
                    tvPeso.setText("Você está abaixo do peso");
                } else if (imc > 19 && imc <= 25.7 ) {
                    tvPeso.setText("Seu peso está normal");
                } else if (imc > 25.7 && imc <= 27.2 ) {
                    tvPeso.setText("Você está levemente acima do peso");
                } else if (imc > 27.2 && imc <= 32.2 ) {
                    tvPeso.setText("Você está acima do peso ideal");
                } else {
                    tvPeso.setText("Você está obesa");
                }

                tvIMC.setText("IMC é de " + imc);
            }

            public double calculaIMC (double altura, double peso) {
                return peso / (altura*altura);
            }
        });
    }
}