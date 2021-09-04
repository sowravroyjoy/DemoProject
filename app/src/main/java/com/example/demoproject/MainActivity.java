package com.example.demoproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText name, address, phone, email, received, delivery;
    private Button next;
    private CheckBox male, female;
    private String gender, cName, cAddress, cPhone, cEmail, cReceived, cDelivery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.c_name);
        address = findViewById(R.id.c_address);
        phone = findViewById(R.id.c_phone);
        email = findViewById(R.id.c_email);
        received = findViewById(R.id.c_received);
        delivery = findViewById(R.id.c_delivery);
        next = findViewById(R.id.c_next);
        male = findViewById(R.id.g_male);
        female = findViewById(R.id.g_female);
        gender = "male";

        male.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean checked = ((CheckBox) v).isChecked();

                if (checked) {
                    female.setChecked(false);
                    gender = "male";
                }
            }
        });


        female.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean checked = ((CheckBox) v).isChecked();

                if (checked) {
                    male.setChecked(false);
                    gender = "female";
                }
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validate()){
                    Intent intent = new Intent(MainActivity.this, ProductTypeActivity.class);
                    intent.putExtra("name", cName);
                    intent.putExtra("address", cAddress);
                    intent.putExtra("phone", cPhone);
                    intent.putExtra("email", cEmail);
                    intent.putExtra("received", cReceived);
                    intent.putExtra("delivery",cDelivery);
                    intent.putExtra("gender", gender);
                    startActivity(intent);
                }
            }
        });

    }

    private Boolean validate() {
        Boolean result = false;

        cName = name.getText().toString().trim();
        cAddress = address.getText().toString().trim();
        cPhone = phone.getText().toString().trim();
        cEmail = email.getText().toString().trim();
        cReceived = received.getText().toString().trim();
        cDelivery = delivery.getText().toString().trim();


        if (cName.isEmpty() || cReceived.isEmpty() || cAddress.isEmpty() || cPhone.isEmpty() ||cEmail.isEmpty()|| cDelivery.isEmpty()) {
            Toast.makeText(this, "input error", Toast.LENGTH_SHORT).show();
        }
        else {
            result = true;
        }
        return result;
    }

}