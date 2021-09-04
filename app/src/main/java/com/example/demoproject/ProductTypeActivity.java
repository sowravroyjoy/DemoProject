package com.example.demoproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class ProductTypeActivity extends AppCompatActivity {

    private CheckBox shirt, seluyar, pent,kamij, tshirt,sharee, panjabi, blaws, payjama,lehenga;
    private Button next;
    private String product,name, address, phone, email, received, delivery, gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_type);

        shirt = findViewById(R.id.shirt);
        seluyar = findViewById(R.id.seluyar);
        pent = findViewById(R.id.pent);
        kamij = findViewById(R.id.kamij);
        tshirt = findViewById(R.id.tshirt);
        sharee = findViewById(R.id.sharee);
        panjabi = findViewById(R.id.panjabi);
        blaws = findViewById(R.id.blaws);
        payjama = findViewById(R.id.payjama);
        lehenga = findViewById(R.id.lehenga);
        next = findViewById(R.id.t_next);
        product = "shirt";

        shirt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean checked = ((CheckBox) v).isChecked();

                if (checked) {
                    seluyar.setChecked(false);
                    pent.setChecked(false);
                    kamij.setChecked(false);
                    tshirt.setChecked(false);
                    sharee.setChecked(false);
                    panjabi.setChecked(false);
                    blaws.setChecked(false);
                    payjama.setChecked(false);
                    lehenga.setChecked(false);
                    product = "shirt";
                }
            }
        });

        seluyar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean checked = ((CheckBox) v).isChecked();

                if (checked) {
                    shirt.setChecked(false);
                    pent.setChecked(false);
                    kamij.setChecked(false);
                    tshirt.setChecked(false);
                    sharee.setChecked(false);
                    panjabi.setChecked(false);
                    blaws.setChecked(false);
                    payjama.setChecked(false);
                    lehenga.setChecked(false);
                    product = "seluyar";
                }
            }
        });

        pent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean checked = ((CheckBox) v).isChecked();

                if (checked) {
                    seluyar.setChecked(false);
                    shirt.setChecked(false);
                    kamij.setChecked(false);
                    tshirt.setChecked(false);
                    sharee.setChecked(false);
                    panjabi.setChecked(false);
                    blaws.setChecked(false);
                    payjama.setChecked(false);
                    lehenga.setChecked(false);
                    product = "pent";
                }
            }
        });

        kamij.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean checked = ((CheckBox) v).isChecked();

                if (checked) {
                    seluyar.setChecked(false);
                    pent.setChecked(false);
                    shirt.setChecked(false);
                    tshirt.setChecked(false);
                    sharee.setChecked(false);
                    panjabi.setChecked(false);
                    blaws.setChecked(false);
                    payjama.setChecked(false);
                    lehenga.setChecked(false);
                    product = "kamij";
                }
            }
        });

        tshirt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean checked = ((CheckBox) v).isChecked();

                if (checked) {
                    seluyar.setChecked(false);
                    pent.setChecked(false);
                    kamij.setChecked(false);
                    shirt.setChecked(false);
                    sharee.setChecked(false);
                    panjabi.setChecked(false);
                    blaws.setChecked(false);
                    payjama.setChecked(false);
                    lehenga.setChecked(false);
                    product = "t-shirt";
                }
            }
        });

        sharee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean checked = ((CheckBox) v).isChecked();

                if (checked) {
                    seluyar.setChecked(false);
                    pent.setChecked(false);
                    kamij.setChecked(false);
                    tshirt.setChecked(false);
                    shirt.setChecked(false);
                    panjabi.setChecked(false);
                    blaws.setChecked(false);
                    payjama.setChecked(false);
                    lehenga.setChecked(false);
                    product = "sharee";
                }
            }
        });

        panjabi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean checked = ((CheckBox) v).isChecked();

                if (checked) {
                    seluyar.setChecked(false);
                    pent.setChecked(false);
                    kamij.setChecked(false);
                    tshirt.setChecked(false);
                    sharee.setChecked(false);
                    shirt.setChecked(false);
                    blaws.setChecked(false);
                    payjama.setChecked(false);
                    lehenga.setChecked(false);
                    product = "panjabi";
                }
            }
        });

        blaws.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean checked = ((CheckBox) v).isChecked();

                if (checked) {
                    seluyar.setChecked(false);
                    pent.setChecked(false);
                    kamij.setChecked(false);
                    tshirt.setChecked(false);
                    sharee.setChecked(false);
                    panjabi.setChecked(false);
                    shirt.setChecked(false);
                    payjama.setChecked(false);
                    lehenga.setChecked(false);
                    product = "blaws";
                }
            }
        });

        payjama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean checked = ((CheckBox) v).isChecked();

                if (checked) {
                    seluyar.setChecked(false);
                    pent.setChecked(false);
                    kamij.setChecked(false);
                    tshirt.setChecked(false);
                    sharee.setChecked(false);
                    panjabi.setChecked(false);
                    blaws.setChecked(false);
                    shirt.setChecked(false);
                    lehenga.setChecked(false);
                    product = "payjama";
                }
            }
        });


        lehenga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean checked = ((CheckBox) v).isChecked();

                if (checked) {
                    seluyar.setChecked(false);
                    pent.setChecked(false);
                    kamij.setChecked(false);
                    tshirt.setChecked(false);
                    sharee.setChecked(false);
                    panjabi.setChecked(false);
                    blaws.setChecked(false);
                    payjama.setChecked(false);
                    shirt.setChecked(false);
                    product = "lehenga";
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

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (product != null) {
                    Intent intent = new Intent(ProductTypeActivity.this, ProductActivity.class);
                    intent.putExtra("name", name);
                    intent.putExtra("address", address);
                    intent.putExtra("phone", phone);
                    intent.putExtra("email", email);
                    intent.putExtra("received", received);
                    intent.putExtra("delivery", delivery);
                    intent.putExtra("gender", gender);
                    intent.putExtra("product", product);
                    startActivity(intent);
                }
            }
        });
    }
}