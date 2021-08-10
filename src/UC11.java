import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UC11 {
	public void sortByPersonName(Map<String, Object> map, List<String> name) {
		List<List> storeList = new ArrayList<List>();

		for (int i = 0; i < map.size(); i++) {
			List<String> list = new ArrayList<String>();
			list.addAll(((List<String>) map.get(name.get(i))));
			storeList.add(list);
		}
		
		System.out.println(storeList);
		List sortData=storeList.stream().map(data->data.get(0)).sorted().collect(Collectors.toList());
		System.out.println(sortData);
		
	}

}
