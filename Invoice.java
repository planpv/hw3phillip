/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hardware;

/**
 *
 * @author Phillip Plangetis
 * Date: 2/11/23
 */
public class Invoice {
    
    String partNum = "52555";
    String partDesc = "The part is in bay 32, section 2b.";
    int itemQuantity = 32;
    double pricePerItem = 50.00;
    
    public static void main(String[] args) {
        Invoice init = new Invoice();
    }
    
    public void setPartNum(String partNum) {
        this.partNum = partNum;
    }

    public void setPartDesc(String partDesc) {
        this.partDesc = partDesc;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    public String getPartNum() {
        return partNum;
    }

    public String getPartDesc() {
        return partDesc;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }
    
     double getInvoiceAmount =  partNum + partDesc + itemQuantity + pricePerItem;
}
