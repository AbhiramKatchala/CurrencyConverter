package com.cconverter.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private EditText eText;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eText = (EditText) findViewById(R.id.getNumber);
        btn = (Button) findViewById(R.id.button);

    }


    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.toUsd:
                if (checked) {
                    btn.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            Double convertedINR = Double.parseDouble(eText.getText().toString());
                            Toast.makeText(MainActivity.this, convertedINR +
                                    " Indian rupee is equals to " + String.format(Locale.US,"%.2f", toUSD(convertedINR)) +
                                    " US Dollar", Toast.LENGTH_SHORT).show();
                        }
                    });
                }else {

                }
                break;
            case R.id.toGbp:
                if (checked) {
                    btn.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            Double convertedINR = Double.parseDouble(eText.getText().toString());
                            Toast.makeText(MainActivity.this, convertedINR +
                                            " Indian rupee is equals to " + String.format(Locale.US,"%.2f", toGBP(convertedINR)) +
                                            " British Pound", Toast.LENGTH_SHORT).show();
                        }
                    });
                }else {
                }
                    break;
            case R.id.toEur:
                if (checked) {
                    btn.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            Double convertedINR = Double.parseDouble(eText.getText().toString());
                            Toast.makeText(MainActivity.this, convertedINR +
                                    " Indian rupee is equals to " + String.format(Locale.US,"%.2f", toEUR(convertedINR)) +
                                    " Euro", Toast.LENGTH_SHORT).show();
                        }
                    });
                }else {

                }
                break;
            // TODO: Veggie sandwich
        }
    }

    public double toUSD(double indianRupee){

        double convertToUSD = indianRupee * 0.016;

        return convertToUSD;
    }

    public double toGBP(double indianRupee){

        double convertToGBP = indianRupee * 0.012;

        return convertToGBP;
    }

    public double toEUR(double indianRupee){

        double convertToEUR = indianRupee * 0.013;

        return convertToEUR;
    }
}
