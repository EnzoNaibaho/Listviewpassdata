package com.example.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Objects;


public class MobileActivity extends AppCompatActivity {

    int pos=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobile);

        Intent intent = getIntent();
        pos= Objects.requireNonNull(intent.getExtras()).getInt("Position");

        final CustomAdapter adapter= new CustomAdapter(this);
        final ImageView img= findViewById(R.id.imgid);
        final TextView name= findViewById(R.id.MobileName);
        final TextView price= findViewById(R.id.MobilePrice);
        final ImageView spekimg= findViewById(R.id.spekid);

        //set data
        img.setImageResource(adapter.images[pos]);
        name.setText(String.valueOf(adapter.names[pos]));
        price.setText(String.valueOf(adapter.price[pos]));
        spekimg.setImageResource(adapter.spekvar[pos]);

        Button btnnext= findViewById(R.id.btnnext);
        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int position =pos+1;

                img.setImageResource(adapter.images[position]);
                name.setText(String.valueOf(adapter.names[position]));
                price.setText(String.valueOf(adapter.price[position]));
                img.setImageResource(adapter.spekvar[position]);

                if (!(position>=adapter.getCount()-1))
                {
                    pos +=1;

                }else
                {
                    pos=-1;
                }

            }
        });
    }
}
