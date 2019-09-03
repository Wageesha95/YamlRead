package yamlread;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

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
	Map<String, Object> obj = (Map<String, Object>) yaml.load(inputStream);
	System.out.println(obj);

	}
}