package com.example.demoproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class ProductActivity extends AppCompatActivity {

    private TextInputEditText length, shoulder, neck, chest, hand, leg;
    private Button next;
    private String pLength, pShoulder, pNeck, pChest, pHand, pLeg,name, address, phone, email, received, delivery, gender, product;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        length = findViewById(R.id.length);
        shoulder = findViewById(R.id.shoulder);
        neck = findViewById(R.id.neck);
        chest = findViewById(R.id.chest);
        hand = findViewById(R.id.hand);
        leg = findViewById(R.id.leg);
        next = findViewById(R.id.p_next);

        Intent intent = getIntent();
        name = intent.getStringExtra("name");
        address = intent.getStringExtra("address");
        phone = intent.getStringExtra("phone");
        email = intent.getStringExtra("email");
        received = intent.getStringExtra("received");
        delivery = intent.getStringExtra("delivery");
        gender = intent.getStringExtra("gender");
        product = intent.getStringExtra("product");

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (validate()) {
                    Intent intent = new Intent(ProductActivity.this, PaymentActivity.class);
                    intent.putExtra("name", name);
                    intent.putExtra("address", address);
                    intent.putExtra("phone", phone);
                    intent.putExtra("email", email);
                    intent.putExtra("received", received);
                    intent.putExtra("delivery", delivery);
                    intent.putExtra("gender", gender);
                    intent.putExtra("product", product);
                    intent.putExtra("length",pLength);
                    intent.putExtra("chest", pChest);
                    intent.putExtra("hand", pHand);
                    intent.putExtra("leg", pLeg);
                    intent.putExtra("shoulder", pShoulder);
                    intent.putExtra("neck", pNeck);

                    startActivity(intent);
                }
            }
        });

    }

    private Boolean validate() {
        Boolean result = false;

        pLength = length.getText().toString().trim();
        pChest = chest.getText().toString().trim();
        pHand = hand.getText().toString().trim();
        pLeg = leg.getText().toString().trim();
        pNeck = neck.getText().toString().trim();
        pShoulder = shoulder.getText().toString().trim();


        if (pShoulder.isEmpty() || pNeck.isEmpty() || pLeg.isEmpty() || pHand.isEmpty() ||pChest.isEmpty()|| pLength.isEmpty()) {
            Toast.makeText(this, "input error", Toast.LENGTH_SHORT).show();
        }
        else {
            result = true;
        }
        return result;
    }
}