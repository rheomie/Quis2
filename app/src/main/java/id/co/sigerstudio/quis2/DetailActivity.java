package id.co.sigerstudio.quis2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import java.sql.SQLOutput;

public class DetailActivity extends AppCompatActivity {
    TextView title, detailBawah;
    ImageView picture;
    Intent intent;
    int linkDrawable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        title = (TextView) findViewById(R.id.titleDetail);
        detailBawah = (TextView) findViewById(R.id.detailDetail);
        picture = (ImageView) findViewById(R.id.pictureDetail);

        intent = getIntent();

        title.setText(""+intent.getStringExtra("title"));
        detailBawah.setText(""+intent.getStringExtra("detail"));
        linkDrawable = intent.getIntExtra("picture", R.drawable.nintendo_switch_large);
        picture.setImageResource(linkDrawable);

    }
}
