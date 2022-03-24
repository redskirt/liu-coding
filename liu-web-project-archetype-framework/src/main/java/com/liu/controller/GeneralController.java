package com.liu.controller;

import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMethod;
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
abstract class GeneralController {

	protected HttpSession session;

	public void setSession(HttpSession session) {
		this.session = session;
	}

	public ModelAndView forwardOrRedirect(String url) {
		return null == session.getAttribute("SESSION_PRINCIPAL") ? //
					new ModelAndView("redirect:/_") : new ModelAndView(url);
	}

	public ResponseEntity<InputStreamResource> download(String fullPath) throws IOException {
		FileSystemResource file = new FileSystemResource(fullPath);
		HttpHeaders headers = new HttpHeaders();
		headers.add("Cache-Control", "no-cache, no-store, must-revalidate");
		headers.add("Content-Disposition", "attachment; filename=" + file.getFilename());
		headers.add("Pragma", "no-cache");
		headers.add("Expires", "0");

		return ResponseEntity
				.ok() //
				.headers(headers) //
				.contentLength(file.contentLength()) //
				.contentType(MediaType.parseMediaType("application/octet-stream")) //
				.body(new InputStreamResource(file.getInputStream()));
	}
}
