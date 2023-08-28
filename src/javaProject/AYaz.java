package javaProject;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class AYaz {

	public static void main(String[] args) throws IOException {
		Properties pop = new Properties();
		pop.put("username", "ayaz@123");
		pop.put("userPass", "ayaz1234");
		pop.put("userAdress", "sakinaka");
		pop.put("secondUser", "sameer@123");
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir") + "/" + "siddiqui.properties");
		pop.store(file, "siddiqui");
		System.out.println(pop.get("secondUser"));

	}
}
