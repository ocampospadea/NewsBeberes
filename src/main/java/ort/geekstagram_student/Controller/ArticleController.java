package ort.geekstagram_student.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class ArticleController {

	@RequestMapping(value = "/home/article", method = RequestMethod.GET)
	public String articleForm() {
		return "article";
	}



}
