package maruth.common.util;

import java.io.File;
import java.util.Iterator;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Component("CHFileupload")
public class CHFileupload {
	
	public Map<String,Object> parseInsertFileInfo(Map<String, Object> map, HttpServletRequest request)throws Exception{
		MultipartHttpServletRequest multipartHttpServletRequest = (MultipartHttpServletRequest)request;

		Iterator<String> iterator = multipartHttpServletRequest.getFileNames();
		MultipartFile multipartFile =null;
		String originalFileName = null;
		String originalFileExtension = null;
		String storeFileName = null;
		String filePath = request.getSession().getServletContext().getRealPath("/")+"img\\CH_img\\";
		File file = new File(filePath);
		
		if(file.exists()==false) {
			file.mkdirs();
		}
		System.out.println(filePath);
		System.out.println(iterator);

			multipartFile = multipartHttpServletRequest.getFile(iterator.next());
				originalFileName = multipartFile.getOriginalFilename();//원본이름
				if(!originalFileName.equals("")) {
				originalFileExtension=originalFileName.substring(originalFileName.lastIndexOf("."));
				storeFileName = map.get("CH_NAME")+originalFileExtension;
				file = new File(filePath+storeFileName);
					multipartFile.transferTo(file);//이부분에서 파일 업로드 됨
					map.put("CH_IMG", "../img/CH_img/"+storeFileName);
			
		}
		return map;
		
	}

}