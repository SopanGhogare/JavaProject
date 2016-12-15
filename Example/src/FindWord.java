import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class FindWord  {

	private Integer id;
	private String name;
	
	public FindWord(Integer id,String name) {
		this.name=name;
		this.id=id;
	}
	
	
	
	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public static void main(String[] args) {
		
	Map<Integer,FindWord> 	map= new HashMap<Integer,FindWord>();
	FindWord f1= new FindWord(1, "Sopan");
	FindWord f2= new FindWord(1, "Sopan");
	
	map.put(f1.id, f1);
	f1.setName("ram");
	map.put(f1.id, f1);
	map.put(f1.id, f1);
	map.put(f2.id, f2);
	
	
	System.out.println(map.size());
	
	System.out.println(map.get(f1.id).getName() +" "+map.get(f2.id).getName());
		
	}
	
	@Override
	public boolean equals(Object o) { if (o == this) return true;
    if (!(o instanceof FindWord)) {
        return false;
    }

    FindWord user = (FindWord) o;

    return user.name.equals(name) &&
            user.id == id &&
            user.name.equals(name);}
}
