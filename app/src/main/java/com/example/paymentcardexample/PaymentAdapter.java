package com.example.paymentcardexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PaymentAdapter extends RecyclerView.Adapter<PaymentAdapter.MyHolder> {
    private List<PaymentCard> paymentCard;

    public PaymentAdapter(List<PaymentCard> paymentCard) {
        this.paymentCard = paymentCard;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
            LayoutInflater inflater = LayoutInflater.from(context);
        View showPayment = inflater.inflate(R.layout.creditpayment, parent, false);
        MyHolder myHolder = new MyHolder(showPayment);
        return myHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        PaymentCard payment = paymentCard.get(position);
        TextView textView = holder.textView;
        textView.setText(payment.getCreditCartType());

        ImageView imageView = holder.imageView;
        imageView.setImageResource(payment.getImgCreditCar());

    }

    @Override
    public int getItemCount() {
        return paymentCard.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {
        private TextView textView;
        private ImageView imageView;

        public MyHolder(View view) {
            super(view);
            imageView = view.findViewById(R.id.imagePaymentCard);
            textView = view.findViewById(R.id.textViewPaymentCardType);
        }
    }
}
