package com.example.a19438561_dangnhatkhuong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class GoodsDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goods_detail);

        Intent intent = getIntent();
        Goods goods = (Goods) intent.getSerializableExtra("goods");

        ImageView img = findViewById(R.id.imgitem);
        TextView mau = findViewById(R.id.mauitem);
        TextView giacu = findViewById(R.id.giacuitem);

        img.setImageResource(goods.getImg());
        mau.setText(goods.getMau());
        giacu.setText("$ "+goods.getGiaCu());

    }
}