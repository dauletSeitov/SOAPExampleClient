package kz.pentagon.zhoyqin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.CalculatorI;


@RestController
public class FighterController {

	@Autowired
	CalculatorI service;

	@RequestMapping("/")
	public String doget() {
		int res = service.add(23, 23);
		return "hello from server" + res;

	}

}
