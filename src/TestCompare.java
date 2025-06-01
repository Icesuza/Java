import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

@AllArgsConstructor
@Data
class People implements Comparable<People>{
    private Integer id;
    private String name;
    @Override
    public int compareTo(People o) {
        return this.id.compareTo(o.id);
    }
}
@AllArgsConstructor
@Data
class House{
    private Integer id;
    private String houseName;
}

public class TestCompare {
    public static void main(String[] args){
        Comparator<People>sorter = Comparator.comparing(e->e.getName());
        Map<People, House> personHouseMap = new TreeMap<>(Comparator.comparingInt((People p)->p.getId()).reversed());
        personHouseMap.put(new People(1,"JK"),new House(2,"Korea"));
        personHouseMap.put(new People(2,"Otaka"),new House(2, "Japan"));
        System.out.println(personHouseMap);
    }
}
