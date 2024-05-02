package nego_github_action.kimjinoh.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping(value = "/")
	public String doGetHelloWorld() {
		return "진짜 개 그지같네 드디어";
	}

    @GetMapping(value = "/nice")
	public String doGetHelloWorldd() {
		return "고양이가 걸어다닙니다???????";
	}


}
