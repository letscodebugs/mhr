package com.tyu.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

@Data
@NoArgsConstructor
public class Nation implements Serializable {
    private Integer id;

    private String name;

    public Nation(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nation nation = (Nation) o;
        return name.equals(nation.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
