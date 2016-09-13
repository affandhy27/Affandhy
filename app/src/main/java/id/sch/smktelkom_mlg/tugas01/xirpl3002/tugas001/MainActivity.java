package id.sch.smktelkom_mlg.tugas01.xirpl3002.tugas001;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etNama;
    RadioButton rbL, rbP;
    CheckBox cb0, cb20, cb21;
    Spinner spKonfirmasi;
    Button bOK;
    TextView tvHasil, tvHasil2, tvHasil3, tvHasil4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNama = (EditText) findViewById(R.id.editTextNama);
        rbL = (RadioButton) findViewById(R.id.radioButtonL);
        rbP = (RadioButton) findViewById(R.id.radioButtonP);
        cb0 = (CheckBox) findViewById(R.id.checkBox0);
        cb20 = (CheckBox) findViewById(R.id.checkBox20);
        cb21 = (CheckBox) findViewById(R.id.checkBox21);
        spKonfirmasi = (Spinner) findViewById(R.id.spinnerKonfirmasi);
        bOK = (Button) findViewById(R.id.buttonOK);
        tvHasil = (TextView) findViewById(R.id.textViewHasil);
        tvHasil2 = (TextView) findViewById(R.id.textViewHasil2);
        tvHasil3 = (TextView) findViewById(R.id.textViewHasil3);
        tvHasil4 = (TextView) findViewById(R.id.textViewHasil4);


        bOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });
    }

}
