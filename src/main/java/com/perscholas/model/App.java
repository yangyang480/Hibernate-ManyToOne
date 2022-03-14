package com.perscholas.model;

import org.hibernate.Session;

public class App {
    public static void main(String[] args)
    {
        MyController my = new MyController();
        my.createManytoone();
        my.InsertInfo();
    }
}
