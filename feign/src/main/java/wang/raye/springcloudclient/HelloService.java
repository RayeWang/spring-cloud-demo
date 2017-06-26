package wang.raye.springcloudclient;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Fegin 可被调用的服务申明
 * Created by Raye on 2017/6/26.
 */
@FeignClient(value = "service-ribbon")
public interface HelloService {

    @RequestMapping(value = "/feignhello",method = RequestMethod.GET)
    String sayHelloFromRibbon(@RequestParam(value = "name") String name);
}
