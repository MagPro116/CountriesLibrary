package com.gmail.magpro116.flags;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class SpinnerAdapter extends ArrayAdapter<Integer> {

    private Integer[] flags;
    private String[] codes;
    private String[] names;
    private Context context;


    public SpinnerAdapter(Context context, Integer[] flags, String[] codes, String[] names) {
        super(context, android.R.layout.simple_spinner_item, flags);
        this.flags = flags;
        this.codes = codes;
        this.names = names;
        this.context = context;
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        return getImageForPosition(position, convertView, parent);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return getImageForPosition(position, convertView, parent);
    }

    private View getImageForPosition(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.row_spinner, parent, false);


        TextView txtCode = row.findViewById(R.id.txtCode);
        TextView txtName = row.findViewById(R.id.txtName);
        ImageView imgFlag = row.findViewById(R.id.imgFlag);


        txtCode.setText(codes[position]);
        txtName.setText(names[position]);
        imgFlag.setImageResource(flags[position]);


        return row;
    }


    public String returnCodes(int position) {
        return codes[position];
    }

    public String returnName(int position) {
        return names[position];
    }

    public Bitmap returnFlag(int position) {
        Bitmap mBitmap = null;
        try {
            mBitmap = BitmapFactory.decodeResource(context.getResources(), flags[position]);
        } catch (Exception ex) {
            Toast.makeText(context, "flag\n" + ex, Toast.LENGTH_LONG).show();
        }
        return mBitmap;
    }


}
