package com.coffee;

import javax.xml.namespace.QName;

public class User {
    private String name;
    private String password;

    User(String name, String password) {
        name = name;
        password = password;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello " + this.name);
    }
}
