package com.vishnu.android_assigment;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class GridAdapter extends BaseAdapter {

    private final int images[];
    private final String name[];
    Context context;

    public GridAdapter(int[] images, String[] name, Context context) {
        this.images = images;
        this.name = name;
        this.context = context;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return name.length;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View convertview, ViewGroup viewGroup) {

        LayoutInflater layoutInflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View V=layoutInflater.inflate(R.layout.demogrid,null);

        ImageView imageView=V.findViewById(R.id.imagegrid);
        TextView textView=V.findViewById(R.id.textgrid);

        imageView.setImageResource(images[i]);
        textView.setText(name[i]);


        return V;
    }
}
