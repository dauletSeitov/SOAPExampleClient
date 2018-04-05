package kz.pentagon.zhoyqin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.CalculatorI;

@RestController
public class FighterController {

	@Autowired
	CalculatorI service;

	@RequestMapping("/*")
	public String doget() {
		int resAdd = service.add(22, 23);
		int resMult = service.multiply(23, 2);
		int resDiv = service.divide(23, 2);
		int resSub = service.subtract(34, 32);
		return String.format("22+23=%d \n 23*2=%d \n 23/2=%d \n34-32=%d", resAdd, resMult, resDiv, resSub);

	}

}
