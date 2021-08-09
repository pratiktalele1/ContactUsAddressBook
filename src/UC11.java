import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UC11 {
	List<String> list=new ArrayList<String>();
	public void sortByPersonName(Map<String,Object> map,List<String> name) {
		for(int i=0;i<map.size();i++) {
			list.add((String) map.get(name.get(i)));
		}
		
		System.out.println(list);
	}
	
}
