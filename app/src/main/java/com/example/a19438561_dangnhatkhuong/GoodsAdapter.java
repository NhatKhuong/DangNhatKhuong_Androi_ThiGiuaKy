package com.example.a19438561_dangnhatkhuong;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class GoodsAdapter extends BaseAdapter {

    private Context ctx;
    private int layoutItem;
    private List<Goods> listGoods;
    private  List<Goods> listFilter;

    public GoodsAdapter(Context ctx, int layoutItem, List<Goods> listGoods) {
        this.ctx = ctx;
        this.layoutItem = layoutItem;
        this.listGoods = listGoods;
        this.listFilter = listGoods;
    }

    @Override
    public int getCount() {
        if(listFilter.size() != 0 && !listFilter.isEmpty()){
            return  listFilter.size();
        }
        return  0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(ctx).inflate(layoutItem,viewGroup,false);

        ImageView img = view.findViewById(R.id.img);
        TextView mau = view.findViewById(R.id.mau);
        TextView trangthai = view.findViewById(R.id.trangthai);
        TextView giaht = view.findViewById(R.id.giaht);
        TextView giacu = view.findViewById(R.id.giacu);

        img.setImageResource(listFilter.get(i).getImg());
        mau.setText(listFilter.get(i).getMau());
        trangthai.setText(listFilter.get(i).getTrangThai());
        giaht.setText("$"+listFilter.get(i).getGiaHienTai());
        giacu.setText("$"+listFilter.get(i).getGiaCu());

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ctx,GoodsDetail.class);
                intent.putExtra("goods",listFilter.get(i));
                ctx.startActivity(intent);
            }
        });

        return view;

    }

    public  void loc(int i){
        listFilter = new ArrayList<>();
        for (Goods item: listGoods){
            if (item.getLoai() == i){
                listFilter.add(item);
            }
        }
        notifyDataSetChanged();
    }

    public void activebutton(Button btn1,Button btn2,Button btn3){
        btn1.setBackgroundColor(Color.GREEN);
        btn2.setBackgroundColor(Color.WHITE);
        btn3.setBackgroundColor(Color.WHITE);

    }
}
