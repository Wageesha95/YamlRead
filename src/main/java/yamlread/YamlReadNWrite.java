package yamlread;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Map.Entry;

import org.yaml.snakeyaml.Yaml;

public class YamlReadNWrite {
	
	/*
	public static void main(String[] args) throws IOException {
	      Yaml yaml = new Yaml();
	      try (InputStream in = YamlReadNWrite .class.getResourceAsStream("/person.yml")) {
	          Object obj = yaml.load(in);
	          System.out.println("Loaded object type:" + obj.getClass());
	          System.out.println(obj);
	      }
	  }
	*/
	
	
	public static void main(String[] args) {
	Yaml yaml = new Yaml();
	InputStream inputStream = yaml.getClass().getClassLoader().getResourceAsStream("person.yaml");
	Map<String, Object> obj_1 = (Map<String, Object>) yaml.load(inputStream);
	//System.out.println(obj_1);
	
	InputStream inputStream_2 = yaml.getClass().getClassLoader().getResourceAsStream("person2.yaml");
	Map<String, Map<String, Object>> obj_2 = (Map<String, Map<String, Object>>) yaml.load(inputStream_2);
	
	for(Map.Entry m:obj_1.entrySet()) {
	System.out.println(m.getKey() + "   " + m.getValue());	
	}
	
	for(Map.Entry m:obj_2.entrySet() ) {
	System.out.println(m.getKey() + "   " + m.getValue());	
		}
	
	}
		
}


	
	
	 
	
	
	
	
	
