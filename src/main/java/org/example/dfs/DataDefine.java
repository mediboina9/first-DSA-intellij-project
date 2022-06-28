package org.example.dfs;

import org.example.BFS.BFSTravers;

import java.util.Arrays;

public class DataDefine {
    public DataDefine(){
        Vertex<Integer> v0=new Vertex<>(0);
        Vertex<Integer> v1=new Vertex<>(1);
        Vertex<Integer> v2=new Vertex<>(2);
        Vertex<Integer> v3=new Vertex<>(3);
        Vertex<Integer> v4=new Vertex<>(4);
        Vertex<Integer> v5=new Vertex<>(5);
        Vertex<Integer> v6=new Vertex<>(6);

        v0.setNeighbours(Arrays.asList(v1,v5,v6));
        v1.setNeighbours(Arrays.asList(v3,v5,v4));
        v4.setNeighbours(Arrays.asList(v2,v6));
        v6.setNeighbours(Arrays.asList(v0));
        System.out.println(" DFS order");
        DFSTravers<Integer> dfs=new DFSTravers<>();
        dfs.travers(v0);

        System.out.println(" BFS order");
        BFSTravers<Integer> bfsTravers=new BFSTravers<>();
        bfsTravers.travers(v0);
    }
}
