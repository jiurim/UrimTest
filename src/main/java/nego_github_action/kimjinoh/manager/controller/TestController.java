package nego_github_action.kimjinoh.manager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping(value = "/")
	public String doGetHelloWorld() {
		return "제발 좀 돼라.";
	}

    @GetMapping(value = "/nice")
	public String doGetHelloWorldd() {
		return "꽁꽁 얼어붙은 한강위로 고양이가 걸어다닙니다.";
	}


}
