package yamlread;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.yaml.snakeyaml.Yaml;



public class YamlReadNWrite {


	private static Yaml yaml;

	public static void main(String[] args) {
		yaml = new Yaml();
		InputStream inputStream = yaml.getClass().getClassLoader().getResourceAsStream("master.yaml");
		Map<String, Object> obj_1 = (Map<String, Object>) yaml.load(inputStream);
	
		


		InputStream input2 = yaml.getClass().getClassLoader().getResourceAsStream("Second.yaml");
		Map<String, Object> obj_2 = (Map<String, Object>) yaml.load(input2);

		for (Map.Entry n : obj_2.entrySet()) {
			obj_1.replace((String) n.getKey(), n.getValue());

		}
		System.out.println(obj_1);

	}
}