package com.ws.dl.www.controller.upload;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.ws.dl.www.utils.PropertyUtil;

@Controller
@RequestMapping(value = "/upload")
public class ImageUpController {

	@RequestMapping(value = "/imageup", method = RequestMethod.POST)
	public String imageup(@RequestParam("imageup") MultipartFile image) {

		String path = PropertyUtil.getApp("www.image.path") + image.getOriginalFilename();
		try {
			image.transferTo(new File(path));
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return "list/welcome";
	}

}
