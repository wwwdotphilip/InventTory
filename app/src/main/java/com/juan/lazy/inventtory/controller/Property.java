package com.juan.lazy.inventtory.controller;

import java.io.Serializable;

public class Property implements Serializable {
    public String name;
    public int type;
    public int totalItems;
    public static final int DEFAULT = 0;
    public static final int HOME = 1;
    public static final int STORE = 2;
    public static final int WAREHOUSE = 3;

    public Property() {

    }

    public Property(String name, int type, int totalItems) {
        this.name = name;
        this.type = type;
        this.totalItems = totalItems;
    }
}
