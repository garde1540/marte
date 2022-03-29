package maruth.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import maruth.dao.MarteDAO;

@Service("MarteService")
public class MarteServiceImpl implements MarteService {
	@Resource(name = "MarteDAO")
	MarteDAO marteDAO;

	@Override
	public void insert_ch(Map<String, Object> map) throws Exception {
		marteDAO.insert_ch(map);
		
	}

	@Override
	public void insert_we(Map<String, Object> map) throws Exception {
		marteDAO.insert_we(map);
		
	}

	@Override
	public void insert_ev(Map<String, Object> map) throws Exception {
		marteDAO.insert_ev(map);
		
	}

	@Override
	public void insert_ch_gacha(Map<String, Object> map) throws Exception {
		marteDAO.insert_ch_gacha(map);
		
	}

	@Override
	public void insert_we_gacha(Map<String, Object> map) throws Exception {
		marteDAO.insert_we_gacha(map);
		
	}

	@Override
	public List<Map<String, Object>> select_all(Map<String, Object> map) throws Exception {
		return marteDAO.select_all(map);
	}

	@Override
	public List<Map<String, Object>> select_we(Map<String, Object> map) throws Exception {
		return marteDAO.select_we(map);
	}

	@Override
	public List<Map<String, Object>> select_ev(Map<String, Object> map) throws Exception {
		return marteDAO.select_ev(map);
	}

	@Override
	public List<Map<String, Object>> select_ch_gacha(Map<String, Object> map) throws Exception {
		return marteDAO.select_ch_gacha(map);
	}

	@Override
	public List<Map<String, Object>> select_we_gacha(Map<String, Object> map) throws Exception {
		return marteDAO.select_we_gacha(map);
	}

	@Override
	public Map<String, Object> ev_detail(Map<String, Object> map) throws Exception {
		return marteDAO.ev_detail(map);
	}

	@Override
	public Map<String, Object> ch_gacha_detail(Map<String, Object> map) throws Exception {
		return marteDAO.ch_gacha_detail(map);
	}

	@Override
	public Map<String, Object> we_gacha_detail(Map<String, Object> map) throws Exception {
		return marteDAO.we_gacha_detail(map);
	}

	@Override
	public void ch_delete(Map<String, Object> map) throws Exception {
		marteDAO.ch_delete(map);
		
	}

	@Override
	public void we_delete(Map<String, Object> map) throws Exception {
		marteDAO.we_delete(map);
		
	}

	@Override
	public void ev_delete(Map<String, Object> map) throws Exception {
		marteDAO.ev_delete(map);
		
	}

	@Override
	public void ch_gach_delete(Map<String, Object> map) throws Exception {
		marteDAO.ch_gach_delete(map);
		
	}

	@Override
	public void we_gach_delete(Map<String, Object> map) throws Exception {
		marteDAO.we_gach_delete(map);
		
	}

	@Override
	public void ev_end_delete(Map<String, Object> map) throws Exception {
		marteDAO.ev_end_delete(map);
		
	}

	@Override
	public void we_end_delete(Map<String, Object> map) throws Exception {
		marteDAO.we_end_delete(map);
		
	}

	@Override
	public void ch_end_delete(Map<String, Object> map) throws Exception {
		marteDAO.ch_end_delete(map);
		
	}

	@Override
	public void ch_update(Map<String, Object> map) throws Exception {
		marteDAO.ch_update(map);
		
	}

	@Override
	public void we_update(Map<String, Object> map) throws Exception {
		marteDAO.we_update(map);
		
	}

	@Override
	public void ev_update(Map<String, Object> map) throws Exception {
		marteDAO.ev_update(map);
		
	}

	@Override
	public void ch_gach_update(Map<String, Object> map) throws Exception {
		marteDAO.ch_gach_update(map);
		
	}

	@Override
	public void we_gach_update(Map<String, Object> map) throws Exception {
		marteDAO.we_gach_update(map);
		
	}

	@Override
	public void insert_not(Map<String, Object> map) throws Exception {
		marteDAO.insert_ch(map);		
	}

	@Override
	public List<Map<String, Object>> select_not(Map<String, Object> map) throws Exception {
		return marteDAO.select_not(map);
	}

	@Override
	public Map<String, Object> not_detail(Map<String, Object> map) throws Exception {
		return marteDAO.not_detail(map);
	}

	@Override
	public void not_delete(Map<String, Object> map) throws Exception {
		marteDAO.not_delete(map);
		
	}

	@Override
	public void not_update(Map<String, Object> map) throws Exception {
		marteDAO.not_update(map);		
	}

	@Override
	public List<Map<String, Object>> select_all_now(Map<String, Object> map) throws Exception {
		return marteDAO.select_all_now(map);
	}

	@Override
	public List<Map<String, Object>> select_ev_now(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		return marteDAO.select_ev_now(map);
	}

	@Override
	public List<Map<String, Object>> select_ch_gacha_now(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		return marteDAO.select_ch_gacha_now(map);
	}

	@Override
	public List<Map<String, Object>> select_we_gacha_now(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		return marteDAO.select_we_gacha_now(map);
	}

	@Override
	public List<Map<String, Object>> select_all_soon(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		return marteDAO.select_all_soon(map);
	}

	@Override
	public List<Map<String, Object>> select_ev_soon(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		return marteDAO.select_ev_soon(map);
	}

	@Override
	public List<Map<String, Object>> select_ch_gacha_soon(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		return marteDAO.select_ch_gacha_soon(map);
	}

	@Override
	public List<Map<String, Object>> select_we_gacha_soon(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		return marteDAO.select_we_gacha_soon(map);
	}
	
	
	
	
	

}
