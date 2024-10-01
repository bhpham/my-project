package com.coffee;

public class MyGenericClass<T extends Number, V extends Number> {

    T x;
    V y;

    MyGenericClass(T x, V y) {
        this.x = x;
        this.y = y;
    }

    public V getValue() {
        return y;
    }

    public void setValue(T x) {
        this.x = x;
    }
}
