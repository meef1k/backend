package com.example.lab2;

public class UserEntity {
    private long Id;
    private String name;

    public UserEntity(long id, String name) {
        Id = id;
        this.name = name;
    }

    public long getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public void setId(long id) {
        Id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
