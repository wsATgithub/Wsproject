package com.ws.dl.www.controller.download;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ws.dl.www.utils.PropertyUtil;

@Controller
@RequestMapping(value = "/download")
public class FileDownloadController {

	@RequestMapping(value = "/filedown", method = RequestMethod.GET)
	public String filedown(@RequestParam("filename") String filename, HttpServletResponse response,Model model) throws IOException {

		File file = new File(PropertyUtil.getApp("www.file.path") + filename);
		FileInputStream fis = new FileInputStream(file);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();

		byte[] data = new byte[1024];
		int n = 0;

		while((n = fis.read(data)) != -1) {
			baos.write(data, 0, n);
		}
		fis.close();
		byte[] fileContent = baos.toByteArray();

        response.setContentType("application/octet-stream");
        response.setHeader("Content-Disposition", "attachment; filename=" + URLEncoder.encode(filename, "UTF-8"));
        response.setContentLength(fileContent.length);

        OutputStream os = response.getOutputStream();

        os.write(fileContent);
        os.flush();

		File files = new File(PropertyUtil.getApp("www.file.path"));

		List<String> fileList = new ArrayList<String>();
		for(String str : files.list()) {
			fileList.add(str);
		}

		model.addAttribute("fileList", fileList);
		return "download/file/filedown";
	}

}
