package com.alik.table.model;

public class Model {

    private String name = "";
    private String count = "";

    public Model(String name, String count) {
        this.name = name;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public String getCount() {
        return count;
    }
}
