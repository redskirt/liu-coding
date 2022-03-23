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
 * @author Matthew
 * @description
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
