package com.example.alimama;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RatingBar;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class Login extends AppCompatActivity {

    SearchView searchView;
    TextView textView2, textView4, textView5, textView7, textView8, textView10, textView11, textView13, textView14, textView16, textView17, textView19, textView20, textView22, textView23, textView25, textView26, textView28, textView29, textView401;
    TextView textView32, textView34, textView35, textView37, textView38, textView40, textView41, textView43, textView44, textView46, textView47, textView49, textView50, textView52, textView53, textView55;
    TextView textView62, textView64, textView65, textView67, textView68, textView70, textView71, textView73, textView74, textView76, textView77, textView79, textView80, textView82, textView83, textView85, textView86, textView88;
    TextView textView92, textView94, textView95, textView97, textView98, textView100, textView101, textView103, textView104, textView106, textView107, textView109, textView110, textView112, textView113, textView115;
    TextView textView122, textView124, textView125, textView127, textView128, textView130, textView131, textView133, textView134, textView136, textView137, textView139, textView140, textView142, textView143, textView145;
    TextView textView152, textView154, textView155, textView157, textView158, textView160, textView161, textView163, textView164, textView166, textView167, textView169, textView170, textView172, textView173, textView175, textView176, textView178;
    ListView listView;
    ArrayList<String> list;
    ArrayAdapter<String > adapter;
    ImageView imageView, imageView2, imageView3, imageView4, imageView5, imageViewi6, imageView7, imageView8, imageView9, imageView10;
    ImageView imageView11, imageView12, imageView13, imageView14, imageView15, imageView16, imageView17, imageView18;
    ImageView imageView21, imageView22, imageView23, imageView24, imageView25, imageView26, imageView27, imageView28, imageView29;
    ImageView imageView31, imageView32, imageView33, imageView34, imageView35, imageView36, imageView37, imageView38;
    ImageView imageView41, imageView42, imageView43, imageView44, imageView45, imageView46, imageView47, imageView48;
    ImageView imageView51, imageView52, imageView53, imageView54, imageView55, imageView56, imageView57, imageView58, imageView59;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        searchView = (SearchView) findViewById(R.id.searchView);
        textView2 = findViewById(R.id.textView2);
        textView4 = findViewById(R.id.textView4);
        textView5 = findViewById(R.id.textView5);
        textView7 = findViewById(R.id.textView7);
        textView8 = findViewById(R.id.textView8);
        textView10 = findViewById(R.id.textView10);
        textView11 = findViewById(R.id.textView11);
        textView13 = findViewById(R.id.textView13);
        textView14 = findViewById(R.id.textView14);
        textView16 = findViewById(R.id.textView16);
        textView17 = findViewById(R.id.textView17);
        textView19 = findViewById(R.id.textView19);
        textView20 = findViewById(R.id.textView20);
        textView22 = findViewById(R.id.textView22);
        textView23 = findViewById(R.id.textView23);
        textView25 = findViewById(R.id.textView25);
        textView26 = findViewById(R.id.textView26);
        textView28 = findViewById(R.id.textView28);
        textView29 = findViewById(R.id.textView29);
        textView401 = findViewById(R.id.textView401);
        textView32 = findViewById(R.id.textView32);
        textView34 = findViewById(R.id.textView34);
        textView35 = findViewById(R.id.textView35);
        textView37 = findViewById(R.id.textView37);
        textView38 = findViewById(R.id.textView38);
        textView40 = findViewById(R.id.textView40);
        textView41 = findViewById(R.id.textView41);
        textView43 = findViewById(R.id.textView43);
        textView44 = findViewById(R.id.textView44);
        textView46 = findViewById(R.id.textView46);
        textView47 = findViewById(R.id.textView47);
        textView49 = findViewById(R.id.textView49);
        textView50 = findViewById(R.id.textView50);
        textView52 = findViewById(R.id.textView52);
        textView53 = findViewById(R.id.textView53);
        textView55 = findViewById(R.id.textView55);
        textView62 = findViewById(R.id.textView62);
        textView64 = findViewById(R.id.textView64);
        textView65 = findViewById(R.id.textView65);
        textView67 = findViewById(R.id.textView67);
        textView68 = findViewById(R.id.textView68);
        textView70 = findViewById(R.id.textView70);
        textView71 = findViewById(R.id.textView71);
        textView73 = findViewById(R.id.textView73);
        textView74 = findViewById(R.id.textView74);
        textView76 = findViewById(R.id.textView76);
        textView77 = findViewById(R.id.textView77);
        textView79 = findViewById(R.id.textView79);
        textView80 = findViewById(R.id.textView80);
        textView82 = findViewById(R.id.textView82);
        textView83 = findViewById(R.id.textView83);
        textView85 = findViewById(R.id.textView85);
        textView86 = findViewById(R.id.textView86);
        textView88 = findViewById(R.id.textView88);
        textView92 = findViewById(R.id.textView92);
        textView94 = findViewById(R.id.textView94);
        textView95 = findViewById(R.id.textView95);
        textView97 = findViewById(R.id.textView97);
        textView98 = findViewById(R.id.textView98);
        textView100 = findViewById(R.id.textView100);
        textView101 = findViewById(R.id.textView101);
        textView103 = findViewById(R.id.textView103);
        textView104 = findViewById(R.id.textView104);
        textView106 = findViewById(R.id.textView106);
        textView107 = findViewById(R.id.textView107);
        textView109 = findViewById(R.id.textView109);
        textView110 = findViewById(R.id.textView110);
        textView112 = findViewById(R.id.textView112);
        textView113 = findViewById(R.id.textView113);
        textView115 = findViewById(R.id.textView115);
        textView122 = findViewById(R.id.textView122);
        textView124 = findViewById(R.id.textView124);
        textView125 = findViewById(R.id.textView125);
        textView127 = findViewById(R.id.textView127);
        textView128 = findViewById(R.id.textView128);
        textView130 = findViewById(R.id.textView130);
        textView131 = findViewById(R.id.textView131);
        textView133 = findViewById(R.id.textView133);
        textView134 = findViewById(R.id.textView134);
        textView136 = findViewById(R.id.textView136);
        textView137 = findViewById(R.id.textView137);
        textView139 = findViewById(R.id.textView139);
        textView140 = findViewById(R.id.textView140);
        textView142 = findViewById(R.id.textView142);
        textView143 = findViewById(R.id.textView143);
        textView145 = findViewById(R.id.textView145);
        textView152 = findViewById(R.id.textView152);
        textView154 = findViewById(R.id.textView154);
        textView155 = findViewById(R.id.textView155);
        textView157 = findViewById(R.id.textView157);
        textView158 = findViewById(R.id.textView158);
        textView160 = findViewById(R.id.textView160);
        textView161 = findViewById(R.id.textView161);
        textView163 = findViewById(R.id.textView163);
        textView164 = findViewById(R.id.textView164);
        textView166 = findViewById(R.id.textView166);
        textView167 = findViewById(R.id.textView167);
        textView169 = findViewById(R.id.textView169);
        textView170 = findViewById(R.id.textView170);
        textView172 = findViewById(R.id.textView172);
        textView173 = findViewById(R.id.textView173);
        textView175 = findViewById(R.id.textView175);
        textView176 = findViewById(R.id.textView176);
        textView178 = findViewById(R.id.textView178);

        listView = (ListView) findViewById(R.id.lv1);
        imageView = findViewById(R.id.imageView);
        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);
        imageView4 = findViewById(R.id.imageView4);
        imageView5 = findViewById(R.id.imageView5);
        imageViewi6 = findViewById(R.id.imageViewi6);
        imageView7 = findViewById(R.id.imageView7);
        imageView8 = findViewById(R.id.imageView8);
        imageView9 = findViewById(R.id.imageView9);
        imageView10 = findViewById(R.id.imageView10);
        imageView11 = findViewById(R.id.imageView11);
        imageView12 = findViewById(R.id.imageView12);
        imageView13 = findViewById(R.id.imageView13);
        imageView14 = findViewById(R.id.imageView14);
        imageView15 = findViewById(R.id.imageView15);
        imageView16 = findViewById(R.id.imageView16);
        imageView17 = findViewById(R.id.imageView17);
        imageView18 = findViewById(R.id.imageView18);
        imageView21 = findViewById(R.id.imageView21);
        imageView22 = findViewById(R.id.imageView22);
        imageView23 = findViewById(R.id.imageView23);
        imageView24 = findViewById(R.id.imageView24);
        imageView25 = findViewById(R.id.imageView25);
        imageView26 = findViewById(R.id.imageView26);
        imageView27 = findViewById(R.id.imageView27);
        imageView28 = findViewById(R.id.imageView28);
        imageView29 = findViewById(R.id.imageView29);
        imageView31 = findViewById(R.id.imageView31);
        imageView32 = findViewById(R.id.imageView32);
        imageView33 = findViewById(R.id.imageView33);
        imageView34 = findViewById(R.id.imageView34);
        imageView35 = findViewById(R.id.imageView35);
        imageView36 = findViewById(R.id.imageView36);
        imageView37 = findViewById(R.id.imageView37);
        imageView38 = findViewById(R.id.imageView38);
        imageView41 = findViewById(R.id.imageView41);
        imageView42 = findViewById(R.id.imageView42);
        imageView43 = findViewById(R.id.imageView43);
        imageView44 = findViewById(R.id.imageView44);
        imageView45 = findViewById(R.id.imageView45);
        imageView46 = findViewById(R.id.imageView46);
        imageView47 = findViewById(R.id.imageView47);
        imageView48 = findViewById(R.id.imageView48);
        imageView51 = findViewById(R.id.imageView51);
        imageView52 = findViewById(R.id.imageView52);
        imageView53 = findViewById(R.id.imageView53);
        imageView54 = findViewById(R.id.imageView54);
        imageView55 = findViewById(R.id.imageView55);
        imageView56 = findViewById(R.id.imageView56);
        imageView57 = findViewById(R.id.imageView57);
        imageView58 = findViewById(R.id.imageView58);
        imageView58 = findViewById(R.id.imageView58);
        imageView59 = findViewById(R.id.imageView59);

        String phone1 = textView2.getText().toString();
        String phone2 = textView5.getText().toString();
        String phone3 = textView8.getText().toString();
        String phone4 = textView11.getText().toString();

        list = new ArrayList<>();
        list.add(phone1);
        list.add(phone2);
        list.add(phone3);
        list.add(phone4);
        list.add("Lychee");
        list.add(phone1);
        list.add(phone2);
        list.add(phone3);
        list.add(phone4);
        list.add("Papaya");

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,list);

        listView.setAdapter(adapter);
        // Setting the listView to be invisible
        listView.setVisibility(View.INVISIBLE);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
//            @Override
//            public boolean onQueryTextSubmit(String s) {
//                return false;
//            }

            @Override
            public boolean onQueryTextSubmit(String query) {

                if(list.contains(query)){
                    adapter.getFilter().filter(query);
                }else{
                    Toast.makeText(Login.this, "No Match found",Toast.LENGTH_LONG).show();
                }
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
//                adapter.getFilter().filter(newText);
                return false;
            }
        });

        // Initialize and assign variable
        BottomNavigationView bottomNavigationView=findViewById(R.id.bottom_navigation);
        // Set Home selected
        bottomNavigationView.setSelectedItemId(R.id.home);

        // Perform item selected listener
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch(item.getItemId())
                {
                    case R.id.home:
                        return true;
                    case R.id.cart:
                        startActivity(new Intent(getApplicationContext(),Cart.class));
                        overridePendingTransition(0,0);
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

    public void addToCartItem1(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Add to Card ");
        StringBuffer alert = new StringBuffer();
        alert.append("\n\nEnter the details below; ");

        final View customLayout = getLayoutInflater().inflate(R.layout.add_to_cart, null);
        builder.setView(customLayout);

        if (imageView.isPressed()) {

            TextView textView303 = customLayout.findViewById(R.id.textView303);
            TextView textView304 = customLayout.findViewById(R.id.textView304);
            TextView textView306 = customLayout.findViewById(R.id.textView306);
            RatingBar ratingBar = customLayout.findViewById(R.id.ratingBar);
            String phone = textView2.getText().toString();
            String price = textView4.getText().toString();
            textView303.setText(phone);
            textView306.setText(price);
            ratingBar.setRating(5);
            textView304.setVisibility(View.VISIBLE);
            textView306.setVisibility(View.VISIBLE);
            ratingBar.setVisibility(View.VISIBLE);

            builder.setPositiveButton("ADD", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent add = new Intent(Login.this, Cart.class);
                    add.putExtra("image", R.drawable.samsung_galaxy_s21_ultra);
                    add.putExtra("phone1", phone);
                    add.putExtra("price", price);
                    Toast.makeText(Login.this, "You are only allowed on one device", Toast.LENGTH_SHORT).show();
                    startActivity(add);
                }
            });

        } else if (imageView2.isPressed()) {
            TextView textView303 = customLayout.findViewById(R.id.textView303);
            TextView textView308 = customLayout.findViewById(R.id.textView308);
            TextView textView306 = customLayout.findViewById(R.id.textView306);
            ImageView imageView6 = customLayout.findViewById(R.id.imageView6);
            RatingBar ratingBar = customLayout.findViewById(R.id.ratingBar);
            String phone = textView5.getText().toString();
            String price = textView7.getText().toString();
            Drawable picture = imageView2.getDrawable();
            textView303.setText(phone);
            textView306.setText(price);
            ratingBar.setRating(4);
            imageView6.setImageDrawable(picture);
            textView308.setVisibility(View.VISIBLE);
            textView306.setVisibility(View.VISIBLE);
            ratingBar.setVisibility(View.VISIBLE);

            builder.setPositiveButton("ADD", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent add = new Intent(Login.this, Cart.class);
                    add.putExtra("image", R.drawable.iphone_14_pro);
                    add.putExtra("phone1", phone);
                    add.putExtra("price", price);
                    startActivity(add);
                }
            });
        } else if (imageView3.isPressed()) {
            TextView textView303 = customLayout.findViewById(R.id.textView303);
            TextView textView309 = customLayout.findViewById(R.id.textView309);
            TextView textView306 = customLayout.findViewById(R.id.textView306);
            ImageView imageView6 = customLayout.findViewById(R.id.imageView6);
            RatingBar ratingBar = customLayout.findViewById(R.id.ratingBar);
            String phone = textView8.getText().toString();
            String price = textView10.getText().toString();
            Drawable picture = imageView3.getDrawable();
            textView303.setText(phone);
            textView306.setText(price);
            ratingBar.setRating(5);
            imageView6.setImageDrawable(picture);
            textView309.setVisibility(View.VISIBLE);
            textView306.setVisibility(View.VISIBLE);
            ratingBar.setVisibility(View.VISIBLE);

            builder.setPositiveButton("ADD", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent add = new Intent(Login.this, Cart.class);
                    add.putExtra("image", R.drawable.nothing_phone);
                    add.putExtra("phone1", phone);
                    add.putExtra("price", price);
                    startActivity(add);
                }
            });
        } else if (imageView4.isPressed()) {
            TextView textView303 = customLayout.findViewById(R.id.textView303);
            TextView textView310 = customLayout.findViewById(R.id.textView310);
            TextView textView306 = customLayout.findViewById(R.id.textView306);
            ImageView imageView6 = customLayout.findViewById(R.id.imageView6);
            RatingBar ratingBar = customLayout.findViewById(R.id.ratingBar);
            String phone = textView11.getText().toString();
            String price = textView13.getText().toString();
            Drawable picture = imageView4.getDrawable();
            textView303.setText(phone);
            textView306.setText(price);
            ratingBar.setRating(3);
            imageView6.setImageDrawable(picture);
            textView310.setVisibility(View.VISIBLE);
            textView306.setVisibility(View.VISIBLE);
            ratingBar.setVisibility(View.VISIBLE);

            builder.setPositiveButton("ADD", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent add = new Intent(Login.this, Cart.class);
                    add.putExtra("image", R.drawable.samsung_galaxy_s21);
                    add.putExtra("phone1", phone);
                    add.putExtra("price", price);
                    startActivity(add);
                }
            });
        } else if (imageView5.isPressed()) {
            TextView textView303 = customLayout.findViewById(R.id.textView303);
            TextView textView311 = customLayout.findViewById(R.id.textView311);
            TextView textView306 = customLayout.findViewById(R.id.textView306);
            ImageView imageView6 = customLayout.findViewById(R.id.imageView6);
            RatingBar ratingBar = customLayout.findViewById(R.id.ratingBar);
            String phone = textView14.getText().toString();
            String price = textView16.getText().toString();
            Drawable picture = imageView5.getDrawable();
            textView303.setText(phone);
            textView306.setText(price);
            ratingBar.setRating(3);
            imageView6.setImageDrawable(picture);
            textView311.setVisibility(View.VISIBLE);
            textView306.setVisibility(View.VISIBLE);
            ratingBar.setVisibility(View.VISIBLE);

            builder.setPositiveButton("ADD", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent add = new Intent(Login.this, Cart.class);
                    add.putExtra("image", R.drawable.samsung_galaxy_s21);
                    add.putExtra("phone1", phone);
                    add.putExtra("price", price);
                    startActivity(add);
                }
            });
        } else if (imageViewi6.isPressed()) {
            TextView textView303 = customLayout.findViewById(R.id.textView303);
            TextView textView312 = customLayout.findViewById(R.id.textView312);
            TextView textView306 = customLayout.findViewById(R.id.textView306);
            ImageView imageView6 = customLayout.findViewById(R.id.imageView6);
            RatingBar ratingBar = customLayout.findViewById(R.id.ratingBar);
            String phone = textView17.getText().toString();
            String price = textView19.getText().toString();
            Drawable picture = imageViewi6.getDrawable();
            textView303.setText(phone);
            textView306.setText(price);
            ratingBar.setRating(3);
            imageView6.setImageDrawable(picture);
            textView312.setVisibility(View.VISIBLE);
            textView306.setVisibility(View.VISIBLE);
            ratingBar.setVisibility(View.VISIBLE);

            builder.setPositiveButton("ADD", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent add = new Intent(Login.this, Cart.class);
                    add.putExtra("image", R.drawable.samsung_galaxy_s21);
                    add.putExtra("phone1", phone);
                    add.putExtra("price", price);
                    startActivity(add);
                }
            });
        } else if (imageView7.isPressed()) {
            TextView textView303 = customLayout.findViewById(R.id.textView303);
            TextView textView313 = customLayout.findViewById(R.id.textView313);
            TextView textView306 = customLayout.findViewById(R.id.textView306);
            ImageView imageView6 = customLayout.findViewById(R.id.imageView6);
            RatingBar ratingBar = customLayout.findViewById(R.id.ratingBar);
            String phone = textView20.getText().toString();
            String price = textView22.getText().toString();
            Drawable picture = imageView7.getDrawable();
            textView303.setText(phone);
            textView306.setText(price);
            ratingBar.setRating(3);
            imageView6.setImageDrawable(picture);
            textView313.setVisibility(View.VISIBLE);
            textView306.setVisibility(View.VISIBLE);
            ratingBar.setVisibility(View.VISIBLE);

            builder.setPositiveButton("ADD", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent add = new Intent(Login.this, Cart.class);
                    add.putExtra("image", R.drawable.samsung_galaxy_s21);
                    add.putExtra("phone1", phone);
                    add.putExtra("price", price);
                    startActivity(add);
                }
            });
        } else if (imageView8.isPressed()) {
            TextView textView303 = customLayout.findViewById(R.id.textView303);
            TextView textView314 = customLayout.findViewById(R.id.textView314);
            TextView textView306 = customLayout.findViewById(R.id.textView306);
            ImageView imageView6 = customLayout.findViewById(R.id.imageView6);
            RatingBar ratingBar = customLayout.findViewById(R.id.ratingBar);
            String phone = textView23.getText().toString();
            String price = textView25.getText().toString();
            Drawable picture = imageView8.getDrawable();
            textView303.setText(phone);
            textView306.setText(price);
            ratingBar.setRating(3);
            imageView6.setImageDrawable(picture);
            textView314.setVisibility(View.VISIBLE);
            textView306.setVisibility(View.VISIBLE);
            ratingBar.setVisibility(View.VISIBLE);

            builder.setPositiveButton("ADD", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent add = new Intent(Login.this, Cart.class);
                    add.putExtra("image", R.drawable.samsung_galaxy_s21);
                    add.putExtra("phone1", phone);
                    add.putExtra("price", price);
                    startActivity(add);
                }
            });
        } else if (imageView9.isPressed()) {
            TextView textView303 = customLayout.findViewById(R.id.textView303);
            TextView textView315 = customLayout.findViewById(R.id.textView315);
            TextView textView306 = customLayout.findViewById(R.id.textView306);
            ImageView imageView6 = customLayout.findViewById(R.id.imageView6);
            RatingBar ratingBar = customLayout.findViewById(R.id.ratingBar);
            String phone = textView26.getText().toString();
            String price = textView28.getText().toString();
            Drawable picture = imageView9.getDrawable();
            textView303.setText(phone);
            textView306.setText(price);
            ratingBar.setRating(3);
            imageView6.setImageDrawable(picture);
            textView315.setVisibility(View.VISIBLE);
            textView306.setVisibility(View.VISIBLE);
            ratingBar.setVisibility(View.VISIBLE);

            builder.setPositiveButton("ADD", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent add = new Intent(Login.this, Cart.class);
                    add.putExtra("image", R.drawable.samsung_galaxy_s21);
                    add.putExtra("phone1", phone);
                    add.putExtra("price", price);
                    startActivity(add);
                }
            });
        } else if (imageView10.isPressed()) {
            TextView textView303 = customLayout.findViewById(R.id.textView303);
            TextView textView316 = customLayout.findViewById(R.id.textView316);
            TextView textView306 = customLayout.findViewById(R.id.textView306);
            ImageView imageView6 = customLayout.findViewById(R.id.imageView6);
            RatingBar ratingBar = customLayout.findViewById(R.id.ratingBar);
            String phone = textView29.getText().toString();
            String price = textView401.getText().toString();
            Drawable picture = imageView10.getDrawable();
            textView303.setText(phone);
            textView306.setText(price);
            ratingBar.setRating(3);
            imageView6.setImageDrawable(picture);
            textView316.setVisibility(View.VISIBLE);
            textView306.setVisibility(View.VISIBLE);
            ratingBar.setVisibility(View.VISIBLE);

            builder.setPositiveButton("ADD", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent add = new Intent(Login.this, Cart.class);
                    add.putExtra("image", R.drawable.samsung_galaxy_s21);
                    add.putExtra("phone1", phone);
                    add.putExtra("price", price);
                    startActivity(add);
                }
            });
        } else if (imageView11.isPressed()) {

            TextView textView303 = customLayout.findViewById(R.id.textView303);
            TextView textView317 = customLayout.findViewById(R.id.textView317);
            TextView textView306 = customLayout.findViewById(R.id.textView306);
            RatingBar ratingBar = customLayout.findViewById(R.id.ratingBar);
            ImageView imageView6 = customLayout.findViewById(R.id.imageView6);
            String phone = textView32.getText().toString();
            String price = textView34.getText().toString();
            Drawable picture = imageView11.getDrawable();
            textView303.setText(phone);
            textView306.setText(price);
            ratingBar.setRating(5);
            imageView6.setImageDrawable(picture);
            textView317.setVisibility(View.VISIBLE);
            textView306.setVisibility(View.VISIBLE);
            ratingBar.setVisibility(View.VISIBLE);

            builder.setPositiveButton("ADD", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent add = new Intent(Login.this, Cart.class);
                    add.putExtra("image", R.drawable.samsung_galaxy_s21_ultra);
                    add.putExtra("phone1", phone);
                    add.putExtra("price", price);
                    startActivity(add);
                }
            });

        } else if (imageView12.isPressed()) {
            TextView textView303 = customLayout.findViewById(R.id.textView303);
            TextView textView318 = customLayout.findViewById(R.id.textView318);
            TextView textView306 = customLayout.findViewById(R.id.textView306);
            ImageView imageView6 = customLayout.findViewById(R.id.imageView6);
            RatingBar ratingBar = customLayout.findViewById(R.id.ratingBar);
            String phone = textView35.getText().toString();
            String price = textView37.getText().toString();
            Drawable picture = imageView12.getDrawable();
            textView303.setText(phone);
            textView306.setText(price);
            ratingBar.setRating(4);
            imageView6.setImageDrawable(picture);
            textView318.setVisibility(View.VISIBLE);
            textView306.setVisibility(View.VISIBLE);
            ratingBar.setVisibility(View.VISIBLE);

            builder.setPositiveButton("ADD", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent add = new Intent(Login.this, Cart.class);
                    add.putExtra("image", R.drawable.iphone_14_pro);
                    add.putExtra("phone1", phone);
                    add.putExtra("price", price);
                    startActivity(add);
                }
            });
        } else if (imageView13.isPressed()) {
            TextView textView303 = customLayout.findViewById(R.id.textView303);
            TextView textView319 = customLayout.findViewById(R.id.textView319);
            TextView textView306 = customLayout.findViewById(R.id.textView306);
            ImageView imageView6 = customLayout.findViewById(R.id.imageView6);
            RatingBar ratingBar = customLayout.findViewById(R.id.ratingBar);
            String phone = textView38.getText().toString();
            String price = textView40.getText().toString();
            Drawable picture = imageView13.getDrawable();
            textView303.setText(phone);
            textView306.setText(price);
            ratingBar.setRating(5);
            imageView6.setImageDrawable(picture);
            textView319.setVisibility(View.VISIBLE);
            textView306.setVisibility(View.VISIBLE);
            ratingBar.setVisibility(View.VISIBLE);

            builder.setPositiveButton("ADD", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent add = new Intent(Login.this, Cart.class);
                    add.putExtra("image", R.drawable.nothing_phone);
                    add.putExtra("phone1", phone);
                    add.putExtra("price", price);
                    startActivity(add);
                }
            });
        } else if (imageView14.isPressed()) {
            TextView textView303 = customLayout.findViewById(R.id.textView303);
            TextView textView320 = customLayout.findViewById(R.id.textView320);
            TextView textView306 = customLayout.findViewById(R.id.textView306);
            ImageView imageView6 = customLayout.findViewById(R.id.imageView6);
            RatingBar ratingBar = customLayout.findViewById(R.id.ratingBar);
            String phone = textView41.getText().toString();
            String price = textView43.getText().toString();
            Drawable picture = imageView14.getDrawable();
            textView303.setText(phone);
            textView306.setText(price);
            ratingBar.setRating(3);
            imageView6.setImageDrawable(picture);
            textView320.setVisibility(View.VISIBLE);
            textView306.setVisibility(View.VISIBLE);
            ratingBar.setVisibility(View.VISIBLE);

            builder.setPositiveButton("ADD", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent add = new Intent(Login.this, Cart.class);
                    add.putExtra("image", R.drawable.samsung_galaxy_s21);
                    add.putExtra("phone1", phone);
                    add.putExtra("price", price);
                    startActivity(add);
                }
            });
        } else if (imageView15.isPressed()) {
            TextView textView303 = customLayout.findViewById(R.id.textView303);
            TextView textView321 = customLayout.findViewById(R.id.textView321);
            TextView textView306 = customLayout.findViewById(R.id.textView306);
            ImageView imageView6 = customLayout.findViewById(R.id.imageView6);
            RatingBar ratingBar = customLayout.findViewById(R.id.ratingBar);
            String phone = textView44.getText().toString();
            String price = textView46.getText().toString();
            Drawable picture = imageView15.getDrawable();
            textView303.setText(phone);
            textView306.setText(price);
            ratingBar.setRating(3);
            imageView6.setImageDrawable(picture);
            textView321.setVisibility(View.VISIBLE);
            textView306.setVisibility(View.VISIBLE);
            ratingBar.setVisibility(View.VISIBLE);

            builder.setPositiveButton("ADD", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent add = new Intent(Login.this, Cart.class);
                    add.putExtra("image", R.drawable.samsung_galaxy_s21);
                    add.putExtra("phone1", phone);
                    add.putExtra("price", price);
                    startActivity(add);
                }
            });
        } else if (imageView16.isPressed()) {
            TextView textView303 = customLayout.findViewById(R.id.textView303);
            TextView textView322 = customLayout.findViewById(R.id.textView322);
            TextView textView306 = customLayout.findViewById(R.id.textView306);
            ImageView imageView6 = customLayout.findViewById(R.id.imageView6);
            RatingBar ratingBar = customLayout.findViewById(R.id.ratingBar);
            String phone = textView47.getText().toString();
            String price = textView49.getText().toString();
            Drawable picture = imageView16.getDrawable();
            textView303.setText(phone);
            textView306.setText(price);
            ratingBar.setRating(3);
            imageView6.setImageDrawable(picture);
            textView322.setVisibility(View.VISIBLE);
            textView306.setVisibility(View.VISIBLE);
            ratingBar.setVisibility(View.VISIBLE);

            builder.setPositiveButton("ADD", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent add = new Intent(Login.this, Cart.class);
                    add.putExtra("image", R.drawable.samsung_galaxy_s21);
                    add.putExtra("phone1", phone);
                    add.putExtra("price", price);
                    startActivity(add);
                }
            });
        } else if (imageView17.isPressed()) {
            TextView textView303 = customLayout.findViewById(R.id.textView303);
            TextView textView323 = customLayout.findViewById(R.id.textView323);
            TextView textView306 = customLayout.findViewById(R.id.textView306);
            ImageView imageView6 = customLayout.findViewById(R.id.imageView6);
            RatingBar ratingBar = customLayout.findViewById(R.id.ratingBar);
            String phone = textView50.getText().toString();
            String price = textView52.getText().toString();
            Drawable picture = imageView17.getDrawable();
            textView303.setText(phone);
            textView306.setText(price);
            ratingBar.setRating(3);
            imageView6.setImageDrawable(picture);
            textView323.setVisibility(View.VISIBLE);
            textView306.setVisibility(View.VISIBLE);
            ratingBar.setVisibility(View.VISIBLE);

            builder.setPositiveButton("ADD", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent add = new Intent(Login.this, Cart.class);
                    add.putExtra("image", R.drawable.samsung_galaxy_s21);
                    add.putExtra("phone1", phone);
                    add.putExtra("price", price);
                    startActivity(add);
                }
            });
        } else if (imageView18.isPressed()) {
            TextView textView303 = customLayout.findViewById(R.id.textView303);
            TextView textView324 = customLayout.findViewById(R.id.textView324);
            TextView textView306 = customLayout.findViewById(R.id.textView306);
            ImageView imageView6 = customLayout.findViewById(R.id.imageView6);
            RatingBar ratingBar = customLayout.findViewById(R.id.ratingBar);
            String phone = textView53.getText().toString();
            String price = textView55.getText().toString();
            Drawable picture = imageView18.getDrawable();
            textView303.setText(phone);
            textView306.setText(price);
            ratingBar.setRating(3);
            imageView6.setImageDrawable(picture);
            textView324.setVisibility(View.VISIBLE);
            textView306.setVisibility(View.VISIBLE);
            ratingBar.setVisibility(View.VISIBLE);

            builder.setPositiveButton("ADD", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent add = new Intent(Login.this, Cart.class);
                    add.putExtra("image", R.drawable.samsung_galaxy_s21);
                    add.putExtra("phone1", phone);
                    add.putExtra("price", price);
                    startActivity(add);
                }
            });
        } else if (imageView21.isPressed()) {

            TextView textView303 = customLayout.findViewById(R.id.textView303);
            TextView textView325 = customLayout.findViewById(R.id.textView325);
            TextView textView306 = customLayout.findViewById(R.id.textView306);
            ImageView imageView6 = customLayout.findViewById(R.id.imageView6);
            RatingBar ratingBar = customLayout.findViewById(R.id.ratingBar);
            String phone = textView62.getText().toString();
            String price = textView64.getText().toString();
            Drawable picture = imageView21.getDrawable();
            textView303.setText(phone);
            textView306.setText(price);
            ratingBar.setRating(5);
            imageView6.setImageDrawable(picture);
            textView325.setVisibility(View.VISIBLE);
            textView306.setVisibility(View.VISIBLE);
            ratingBar.setVisibility(View.VISIBLE);

            builder.setPositiveButton("ADD", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent add = new Intent(Login.this, Cart.class);
                    add.putExtra("image", R.drawable.samsung_galaxy_s21_ultra);
                    add.putExtra("phone1", phone);
                    add.putExtra("price", price);
                    Toast.makeText(Login.this, "You are only allowed on one device", Toast.LENGTH_SHORT).show();
                    startActivity(add);
                }
            });

        } else if (imageView22.isPressed()) {
            TextView textView303 = customLayout.findViewById(R.id.textView303);
            TextView textView326 = customLayout.findViewById(R.id.textView326);
            TextView textView306 = customLayout.findViewById(R.id.textView306);
            ImageView imageView6 = customLayout.findViewById(R.id.imageView6);
            RatingBar ratingBar = customLayout.findViewById(R.id.ratingBar);
            String phone = textView65.getText().toString();
            String price = textView67.getText().toString();
            Drawable picture = imageView22.getDrawable();
            textView303.setText(phone);
            textView306.setText(price);
            ratingBar.setRating(4);
            imageView6.setImageDrawable(picture);
            textView326.setVisibility(View.VISIBLE);
            textView306.setVisibility(View.VISIBLE);
            ratingBar.setVisibility(View.VISIBLE);

            builder.setPositiveButton("ADD", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent add = new Intent(Login.this, Cart.class);
                    add.putExtra("image", R.drawable.iphone_14_pro);
                    add.putExtra("phone1", phone);
                    add.putExtra("price", price);
                    startActivity(add);
                }
            });
        } else if (imageView23.isPressed()) {
            TextView textView303 = customLayout.findViewById(R.id.textView303);
            TextView textView327 = customLayout.findViewById(R.id.textView327);
            TextView textView306 = customLayout.findViewById(R.id.textView306);
            ImageView imageView6 = customLayout.findViewById(R.id.imageView6);
            RatingBar ratingBar = customLayout.findViewById(R.id.ratingBar);
            String phone = textView68.getText().toString();
            String price = textView70.getText().toString();
            Drawable picture = imageView23.getDrawable();
            textView303.setText(phone);
            textView306.setText(price);
            ratingBar.setRating(5);
            imageView6.setImageDrawable(picture);
            textView327.setVisibility(View.VISIBLE);
            textView306.setVisibility(View.VISIBLE);
            ratingBar.setVisibility(View.VISIBLE);

            builder.setPositiveButton("ADD", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent add = new Intent(Login.this, Cart.class);
                    add.putExtra("image", R.drawable.nothing_phone);
                    add.putExtra("phone1", phone);
                    add.putExtra("price", price);
                    startActivity(add);
                }
            });
        } else if (imageView24.isPressed()) {
            TextView textView303 = customLayout.findViewById(R.id.textView303);
            TextView textView328 = customLayout.findViewById(R.id.textView328);
            TextView textView306 = customLayout.findViewById(R.id.textView306);
            ImageView imageView6 = customLayout.findViewById(R.id.imageView6);
            RatingBar ratingBar = customLayout.findViewById(R.id.ratingBar);
            String phone = textView71.getText().toString();
            String price = textView73.getText().toString();
            Drawable picture = imageView24.getDrawable();
            textView303.setText(phone);
            textView306.setText(price);
            ratingBar.setRating(3);
            imageView6.setImageDrawable(picture);
            textView328.setVisibility(View.VISIBLE);
            textView306.setVisibility(View.VISIBLE);
            ratingBar.setVisibility(View.VISIBLE);

            builder.setPositiveButton("ADD", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent add = new Intent(Login.this, Cart.class);
                    add.putExtra("image", R.drawable.samsung_galaxy_s21);
                    add.putExtra("phone1", phone);
                    add.putExtra("price", price);
                    startActivity(add);
                }
            });
        } else if (imageView25.isPressed()) {
            TextView textView303 = customLayout.findViewById(R.id.textView303);
            TextView textView329 = customLayout.findViewById(R.id.textView329);
            TextView textView306 = customLayout.findViewById(R.id.textView306);
            ImageView imageView6 = customLayout.findViewById(R.id.imageView6);
            RatingBar ratingBar = customLayout.findViewById(R.id.ratingBar);
            String phone = textView74.getText().toString();
            String price = textView76.getText().toString();
            Drawable picture = imageView25.getDrawable();
            textView303.setText(phone);
            textView306.setText(price);
            ratingBar.setRating(3);
            imageView6.setImageDrawable(picture);
            textView329.setVisibility(View.VISIBLE);
            textView306.setVisibility(View.VISIBLE);
            ratingBar.setVisibility(View.VISIBLE);

            builder.setPositiveButton("ADD", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent add = new Intent(Login.this, Cart.class);
                    add.putExtra("image", R.drawable.samsung_galaxy_s21);
                    add.putExtra("phone1", phone);
                    add.putExtra("price", price);
                    startActivity(add);
                }
            });
        } else if (imageView26.isPressed()) {
            TextView textView303 = customLayout.findViewById(R.id.textView303);
            TextView textView330 = customLayout.findViewById(R.id.textView330);
            TextView textView306 = customLayout.findViewById(R.id.textView306);
            ImageView imageView6 = customLayout.findViewById(R.id.imageView6);
            RatingBar ratingBar = customLayout.findViewById(R.id.ratingBar);
            String phone = textView77.getText().toString();
            String price = textView79.getText().toString();
            Drawable picture = imageView26.getDrawable();
            textView303.setText(phone);
            textView306.setText(price);
            ratingBar.setRating(3);
            imageView6.setImageDrawable(picture);
            textView330.setVisibility(View.VISIBLE);
            textView306.setVisibility(View.VISIBLE);
            ratingBar.setVisibility(View.VISIBLE);

            builder.setPositiveButton("ADD", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent add = new Intent(Login.this, Cart.class);
                    add.putExtra("image", R.drawable.samsung_galaxy_s21);
                    add.putExtra("phone1", phone);
                    add.putExtra("price", price);
                    startActivity(add);
                }
            });
        } else if (imageView27.isPressed()) {
            TextView textView303 = customLayout.findViewById(R.id.textView303);
            TextView textView331 = customLayout.findViewById(R.id.textView331);
            TextView textView306 = customLayout.findViewById(R.id.textView306);
            ImageView imageView6 = customLayout.findViewById(R.id.imageView6);
            RatingBar ratingBar = customLayout.findViewById(R.id.ratingBar);
            String phone = textView80.getText().toString();
            String price = textView82.getText().toString();
            Drawable picture = imageView27.getDrawable();
            textView303.setText(phone);
            textView306.setText(price);
            ratingBar.setRating(3);
            imageView6.setImageDrawable(picture);
            textView331.setVisibility(View.VISIBLE);
            textView306.setVisibility(View.VISIBLE);
            ratingBar.setVisibility(View.VISIBLE);

            builder.setPositiveButton("ADD", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent add = new Intent(Login.this, Cart.class);
                    add.putExtra("image", R.drawable.samsung_galaxy_s21);
                    add.putExtra("phone1", phone);
                    add.putExtra("price", price);
                    startActivity(add);
                }
            });
        } else if (imageView28.isPressed()) {
            TextView textView303 = customLayout.findViewById(R.id.textView303);
            TextView textView332 = customLayout.findViewById(R.id.textView332);
            TextView textView306 = customLayout.findViewById(R.id.textView306);
            ImageView imageView6 = customLayout.findViewById(R.id.imageView6);
            RatingBar ratingBar = customLayout.findViewById(R.id.ratingBar);
            String phone = textView83.getText().toString();
            String price = textView85.getText().toString();
            Drawable picture = imageView28.getDrawable();
            textView303.setText(phone);
            textView306.setText(price);
            ratingBar.setRating(3);
            imageView6.setImageDrawable(picture);
            textView332.setVisibility(View.VISIBLE);
            textView306.setVisibility(View.VISIBLE);
            ratingBar.setVisibility(View.VISIBLE);

            builder.setPositiveButton("ADD", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent add = new Intent(Login.this, Cart.class);
                    add.putExtra("image", R.drawable.samsung_galaxy_s21);
                    add.putExtra("phone1", phone);
                    add.putExtra("price", price);
                    startActivity(add);
                }
            });
        } else if (imageView29.isPressed()) {
            TextView textView303 = customLayout.findViewById(R.id.textView303);
            TextView textView333 = customLayout.findViewById(R.id.textView333);
            TextView textView306 = customLayout.findViewById(R.id.textView306);
            ImageView imageView6 = customLayout.findViewById(R.id.imageView6);
            RatingBar ratingBar = customLayout.findViewById(R.id.ratingBar);
            String phone = textView86.getText().toString();
            String price = textView88.getText().toString();
            Drawable picture = imageView29.getDrawable();
            textView303.setText(phone);
            textView306.setText(price);
            ratingBar.setRating(3);
            imageView6.setImageDrawable(picture);
            textView333.setVisibility(View.VISIBLE);
            textView306.setVisibility(View.VISIBLE);
            ratingBar.setVisibility(View.VISIBLE);

            builder.setPositiveButton("ADD", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent add = new Intent(Login.this, Cart.class);
                    add.putExtra("image", R.drawable.samsung_galaxy_s21);
                    add.putExtra("phone1", phone);
                    add.putExtra("price", price);
                    startActivity(add);
                }
            });
        } else if (imageView31.isPressed()) {
            TextView textView303 = customLayout.findViewById(R.id.textView303);
            TextView textView334 = customLayout.findViewById(R.id.textView334);
            TextView textView306 = customLayout.findViewById(R.id.textView306);
            ImageView imageView6 = customLayout.findViewById(R.id.imageView6);
            RatingBar ratingBar = customLayout.findViewById(R.id.ratingBar);
            String phone = textView92.getText().toString();
            String price = textView94.getText().toString();
            Drawable picture = imageView31.getDrawable();
            textView303.setText(phone);
            textView306.setText(price);
            ratingBar.setRating(5);
            imageView6.setImageDrawable(picture);
            textView334.setVisibility(View.VISIBLE);
            textView306.setVisibility(View.VISIBLE);
            ratingBar.setVisibility(View.VISIBLE);

            builder.setPositiveButton("ADD", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent add = new Intent(Login.this, Cart.class);
                    add.putExtra("image", R.drawable.samsung_galaxy_s21_ultra);
                    add.putExtra("phone1", phone);
                    add.putExtra("price", price);
                    Toast.makeText(Login.this, "You are only allowed on one device", Toast.LENGTH_SHORT).show();
                    startActivity(add);
                }
            });

        } else if (imageView32.isPressed()) {
            TextView textView303 = customLayout.findViewById(R.id.textView303);
            TextView textView335 = customLayout.findViewById(R.id.textView335);
            TextView textView306 = customLayout.findViewById(R.id.textView306);
            ImageView imageView6 = customLayout.findViewById(R.id.imageView6);
            RatingBar ratingBar = customLayout.findViewById(R.id.ratingBar);
            String phone = textView95.getText().toString();
            String price = textView97.getText().toString();
            Drawable picture = imageView32.getDrawable();
            textView303.setText(phone);
            textView306.setText(price);
            ratingBar.setRating(4);
            imageView6.setImageDrawable(picture);
            textView335.setVisibility(View.VISIBLE);
            textView306.setVisibility(View.VISIBLE);
            ratingBar.setVisibility(View.VISIBLE);

            builder.setPositiveButton("ADD", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent add = new Intent(Login.this, Cart.class);
                    add.putExtra("image", R.drawable.iphone_14_pro);
                    add.putExtra("phone1", phone);
                    add.putExtra("price", price);
                    startActivity(add);
                }
            });
        } else if (imageView33.isPressed()) {
            TextView textView303 = customLayout.findViewById(R.id.textView303);
            TextView textView336 = customLayout.findViewById(R.id.textView336);
            TextView textView306 = customLayout.findViewById(R.id.textView306);
            ImageView imageView6 = customLayout.findViewById(R.id.imageView6);
            RatingBar ratingBar = customLayout.findViewById(R.id.ratingBar);
            String phone = textView98.getText().toString();
            String price = textView100.getText().toString();
            Drawable picture = imageView33.getDrawable();
            textView303.setText(phone);
            textView306.setText(price);
            ratingBar.setRating(5);
            imageView6.setImageDrawable(picture);
            textView336.setVisibility(View.VISIBLE);
            textView306.setVisibility(View.VISIBLE);
            ratingBar.setVisibility(View.VISIBLE);

            builder.setPositiveButton("ADD", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent add = new Intent(Login.this, Cart.class);
                    add.putExtra("image", R.drawable.nothing_phone);
                    add.putExtra("phone1", phone);
                    add.putExtra("price", price);
                    startActivity(add);
                }
            });
        } else if (imageView34.isPressed()) {
            TextView textView303 = customLayout.findViewById(R.id.textView303);
            TextView textView337 = customLayout.findViewById(R.id.textView337);
            TextView textView306 = customLayout.findViewById(R.id.textView306);
            ImageView imageView6 = customLayout.findViewById(R.id.imageView6);
            RatingBar ratingBar = customLayout.findViewById(R.id.ratingBar);
            String phone = textView101.getText().toString();
            String price = textView103.getText().toString();
            Drawable picture = imageView34.getDrawable();
            textView303.setText(phone);
            textView306.setText(price);
            ratingBar.setRating(3);
            imageView6.setImageDrawable(picture);
            textView337.setVisibility(View.VISIBLE);
            textView306.setVisibility(View.VISIBLE);
            ratingBar.setVisibility(View.VISIBLE);

            builder.setPositiveButton("ADD", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent add = new Intent(Login.this, Cart.class);
                    add.putExtra("image", R.drawable.samsung_galaxy_s21);
                    add.putExtra("phone1", phone);
                    add.putExtra("price", price);
                    startActivity(add);
                }
            });
        } else if (imageView35.isPressed()) {
            TextView textView303 = customLayout.findViewById(R.id.textView303);
            TextView textView338 = customLayout.findViewById(R.id.textView338);
            TextView textView306 = customLayout.findViewById(R.id.textView306);
            ImageView imageView6 = customLayout.findViewById(R.id.imageView6);
            RatingBar ratingBar = customLayout.findViewById(R.id.ratingBar);
            String phone = textView104.getText().toString();
            String price = textView106.getText().toString();
            Drawable picture = imageView35.getDrawable();
            textView303.setText(phone);
            textView306.setText(price);
            ratingBar.setRating(3);
            imageView6.setImageDrawable(picture);
            textView338.setVisibility(View.VISIBLE);
            textView306.setVisibility(View.VISIBLE);
            ratingBar.setVisibility(View.VISIBLE);

            builder.setPositiveButton("ADD", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent add = new Intent(Login.this, Cart.class);
                    add.putExtra("image", R.drawable.samsung_galaxy_s21);
                    add.putExtra("phone1", phone);
                    add.putExtra("price", price);
                    startActivity(add);
                }
            });
        } else if (imageView36.isPressed()) {
            TextView textView303 = customLayout.findViewById(R.id.textView303);
            TextView textView339 = customLayout.findViewById(R.id.textView339);
            TextView textView306 = customLayout.findViewById(R.id.textView306);
            ImageView imageView6 = customLayout.findViewById(R.id.imageView6);
            RatingBar ratingBar = customLayout.findViewById(R.id.ratingBar);
            String phone = textView107.getText().toString();
            String price = textView109.getText().toString();
            Drawable picture = imageView36.getDrawable();
            textView303.setText(phone);
            textView306.setText(price);
            ratingBar.setRating(3);
            imageView6.setImageDrawable(picture);
            textView339.setVisibility(View.VISIBLE);
            textView306.setVisibility(View.VISIBLE);
            ratingBar.setVisibility(View.VISIBLE);

            builder.setPositiveButton("ADD", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent add = new Intent(Login.this, Cart.class);
                    add.putExtra("image", R.drawable.samsung_galaxy_s21);
                    add.putExtra("phone1", phone);
                    add.putExtra("price", price);
                    startActivity(add);
                }
            });
        } else if (imageView37.isPressed()) {
            TextView textView303 = customLayout.findViewById(R.id.textView303);
            TextView textView340 = customLayout.findViewById(R.id.textView340);
            TextView textView306 = customLayout.findViewById(R.id.textView306);
            ImageView imageView6 = customLayout.findViewById(R.id.imageView6);
            RatingBar ratingBar = customLayout.findViewById(R.id.ratingBar);
            String phone = textView110.getText().toString();
            String price = textView112.getText().toString();
            Drawable picture = imageView37.getDrawable();
            textView303.setText(phone);
            textView306.setText(price);
            ratingBar.setRating(3);
            imageView6.setImageDrawable(picture);
            textView340.setVisibility(View.VISIBLE);
            textView306.setVisibility(View.VISIBLE);
            ratingBar.setVisibility(View.VISIBLE);

            builder.setPositiveButton("ADD", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent add = new Intent(Login.this, Cart.class);
                    add.putExtra("image", R.drawable.samsung_galaxy_s21);
                    add.putExtra("phone1", phone);
                    add.putExtra("price", price);
                    startActivity(add);
                }
            });
        } else if (imageView38.isPressed()) {
            TextView textView303 = customLayout.findViewById(R.id.textView303);
            TextView textView341 = customLayout.findViewById(R.id.textView341);
            TextView textView306 = customLayout.findViewById(R.id.textView306);
            ImageView imageView6 = customLayout.findViewById(R.id.imageView6);
            RatingBar ratingBar = customLayout.findViewById(R.id.ratingBar);
            String phone = textView113.getText().toString();
            String price = textView115.getText().toString();
            Drawable picture = imageView38.getDrawable();
            textView303.setText(phone);
            textView306.setText(price);
            ratingBar.setRating(3);
            imageView6.setImageDrawable(picture);
            textView341.setVisibility(View.VISIBLE);
            textView306.setVisibility(View.VISIBLE);
            ratingBar.setVisibility(View.VISIBLE);

            builder.setPositiveButton("ADD", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent add = new Intent(Login.this, Cart.class);
                    add.putExtra("image", R.drawable.samsung_galaxy_s21);
                    add.putExtra("phone1", phone);
                    add.putExtra("price", price);
                    startActivity(add);
                }
            });
        } else if (imageView41.isPressed()) {
            TextView textView303 = customLayout.findViewById(R.id.textView303);
            TextView textView342 = customLayout.findViewById(R.id.textView342);
            TextView textView306 = customLayout.findViewById(R.id.textView306);
            ImageView imageView6 = customLayout.findViewById(R.id.imageView6);
            RatingBar ratingBar = customLayout.findViewById(R.id.ratingBar);
            String phone = textView122.getText().toString();
            String price = textView124.getText().toString();
            Drawable picture = imageView41.getDrawable();
            textView303.setText(phone);
            textView306.setText(price);
            ratingBar.setRating(5);
            imageView6.setImageDrawable(picture);
            textView342.setVisibility(View.VISIBLE);
            textView306.setVisibility(View.VISIBLE);
            ratingBar.setVisibility(View.VISIBLE);

            builder.setPositiveButton("ADD", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent add = new Intent(Login.this, Cart.class);
                    add.putExtra("image", R.drawable.samsung_galaxy_s21_ultra);
                    add.putExtra("phone1", phone);
                    add.putExtra("price", price);
                    Toast.makeText(Login.this, "You are only allowed on one device", Toast.LENGTH_SHORT).show();
                    startActivity(add);
                }
            });

        } else if (imageView42.isPressed()) {
            TextView textView303 = customLayout.findViewById(R.id.textView303);
            TextView textView343 = customLayout.findViewById(R.id.textView343);
            TextView textView306 = customLayout.findViewById(R.id.textView306);
            ImageView imageView6 = customLayout.findViewById(R.id.imageView6);
            RatingBar ratingBar = customLayout.findViewById(R.id.ratingBar);
            String phone = textView125.getText().toString();
            String price = textView127.getText().toString();
            Drawable picture = imageView42.getDrawable();
            textView303.setText(phone);
            textView306.setText(price);
            ratingBar.setRating(4);
            imageView6.setImageDrawable(picture);
            textView343.setVisibility(View.VISIBLE);
            textView306.setVisibility(View.VISIBLE);
            ratingBar.setVisibility(View.VISIBLE);

            builder.setPositiveButton("ADD", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent add = new Intent(Login.this, Cart.class);
                    add.putExtra("image", R.drawable.iphone_14_pro);
                    add.putExtra("phone1", phone);
                    add.putExtra("price", price);
                    startActivity(add);
                }
            });
        } else if (imageView43.isPressed()) {
            TextView textView303 = customLayout.findViewById(R.id.textView303);
            TextView textView344 = customLayout.findViewById(R.id.textView344);
            TextView textView306 = customLayout.findViewById(R.id.textView306);
            ImageView imageView6 = customLayout.findViewById(R.id.imageView6);
            RatingBar ratingBar = customLayout.findViewById(R.id.ratingBar);
            String phone = textView128.getText().toString();
            String price = textView130.getText().toString();
            Drawable picture = imageView43.getDrawable();
            textView303.setText(phone);
            textView306.setText(price);
            ratingBar.setRating(5);
            imageView6.setImageDrawable(picture);
            textView344.setVisibility(View.VISIBLE);
            textView306.setVisibility(View.VISIBLE);
            ratingBar.setVisibility(View.VISIBLE);

            builder.setPositiveButton("ADD", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent add = new Intent(Login.this, Cart.class);
                    add.putExtra("image", R.drawable.nothing_phone);
                    add.putExtra("phone1", phone);
                    add.putExtra("price", price);
                    startActivity(add);
                }
            });
        } else if (imageView44.isPressed()) {
            TextView textView303 = customLayout.findViewById(R.id.textView303);
            TextView textView345 = customLayout.findViewById(R.id.textView345);
            TextView textView306 = customLayout.findViewById(R.id.textView306);
            ImageView imageView6 = customLayout.findViewById(R.id.imageView6);
            RatingBar ratingBar = customLayout.findViewById(R.id.ratingBar);
            String phone = textView131.getText().toString();
            String price = textView133.getText().toString();
            Drawable picture = imageView44.getDrawable();
            textView303.setText(phone);
            textView306.setText(price);
            ratingBar.setRating(3);
            imageView6.setImageDrawable(picture);
            textView345.setVisibility(View.VISIBLE);
            textView306.setVisibility(View.VISIBLE);
            ratingBar.setVisibility(View.VISIBLE);

            builder.setPositiveButton("ADD", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent add = new Intent(Login.this, Cart.class);
                    add.putExtra("image", R.drawable.samsung_galaxy_s21);
                    add.putExtra("phone1", phone);
                    add.putExtra("price", price);
                    startActivity(add);
                }
            });
        } else if (imageView45.isPressed()) {
            TextView textView303 = customLayout.findViewById(R.id.textView303);
            TextView textView346 = customLayout.findViewById(R.id.textView346);
            TextView textView306 = customLayout.findViewById(R.id.textView306);
            ImageView imageView6 = customLayout.findViewById(R.id.imageView6);
            RatingBar ratingBar = customLayout.findViewById(R.id.ratingBar);
            String phone = textView134.getText().toString();
            String price = textView136.getText().toString();
            Drawable picture = imageView45.getDrawable();
            textView303.setText(phone);
            textView306.setText(price);
            ratingBar.setRating(3);
            imageView6.setImageDrawable(picture);
            textView346.setVisibility(View.VISIBLE);
            textView306.setVisibility(View.VISIBLE);
            ratingBar.setVisibility(View.VISIBLE);

            builder.setPositiveButton("ADD", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent add = new Intent(Login.this, Cart.class);
                    add.putExtra("image", R.drawable.samsung_galaxy_s21);
                    add.putExtra("phone1", phone);
                    add.putExtra("price", price);
                    startActivity(add);
                }
            });
        } else if (imageView46.isPressed()) {
            TextView textView303 = customLayout.findViewById(R.id.textView303);
            TextView textView347 = customLayout.findViewById(R.id.textView347);
            TextView textView306 = customLayout.findViewById(R.id.textView306);
            ImageView imageView6 = customLayout.findViewById(R.id.imageView6);
            RatingBar ratingBar = customLayout.findViewById(R.id.ratingBar);
            String phone = textView137.getText().toString();
            String price = textView139.getText().toString();
            Drawable picture = imageView46.getDrawable();
            textView303.setText(phone);
            textView306.setText(price);
            ratingBar.setRating(3);
            imageView6.setImageDrawable(picture);
            textView347.setVisibility(View.VISIBLE);
            textView306.setVisibility(View.VISIBLE);
            ratingBar.setVisibility(View.VISIBLE);

            builder.setPositiveButton("ADD", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent add = new Intent(Login.this, Cart.class);
                    add.putExtra("image", R.drawable.samsung_galaxy_s21);
                    add.putExtra("phone1", phone);
                    add.putExtra("price", price);
                    startActivity(add);
                }
            });
        } else if (imageView47.isPressed()) {
            TextView textView303 = customLayout.findViewById(R.id.textView303);
            TextView textView348 = customLayout.findViewById(R.id.textView348);
            TextView textView306 = customLayout.findViewById(R.id.textView306);
            ImageView imageView6 = customLayout.findViewById(R.id.imageView6);
            RatingBar ratingBar = customLayout.findViewById(R.id.ratingBar);
            String phone = textView140.getText().toString();
            String price = textView142.getText().toString();
            Drawable picture = imageView47.getDrawable();
            textView303.setText(phone);
            textView306.setText(price);
            ratingBar.setRating(3);
            imageView6.setImageDrawable(picture);
            textView348.setVisibility(View.VISIBLE);
            textView306.setVisibility(View.VISIBLE);
            ratingBar.setVisibility(View.VISIBLE);

            builder.setPositiveButton("ADD", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent add = new Intent(Login.this, Cart.class);
                    add.putExtra("image", R.drawable.samsung_galaxy_s21);
                    add.putExtra("phone1", phone);
                    add.putExtra("price", price);
                    startActivity(add);
                }
            });
        } else if (imageView48.isPressed()) {
            TextView textView303 = customLayout.findViewById(R.id.textView303);
            TextView textView349 = customLayout.findViewById(R.id.textView349);
            TextView textView306 = customLayout.findViewById(R.id.textView306);
            ImageView imageView6 = customLayout.findViewById(R.id.imageView6);
            RatingBar ratingBar = customLayout.findViewById(R.id.ratingBar);
            String phone = textView143.getText().toString();
            String price = textView145.getText().toString();
            Drawable picture = imageView48.getDrawable();
            textView303.setText(phone);
            textView306.setText(price);
            ratingBar.setRating(3);
            imageView6.setImageDrawable(picture);
            textView349.setVisibility(View.VISIBLE);
            textView306.setVisibility(View.VISIBLE);
            ratingBar.setVisibility(View.VISIBLE);

            builder.setPositiveButton("ADD", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent add = new Intent(Login.this, Cart.class);
                    add.putExtra("image", R.drawable.samsung_galaxy_s21);
                    add.putExtra("phone1", phone);
                    add.putExtra("price", price);
                    startActivity(add);
                }
            });
        } else if (imageView51.isPressed()) {
            TextView textView303 = customLayout.findViewById(R.id.textView303);
            TextView textView350 = customLayout.findViewById(R.id.textView350);
            TextView textView306 = customLayout.findViewById(R.id.textView306);
            ImageView imageView6 = customLayout.findViewById(R.id.imageView6);
            RatingBar ratingBar = customLayout.findViewById(R.id.ratingBar);
            String phone = textView152.getText().toString();
            String price = textView154.getText().toString();
            Drawable picture = imageView51.getDrawable();
            textView303.setText(phone);
            textView306.setText(price);
            ratingBar.setRating(5);
            imageView6.setImageDrawable(picture);
            textView350.setVisibility(View.VISIBLE);
            textView306.setVisibility(View.VISIBLE);
            ratingBar.setVisibility(View.VISIBLE);

            builder.setPositiveButton("ADD", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent add = new Intent(Login.this, Cart.class);
                    add.putExtra("image", R.drawable.samsung_galaxy_s21_ultra);
                    add.putExtra("phone1", phone);
                    add.putExtra("price", price);
                    Toast.makeText(Login.this, "You are only allowed on one device", Toast.LENGTH_SHORT).show();
                    startActivity(add);
                }
            });

        } else if (imageView52.isPressed()) {
            TextView textView303 = customLayout.findViewById(R.id.textView303);
            TextView textView351 = customLayout.findViewById(R.id.textView351);
            TextView textView306 = customLayout.findViewById(R.id.textView306);
            ImageView imageView6 = customLayout.findViewById(R.id.imageView6);
            RatingBar ratingBar = customLayout.findViewById(R.id.ratingBar);
            String phone = textView155.getText().toString();
            String price = textView157.getText().toString();
            Drawable picture = imageView52.getDrawable();
            textView303.setText(phone);
            textView306.setText(price);
            ratingBar.setRating(4);
            imageView6.setImageDrawable(picture);
            textView351.setVisibility(View.VISIBLE);
            textView306.setVisibility(View.VISIBLE);
            ratingBar.setVisibility(View.VISIBLE);

            builder.setPositiveButton("ADD", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent add = new Intent(Login.this, Cart.class);
                    add.putExtra("image", R.drawable.iphone_14_pro);
                    add.putExtra("phone1", phone);
                    add.putExtra("price", price);
                    startActivity(add);
                }
            });
        } else if (imageView53.isPressed()) {
            TextView textView303 = customLayout.findViewById(R.id.textView303);
            TextView textView352 = customLayout.findViewById(R.id.textView352);
            TextView textView306 = customLayout.findViewById(R.id.textView306);
            ImageView imageView6 = customLayout.findViewById(R.id.imageView6);
            RatingBar ratingBar = customLayout.findViewById(R.id.ratingBar);
            String phone = textView158.getText().toString();
            String price = textView160.getText().toString();
            Drawable picture = imageView53.getDrawable();
            textView303.setText(phone);
            textView306.setText(price);
            ratingBar.setRating(5);
            imageView6.setImageDrawable(picture);
            textView352.setVisibility(View.VISIBLE);
            textView306.setVisibility(View.VISIBLE);
            ratingBar.setVisibility(View.VISIBLE);

            builder.setPositiveButton("ADD", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent add = new Intent(Login.this, Cart.class);
                    add.putExtra("image", R.drawable.nothing_phone);
                    add.putExtra("phone1", phone);
                    add.putExtra("price", price);
                    startActivity(add);
                }
            });
        } else if (imageView54.isPressed()) {
            TextView textView303 = customLayout.findViewById(R.id.textView303);
            TextView textView353 = customLayout.findViewById(R.id.textView353);
            TextView textView306 = customLayout.findViewById(R.id.textView306);
            ImageView imageView6 = customLayout.findViewById(R.id.imageView6);
            RatingBar ratingBar = customLayout.findViewById(R.id.ratingBar);
            String phone = textView161.getText().toString();
            String price = textView163.getText().toString();
            Drawable picture = imageView54.getDrawable();
            textView303.setText(phone);
            textView306.setText(price);
            ratingBar.setRating(3);
            imageView6.setImageDrawable(picture);
            textView353.setVisibility(View.VISIBLE);
            textView306.setVisibility(View.VISIBLE);
            ratingBar.setVisibility(View.VISIBLE);

            builder.setPositiveButton("ADD", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent add = new Intent(Login.this, Cart.class);
                    add.putExtra("image", R.drawable.samsung_galaxy_s21);
                    add.putExtra("phone1", phone);
                    add.putExtra("price", price);
                    startActivity(add);
                }
            });
        } else if (imageView55.isPressed()) {
            TextView textView303 = customLayout.findViewById(R.id.textView303);
            TextView textView354 = customLayout.findViewById(R.id.textView354);
            TextView textView306 = customLayout.findViewById(R.id.textView306);
            ImageView imageView6 = customLayout.findViewById(R.id.imageView6);
            RatingBar ratingBar = customLayout.findViewById(R.id.ratingBar);
            String phone = textView164.getText().toString();
            String price = textView166.getText().toString();
            Drawable picture = imageView55.getDrawable();
            textView303.setText(phone);
            textView306.setText(price);
            ratingBar.setRating(3);
            imageView6.setImageDrawable(picture);
            textView354.setVisibility(View.VISIBLE);
            textView306.setVisibility(View.VISIBLE);
            ratingBar.setVisibility(View.VISIBLE);

            builder.setPositiveButton("ADD", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent add = new Intent(Login.this, Cart.class);
                    add.putExtra("image", R.drawable.samsung_galaxy_s21);
                    add.putExtra("phone1", phone);
                    add.putExtra("price", price);
                    startActivity(add);
                }
            });
        } else if (imageView56.isPressed()) {
            TextView textView303 = customLayout.findViewById(R.id.textView303);
            TextView textView355 = customLayout.findViewById(R.id.textView355);
            TextView textView306 = customLayout.findViewById(R.id.textView306);
            ImageView imageView6 = customLayout.findViewById(R.id.imageView6);
            RatingBar ratingBar = customLayout.findViewById(R.id.ratingBar);
            String phone = textView167.getText().toString();
            String price = textView169.getText().toString();
            Drawable picture = imageView56.getDrawable();
            textView303.setText(phone);
            textView306.setText(price);
            ratingBar.setRating(3);
            imageView6.setImageDrawable(picture);
            textView355.setVisibility(View.VISIBLE);
            textView306.setVisibility(View.VISIBLE);
            ratingBar.setVisibility(View.VISIBLE);

            builder.setPositiveButton("ADD", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent add = new Intent(Login.this, Cart.class);
                    add.putExtra("image", R.drawable.samsung_galaxy_s21);
                    add.putExtra("phone1", phone);
                    add.putExtra("price", price);
                    startActivity(add);
                }
            });
        } else if (imageView57.isPressed()) {
            TextView textView303 = customLayout.findViewById(R.id.textView303);
            TextView textView356 = customLayout.findViewById(R.id.textView356);
            TextView textView306 = customLayout.findViewById(R.id.textView306);
            ImageView imageView6 = customLayout.findViewById(R.id.imageView6);
            RatingBar ratingBar = customLayout.findViewById(R.id.ratingBar);
            String phone = textView170.getText().toString();
            String price = textView172.getText().toString();
            Drawable picture = imageView57.getDrawable();
            textView303.setText(phone);
            textView306.setText(price);
            ratingBar.setRating(3);
            imageView6.setImageDrawable(picture);
            textView356.setVisibility(View.VISIBLE);
            textView306.setVisibility(View.VISIBLE);
            ratingBar.setVisibility(View.VISIBLE);

            builder.setPositiveButton("ADD", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent add = new Intent(Login.this, Cart.class);
                    add.putExtra("image", R.drawable.samsung_galaxy_s21);
                    add.putExtra("phone1", phone);
                    add.putExtra("price", price);
                    startActivity(add);
                }
            });
        } else if (imageView58.isPressed()) {
            TextView textView303 = customLayout.findViewById(R.id.textView303);
            TextView textView357 = customLayout.findViewById(R.id.textView357);
            TextView textView306 = customLayout.findViewById(R.id.textView306);
            ImageView imageView6 = customLayout.findViewById(R.id.imageView6);
            RatingBar ratingBar = customLayout.findViewById(R.id.ratingBar);
            String phone = textView173.getText().toString();
            String price = textView175.getText().toString();
            Drawable picture = imageView58.getDrawable();
            textView303.setText(phone);
            textView306.setText(price);
            ratingBar.setRating(3);
            imageView6.setImageDrawable(picture);
            textView357.setVisibility(View.VISIBLE);
            textView306.setVisibility(View.VISIBLE);
            ratingBar.setVisibility(View.VISIBLE);

            builder.setPositiveButton("ADD", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent add = new Intent(Login.this, Cart.class);
                    add.putExtra("image", R.drawable.samsung_galaxy_s21);
                    add.putExtra("phone1", phone);
                    add.putExtra("price", price);
                    startActivity(add);
                }
            });
        } else if (imageView59.isPressed()) {
            TextView textView303 = customLayout.findViewById(R.id.textView303);
            TextView textView358 = customLayout.findViewById(R.id.textView358);
            TextView textView306 = customLayout.findViewById(R.id.textView306);
            ImageView imageView6 = customLayout.findViewById(R.id.imageView6);
            RatingBar ratingBar = customLayout.findViewById(R.id.ratingBar);
            String phone = textView176.getText().toString();
            String price = textView178.getText().toString();
            Drawable picture = imageView59.getDrawable();
            textView303.setText(phone);
            textView306.setText(price);
            ratingBar.setRating(3);
            imageView6.setImageDrawable(picture);
            textView358.setVisibility(View.VISIBLE);
            textView306.setVisibility(View.VISIBLE);
            ratingBar.setVisibility(View.VISIBLE);

            builder.setPositiveButton("ADD", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent add = new Intent(Login.this, Cart.class);
                    add.putExtra("image", R.drawable.samsung_galaxy_s21);
                    add.putExtra("phone1", phone);
                    add.putExtra("price", price);
                    startActivity(add);
                }
            });
        }
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}