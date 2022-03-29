package maruth.common;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import org.springframework.core.MethodParameter; 
import org.springframework.web.bind.support.WebDataBinderFactory; 
import org.springframework.web.context.request.NativeWebRequest; 
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;


public class CustomMapArgumentResolver implements HandlerMethodArgumentResolver {

	@Override
	public boolean supportsParameter(MethodParameter parameter) {
		return CommandMap.class.isAssignableFrom(parameter.getParameterType());
	}

	@Override
	public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer,
			NativeWebRequest webRequest, WebDataBinderFactory binderFactory) throws Exception {
		CommandMap commandMap = new CommandMap();
		HttpServletRequest request =(HttpServletRequest)webRequest.getNativeRequest();
		Enumeration<?> enumeration =request.getParameterNames();
		
		String key =null;
		String[] value=null;
		while(enumeration.hasMoreElements()) {
			key=(String)enumeration.nextElement();
			value=request.getParameterValues(key);
			if(value != null) {
				commandMap.put(key, (value.length>1)?value:value[0]);
			}
		}
		return commandMap;
	}
	

	

}
