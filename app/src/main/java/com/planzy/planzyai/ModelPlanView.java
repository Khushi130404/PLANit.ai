package com.planzy.planzyai;

import java.util.ArrayList;

public class ModelPlanView {
    int price;
    ArrayList<String> includedlist;
    String[] id_of_services;

    public ModelPlanView(int price, ArrayList<String> includedlist, String[] id_of_services) {
        this.price = price;
        this.includedlist = includedlist;
        this.id_of_services = id_of_services;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public ArrayList<String> getIncludedlist() {
        return includedlist;
    }

    public void setIncludedlist(ArrayList<String> includedlist) {
        this.includedlist = includedlist;
    }

    public String[] getId_of_services() {
        return id_of_services;
    }

    public void setId_of_services(String[] id_of_services) {
        this.id_of_services = id_of_services;
    }
}

