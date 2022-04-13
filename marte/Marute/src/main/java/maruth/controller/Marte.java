package maruth.controller;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.sql.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import maruth.common.CommandMap;
import maruth.common.util.CHFileupload;
import maruth.service.MarteService;

@Controller
public class Marte {
	
	@Resource(name="CHFileupload")
	CHFileupload chFileupload;
	
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
			hash.put("GACH_NO", list.get(i).get("GACH_NO"));
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
			hash.put("GACH_NO", list.get(i).get("GACH_NO"));
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
	@RequestMapping(value = "/detail/content")
	@ResponseBody
	public  Map<String, Object> charactersconent(CommandMap commandMap)throws Exception{
		Map<String, Object> list = marteService.all_detail(commandMap.getMap());
		List<Map<String, Object>> rlist = marteService.CHimg(commandMap.getMap());
		List<Map<String, Object>> slist = marteService.weimg(commandMap.getMap());
		JSONObject jsonObject;
		HashMap<String, Object> hash = new HashMap<String, Object>(list);
		if(rlist.size()>0) {
		hash.put("list", rlist);}else 
			if(slist.size()>0) {
		hash.put("list", slist);}
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
			hash.put("GACH_NO", list.get(i).get("GACH_NO"));
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
			hash.put("GACH_NO", list.get(i).get("GACH_NO"));
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
	
	
	@RequestMapping(value = "/marte/notification")
	public String notification()throws Exception{
		return "marte/notification";
	}
	@RequestMapping(value = "/detail/notification")
	public ModelAndView notdetail(CommandMap commandMap)throws Exception{
		ModelAndView mav = new ModelAndView("marte/notdetail");
		Map<String,Object> map = marteService.not_detail(commandMap.getMap());
		mav.addAllObjects(map);
		return mav;
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
	
	@RequestMapping(value = "/marte/login")
	public String login(CommandMap map,HttpSession session)throws Exception{
		int check = marteService.login(map.getMap());
		if(check>0) {
			session.setAttribute("admin", map.getMap());
			return "redirect:/admin/notification";
		}else {
			return "redirect:/marte/main";
		}
		
	}
	@RequestMapping(value = "/admin/logout")
	public String loguot(CommandMap map,HttpSession session)throws Exception{
			session.invalidate();
			return "redirect:/marte/main";
		
	}
	@RequestMapping(value = "/admin/notification")
	public String wrtienotion(CommandMap map)throws Exception{
		return "marte/admin";
	}
	@RequestMapping(value = "/notification/write")
	@ResponseBody
	public void notionwrite(CommandMap map)throws Exception{
	marteService.insert_not(map.getMap());
	}
	
	@RequestMapping(value = "/admin/characters")
	public String adminCH()throws Exception{
		return "marte/characters_insert";
	}
	@RequestMapping(value = "/characters/insert")
	@ResponseBody
	public void insertCH(CommandMap map,HttpServletRequest request)throws Exception{
		marteService.insert_ch(map.getMap(),request);
	}
	@RequestMapping(value = "/admin/weapon")
	public String adminWE()throws Exception{
		return "marte/characters_insert";
	}
	@RequestMapping(value = "/weapon/insert")
	@ResponseBody
	public void insertWE(CommandMap map,HttpServletRequest request)throws Exception{
		marteService.insert_we(map.getMap(),request);
	}
	
	@RequestMapping(value = "/admin/cal_weapon" ,method = RequestMethod.GET)
	public String calweapon(CommandMap map)throws Exception{
		marteService.we_con_delete();
		return "marte/Cal_add";
	}
	@RequestMapping(value = "/admin/cal_characters",method = RequestMethod.GET)
	public String calcharacters(CommandMap map)throws Exception{
		marteService.ch_con_delete();
		return "marte/Cal_add";
	}
	@RequestMapping(value = "/admin/cal_event",method = RequestMethod.GET)
	public String calevent(CommandMap map)throws Exception{
		marteService.we_con_delete();
		marteService.ch_con_delete();
		return "marte/Cal_add";
	}
	
	@RequestMapping(value = "/admin/cal_weapon" ,method = RequestMethod.POST)
	public String insertcalweapon(CommandMap map,HttpServletRequest request)throws Exception{
		map.put("GACH_COLOR", "GREEN");
		String str = map.get("GACH_CONTEXT").toString();
		map.put("GACH_CONTEXT", str.substring(3, str.length()-4));
		marteService.insert_we_gacha(map.getMap(), request);
		return "marte/Cal_add";
	}
	@RequestMapping(value = "/admin/cal_characters",method = RequestMethod.POST)
	public String insertcalcharacters(CommandMap map,HttpServletRequest request)throws Exception{
		map.put("GACH_COLOR", "RED");
		String str = map.get("GACH_CONTEXT").toString();
		map.put("GACH_CONTEXT", str.substring(3, str.length()-4));
		marteService.insert_ch_gacha(map.getMap(), request);
		return "marte/Cal_add";
	}
	@RequestMapping(value = "/admin/cal_event",method = RequestMethod.POST)
	public String insertcalevent(CommandMap map,HttpServletRequest request)throws Exception{
		map.put("GACH_COLOR", "BLUE");
		String str = map.get("GACH_CONTEXT").toString();
		map.put("GACH_CONTEXT", str.substring(3, str.length()-4));
		marteService.insert_ev(map.getMap(), request);
		return "marte/Cal_add";
	}
	@RequestMapping(value = "/characters/obj")
	@ResponseBody
	public List<Map<String, Object>> CHOBJ(CommandMap map,HttpServletRequest request)throws Exception{
		List<Map<String, Object>> list = marteService.select_ch(map.getMap());
		JSONObject jsonObject;
		JSONArray jsonArray = new JSONArray();
		HashMap<String, Object> hash = new HashMap<String, Object>();
		for(int i =0;i<list.size();i++) {
			hash = new HashMap<String, Object>();
			hash.put("NO", list.get(i).get("CH_NO"));
			hash.put("NAME", list.get(i).get("CH_NAME"));
			hash.put("SO", list.get(i).get("CH_SO"));
			hash.put("STAR", list.get(i).get("CH_STAR"));
			hash.put("IMG", list.get(i).get("CH_IMG"));
			jsonObject = new JSONObject();
			jsonObject.putAll(hash);
			jsonArray.add(jsonObject);
		}
		return jsonArray;
	}
	@RequestMapping(value = "/weapon/obj")
	@ResponseBody
	public List<Map<String, Object>> WEOBJ(CommandMap map,HttpServletRequest request)throws Exception{
		List<Map<String, Object>> list = marteService.select_we(map.getMap());
		JSONObject jsonObject;
		JSONArray jsonArray = new JSONArray();
		HashMap<String, Object> hash = new HashMap<String, Object>();
		for(int i =0;i<list.size();i++) {
			hash = new HashMap<String, Object>();
			hash.put("NO", list.get(i).get("WE_NO"));
			hash.put("NAME", list.get(i).get("WE_NAME"));
			hash.put("SO", list.get(i).get("WE_SO"));
			hash.put("STAR", list.get(i).get("WE_STAR"));
			hash.put("IMG", list.get(i).get("WE_IMG"));
			jsonObject = new JSONObject();
			jsonObject.putAll(hash);
			jsonArray.add(jsonObject);
		}
		return jsonArray;
	}
	
	@RequestMapping(value = "/characters/addobj")
	@ResponseBody
	public List<Map<String, Object>> CHABBOBJ(CommandMap map,HttpServletRequest request)throws Exception{
		marteService.insert_ch_obj(map.getMap());
		List<Map<String, Object>> list = marteService.select_ch_obj(map.getMap());
		JSONObject jsonObject;
		JSONArray jsonArray = new JSONArray();
		HashMap<String, Object> hash = new HashMap<String, Object>();
		for(int i =0;i<list.size();i++) {
			hash = new HashMap<String, Object>();
			hash.put("NO", list.get(i).get("CH_NO"));;
			hash.put("IMG", list.get(i).get("CH_IMG"));
			jsonObject = new JSONObject();
			jsonObject.putAll(hash);
			jsonArray.add(jsonObject);
		}
		return jsonArray;
	}
	@RequestMapping(value = "/weapon/addobj")
	@ResponseBody
	public List<Map<String, Object>> WEABBOBJ(CommandMap map,HttpServletRequest request)throws Exception{
		marteService.insert_we_obj(map.getMap());
		List<Map<String, Object>> list = marteService.select_we_obj(map.getMap());
		JSONObject jsonObject;
		JSONArray jsonArray = new JSONArray();
		HashMap<String, Object> hash = new HashMap<String, Object>();
		for(int i =0;i<list.size();i++) {
			hash = new HashMap<String, Object>();
			hash.put("NO", list.get(i).get("WE_NO"));
			hash.put("IMG", list.get(i).get("WE_IMG"));
			jsonObject = new JSONObject();
			jsonObject.putAll(hash);
			jsonArray.add(jsonObject);
		}
		return jsonArray;
	}
	
	@RequestMapping(value = "/characters/delobj")
	@ResponseBody
	public List<Map<String, Object>> CHdelOBJ(CommandMap map,HttpServletRequest request)throws Exception{
		marteService.ch_obj_delete(map.getMap());
		List<Map<String, Object>> list = marteService.select_ch_obj(map.getMap());
		JSONObject jsonObject;
		JSONArray jsonArray = new JSONArray();
		HashMap<String, Object> hash = new HashMap<String, Object>();
		for(int i =0;i<list.size();i++) {
			hash = new HashMap<String, Object>();
			hash.put("NO", list.get(i).get("CH_NO"));
			hash.put("NAME", list.get(i).get("CH_NAME"));
			hash.put("SO", list.get(i).get("CH_SO"));
			hash.put("STAR", list.get(i).get("CH_STAR"));
			hash.put("IMG", list.get(i).get("CH_IMG"));
			jsonObject = new JSONObject();
			jsonObject.putAll(hash);
			jsonArray.add(jsonObject);
		}
		return jsonArray;
	}
	@RequestMapping(value = "/weapon/delobj")
	@ResponseBody
	public List<Map<String, Object>> WEdelOBJ(CommandMap map,HttpServletRequest request)throws Exception{
		marteService.we_obj_delete(map.getMap());
		List<Map<String, Object>> list = marteService.select_we_obj(map.getMap());
		JSONObject jsonObject;
		JSONArray jsonArray = new JSONArray();
		HashMap<String, Object> hash = new HashMap<String, Object>();
		for(int i =0;i<list.size();i++) {
			hash = new HashMap<String, Object>();
			hash.put("NO", list.get(i).get("WE_NO"));
			hash.put("NAME", list.get(i).get("WE_NAME"));
			hash.put("SO", list.get(i).get("WE_SO"));
			hash.put("STAR", list.get(i).get("WE_STAR"));
			hash.put("IMG", list.get(i).get("WE_IMG"));
			jsonObject = new JSONObject();
			jsonObject.putAll(hash);
			jsonArray.add(jsonObject);
		}
		return jsonArray;
	}
	
	

}