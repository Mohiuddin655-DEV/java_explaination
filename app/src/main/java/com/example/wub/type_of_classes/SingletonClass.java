package com.example.wub.type_of_classes;

class SingletonClass {

    private SingletonClass() {
    }

    static SingletonClass instance;

    public static SingletonClass getInstance() {
        if (instance == null) {
            instance = new SingletonClass();
        }
        return instance;
    }
}
