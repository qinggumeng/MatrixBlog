package com.matrix.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;

/**
 * Controller 工具类
 * @author JasonFu
 * @createTime 2018年9月14日 下午12:24:27
 */
public class BaseController {
	/**
	 * 返回Table数据Json字符串
	 * @author JasonFu
	 * @createTime 2018年9月14日 下午12:24:11
	 * @param code
	 * @param msg
	 * @param list
	 * @return
	 */
	public String getReturnDataJson(Integer code, String msg, List list) {
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("code", code);
		result.put("msg", msg);
		result.put("count", list.size());
		result.put("data", list);
		return JSON.toJSONString(result);
	}
}
