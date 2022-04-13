package maruth.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import maruth.common.util.CHFileupload;
import maruth.common.util.CH_GACH_FileUpload;
import maruth.common.util.EVENTFileUpload;
import maruth.common.util.WEFileUpload;
import maruth.common.util.WE_GACH_FileUpload;
import maruth.dao.MarteDAO;

@Service("MarteService")
public class MarteServiceImpl implements MarteService {
	@Resource(name = "EVENTFileUpload")
	EVENTFileUpload eventFileUpload;
	@Resource(name = "WE_GACH_FileUpload")
	WE_GACH_FileUpload we_GACH_FileUpload;
	@Resource(name = "CH_GACH_FileUpload")
	CH_GACH_FileUpload ch_GACH_FileUpload;
	@Resource(name = "WEFileUpload")
	WEFileUpload weFileUpload;
	@Resource(name="CHFileupload")
	CHFileupload chFileupload;
	@Resource(name = "MarteDAO")
	MarteDAO marteDAO;

	@Override
	public void insert_ch(Map<String, Object> map,HttpServletRequest request) throws Exception {
	chFileupload.parseInsertFileInfo(map, request);
	marteDAO.insert_ch(map);
		
	}

	@Override
	public void insert_we(Map<String, Object> map,HttpServletRequest request) throws Exception {
		weFileUpload.parseInsertFileInfo(map, request);
		marteDAO.insert_we(map);
		
	}

	@Override
	public void insert_ev(Map<String, Object> map,HttpServletRequest request) throws Exception {
		eventFileUpload.parseInsertFileInfo(map, request);
		marteDAO.insert_ev(map);
		
	}

	@Override
	public void insert_ch_gacha(Map<String, Object> map,HttpServletRequest request) throws Exception {
		ch_GACH_FileUpload.parseInsertFileInfo(map, request);
		System.out.println(map);
		marteDAO.insert_ch_gacha(map);
		
	}

	@Override
	public void insert_we_gacha(Map<String, Object> map,HttpServletRequest request) throws Exception {
		we_GACH_FileUpload.parseInsertFileInfo(map, request);
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
	public List<Map<String, Object>> select_ch(Map<String, Object> map) throws Exception {
		return marteDAO.select_ch(map);
	}

	@Override
	public Map<String, Object> all_detail(Map<String, Object> map) throws Exception {
		return marteDAO.all_detail(map);
				
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
	public void ch_update(Map<String, Object> map,HttpServletRequest request) throws Exception {
		chFileupload.parseInsertFileInfo(map, request);
		marteDAO.ch_update(map);
		
	}

	@Override
	public void we_update(Map<String, Object> map,HttpServletRequest request) throws Exception {
		weFileUpload.parseInsertFileInfo(map, request);
		marteDAO.we_update(map);
		
	}

	@Override
	public void ev_update(Map<String, Object> map,HttpServletRequest request) throws Exception {
		eventFileUpload.parseInsertFileInfo(map, request);
		marteDAO.ev_update(map);
		
	}

	@Override
	public void ch_gach_update(Map<String, Object> map,HttpServletRequest request) throws Exception {
		ch_GACH_FileUpload.parseInsertFileInfo(map, request);
		marteDAO.ch_gach_update(map);
		
	}

	@Override
	public void we_gach_update(Map<String, Object> map,HttpServletRequest request) throws Exception {
		we_GACH_FileUpload.parseInsertFileInfo(map, request);
		marteDAO.we_gach_update(map);
		
	}

	@Override
	public void insert_not(Map<String, Object> map) throws Exception {
		marteDAO.insert_not(map);		
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

	@Override
	public int login(Map<String, Object> map) throws Exception {
		return marteDAO.login(map);
	}

	@Override
	public void insert_ch_obj(Map<String, Object> map) throws Exception {
		marteDAO.insert_ch_obj(map);
		
	}

	@Override
	public void insert_we_obj(Map<String, Object> map) throws Exception {
		marteDAO.insert_we_obj(map);
		
	}

	@Override
	public List<Map<String, Object>> select_we_obj(Map<String, Object> map) throws Exception {
		return marteDAO.select_we_obj(map);
	}

	@Override
	public List<Map<String, Object>> select_ch_obj(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		return marteDAO.select_ch_obj(map);
	}

	@Override
	public void we_con_delete() throws Exception {
		 marteDAO.we_con_delete();
		
	}

	@Override
	public void ch_con_delete() throws Exception {
		marteDAO.ch_con_delete();
		
	}

	@Override
	public void we_obj_delete(Map<String, Object> map) throws Exception {
		marteDAO.we_obj_delete(map);
		
	}

	@Override
	public void ch_obj_delete(Map<String, Object> map) throws Exception {
		marteDAO.ch_obj_delete(map);
		
	}

	@Override
	public List<Map<String, Object>> weimg(Map<String, Object> map) throws Exception {
		
		return (List<Map<String, Object>>)marteDAO.weimg(map);
	}

	@Override
	public List<Map<String, Object>> CHimg(Map<String, Object> map) throws Exception {
		return (List<Map<String, Object>>)marteDAO.CHimg(map);
	}
	
	


	
	
	
	
	
	
	

}
