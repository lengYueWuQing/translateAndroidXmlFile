package cn.sh.translateService;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class ResponseUtils {

	/**
	 * 获取data JSONObject
	 * @param request
	 * @param response
	 * @return
	 */
	public static JSONObject getDataObject(HttpServletRequest request, HttpServletResponse response){
		String data = request.getAttribute("data").toString();
		return JSONObject.parseObject(data);
	}
	
	/**
	 * 获取data JSONArray
	 * @param request
	 * @param response
	 * @return
	 */
	public static JSONArray getDataArray(HttpServletRequest request, HttpServletResponse response){
		String data = request.getAttribute("data").toString();
		return JSONArray.parseArray(data);
	}
	
	public static String getParamStr(Object object){
		if(object==null){
			return null;
		}else{
			return object.toString().trim();
		}
	}
	
	/**
	 * 返回错误信息
	 * @param response
	 * @param object
	 */
	public static void setErrorMessage(HttpServletResponse response, String... object){
		List<String> list = Arrays.asList(object);
		ErrorMessages erms = new ErrorMessages();
		erms.setErrorMessage(list);
		try {
			response.getWriter().println(JSONObject.toJSONString(erms));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
