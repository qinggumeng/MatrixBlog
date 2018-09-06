package com.matrix.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.matrix.pojo.Content;
import com.matrix.pojo.ContentExample;
import com.matrix.service.ContentService;

/**
 * 文章相关控制器
 * @author JasonFu
 * @createTime 2018年9月6日 下午1:57:39
 */
@RestController
@RequestMapping("/front/content")
public class FrontContentController {
	@Autowired
	private ContentService contentService;
	/**
	 * 根据条件分页查询文章信息
	 * @author JasonFu
	 * @createTime 2018年9月6日 下午1:58:06
	 * @param request
	 * @param response
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping("/getPageByExample")
	public Object getPageByExample(HttpServletRequest request, HttpServletResponse response,
			@RequestParam(required=true, name="page") Integer page,
			@RequestParam(required=true, name="rows") Integer rows) {
		
		ContentExample ctExample = new ContentExample();
		List<Content> list = contentService.findPageByConditon(ctExample, 0, 10);
		return JSON.toJSONString(list);
	}
}
