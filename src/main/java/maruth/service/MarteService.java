package maruth.service;

import java.util.List;
import java.util.Map;

public interface MarteService {
	public void insert_ch(Map<String, Object> map) throws Exception;

	public void insert_we(Map<String, Object> map) throws Exception;

	public void insert_ev(Map<String, Object> map) throws Exception;

	public void insert_ch_gacha(Map<String, Object> map) throws Exception;

	public void insert_we_gacha(Map<String, Object> map) throws Exception;
	
	public void insert_not(Map<String, Object> map) throws Exception;

	public List<Map<String, Object>> select_all(Map<String, Object> map)throws Exception;

	public List<Map<String, Object>> select_we(Map<String, Object> map)throws Exception;
	
	public List<Map<String, Object>> select_ev(Map<String, Object> map)throws Exception;

	public List<Map<String, Object>> select_ch_gacha(Map<String, Object> map)throws Exception;

	public List<Map<String, Object>> select_we_gacha(Map<String, Object> map)throws Exception;
	
	public List<Map<String, Object>> select_not(Map<String, Object> map)throws Exception;

	
	public Map<String, Object> ev_detail(Map<String, Object> map)throws Exception;

	public Map<String, Object> ch_gacha_detail(Map<String, Object> map)throws Exception;

	public Map<String, Object> we_gacha_detail(Map<String, Object> map)throws Exception;
	
	public Map<String, Object> not_detail(Map<String, Object> map)throws Exception;

	
	public void ch_delete(Map<String, Object> map)throws Exception;

	public void we_delete(Map<String, Object> map)throws Exception;

	public void ev_delete(Map<String, Object> map)throws Exception;

	public void ch_gach_delete(Map<String, Object> map)throws Exception;

	public void we_gach_delete(Map<String, Object> map)throws Exception;

	public void ev_end_delete(Map<String, Object> map)throws Exception;

	public void we_end_delete(Map<String, Object> map)throws Exception;

	public void ch_end_delete(Map<String, Object> map)throws Exception;
	
	public void not_delete(Map<String, Object> map)throws Exception;


	
	public void ch_update(Map<String, Object> map)throws Exception;

	public void we_update(Map<String, Object> map)throws Exception;

	public void ev_update(Map<String, Object> map)throws Exception;

	public void ch_gach_update(Map<String, Object> map)throws Exception;
	
	public void we_gach_update(Map<String, Object> map)throws Exception;
	
	public void not_update(Map<String, Object> map)throws Exception;
	
	public List<Map<String, Object>> select_all_now(Map<String, Object> map)throws Exception
	;
	public List<Map<String, Object>> select_ev_now(Map<String, Object> map)throws Exception;
	
	public List<Map<String, Object>> select_ch_gacha_now(Map<String, Object> map)throws Exception;
	
	public List<Map<String, Object>> select_we_gacha_now(Map<String, Object> map)throws Exception;
	


	public List<Map<String, Object>> select_all_soon(Map<String, Object> map)throws Exception;
	
	public List<Map<String, Object>> select_ev_soon(Map<String, Object> map)throws Exception;
	
	public List<Map<String, Object>> select_ch_gacha_soon(Map<String, Object> map)throws Exception;
	
	public List<Map<String, Object>> select_we_gacha_soon(Map<String, Object> map)throws Exception;
	



}
