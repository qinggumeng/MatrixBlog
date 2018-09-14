package com.matrix.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.matrix.pojo.Account;
import com.matrix.pojo.AccountExample;
import com.matrix.service.impl.AccountServiceImpl;
/**
 * 用户相关控制器
 * @author JasonFu
 * @createTime 2018年9月14日 上午10:53:19
 */
@RestController
@CrossOrigin(origins="*", maxAge=3600)
@RequestMapping("/back/account")
public class AccountController extends BaseController {
	
	@Autowired
	private AccountServiceImpl accountService;
	
	@RequestMapping("/getPageByExample")
	@ResponseBody
	public Object getAccount(HttpServletRequest request, HttpServletResponse response,
			@RequestParam(required=true, name="page") Integer page,
			@RequestParam(required=true, name="rows") Integer rows) {
		AccountExample acEmp = new AccountExample();
		List<Account> list = accountService.findPageByConditon(acEmp, page, rows);
		Integer count = (int) accountService.countByCondition(acEmp);
		return getReturnDataJson(0, "success", count, list);
	}
}
