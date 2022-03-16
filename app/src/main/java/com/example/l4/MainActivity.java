package com.example.l4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btreal;
    private Button btpeso;
    private Button btdolar;

    private CheckBox cbreal;
    private CheckBox cbpeso;
    private CheckBox cbdolar;

    private EditText etvalor;
    private Float valor;
    private Float resultado;

    private TextView tvresultado;
    private  String resultadotv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btreal = (Button) findViewById(R.id.btreal);
        btpeso = (Button) findViewById(R.id.btpeso);
        btdolar = (Button) findViewById(R.id.btdolar);


        cbreal = (CheckBox) findViewById(R.id.cbreal);
        cbpeso = (CheckBox) findViewById(R.id.cbpeso);
        cbdolar = (CheckBox) findViewById(R.id.cbdolar);

        etvalor = (EditText) findViewById(R.id.etvalor);
        etvalor.setText("0");

        //valor = Float.valueOf(etvalor.getText().toString());

        tvresultado = (TextView) findViewById(R.id.tvresultado);

        btreal.setOnClickListener(this);
        btpeso.setOnClickListener(this);
        btdolar.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        valor = Float.parseFloat(etvalor.getText().toString());
        if(view.getId()==R.id.btreal){
            if(cbpeso.isChecked()){
                resultado = valor/8;
                resultadotv = "R$ "+resultado+"!";
                tvresultado.setText(resultadotv);
            }
            else{
                if(cbdolar.isChecked())
                {
                    resultado = valor*5;
                    resultadotv = "R$ "+resultado+"!";
                    tvresultado.setText(resultadotv);
                }
                else
                {
                    if(cbreal.isChecked()){
                        resultado = valor;
                        resultadotv = "R$ "+resultado+"!";
                        tvresultado.setText(resultadotv);
                    }
                }
            }
        }
        else{
            if(view.getId()==R.id.btdolar){
                if(cbpeso.isChecked()){
                    resultado = valor/42;
                    resultadotv = "$ "+resultado+"!";
                    tvresultado.setText(resultadotv);
                }
                else{
                    if(cbdolar.isChecked())
                    {
                        resultado = valor;
                        resultadotv = "$ "+resultado+"!";
                        tvresultado.setText(resultadotv);
                    }
                    else
                    {
                        if(cbreal.isChecked()){
                            resultado = valor/5;
                            resultadotv = "$ "+resultado+"!";
                            tvresultado.setText(resultadotv);
                        }
                    }
                }
            }
            else{
                if(view.getId()==R.id.btpeso){
                    if(cbpeso.isChecked()){
                        resultado = valor;
                        resultadotv = "$U "+resultado+"!";
                        tvresultado.setText(resultadotv);
                    }
                    else{
                        if(cbdolar.isChecked())
                        {
                            resultado = valor*42;
                            resultadotv = "$U"+resultado+"!";
                            tvresultado.setText(resultadotv);
                        }
                        else
                        {
                            if(cbreal.isChecked()){
                                resultado = valor*8;
                                resultadotv = "$U "+resultado+"!";
                                tvresultado.setText(resultadotv);
                            }

                        }
                    }
                }
            }
        }


    }
}