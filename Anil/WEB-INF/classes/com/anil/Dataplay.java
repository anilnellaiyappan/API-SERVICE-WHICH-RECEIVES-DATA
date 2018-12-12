package com.anil;

import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Dataplay {

	@PostMapping("/app")
	public int app(@RequestBody JSONObject appdata) throws ParseException{
		String userid = (String)appdata.get("user_id");
		String app = (String)appdata.get("app");
		String timestamp = (String)appdata.get("timestamp");
		System.out.println(userid +" - "+ app +" - "+ timestamp);
		
		return 0; 	
	}
	
	@SuppressWarnings("unchecked")
	@GetMapping("/user")
	public JSONObject user() throws ParseException{
		JSONObject userobject = new JSONObject();
		userobject.put("user_id", "019mr8mf4r");
		userobject.put("app_launched", 21);
		userobject.put("most_active_day_last_7_days", "2018-10-29");
		userobject.put("number_of_days_active_last_7_days", 3);
		userobject.put("most_launched_app_last_7_days", "Airbnb");
		
		return userobject; 	
	}
}
