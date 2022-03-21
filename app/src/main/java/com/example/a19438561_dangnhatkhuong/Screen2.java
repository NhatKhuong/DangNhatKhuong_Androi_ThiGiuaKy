package com.example.a19438561_dangnhatkhuong;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Screen2 extends AppCompatActivity {

    ListView listView;
    GoodsAdapter adt;
    List<Goods> goodsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);

        listView = findViewById(R.id.lvgood);
        goodsList = new ArrayList<>();

        goodsList.add(new Goods("Red Bull One","Free Ship",350,449,R.drawable.item1,1));
        goodsList.add(new Goods("Red One","Free Ship",840,950,R.drawable.item2,2));
        goodsList.add(new Goods("Red Bull One","Free Ship",350,449,R.drawable.item1,3));

        adt = new GoodsAdapter(this, R.layout.listview_item,goodsList);
        listView.setAdapter(adt);

        Button btnT = findViewById(R.id.btnT);
        Button btnP = findViewById(R.id.btnP);
        Button btnR = findViewById(R.id.btnR);

        btnT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adt.loc(1);
                adt.activebutton(btnT,btnR,btnP);
            }
        });

        btnP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adt.loc(2);
                adt.activebutton(btnP,btnR,btnT);
            }
        });

        btnR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adt.loc(3);
                adt.activebutton(btnR,btnT,btnP);
            }
        });


    }
}