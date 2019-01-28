package com.barney.countriesapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailActivity extends AppCompatActivity {

    @BindView(R.id.nama)
    TextView nama;
    @BindView(R.id.gambar)
    ImageView gambar;
    @BindView(R.id.detail)
    TextView detail;
    String Header,Isi,Gambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        ButterKnife.bind(this);

        Header = getIntent().getStringExtra("name");
        Isi = getIntent().getStringExtra("any");
        Gambar = getIntent().getStringExtra("covers");

        Glide.with(DetailActivity.this)
                .load(Gambar)
                .apply(RequestOptions.fitCenterTransform())
                .into(gambar);

        nama.setText(Header);
        detail.setText(Isi);
    }
}
