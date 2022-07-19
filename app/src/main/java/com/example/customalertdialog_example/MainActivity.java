package com.example.customalertdialog_example;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog dialog = new Dialog(MainActivity.this);
                dialog.setContentView(R.layout.dialog);

                EditText edTxt_fname = dialog.findViewById(R.id.edTxt_fname);
                EditText edTxt_lname = dialog.findViewById(R.id.edTxt_lname);

                Button btn_dialog = dialog.findViewById(R.id.btn_dialog);

                btn_dialog.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(MainActivity.this, edTxt_fname.getText().toString()+" "+edTxt_lname.getText().toString(), Toast.LENGTH_LONG).show();
                        dialog.cancel();
                    }
                });





                dialog.show();
            }
        });
    }
}