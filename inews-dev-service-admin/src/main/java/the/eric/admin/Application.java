package the.eric.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;


@SpringBootApplication//(exclude = DataSourceAutoConfiguration.class)
@MapperScan(basePackages = "the.eric.admin.mapper")
@ComponentScan(basePackages = {"the.eric", "org.n3r.idworker"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}

