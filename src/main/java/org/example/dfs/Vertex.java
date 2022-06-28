package org.example.dfs;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Data
public class Vertex<T>{

    private final T data;
    private boolean visted;
    @ToString.Exclude
    private List<Vertex<T>> neighbours=new ArrayList<>();


}
