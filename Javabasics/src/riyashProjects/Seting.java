package riyashProjects;

import java.util.HashMap;

public class Seting {
		public static void main (String[]args) {
				HashMap<String,String>movies =new HashMap<String,String>();
				movies.put("peaky blinders", "thoms shellbey");
				movies.put("jailer", "thalaivar");
				movies.put("jawan", "shrk");
				System.out.println(movies);
				System.out.println(movies.get("peaky blinders"));
				
				
		}
}
