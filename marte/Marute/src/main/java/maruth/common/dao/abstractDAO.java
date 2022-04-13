package maruth.common.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

public class abstractDAO {
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	public Object insert(String queryId, Object params){
		return sqlSession.insert(queryId, params);
	}
	public Object delete(String queryId) {
		return sqlSession.delete(queryId);
	}
	
	public Object update(String queryId, Object params){
		return sqlSession.update(queryId, params);
	}
	
	public Object delete(String queryId, Object params){
		return sqlSession.delete(queryId, params);
	}
	
	public Object selectOne(String queryId){
		return sqlSession.selectOne(queryId);
	}
	public int selectint(String queryId) {
		return sqlSession.selectOne(queryId);
	}
	public Object selectOne(String queryId, Object params){
		return sqlSession.selectOne(queryId, params);
	}
	
	@SuppressWarnings("rawtypes")
	public List selectList(String queryId){
		return sqlSession.selectList(queryId);
	}
	
	@SuppressWarnings("rawtypes")
	public List selectList(String queryId, Object params){
		return sqlSession.selectList(queryId,params);
	}
	
	@SuppressWarnings("unchecked")  //페이징 관련 로직 
	public Object selectPagingList(String queryId,Object params) {
			Map<String,Object>map = (Map<String,Object>)params;
			String strPageIndex = (String)map.get("PAGE_INDEX");
			String strPageRow = (String)map.get("PAGE_ROW");
			int nPageIndex = 0;
			int nPageRow = 20;
			
			if(StringUtils.isEmpty(strPageIndex)==false) {
				nPageIndex = Integer.parseInt(strPageIndex)-1;
			}
			if(StringUtils.isEmpty(strPageRow)==false) {
				nPageRow = Integer.parseInt(strPageRow);
			}
			map.put("START",(nPageIndex*nPageRow)+1);
			map.put("END",(nPageIndex*nPageRow)+nPageRow);
			return sqlSession.selectList(queryId,map);
	}
}
