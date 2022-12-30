package com.example.alimama;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Cart extends AppCompatActivity {

    CheckBox checkBox;
    TextView textView300, textView301, textView302, textView303, textView304, textView76;
    Button button, button2, button3, button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        checkBox = findViewById(R.id.checkBox);

        textView300 = findViewById(R.id.textView300);
        textView301 = findViewById(R.id.textView301);
        textView302 = findViewById(R.id.textView302);
        textView303 = findViewById(R.id.textView303);
        textView304 = findViewById(R.id.textView304);
        textView76 = findViewById(R.id.textView76);

        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 =findViewById(R.id.button4);

//        String originalPrice = textView303.getText().toString();
//        Integer original_price = Integer.parseInt(originalPrice);
//
//        if(original_price < 1) {
//            button4.setEnabled(false);
//        } else {
//            button4.setEnabled(true);
//        }

        Intent add = getIntent();
        String phone1 = add.getStringExtra("phone1");
        String price1 = add.getStringExtra("price");

        Items Item1 = new Items();
        Item1.itemSelected(phone1, price1);

        textView301.setText(phone1);
        textView303.setText(price1);

        if (price1 == null) {
            button3.setEnabled(false);
            button4.setEnabled(false);
            restartOption();
        } else {
            button3.setEnabled(true);
            button4.setEnabled(true);
        }

//        Integer new_price = Integer.parseInt(price1);

//        if(cartItem1.equals("Product Name")) {
//            textView300.setVisibility(View.VISIBLE);
//            textView301.setVisibility(View.INVISIBLE);
//            textView302.setVisibility(View.INVISIBLE);
//            textView303.setVisibility(View.INVISIBLE);
//            textView304.setVisibility(View.INVISIBLE);
//            checkBox.setVisibility(View.INVISIBLE);
//            button.setVisibility(View.INVISIBLE);
//            button2.setVisibility(View.INVISIBLE);
//        } else {
            textView300.setVisibility(View.INVISIBLE);
            textView301.setVisibility(View.VISIBLE);
            textView302.setVisibility(View.VISIBLE);
            textView303.setVisibility(View.VISIBLE);
            textView304.setVisibility(View.VISIBLE);
            checkBox.setVisibility(View.VISIBLE);
            button.setVisibility(View.VISIBLE);
            button2.setVisibility(View.VISIBLE);
//        }


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String itemQuantity = textView304.getText().toString();
                Integer item_quantity = Integer.parseInt(itemQuantity);

                if(item_quantity > 1) {
                    Integer current_quantity = item_quantity - 1;
                    textView304.setText(current_quantity.toString());
                } else {
                    textView304.setText("0");
                    button4.setEnabled(false);

                    Toast.makeText(Cart.this, "You Have no Item on your Cart", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String itemQuantity = textView304.getText().toString();
                Integer item_quantity = Integer.parseInt(itemQuantity);

                if(item_quantity < 10) {
                    Integer current_quantity = item_quantity + 1;
                    textView304.setText(current_quantity.toString());
                    button4.setEnabled(true);
                    checkBox.setChecked(true);
                } else {
                    textView304.setText("10");

                    Toast.makeText(Cart.this, "You Have Selected a Maximum Item Quantity", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                restartOption();
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkOut();
            }
        });

        // Initialize and assign variable
        BottomNavigationView bottomNavigationView=findViewById(R.id.bottom_navigation);

        // Set Home selected
        bottomNavigationView.setSelectedItemId(R.id.cart);

        // Perform item selected listener
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch(item.getItemId())
                {
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext(), Login.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.cart:
                        return true;
                    case R.id.account:
                        startActivity(new Intent(getApplicationContext(),Account.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });
    }

    private void checkOut() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Shipping Address & Payment");
        StringBuffer alert = new StringBuffer();
        alert.append("\nSelect your preferred payment method: ");
        alert.append("\n\nYour Total: ");
        builder.setMessage(alert.toString());

        final View customLayout = getLayoutInflater().inflate(R.layout.payment, null);
        builder.setView(customLayout);

        RadioButton radioButton2 = customLayout.findViewById(R.id.radioButton2);
        TextView textView77 = customLayout.findViewById(R.id.textView77);
        TextView textView78 = customLayout.findViewById(R.id.textView78);
        EditText editTextTextPersonName7 = customLayout.findViewById(R.id.editTextTextPersonName7);
        EditText editTextTextPersonName8 = customLayout.findViewById(R.id.editTextTextPersonName8);

        String itemPrice = textView303.getText().toString();
        String itemQuantity = textView304.getText().toString();
        Integer item_price = Integer.parseInt(itemPrice);
        Integer item_quantity = Integer.parseInt(itemQuantity);

        Integer totalPrice = item_price * item_quantity;

        textView77.setText(totalPrice.toString());

        radioButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView78.setVisibility(View.VISIBLE);
                editTextTextPersonName7.setVisibility(View.VISIBLE);
            }
        });

        String address = editTextTextPersonName8.getText().toString();

        builder.setPositiveButton("Pay", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                if(editTextTextPersonName7.length() < 10 || editTextTextPersonName7.length() > 10) {
                    Toast.makeText(Cart.this, "Please Provide a Valid Phone Number", Toast.LENGTH_SHORT).show();
                }
            }
        });

        AlertDialog dialog = builder.create();
        dialog.show();
    }

    public void restartOption() {
        textView301.setText("Product Name");
        textView303.setText("00");
        textView304.setText("0");

        checkBox.setChecked(false);
        button.setEnabled(false);
        button2.setEnabled(false);
        button4.setEnabled(false);
    }
}