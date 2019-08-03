package com.example.paymentcardexample;

public class PaymentCard {

    int imgCreditCar;
    String creditCartType;

    public int getImgCreditCar() {
        return imgCreditCar;
    }

    public void setImgCreditCar(int imgCreditCar) {
        this.imgCreditCar = imgCreditCar;
    }

    public String getCreditCartType() {
        return creditCartType;
    }

    public void setCreditCartType(String creditCartType) {
        this.creditCartType = creditCartType;
    }

    public PaymentCard(int imgCreditCar, String creditCartType) {
        this.imgCreditCar = imgCreditCar;
        this.creditCartType = creditCartType;
    }
}
