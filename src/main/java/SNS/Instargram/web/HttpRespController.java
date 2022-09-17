package SNS.Instargram.web;

import SNS.Instargram.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller//파일을 리턴할 것이기 때문!!
public class HttpRespController {
    @GetMapping("/txt")
    public String txt(){
        return "a.txt";
        //프레임워크 사용(틀이 이미 정해져 있음)
        //일반 정적 파일들은 resources/static 폴더 내부가 디폴트 경로이다.
    }
    @GetMapping("/mus")
    public String mus(){
        return "b";
        //mustach 템플릿 엔진 라이브러리 등록 완료
        //templates 폴더 안에 .mustache을 나두면 확장자 없이 파일명만 적으면 자동으로 찾아감.
    }
    @GetMapping("/jsp")
    public String jsp(){
        return "c";
        //mustach 템플릿 엔진 라이브러리 등록 완료
        //templates 폴더 안에 .mustache을 나두면 확장자 없이 파일명만 적으면 자동으로 찾아감.
    }
    @GetMapping("/jsp/java")
    public String jspJava(){
        return "d";
    }

    @GetMapping("/jsp/java/model")
    public String jspToJavaToModel(Model model){//함수의 파라미터에 Model 선언
        User user = new User();
        user.setUsername("ssuar");
        model.addAttribute("username", user.getUsername());//addAttribute 함수로 전달만 하면 됨.
        return "e";
    }
}
