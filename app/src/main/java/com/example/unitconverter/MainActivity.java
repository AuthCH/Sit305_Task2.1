package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Spinner sspinner,dspinner;
    EditText input;
    Button convert;
    TextView resulttext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = findViewById(R.id.input);
        sspinner =findViewById(R.id.sspinner);
        dspinner = findViewById(R.id.dspinner);
        convert = findViewById(R.id.convert);
        resulttext = findViewById(R.id.showresult);

        String[] source = {"Inches","Cm","Mm","Foot"};
        ArrayAdapter adapter1= new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,source);
        sspinner.setAdapter(adapter1);

        String[] Dest = {"Inches","Cm","Mm","Foot"};
        ArrayAdapter adapter2= new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,Dest);
        dspinner.setAdapter(adapter2);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double result;
                Double number = Double.parseDouble(input.getText().toString());
                if(sspinner.getSelectedItem().toString() == "Inches" && dspinner.getSelectedItem().toString() == "Inches")
                {
                    result = number * 1;
                    String Strresult = Double.toString(result);
                    resulttext.setText(Strresult);

                }
                else if (sspinner.getSelectedItem().toString() == "Inches" && dspinner.getSelectedItem().toString() == "Cm")
                {
                    result = number * 2.54;
                    String Strresult = Double.toString(result);
                    resulttext.setText(Strresult);
                }
                else if (sspinner.getSelectedItem().toString() == "Inches" && dspinner.getSelectedItem().toString() == "Mm")
                {
                    result = number * 25.4;
                    String Strresult = Double.toString(result);
                    resulttext.setText(Strresult);
                }
                else if (sspinner.getSelectedItem().toString() == "Inches" && dspinner.getSelectedItem().toString() == "Foot")
                {
                    result = number * 0.083;
                    String Strresult = Double.toString(result);
                    resulttext.setText(Strresult);
                }
                else if (sspinner.getSelectedItem().toString() == "Cm" && dspinner.getSelectedItem().toString() == "Inches")
                {
                    result = number * 0.39;
                    String Strresult = Double.toString(result);
                    resulttext.setText(Strresult);
                }
                else if (sspinner.getSelectedItem().toString() == "Cm" && dspinner.getSelectedItem().toString() == "Cm")
                {
                    result = number * 1;
                    String Strresult = Double.toString(result);
                    resulttext.setText(Strresult);
                }
                else if (sspinner.getSelectedItem().toString() == "Cm" && dspinner.getSelectedItem().toString() == "Mm")
                {
                    result = number * 10;
                    String Strresult = Double.toString(result);
                    resulttext.setText(Strresult);
                }
                else if (sspinner.getSelectedItem().toString() == "Cm" && dspinner.getSelectedItem().toString() == "Foot")
                {
                    result = number * 0.032;
                    String Strresult = Double.toString(result);
                    resulttext.setText(Strresult);
                }
                else if (sspinner.getSelectedItem().toString() == "Mm" && dspinner.getSelectedItem().toString() == "Mm")
                {
                    result = number * 1;
                    String Strresult = Double.toString(result);
                    resulttext.setText(Strresult);
                }
                else if (sspinner.getSelectedItem().toString() == "Mm" && dspinner.getSelectedItem().toString() == "Inches")
                {
                    result = number * 0.039;
                    String Strresult = Double.toString(result);
                    resulttext.setText(Strresult);
                }
                else if (sspinner.getSelectedItem().toString() == "Mm" && dspinner.getSelectedItem().toString() == "Cm")
                {
                    result = number / 10;
                    String Strresult = Double.toString(result);
                    resulttext.setText(Strresult);
                }
                else if (sspinner.getSelectedItem().toString() == "Mm" && dspinner.getSelectedItem().toString() == "Foot")
                {
                    result = number * 0.00328;
                    String Strresult = Double.toString(result);
                    resulttext.setText(Strresult);
                }
                else if (sspinner.getSelectedItem().toString() == "Foot" && dspinner.getSelectedItem().toString() == "Foot")
                {
                    result = number * 1;
                    String Strresult = Double.toString(result);
                    resulttext.setText(Strresult);
                }
                else if (sspinner.getSelectedItem().toString() == "Foot" && dspinner.getSelectedItem().toString() == "inches")
                {
                    result = number * 12;
                    String Strresult = Double.toString(result);
                    resulttext.setText(Strresult);
                }
                else if (sspinner.getSelectedItem().toString() == "Foot" && dspinner.getSelectedItem().toString() == "Cm")
                {
                    result = number * 30.48;
                    String Strresult = Double.toString(result);
                    resulttext.setText(Strresult);
                }
                else if (sspinner.getSelectedItem().toString() == "Foot" && dspinner.getSelectedItem().toString() == "Mm")
                {
                    result = number * 304.8;
                    String Strresult = Double.toString(result);
                    resulttext.setText(Strresult);
                }
                else {
                    resulttext.setText("Error");
                }
            }
        });

        }




    }
