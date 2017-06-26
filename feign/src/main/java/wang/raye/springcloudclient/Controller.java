package wang.raye.springcloudclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * feign调用的Controller
 * Created by Raye on 2017/6/26.
 */
@RestController
public class Controller {

    @Autowired
    private HelloService helloService;
    /**
     * 远程通过feign调用另外一个项目的方法
     * @param name
     * @return
     */
    @RequestMapping("hello")
    public String hello(String name){
        return helloService.sayHelloFromRibbon(name);
    }

    /**
     * 使用ribbon方式调用的方法
     * @param name
     * @return
     */
    @RequestMapping("ribbonhello")
    public String sayHello(String name){
        return "hello "+name+" this is feign spring cloud";
    }
}
