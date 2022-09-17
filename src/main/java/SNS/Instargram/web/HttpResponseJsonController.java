package SNS.Instargram.web;

import SNS.Instargram.domain.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HttpResponseJsonController  {
    @GetMapping("/resp/json/object")
    public String respJsonObject(){
        User user = new User();
        user.setUsername("홍길동");
        String data = "{\"username\":\""+user.getUsername()+"\"}";
        return data;
    }

    @GetMapping("/resp/json/javaobject")
    public User respJsonJavaObejct(){
        User user = new User();
        user.setUsername("홍길동");
        return user;
        //1. MessageConverter가 자동으로 JavaObject를 Json으로 변경해서 통신을 통해 응답을 해준다.
        //2. @RestController일때만 MessageConverter가 작동한다.
    }
}
