package com.java.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Set;

public class ControllerMapper {

	private static ControllerMapper instance = new ControllerMapper();

	private ControllerMapper() {
	}

	public static ControllerMapper getInstance() {
		return instance;
	}

	private Map<String, Controller> mapper = new HashMap<String, Controller>();
//	resource bundle 사용 -> 확장자 .properties 생략
	private final String path = "com/java/properties/controller";
	{
		ResourceBundle rbHome = ResourceBundle.getBundle(path);
		Set<String> actionSetHome = rbHome.keySet(); // uri set
		Iterator<String> it = actionSetHome.iterator();
		while(it.hasNext()) {
			String url = it.next();
			String controllerType = rbHome.getString(url);
			try {
			Class<?> clazz = Class.forName(controllerType);
			Controller cont = (Controller)clazz.getDeclaredConstructor().newInstance();
			mapper.put(url,cont);
			
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public Controller getController(String controllerURL) {
		return mapper.get(controllerURL);
	}
}
