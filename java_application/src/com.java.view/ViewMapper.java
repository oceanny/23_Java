package com.java.view;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Set;

public class ViewMapper {
	
	private static ViewMapper instance = new ViewMapper();
	private ViewMapper() {}
	public static ViewMapper getInstance() {
		return instance;
	}
	
	private Map<String, View> mapper = new HashMap<String, View>();
	private final String path = "com/java/properties/view";
	{
//		ControllerMapper에서 Controller와 path를 변경하면 된다
		ResourceBundle rbHome = ResourceBundle.getBundle(path);
		Set<String> actionSetHome = rbHome.keySet(); // uri set
		Iterator<String> it = actionSetHome.iterator();

		while (it.hasNext()) {
			String url = it.next();
			String controllerType = rbHome.getString(url);
			try {
				Class<?> clazz = Class.forName(controllerType);
				View view = (View)clazz.getDeclaredConstructor().newInstance();
				mapper.put(url, view);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public View getView(String viewURL) {
		View view = mapper.get(viewURL);
		return view;
	}
}
