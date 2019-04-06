package com.company;

public class Main {

    public static void main(String[] args) {
        ITelephone telephone;
        telephone = new DeskPhone(123456789);
        telephone.powerOn();
        telephone.callPhone(123456789);
        telephone.answer();

        telephone = new MobilePhone(234567);
        telephone.powerOn();
        telephone.callPhone(234567);
        telephone.answer();
    }
}
