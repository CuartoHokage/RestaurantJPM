package com.facci.restaurantjpm;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class resutaurantJPM extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resutaurant_jpm);
        //langosta,hamburguesa, hotdog, chuzo, pizza , pollo , snacks
    }
    public void Click1 (View v){
        Toast.makeText(resutaurantJPM.this,"Usted a seleccionado langosta",Toast.LENGTH_SHORT).show();

    }
    public void Click2 (View v){
        Toast.makeText(resutaurantJPM.this,"Usted a seleccionado hamburguesa",Toast.LENGTH_SHORT).show();
    }
    public void Click3 (View v){
        Toast.makeText(resutaurantJPM.this,"Usted a seleccionado sachipapa",Toast.LENGTH_SHORT).show();
    }
    public void Click4 (View v){
        Toast.makeText(resutaurantJPM.this,"Usted a seleccionado chuzo",Toast.LENGTH_SHORT).show();
    }
    public void Click5 (View v){
        Toast.makeText(resutaurantJPM.this,"Usted a seleccionado pizza",Toast.LENGTH_SHORT).show();
    }
    public void Click6 (View v){
        Toast.makeText(resutaurantJPM.this,"Usted a seleccionado pollo",Toast.LENGTH_SHORT).show();
    }
    public void Click7 (View v){
        Toast.makeText(resutaurantJPM.this,"Usted a seleccionado snacks",Toast.LENGTH_SHORT).show();
    }

}
