package maruth.dao;

import maruth.common.dao.abstractDAO;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository("MarteDAO")
public class MarteDAO extends abstractDAO{

	public void insert_ch(Map<String, Object> map) throws Exception{
		insert("Marte.insert_ch", map);
	}
	public void insert_we(Map<String, Object> map) throws Exception{
		insert("Marte.insert_we", map);
		
	}
	public void insert_ev(Map<String, Object> map) throws Exception{
		insert("Marte.insert_ev", map);
	
	}
	public void insert_ch_gacha(Map<String, Object> map) throws Exception{
		insert("Marte.insert_ch_gacha", map);
	
	}
	public void insert_we_gacha(Map<String, Object> map) throws Exception{
		insert("Marte.insert_we_gacha", map);
	
	}
	public void insert_not(Map<String, Object> map) throws Exception{
		insert("Marte.insert_not", map);
	
	}
	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> select_all(Map<String, Object> map)throws Exception{
		return (List<Map<String,Object>>)selectList("Marte.select_all", map);
	}
	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> select_we(Map<String, Object> map)throws Exception{
		return (List<Map<String,Object>>)selectList("Marte.select_we", map);
	}
	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> select_ev(Map<String, Object> map)throws Exception{
		return (List<Map<String,Object>>)selectList("Marte.select_ev", map);
	}
	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> select_ch_gacha(Map<String, Object> map)throws Exception{
		return (List<Map<String,Object>>)selectList("Marte.select_ch_gacha", map);
	}
	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> select_we_gacha(Map<String, Object> map)throws Exception{
		return (List<Map<String,Object>>)selectList("Marte.select_we_gacha", map);
	}
	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> select_not(Map<String, Object> map)throws Exception{
		return (List<Map<String,Object>>)selectList("Marte.select_not", map);
	}
	@SuppressWarnings("unchecked")
	public Map<String, Object> ev_detail(Map<String, Object> map)throws Exception{
		return (Map<String, Object>)selectOne("Marte.ev_detail", map);
	}
	@SuppressWarnings("unchecked")
	public Map<String, Object> ch_gacha_detail(Map<String, Object> map)throws Exception{
		return (Map<String, Object>)selectOne("Marte.ch_gacha_detail", map);
	}
	@SuppressWarnings("unchecked")
	public Map<String, Object> we_gacha_detail(Map<String, Object> map)throws Exception{
		return (Map<String, Object>)selectOne("Marte.we_gacha_detail", map);
	}
	@SuppressWarnings("unchecked")
	public Map<String, Object> not_detail(Map<String, Object> map)throws Exception{
		return (Map<String, Object>)selectOne("Marte.not_detail", map);
	}
	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> select_all_now(Map<String, Object> map)throws Exception{
		return (List<Map<String,Object>>)selectList("Marte.select_all_now", map);
	}
	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> select_ev_now(Map<String, Object> map)throws Exception{
		return (List<Map<String,Object>>)selectList("Marte.select_ev_now", map);
	}
	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> select_ch_gacha_now(Map<String, Object> map)throws Exception{
		return (List<Map<String,Object>>)selectList("Marte.select_ch_gacha_now", map);
	}
	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> select_we_gacha_now(Map<String, Object> map)throws Exception{
		return (List<Map<String,Object>>)selectList("Marte.select_we_gacha_now", map);
	}
	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> select_all_soon(Map<String, Object> map)throws Exception{
		return (List<Map<String,Object>>)selectList("Marte.select_all_soon", map);
	}
	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> select_ev_soon(Map<String, Object> map)throws Exception{
		return (List<Map<String,Object>>)selectList("Marte.select_ev_soon", map);
	}
	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> select_ch_gacha_soon(Map<String, Object> map)throws Exception{
		return (List<Map<String,Object>>)selectList("Marte.select_ch_gacha_soon", map);
	}
	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> select_we_gacha_soon(Map<String, Object> map)throws Exception{
		return (List<Map<String,Object>>)selectList("Marte.select_we_gacha_soon", map);
	}
	
	public void ch_delete(Map<String, Object> map)throws Exception{
		delete("Marte.ch_delete", map);
	}
	public void we_delete(Map<String, Object> map)throws Exception{
		delete("Marte.we_delete", map);
	}
	public void ev_delete(Map<String, Object> map)throws Exception{
		delete("Marte.ev_delete", map);
	}
	public void ch_gach_delete(Map<String, Object> map)throws Exception{
		delete("Marte.ch_gach_delete", map);
	}
	public void we_gach_delete(Map<String, Object> map)throws Exception{
		delete("Marte.we_gach_delete", map);
	}
	public void ev_end_delete(Map<String, Object> map)throws Exception{
		delete("Marte.ev_end_delete", map);
	}
	public void we_end_delete(Map<String, Object> map)throws Exception{
		delete("Marte.we_end_delete", map);
	}
	public void ch_end_delete(Map<String, Object> map)throws Exception{
		delete("Marte.ch_end_delete", map);
	}
	
	public void not_delete(Map<String, Object> map)throws Exception{
		delete("Marte.not_delete", map);
	}
	
	
	public void ch_update(Map<String, Object> map)throws Exception{
		update("Marte.ch_update", map);
	}
	public void we_update(Map<String, Object> map)throws Exception{
		update("Marte.we_update", map);
		
	}
	public void ev_update(Map<String, Object> map)throws Exception{
		update("Marte.ev_update", map);
	
}
	public void ch_gach_update(Map<String, Object> map)throws Exception{
		update("Marte.ch_gach_update", map);
	
}
	public void we_gach_update(Map<String, Object> map)throws Exception{
		update("Marte.we_gach_update", map);
	
}
	public void not_update(Map<String, Object> map)throws Exception{
		update("Marte.not_update", map);
	
}
}

