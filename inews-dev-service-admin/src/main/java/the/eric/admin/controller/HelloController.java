package the.eric.admin.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import the.eric.api.controller.user.HelloControllerApi;
import the.eric.grace.result.GraceJSONResult;
import the.eric.utils.RedisOperator;

@RestController
public class HelloController implements HelloControllerApi {
    final static Logger logger = LoggerFactory.getLogger(HelloController.class);



    @Override
    public Object hello(){

        return GraceJSONResult.ok();
    }




}
