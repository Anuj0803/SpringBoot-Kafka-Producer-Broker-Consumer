package com.practice.KafkaSpringBoot;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class User {

    int id;
    String name;
    String tech;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tech='" + tech + '\'' +
                '}';
    }
}
