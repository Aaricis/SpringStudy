import com.kuang.pojo.User;
import com.kuang.pojo.UserT;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        //User user = new User();
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        //User user = (User)context.getBean("user");
        //User user = (User)context.getBean("userNew");
        //user.show();
        //User user2 = (User)context.getBean("user");
        //System.out.println(user==user2);
        //UserT user = (UserT)context.getBean("user2");
        //UserT user = (UserT)context.getBean("u2");
        //UserT user = (UserT)context.getBean("u3");
        //UserT user = (UserT)context.getBean("u4");
        UserT user = (UserT)context.getBean("u5");
        user.show();
    }
}
