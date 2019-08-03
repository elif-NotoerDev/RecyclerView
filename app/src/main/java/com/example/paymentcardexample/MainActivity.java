package com.example.paymentcardexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @SuppressLint("WrongConstant")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        List<PaymentCard> paymentCards = new ArrayList<>();
        paymentCards.add(new PaymentCard(R.drawable.coins, "TAI smfdlçf"));
        paymentCards.add(new PaymentCard(R.drawable.coins, "TAXI CcdggAR"));
        paymentCards.add(new PaymentCard(R.drawable.coins, "TAXI CAR"));
        paymentCards.add(new PaymentCard(R.drawable.coins, "TAXI CAR"));


        recyclerView = findViewById(R.id.my_recycler_view);
        PaymentAdapter paymentAdapter = new PaymentAdapter(paymentCards);
        recyclerView.setAdapter(paymentAdapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
//        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(linearLayoutManager);


    }
}
