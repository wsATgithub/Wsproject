package com.ws.dl.www.controller.list;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ws.dl.www.form.LoginForm;
import com.ws.dl.www.service.GetUserService;
import com.ws.dl.www.utils.PropertyUtil;

@Controller
@RequestMapping(value = "/list")
public class WelcomeController {

	@Autowired
	private GetUserService service;

	@RequestMapping(value = "/welcome", method = RequestMethod.POST)
	public String welcome(LoginForm form, Model model) {

		String name = service.getUser(form.getId());
		model.addAttribute("loginName", name);

		return "list/welcome";
	}

	@RequestMapping(value = "/audio", method = RequestMethod.POST)
	public String audio(LoginForm form, Model model) {

		model.addAttribute("audioPath", PropertyUtil.getApp("www.audio.path"));
		return "audio/audio";
	}

	@RequestMapping(value = "/video", method = RequestMethod.POST)
	public String video(LoginForm form, Model model) {

		model.addAttribute("videoPath", PropertyUtil.getApp("www.video.path"));
		return "video/video";
	}

	@RequestMapping(value = "/imageup", method = RequestMethod.POST)
	public String imageup(LoginForm form, Model model) {

		return "upload/image/imageup";
	}

	@RequestMapping(value = "/imagedown", method = RequestMethod.POST)
	public String imagedown(LoginForm form, Model model) {

		File file = new File(PropertyUtil.getApp("www.image.path"));

		List<String> imageList = new ArrayList<String>();
		for (String str : file.list()) {
			imageList.add(str);
		}

		model.addAttribute("imageList", imageList);
		return "download/image/imagedown";
	}

	@RequestMapping(value = "/fileup", method = RequestMethod.POST)
	public String fileup(LoginForm form, Model model) {

		model.addAttribute("fileupPath", PropertyUtil.getApp("www.file.path"));
		return "upload/file/fileup";
	}

	@RequestMapping(value = "/filedown", method = RequestMethod.POST)
	public String filedown(LoginForm form, Model model) {

		File file = new File(PropertyUtil.getApp("www.file.path"));

		List<String> fileList = new ArrayList<String>();
		for (String str : file.list()) {
			fileList.add(str);
		}

		model.addAttribute("fileList", fileList);
		return "download/file/filedown";
	}
}
