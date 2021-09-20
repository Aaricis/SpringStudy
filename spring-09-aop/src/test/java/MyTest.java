import com.kuang.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: com.kuang
 * @description: test aop
 * @author: zkg
 * @create: 2021-09-07 09:19
 **/
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //动态代理所代理的是接口
        UserService userService =  context.getBean("userService", UserService.class);
        userService.select();
    }
}
