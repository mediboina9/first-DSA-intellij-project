package org.example.dfs;

import java.util.Currency;
import java.util.Deque;
import java.util.LinkedList;

public class DFSTravers<T> {
    public void travers(Vertex<T> startVertix){
        Deque<Vertex<T>> stack=new LinkedList<>();
        stack.push(startVertix);
        while (!stack.isEmpty()){
            Vertex<T> current = stack.pop();
            if(!current.isVisted()){
                current.setVisted(true);
                System.out.println(current);
                current.getNeighbours().forEach(stack::push);
            }
        }
    }

}
