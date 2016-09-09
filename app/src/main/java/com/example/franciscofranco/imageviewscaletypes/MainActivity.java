package com.example.franciscofranco.imageviewscaletypes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;
    private ImageView imageView2;
    private ImageView imageView3;
    private ImageView imageView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.imageView);
        imageView2 = (ImageView) findViewById(R.id.imageView2);
        imageView3 = (ImageView) findViewById(R.id.imageView3);
        imageView4 = (ImageView) findViewById(R.id.imageView4);


        // pixel to dp ratio is 3 : 1

        Log.d("FRANCO_DEBUG", Float.toString(getResources().getDisplayMetrics().density));


        Picasso.with(this)
                .load("http://orig05.deviantart.net/2afe/f/2016/092/d/8/ladies_of_game_of_thrones_png_by_nickelbackloverxoxox-d9xhnz0.png")
                .resize(900, 450)
                .centerCrop()
                .into(imageView);
//
        Picasso.with(this)
                .load("https://projectworldimpact.com/images/user/nn3q09250so.png")
                .resize(300, 300)
                .centerInside()
                .into(imageView2);

        Picasso.with(this)
                .load("http://orig05.deviantart.net/2afe/f/2016/092/d/8/ladies_of_game_of_thrones_png_by_nickelbackloverxoxox-d9xhnz0.png")
                .fit()
                .into(imageView3);

        Picasso.with(this)
                .load("https://projectworldimpact.com/images/user/nn3q09250so.png")
                .fit()
                .centerInside()
                .into(imageView4);
    }
}
