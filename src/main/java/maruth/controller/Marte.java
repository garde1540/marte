package maruth.controller;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import maruth.common.CommandMap;
import maruth.service.MarteService;

@Controller
public class Marte {
	
	@Resource(name = "MarteService")
	MarteService marteService;
	
	@RequestMapping(value = "/marte/main")
	public String main()throws Exception{
		return "marte/main";
	}
	@RequestMapping(value = "/main/calnder")
	@ResponseBody
	public List<Map<String, Object>> maincalnder(CommandMap commandMap)throws Exception{
		List<Map<String, Object>> list = marteService.select_all(commandMap.getMap());
		JSONObject jsonObject;
		JSONArray jsonArray = new JSONArray();
		HashMap<String, Object> hash = new HashMap<String, Object>();
		
		for(int i =0;i<list.size();i++) {
			hash.put("title", list.get(i).get("GACH_NAME"));
			hash.put("start", list.get(i).get("GACH_START"));
			hash.put("end", list.get(i).get("GACH_END"));
			hash.put("context", list.get(i).get("GACH_CONTEXT"));
			hash.put("backgroundColor", list.get(i).get("GACH_COLOR"));
			jsonObject = new JSONObject();
			jsonObject.putAll(hash);
			jsonArray.add(jsonObject);
		}
		return jsonArray;
	}
	
	@RequestMapping(value = "/main/page")
	@ResponseBody
	public  List<Map<String, Object>> mainpage(CommandMap commandMap)throws Exception{
		List<Map<String, Object>> list = marteService.select_all_soon(commandMap.getMap());
		JSONObject jsonObject;
		JSONArray jsonArray = new JSONArray();
		HashMap<String, Object> hash = new HashMap<String, Object>();
		for(int i =0;i<list.size();i++) {
			hash = new HashMap<String, Object>(list.get(i));
			jsonObject = new JSONObject();
			jsonObject.putAll(hash);
			jsonArray.add(jsonObject);
		}
		return jsonArray;
	}
	@RequestMapping(value = "/main/nowpage")
	@ResponseBody
	public  List<Map<String, Object>> mainnowpage(CommandMap commandMap)throws Exception{
		List<Map<String, Object>> list = marteService.select_all_now(commandMap.getMap());
		JSONObject jsonObject;
		JSONArray jsonArray = new JSONArray();
		HashMap<String, Object> hash = new HashMap<String, Object>();
		for(int i =0;i<list.size();i++) {
			hash = new HashMap<String, Object>(list.get(i));
			jsonObject = new JSONObject();
			jsonObject.putAll(hash);
			jsonArray.add(jsonObject);
		}
		return jsonArray;
	}
	
	@RequestMapping(value = "/marte/event")
	public String event()throws Exception{
		return "marte/event";
	}
	@RequestMapping(value = "/event/calnder")
	@ResponseBody
	public List<Map<String, Object>> eventcalnder(CommandMap commandMap)throws Exception{
		List<Map<String, Object>> list = marteService.select_ev(commandMap.getMap());
		JSONObject jsonObject;
		JSONArray jsonArray = new JSONArray();
		HashMap<String, Object> hash = new HashMap<String, Object>();
		for(int i =0;i<list.size();i++) {
			hash.put("title", list.get(i).get("GACH_NAME"));
			hash.put("start", list.get(i).get("GACH_START"));
			hash.put("end", list.get(i).get("GACH_END"));
			hash.put("context", list.get(i).get("GACH_CONTEXT"));
			hash.put("backgroundColor", list.get(i).get("GACH_COLOR"));
			jsonObject = new JSONObject();
			jsonObject.putAll(hash);
			jsonArray.add(jsonObject);
		}
		return jsonArray;
	}
	@RequestMapping(value = "/event/page")
	@ResponseBody
	public  List<Map<String, Object>> eventpage(CommandMap commandMap)throws Exception{
		List<Map<String, Object>> list = marteService.select_ev_soon(commandMap.getMap());
		JSONObject jsonObject;
		JSONArray jsonArray = new JSONArray();
		HashMap<String, Object> hash = new HashMap<String, Object>();
		for(int i =0;i<list.size();i++) {
			hash = new HashMap<String, Object>(list.get(i));
			jsonObject = new JSONObject();
			jsonObject.putAll(hash);
			jsonArray.add(jsonObject);
		}
		return jsonArray;
	}
	@RequestMapping(value = "/event/nowpage")
	@ResponseBody
	public  List<Map<String, Object>> eventnowpage(CommandMap commandMap)throws Exception{
		List<Map<String, Object>> list = marteService.select_ev_now(commandMap.getMap());
		JSONObject jsonObject;
		JSONArray jsonArray = new JSONArray();
		HashMap<String, Object> hash = new HashMap<String, Object>();
		for(int i =0;i<list.size();i++) {
			hash = new HashMap<String, Object>(list.get(i));
			jsonObject = new JSONObject();
			jsonObject.putAll(hash);
			jsonArray.add(jsonObject);
		}
		return jsonArray;
	}
	
	
	@RequestMapping(value = "/write/event")
	public String insertevent()throws Exception{
		return "marte/main";
	}
	@RequestMapping(value = "/update/event")
	public String updateevent()throws Exception{
		return "marte/main";
	}
	@RequestMapping(value = "/delete/event")
	public String deleteevent()throws Exception{
		return "marte/main";
	}
	@RequestMapping(value = "/detail/notification")
	public String detailnot()throws Exception{
		return "marte/detail";
	}
	@RequestMapping(value = "/notification/content")
	@ResponseBody
	public  Map<String, Object> notificationconent(CommandMap commandMap)throws Exception{
		Map<String, Object> list = marteService.not_detail(commandMap.getMap());
		JSONObject jsonObject;
		HashMap<String, Object> hash = new HashMap<String, Object>(list);
			jsonObject = new JSONObject();
			jsonObject.putAll(hash);
		return jsonObject;
	}
	@RequestMapping(value = "/detail/characters")
	public String detailch()throws Exception{
		return "marte/detail";
	}
	@RequestMapping(value = "/characters/content")
	@ResponseBody
	public  Map<String, Object> charactersconent(CommandMap commandMap)throws Exception{
		Map<String, Object> list = marteService.ch_gacha_detail(commandMap.getMap());
		JSONObject jsonObject;
		HashMap<String, Object> hash = new HashMap<String, Object>(list);
			jsonObject = new JSONObject();
			jsonObject.putAll(hash);
		return jsonObject;
	}
	@RequestMapping(value = "/detail/weapon")
	public String detailwe()throws Exception{
		return "marte/detail";
	}
	@RequestMapping(value = "/weapon/content")
	@ResponseBody
	public Map<String, Object> weaponconent(CommandMap commandMap)throws Exception{
		Map<String, Object> list = marteService.we_gacha_detail(commandMap.getMap());
		JSONObject jsonObject;
		JSONArray jsonArray = new JSONArray();
		HashMap<String, Object> hash = new HashMap<String, Object>(list);
			jsonObject = new JSONObject();
			jsonObject.putAll(hash);

		return jsonObject;
	}
	@RequestMapping(value = "/detail/event")
	public String detailevent()throws Exception{
		return "marte/detail";
	}
	@RequestMapping(value = "/event/content")
	@ResponseBody
	public  Map<String, Object> eventconent(CommandMap commandMap)throws Exception{
		Map<String, Object> list = marteService.ev_detail(commandMap.getMap());
		JSONObject jsonObject;
		HashMap<String, Object> hash = new HashMap<String, Object>(list);
			jsonObject = new JSONObject();
			jsonObject.putAll(hash);
		return jsonObject;
	}
	@RequestMapping(value = "/marte/weapon")
	public String weapon()throws Exception{
		return "marte/weapon";
	}
	@RequestMapping(value = "/weapon/calnder")
	@ResponseBody
	public  List<Map<String, Object>> weaponcalnder(CommandMap commandMap)throws Exception{
		List<Map<String, Object>> list = marteService.select_we_gacha(commandMap.getMap());
		JSONObject jsonObject;
		JSONArray jsonArray = new JSONArray();
		HashMap<String, Object> hash = new HashMap<String, Object>();
		for(int i =0;i<list.size();i++) {
			hash.put("title", list.get(i).get("GACH_NAME"));
			hash.put("start", list.get(i).get("GACH_START"));
			hash.put("end", list.get(i).get("GACH_END"));
			hash.put("context", list.get(i).get("GACH_CONTEXT"));
			hash.put("backgroundColor", list.get(i).get("GACH_COLOR"));
			jsonObject = new JSONObject();
			jsonObject.putAll(hash);
			jsonArray.add(jsonObject);
		}
		return jsonArray;
	}
	
	@RequestMapping(value = "/weapon/page")
	@ResponseBody
	public  List<Map<String, Object>> weaponpage(CommandMap commandMap)throws Exception{
		List<Map<String, Object>> list = marteService.select_we_gacha_soon(commandMap.getMap());
		JSONObject jsonObject;
		JSONArray jsonArray = new JSONArray();
		HashMap<String, Object> hash = new HashMap<String, Object>();
		for(int i =0;i<list.size();i++) {
			hash = new HashMap<String, Object>(list.get(i));
			jsonObject = new JSONObject();
			jsonObject.putAll(hash);
			jsonArray.add(jsonObject);
		}
		return jsonArray;
	}
	@RequestMapping(value = "/weapon/nowpage")
	@ResponseBody
	public  List<Map<String, Object>> weaponnowpage(CommandMap commandMap)throws Exception{
		List<Map<String, Object>> list = marteService.select_we_gacha_now(commandMap.getMap());
		JSONObject jsonObject;
		JSONArray jsonArray = new JSONArray();
		HashMap<String, Object> hash = new HashMap<String, Object>();
		for(int i =0;i<list.size();i++) {
			hash = new HashMap<String, Object>(list.get(i));
			jsonObject = new JSONObject();
			jsonObject.putAll(hash);
			jsonArray.add(jsonObject);
		}
		return jsonArray;
	}
	@RequestMapping(value = "/write/weapon")
	public String insertweapon()throws Exception{
		return "marte/main";
	}
	@RequestMapping(value = "/update/weapon")
	public String updateweapon()throws Exception{
		return "marte/main";
	}
	@RequestMapping(value = "/delete/weapon")
	public String deleteweapon()throws Exception{
		return "marte/main";
	}
	@RequestMapping(value = "/marte/characters")
	public String characters()throws Exception{
		return "marte/characters";
	}
	@RequestMapping(value = "/characters/calnder")
	@ResponseBody
	public List<Map<String, Object>> characterscalnder(CommandMap commandMap)throws Exception{
		List<Map<String, Object>> list = marteService.select_ch_gacha(commandMap.getMap());
		JSONObject jsonObject;
		JSONArray jsonArray = new JSONArray();
		HashMap<String, Object> hash = new HashMap<String, Object>();
		for(int i =0;i<list.size();i++) {
			hash.put("title", list.get(i).get("GACH_NAME"));
			hash.put("start", list.get(i).get("GACH_START"));
			hash.put("end", list.get(i).get("GACH_END"));
			hash.put("context", list.get(i).get("GACH_CONTEXT"));
			hash.put("backgroundColor", list.get(i).get("GACH_COLOR"));
			jsonObject = new JSONObject();
			jsonObject.putAll(hash);
			jsonArray.add(jsonObject);
		}
		return jsonArray;
	}
	@RequestMapping(value = "/characters/page")
	@ResponseBody
	public List<Map<String, Object>> characterspage(CommandMap commandMap)throws Exception{
		List<Map<String, Object>> list = marteService.select_ch_gacha_soon(commandMap.getMap());
		JSONObject jsonObject;
		JSONArray jsonArray = new JSONArray();
		HashMap<String, Object> hash = new HashMap<String, Object>();
		for(int i =0;i<list.size();i++) {
			hash = new HashMap<String, Object>(list.get(i));
			jsonObject = new JSONObject();
			jsonObject.putAll(hash);
			jsonArray.add(jsonObject);
		}
		return jsonArray;
	}
	@RequestMapping(value = "/characters/nowpage")
	@ResponseBody
	public List<Map<String, Object>> charactersnowpage(CommandMap commandMap)throws Exception{
		List<Map<String, Object>> list = marteService.select_ch_gacha_now(commandMap.getMap());
		JSONObject jsonObject;
		JSONArray jsonArray = new JSONArray();
		HashMap<String, Object> hash = new HashMap<String, Object>();
		for(int i =0;i<list.size();i++) {
			hash = new HashMap<String, Object>(list.get(i));
			jsonObject = new JSONObject();
			jsonObject.putAll(hash);
			jsonArray.add(jsonObject);
		}
		return jsonArray;
	}
	@RequestMapping(value = "/write/characters")
	public String insertcharacters()throws Exception{
		return "marte/main";
	}
	@RequestMapping(value = "/update/characters")
	public String updatecharacters()throws Exception{
		return "marte/main";
	}
	@RequestMapping(value = "/delete/characters")
	public String deletecharacters()throws Exception{
		return "marte/main";
	}
	
	@RequestMapping(value = "/marte/notification")
	public String notification()throws Exception{
		return "marte/notification";
	}
	@RequestMapping(value = "/notification/page")
	@ResponseBody
	public List<Map<String, Object>> notificationpage(CommandMap commandMap)throws Exception{
		List<Map<String, Object>> list = marteService.select_not(commandMap.getMap());
		JSONObject jsonObject;
		JSONArray jsonArray = new JSONArray();
		HashMap<String, Object> hash = new HashMap<String, Object>();
		for(int i =0;i<list.size();i++) {
			hash = new HashMap<String, Object>(list.get(i));
			jsonObject = new JSONObject();
			jsonObject.putAll(hash);
			jsonArray.add(jsonObject);
		}
		return jsonArray;
	}
	@RequestMapping(value = "/update/notification")
	public String notificationupdate()throws Exception{
		return "marte/main";
	}
	@RequestMapping(value = "/delete/notification")
	public String notificationdelete()throws Exception{
		return "marte/main";
	}
	@RequestMapping(value = "/write/notification")
	public String notificationwrite()throws Exception{
		return "marte/main";
	}
	
	@RequestMapping(value = "/marte/admin")
	public String admin()throws Exception{
		return "marte/main";
	}
	
	@RequestMapping(value = "/indate/admin")
	public String insertdate()throws Exception{
		return "marte/main";
	}
	
	@RequestMapping(value = "/incalendar/admin")
	public String insertcalendar()throws Exception{
		return "marte/main";
	}
	
	

}