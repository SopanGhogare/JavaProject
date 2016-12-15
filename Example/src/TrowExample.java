public class TrowExample {
	String id="sopan";
public static void main(String[] args) {
	//throw new Exception("");
	TrowExample tw=new TrowExample();
	System.out.println(""+tw.hashCode());
	
}


@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	//result = prime * result + ((id == null) ? 0 : id.hashCode());
	result = id.hashCode();
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	TrowExample other = (TrowExample) obj;
	if (id == null) {
		if (other.id != null)
			return false;
	} else if (!id.equals(other.id))
		return false;
	return true;
}


}
