package com.example.demoproject;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class PaymentActivity extends AppCompatActivity {
    private TextInputEditText payable, dues, paid;
    private CheckBox cash, credit, bkash, nogod;
    private Button confirm, cancel;
    private String payment, pPayable, pDues, pPaid, name, address, phone, email, received, delivery, gender, product, length, chest, hand, leg, shoulder, neck;

    private FirebaseDatabase firebaseDatabase;
    private DatabaseReference databaseReference;
    private ProgressDialog pDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        payable = findViewById(R.id.payable);
        dues = findViewById(R.id.dues);
        paid = findViewById(R.id.paid);
        confirm = findViewById(R.id.confirm);
        cancel = findViewById(R.id.cancel);
        cash = findViewById(R.id.cash);
        credit = findViewById(R.id.credit);
        bkash = findViewById(R.id.bkash);
        nogod = findViewById(R.id.nogod);
        payment = "Cash";

        pDialog = new ProgressDialog(this);
        // Showing progress dialog before making http request
        pDialog.setMessage("Loading...");

        cash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean checked = ((CheckBox) v).isChecked();

                if (checked) {
                    credit.setChecked(false);
                    bkash.setChecked(false);
                    nogod.setChecked(false);
                    payment = "Cash";
                }
            }
        });

        credit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean checked = ((CheckBox) v).isChecked();

                if (checked) {
                    cash.setChecked(false);
                    bkash.setChecked(false);
                    nogod.setChecked(false);
                    payment = "Credit Card";
                }
            }
        });

        bkash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean checked = ((CheckBox) v).isChecked();

                if (checked) {
                    credit.setChecked(false);
                    cash.setChecked(false);
                    nogod.setChecked(false);
                    payment = "Bkash";
                }
            }
        });

        nogod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean checked = ((CheckBox) v).isChecked();

                if (checked) {
                    credit.setChecked(false);
                    bkash.setChecked(false);
                    cash.setChecked(false);
                    payment = "Nogod";
                }
            }
        });

        Intent intent = getIntent();
        name = intent.getStringExtra("name");
        address = intent.getStringExtra("address");
        phone = intent.getStringExtra("phone");
        email = intent.getStringExtra("email");
        received = intent.getStringExtra("received");
        delivery = intent.getStringExtra("delivery");
        gender = intent.getStringExtra("gender");
        product = intent.getStringExtra("product");
        length = intent.getStringExtra("length");
        chest = intent.getStringExtra("chest");
        hand = intent.getStringExtra("hand");
        leg = intent.getStringExtra("leg");
        shoulder = intent.getStringExtra("shoulder");
        neck = intent.getStringExtra("neck");

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pDialog.show();
                if(validate()){
                    firebaseDatabase = FirebaseDatabase.getInstance();
                    databaseReference = firebaseDatabase.getReference("customers");

                    Model model = new Model(payment, pPayable, pDues, pPaid, name, address, phone, email, received, delivery, gender, product, length, chest, hand, leg, shoulder, neck);

                    databaseReference.setValue(model);
                    hidePDialog();
                    Toast.makeText(PaymentActivity.this, "Completed", Toast.LENGTH_SHORT).show();

                    startActivity(new Intent(PaymentActivity.this, MainActivity.class));
                    finish();

                }
            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PaymentActivity.this, MainActivity.class));
                finish();
            }
        });

    }
    private Boolean validate() {
        Boolean result = false;

        pPayable = payable.getText().toString().trim();
        pPaid = paid.getText().toString().trim();
        pDues = dues.getText().toString().trim();

        if (pPayable.isEmpty() || pPaid.isEmpty() || pDues.isEmpty()) {
            Toast.makeText(this, "input error", Toast.LENGTH_SHORT).show();
            hidePDialog();
        }
        else {
            result = true;
        }
        return result;
    }

    private void hidePDialog() {
        if (pDialog != null) {
            pDialog.dismiss();
            pDialog = null;
        }
    }
}