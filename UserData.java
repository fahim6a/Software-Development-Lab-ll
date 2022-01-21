/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecard;

/**
 *
 * @author Fahim
 */
public class UserData {
    private String Name,Brand,Payment_Type,Pay_method;
    private double price,discount;

    public UserData(String Name, String Brand, String Payment_Type, String Pay_method, double price, double discount) {
        this.Name = Name;
        this.Brand = Brand;
        this.Payment_Type = Payment_Type;
        this.Pay_method = Pay_method;
        this.price = price;
        this.discount = discount;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public String getPayment_Type() {
        return Payment_Type;
    }

    public void setPayment_Type(String Payment_Type) {
        this.Payment_Type = Payment_Type;
    }

    public String getPay_method() {
        return Pay_method;
    }

    public void setPay_method(String Pay_method) {
        this.Pay_method = Pay_method;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
    
}
