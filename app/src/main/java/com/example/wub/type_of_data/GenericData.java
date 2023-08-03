package com.example.wub.type_of_data;

// User Defined Data Type by generic <T>
// Follow the sign <T>

public class GenericData<T> {
    String tag;
    T data;

    public GenericData(String tag, T data) {
        this.tag = tag;
        this.data = data;
    }
}
