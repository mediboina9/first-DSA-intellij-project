package org.example.BFS;

import org.example.dfs.Vertex;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class BFSTravers<T> {
    public void travers(Vertex<T> startVertix){
        Queue<Vertex<T>> queue=new LinkedList<>();
       // stack.push(startVertix);
        queue.add(startVertix);
        while (!queue.isEmpty()){
            Vertex<T> current = queue.remove();
            if(current.isVisted()){
                current.setVisted(false);
                System.out.println(current);
                current.getNeighbours().forEach(queue::add);
            }
        }
    }

}
