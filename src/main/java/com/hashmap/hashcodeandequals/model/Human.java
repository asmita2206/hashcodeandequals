package com.hashmap.hashcodeandequals.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Objects;

@Data
@AllArgsConstructor
public class Human {

    private int adharNumber;
    private String name;

   /* @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return adharNumber == human.adharNumber && Objects.equals(name, human.name);
    }
*/
    @Override
    public int hashCode() {
        return adharNumber;
    }
}
