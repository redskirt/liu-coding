package com.liu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * @author 刘老师
 * 
 * - 源码请所有同学合理使用，禁止非学习用途。
 * - 参照源码多想多练多Debug，杜绝无脑Copy！
 * - 有问题找学委统一汇总，课堂答疑，也可到办公室问我。
 * - 小红书|微信视频号 @老刘编程 三连到位，禁止下次一定！
 *
 */
@Controller
public class EntranceController extends GeneralController {
	
	

	@RequestMapping("/")
	public ModelAndView login() {

		return new ModelAndView("login");
	}
	
	
	
	@RequestMapping("/index")
	public ModelAndView index() {
		
		return new ModelAndView("index");
	}
	

//	@GetMapping("/greeting")
//	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
//		
//		model.addAttribute("name", "Matthew");
//		return "greeting";
//	}
//
//	@RequestMapping("/ajaxUrl")
//	public @ResponseBody String ajaxJsonPost() {
//		return "{\"message\" : \"hello world!\"}";
//	}

}
