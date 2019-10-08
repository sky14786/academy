
package com.kh.spring.demo.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.spring.demo.model.service.DevService;
import com.kh.spring.demo.model.vo.Dev;

@Controller
//democontroller
public class DemoController {

	@Autowired
	DevService devService;

	@RequestMapping("/demo/demo.do")
	public String jangwon() {
		System.out.println("/demo/demo.do 컨트롤러 호출");
		return "demo/demo";
	}

	@RequestMapping("/demo/demo1.do")
	public String demo1(HttpServletRequest req, HttpServletResponse res) {
		String devName = req.getParameter("devName");
		int devAge = Integer.parseInt(req.getParameter("devAge"));
		String devEmail = req.getParameter("devEmail");
		String devGender = req.getParameter("devGender");
		String[] devLangs = req.getParameterValues("devLang");
		System.out.println(devName + devAge + devEmail + devGender);
		for (String a : devLangs) {
			System.out.println(a);
		}
		Dev dev = new Dev(devName, devAge, devEmail, devGender, devLangs);
		req.setAttribute("dev", dev);

		return "demo/demoResult";
	}

	// @RequestParam(value="name명") 매개변수지정 => 매개변수 위치
	// 공유객체를 request를 사용하지 않고 Model객체를 이용하여
	// 데이터를 공유할 수 있음
	@RequestMapping("/demo/demo2.do")
	/*
	 * public String demo2(@RequestParam(value="devName") String devName,
	 * 
	 * @RequestParam(value="devAge", required=false, defaultValue="19") int devAge,
	 * 
	 * @RequestParam(value="devEmail") String devEmail,
	 * 
	 * @RequestParam(value="devGender") String devGender,
	 * 
	 * @RequestParam(value="devLang") String[] devLang, HttpServletRequest req ){
	 */
	/*
	 * public String demo2(String devName, int devAge, String devEmail, String
	 * devGender, String[] devLang) {
	 */
	/* Model객체를 이용해서 데이터 넘기기 */
	public String demo2(String devName, int devAge, String devEmail, String devGender, String[] devLang, Model model) {
		System.out.println(devName);
		System.out.println(devAge);
		System.out.println(devEmail);
		System.out.println(devGender);
		System.out.println(devLang);

		Dev dev = new Dev(devName, devAge, devEmail, devGender, devLang);
		// req.setAttribute("dev", dev);
		model.addAttribute("dev", dev);

		return "demo/demoResult";
	}

	@RequestMapping("/demo/demo3.do")
	public String demo3(@RequestParam Map map, Model model) {
		System.out.println(map);
		model.addAttribute("dev", map);
		return "demo/demoResult";
	}

	@RequestMapping("/demo/demo4.do")
	public String demo4(Dev dev, Model model) {

		model.addAttribute("dev", dev);

		return "demo/demoResult";
	}

	@RequestMapping("/demo/insertDev.do")
	public String insertDev(Dev dev) {

		int result = devService.insertDev(dev);
		System.out.println("가입완료");
		// redirect page change
		return "redirect:/";
	}

	@RequestMapping("/demo/selectDevList.do")
	public String selectDevList(Model model) {
		List<Dev> list = devService.selectDevList();
		model.addAttribute("list", list);
		return "demo/devList";
	}

}
