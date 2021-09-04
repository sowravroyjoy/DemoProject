package com.example.demoproject;

public class Model {
    private String payment, pPayable, pDues, pPaid, name, address, phone, email, received, delivery, gender, product, length, chest, hand, leg, shoulder, neck;

    public Model(String payment, String pPayable, String pDues, String pPaid, String name, String address, String phone, String email, String received, String delivery, String gender, String product, String length, String chest, String hand, String leg, String shoulder, String neck) {
        this.payment = payment;
        this.pPayable = pPayable;
        this.pDues = pDues;
        this.pPaid = pPaid;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.received = received;
        this.delivery = delivery;
        this.gender = gender;
        this.product = product;
        this.length = length;
        this.chest = chest;
        this.hand = hand;
        this.leg = leg;
        this.shoulder = shoulder;
        this.neck = neck;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getpPayable() {
        return pPayable;
    }

    public void setpPayable(String pPayable) {
        this.pPayable = pPayable;
    }

    public String getpDues() {
        return pDues;
    }

    public void setpDues(String pDues) {
        this.pDues = pDues;
    }

    public String getpPaid() {
        return pPaid;
    }

    public void setpPaid(String pPaid) {
        this.pPaid = pPaid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getReceived() {
        return received;
    }

    public void setReceived(String received) {
        this.received = received;
    }

    public String getDelivery() {
        return delivery;
    }

    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getChest() {
        return chest;
    }

    public void setChest(String chest) {
        this.chest = chest;
    }

    public String getHand() {
        return hand;
    }

    public void setHand(String hand) {
        this.hand = hand;
    }

    public String getLeg() {
        return leg;
    }

    public void setLeg(String leg) {
        this.leg = leg;
    }

    public String getShoulder() {
        return shoulder;
    }

    public void setShoulder(String shoulder) {
        this.shoulder = shoulder;
    }

    public String getNeck() {
        return neck;
    }

    public void setNeck(String neck) {
        this.neck = neck;
    }
}
