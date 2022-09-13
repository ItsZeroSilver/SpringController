package SNS.Instargram.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QueryPathController {
    //http://localhost:8080/chicken?type=양념
    @GetMapping("/chicken")
    public String chickenQuery(String type){
        return type + " 배달갑니다. (쿼리스트링형)";
    }

    //http://localhost:8080/chicken/양념
    //이걸 더 많이 씀
    @GetMapping("/chicken/{type}")
    public String chickenPath(@PathVariable String type){
        return type + " 배달갑니다. (주소변수매핑형)";
    }
}
