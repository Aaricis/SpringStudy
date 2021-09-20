import com.kuang.config.KuangConfig;
import com.kuang.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @program: com.kuang
 * @description: test
 * @author: zkg
 * @create: 2021-09-02 20:14
 **/
public class MyTest {
    public static void main(String[] args) {
        //如果完全使用了配置类方式去作，只能通过AnnotationConfig上下文来获取容器，通过配置类的class对象加载
        ApplicationContext context = new AnnotationConfigApplicationContext(KuangConfig.class);
        User getUser = context.getBean("getUser", User.class);
        System.out.println(getUser.getName());
    }
}
