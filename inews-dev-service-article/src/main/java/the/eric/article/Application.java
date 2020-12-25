package the.eric.article;

import the.eric.rule.MyRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "the.eric.article.mapper")
@ComponentScan(basePackages = {"the.eric", "org.n3r.idworker"})
@EnableEurekaClient
//@RibbonClient(name = "SERVICE-USER", configuration = MyRule.class)
@EnableFeignClients({"the.eric"})
@EnableHystrix
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
