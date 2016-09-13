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
            public void onClick(View view) {

                doKlik();
                doProcess();
                doClick();
                doPilih();

            }
        });
    }

    private void doPilih() {
        tvHasil4.setText("Pilihan anda" + spKonfirmasi.getSelectedItem().toString());
    }

    private void doKlik() {
        String Hasil = "Umur anda:\n";
        int startlen = Hasil.length();
        if (cb0.isChecked()) Hasil += cb0.getText() + "\n";
        if (cb20.isChecked()) Hasil += cb20.getText() + "\n";
        if (cb21.isChecked()) Hasil += cb21.getText() + "\n";

        if (Hasil.length() == startlen) Hasil += "Tidak ada di Pilihan";
        tvHasil2.setText(Hasil);
    }

    private void doClick() {
        String Hasil = null;

        if (rbL.isChecked()) {
            Hasil = rbL.getText().toString();
        } else if (rbP.isChecked()) {
            Hasil = rbP.getText().toString();
        }
        if (Hasil == null) {
            tvHasil3.setText("Belum memilih Jenis Kelamin");
        } else {
            tvHasil3.setText("Status anda : " + Hasil);
        }
    }

    private void doProcess() {
        if (isValid()) {
            String Nama = etNama.getText().toString();
            tvHasil.setText("Nama anda" + Nama);
        }
    }


    private boolean isValid() {
        boolean valid = true;
        String Nama = etNama.getText().toString();

        if (Nama.isEmpty()) {
            etNama.setError("Namanya Belum Diisi");
        } else if (Nama.length() < 3) {
            etNama.setError("Karakter minimal 3");
            valid = false;
        } else {
            etNama.setError(null);
        }

        return valid;

    }
}
