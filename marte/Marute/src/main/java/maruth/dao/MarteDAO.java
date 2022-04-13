package maruth.dao;

import maruth.common.dao.abstractDAO;

import java.util.List;
import java.util.Map;import org.springframework.expression.spel.ast.OperatorBetween;
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
		update("Marte.we_obj", map);
		update("Marte.ch_obj", map);
	
	}
	public void insert_ch_gacha(Map<String, Object> map) throws Exception{
		insert("Marte.insert_ch_gacha", map);
		update("Marte.ch_obj", map);
	
	}
	public void insert_we_gacha(Map<String, Object> map) throws Exception{
		insert("Marte.insert_we_gacha", map);
		update("Marte.we_obj", map);
	}
	
	
	public void insert_not(Map<String, Object> map) throws Exception{
		insert("Marte.insert_not", map);
	}
	public void insert_ch_obj(Map<String, Object> map) throws Exception{
		insert("Marte.insert_ch_obj", map);
	}
	public void insert_we_obj(Map<String, Object> map) throws Exception{
		insert("Marte.insert_we_obj", map);
	}
	
	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> CHimg(Map<String, Object> map)throws Exception{
		return (List<Map<String,Object>>)selectList("Marte.CHimg", map);
	}
	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> weimg(Map<String, Object> map)throws Exception{
		return (List<Map<String,Object>>)selectList("Marte.weimg", map);
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
	public Map<String, Object> all_detail(Map<String, Object> map)throws Exception{
		return (Map<String, Object>)selectOne("Marte.all_detail", map);
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
	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> select_ch(Map<String, Object> map)throws Exception{
		return (List<Map<String,Object>>)selectList("Marte.select_ch", map);
	}
	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> select_ch_obj(Map<String, Object> map)throws Exception{
		return (List<Map<String,Object>>)selectList("Marte.select_ch_obj", map);
	}
	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> select_we_obj(Map<String, Object> map)throws Exception{
		return (List<Map<String,Object>>)selectList("Marte.select_we_obj", map);
	}

	public int CH_GACHA_SEQ(Map<String, Object> map)throws Exception{
		return selectint("Marte.CH_GACHA_SEQ");
	}
	public int WE_GACHA_SEQ(Map<String, Object> map)throws Exception{
		return selectint("Marte.WE_GACHA_SEQ");
	}
	public int EV_SEQ(Map<String, Object> map)throws Exception{
		return selectint("Marte.EV_SEQ");
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
	public int login(Map<String, Object> map)throws Exception{
		return (int)selectOne("Marte.login", map);
	}
	public void we_con_delete()throws Exception{
		delete("Marte.we_con_delete");
	}
	public void ch_con_delete()throws Exception{
		delete("Marte.ch_con_delete");
	}
	public void we_obj_delete(Map<String, Object> map)throws Exception{
		delete("Marte.we_obj_delete", map);
	}
	public void ch_obj_delete(Map<String, Object> map)throws Exception{
		delete("Marte.ch_obj_delete", map);
	}
}

