package org.example.ICIMS_Interview;

import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Setter
@Getter
public class IcimsPrepairation {
    private int id;
    private String name;

    public IcimsPrepairation(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "IcimsPrepairation{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public IcimsPrepairation() {
        IcimsPrepairation obj=new IcimsPrepairation(1,"siva");
        IcimsPrepairation obj1=new IcimsPrepairation(2,"satya");
        IcimsPrepairation obj2=new IcimsPrepairation(2,"Narayana");
        ArrayList<IcimsPrepairation> icimsPrepairationArrayList=new ArrayList<>(){
            {
                add(obj);
                add(obj1);
                add(obj2);
            }
        };
        icimsPrepairationArrayList.forEach(System.out::println);
       /* icimsPrepairationArrayList.stream().filter(i->i.getId()==1).forEach(System.out::println);
        icimsPrepairationArrayList.stream().sorted(Comparator.comparingInt(IcimsPrepairation::getId).reversed()).forEach(System.out::println);
        icimsPrepairationArrayList.stream().sorted(Comparator.comparingInt(IcimsPrepairation::getId).reversed()).sorted(Comparator.comparing(IcimsPrepairation::getName)).forEach(System.out::println);*/
        HashMap<Integer,String> hashMap=new HashMap<>(){
            {
                put(obj.getId(), obj.getName());
                put(obj1.getId(),obj1.getName());
                put(obj2.getId(),obj2.getName());
            }
        };
       System.out.println(Arrays.asList(hashMap));
        Arrays.stream(hashMap.values().toArray()).sorted().forEach(System.out::println);
        hashMap.values().stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
        hashMap.keySet().stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
       // int max=Collections.max(hashMap.entrySet(), Comparator.comparing(hashMap::getValue()).getKey();

    }
}
