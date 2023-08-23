package com.example.ir_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public EditText edRenda;
    public EditText edDependentes;
    public EditText edDeducoes;

    public Button btCalcular;

    public TextView tvRendaBrutaAnualValue;
    public TextView tvBaseCalculoValue;
    public TextView tvImpostoDevidoValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edRenda = findViewById(R.id.edRenda);
        edDependentes = findViewById(R.id.edDependentes);
        edDeducoes = findViewById(R.id.edDeducoes);

        btCalcular = findViewById(R.id.btCalcular);

        tvRendaBrutaAnualValue = findViewById(R.id.tvRendaBrutaAnualValue);
        tvBaseCalculoValue = findViewById(R.id.tvBaseCalculoValue);
        tvImpostoDevidoValue = findViewById(R.id.tvImpostoDevidoValue);

        btCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double renda = Double.parseDouble(edRenda.getText().toString()) * 12;
                double dependentes = Double.parseDouble(edDependentes.getText().toString()) * 300.0 * 12;
                double deducoes = Double.parseDouble(edDeducoes.getText().toString());

                double baseCalculo = renda - dependentes - deducoes;

                double diferenca = renda - baseCalculo;

                double imposto;

                if (baseCalculo <= 18000) {
                    imposto = 0;
                } else if (baseCalculo <= 27000) {
                    imposto = (baseCalculo - 18000) * 0.15;
                } else {
                    imposto = 1350 + (0.275 * diferenca);
                }

                tvRendaBrutaAnualValue.setText("" + renda);
                tvBaseCalculoValue.setText("" + baseCalculo);
                tvImpostoDevidoValue.setText("" + imposto);
            }
        });
    }
}