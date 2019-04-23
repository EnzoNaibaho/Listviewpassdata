package com.example.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class CustomAdapter extends BaseAdapter
{
    Context c;
    String[] names={"Samsung Galaxy J2","Samsung Galaxy J4","Samsung Galaxy J5","Samsung Galaxy J6","Samsung Galaxy J6 Plus","Samsung Galaxy J7","Samsung Galaxy J7 Plus"};
    String[] price={"Rp.2.500.000","Rp.2.700.000","Rp.3.000.000","Rp.4.000.000","Rp.4.500.000","Rp.5.000.000","Rp.6.000.000"};
    int[]images={R.drawable.samsungj2,
            R.drawable.samsungj4,
            R.drawable.samsungj5,
            R.drawable.samsungj6,
            R.drawable.samsung6plus,
            R.drawable.samsungj7,
            R.drawable.samsungj7plus};
    int[]spekvar={R.drawable.spekj2,
            R.drawable.spekj4,
            R.drawable.spekj5,
            R.drawable.spekj6,
            R.drawable.spekj6plus,
            R.drawable.spekj7,
            R.drawable.spekj7plus};
    public CustomAdapter (Context ctx)
    {

        this.c=ctx;
    }
    @Override
    public int getCount() {

        return names.length;
    }

    @Override
    public Object getItem(int pos) {

        return names[pos];
    }

    @Override
    public long getItemId(int pos) {
        return pos;
    }

    @Override
    public View getView(int pos, View convertview, ViewGroup viewGroup) {


        if (convertview==null)
        {
            LayoutInflater inflater= (LayoutInflater)c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertview=inflater.inflate(R.layout.mobiles,null);
        }
        //get view
        TextView nametxt= convertview.findViewById(R.id.name);
        TextView pricetxt= convertview.findViewById(R.id.price);
        ImageView img= convertview.findViewById(R.id.imgid);
        ImageView imgspek= convertview.findViewById(R.id.spekid);

        //Set Data
        nametxt.setText(String.valueOf(names[pos]));
        pricetxt.setText(String.valueOf(price[pos]));
        img.setImageResource(images[pos]);
        imgspek.setImageResource(spekvar[pos]);


        return convertview;
    }
}
