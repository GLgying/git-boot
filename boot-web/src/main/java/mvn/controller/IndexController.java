package mvn.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:TuoTuo
 * @createDate:2022/11/23 10:16
 * @description:
 */
@Slf4j
@RestController("index")
public class IndexController {
    @RequestMapping("/")
    public String index(){
        log.info("---");
        log.info("-test--");
        return "hello";
    }
}
