package com.example.wub.type_of_classes;

class ConstructorOverloadingExample {

    private String name;
    private String email;
    private String phoneNumber;

    public ConstructorOverloadingExample(String name) {
        this.name = name;
    }

    public ConstructorOverloadingExample(String name, String email) {
        this(name);
        this.email = email;
    }

    public ConstructorOverloadingExample(String name, String email, String phoneNumber) {
        this(name, email);
        this.phoneNumber = phoneNumber;
    }
}
