import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;

public class UC15 {
	public void fileWriteJson(Map<String, Object> map, List<String> name) {
		List<String> data=new ArrayList<String>();
		for(int i=0;i<map.size();i++) {
			data.add((String) map.get(name.get(i)));
		}
		
		System.out.println(data);
		
		Gson gson = new Gson();
		FileWriter fileWriter = new FileWriter("data.json", true);
		fileWriter.write(gson.toJson());
		fileWriter.close();

	}
}
