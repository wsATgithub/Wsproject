package com.ws.dl.www.controller.list;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ws.dl.www.form.LoginForm;
import com.ws.dl.www.utils.PropertyUtil;

@Controller
@RequestMapping(value = "/list")
public class WelcomeController {

	@RequestMapping(value = "/welcome", method = RequestMethod.POST)
	public String welcome(LoginForm form,Model model) {

		//String name = MySQLConnector.getName(form.getName());
		model.addAttribute("loginName", "name");

		return "list/welcome";
	}

	@RequestMapping(value = "/audio", method = RequestMethod.POST)
	public String audio(LoginForm form,Model model) {

		model.addAttribute("audioPath", PropertyUtil.getApp("www.audio.path"));
		return "audio/audio";
	}

	@RequestMapping(value = "/video", method = RequestMethod.POST)
	public String video(LoginForm form,Model model) {

		model.addAttribute("videoPath", PropertyUtil.getApp("www.video.path"));
		return "video/video";
	}

	@RequestMapping(value = "/imageup", method = RequestMethod.POST)
	public String imageup(LoginForm form,Model model) {

		return "upload/image/imageup";
	}

	@RequestMapping(value = "/imagedown", method = RequestMethod.POST)
	public String imagedown(LoginForm form,Model model) {

		model.addAttribute("imagedownPath", PropertyUtil.getApp("www.image.path"));
		return "download/image/imagedown";
	}

	@RequestMapping(value = "/fileup", method = RequestMethod.POST)
	public String fileup(LoginForm form,Model model) {

		model.addAttribute("fileupPath", PropertyUtil.getApp("www.file.path"));
		return "upload/file/fileup";
	}

	@RequestMapping(value = "/filedown", method = RequestMethod.POST)
	public String filedown(LoginForm form,Model model) {

		model.addAttribute("filedownPath", PropertyUtil.getApp("www.file.path"));
		return "download/file/filedown";
	}
}
