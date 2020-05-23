package com.alik.table.model;

public class Detail {
    //"Модель, Цвет, Дата заказа в цвете, Дата готовности в цвете"
    String model;
    String color;
    String dateOrder;
    String dateReady;

    public Detail(String model, String color, String date_order, String date_ready) {
        this.model = model;
        this.color = color;
        this.dateOrder = date_order;
        this.dateReady = date_ready;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getDateOrder() {
        return dateOrder;
    }

    public String getDateReady() {
        return dateReady;
    }
}
