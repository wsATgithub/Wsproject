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
public class FileUpController {

	@RequestMapping(value = "/fileup", method = RequestMethod.POST)
	public String fileup(@RequestParam("fileup") MultipartFile file) {

        String path = PropertyUtil.getApp("www.file.path") + file.getOriginalFilename();
        try {
        	file.transferTo(new File(path));
		} catch (IllegalStateException | IOException e) {
			e.printStackTrace();
		}

		return "list/welcome";
	}

}
