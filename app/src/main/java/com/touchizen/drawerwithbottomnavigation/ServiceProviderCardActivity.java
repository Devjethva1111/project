package com.touchizen.drawerwithbottomnavigation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import de.hdodenhof.circleimageview.CircleImageView;

public class ServiceProviderCardActivity extends AppCompatActivity {
    private Toolbar toolbar;
    CircleImageView img1,img2,img3,img4,img5,img6,img7,img8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_provider_card);
        toolbar = (Toolbar) findViewById(R.id.toolbar_search);
        if(getSupportActionBar() == null) {
            setSupportActionBar(toolbar);
        }else toolbar.setVisibility(View.GONE);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout)findViewById(R.id.refreshLayout);
        img1 = findViewById(R.id.ac_service);
        img2 = findViewById(R.id.cafe);
        img3 = findViewById(R.id.doctor);
        img4 = findViewById(R.id.medicine);
        img5 = findViewById(R.id.car_repair);
        img6 = findViewById(R.id.grocery);
        img7 = findViewById(R.id.electrician);
        img8 = findViewById(R.id.plumber);

        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                // This line is important as it explicitly
                // refreshes only once
                // If "true" it implicitly refreshes forever
                swipeRefreshLayout.setRefreshing(false);
            }
        });

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ServiceProviderCardActivity.this, "Ac Service", Toast.LENGTH_SHORT).show();
            }
        });

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ServiceProviderCardActivity.this, "Ac Service", Toast.LENGTH_SHORT).show();
            }
        });

        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ServiceProviderCardActivity.this, "Ac Service", Toast.LENGTH_SHORT).show();
            }
        });

        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ServiceProviderCardActivity.this, "Ac Service", Toast.LENGTH_SHORT).show();
            }
        });

        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ServiceProviderCardActivity.this, "Ac Service", Toast.LENGTH_SHORT).show();
            }
        });

        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ServiceProviderCardActivity.this, "Ac Service", Toast.LENGTH_SHORT).show();
            }
        });

        img7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ServiceProviderCardActivity.this, "Ac Service", Toast.LENGTH_SHORT).show();
            }
        });

        img8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ServiceProviderCardActivity.this, "Ac Service", Toast.LENGTH_SHORT).show();
            }
        });
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}