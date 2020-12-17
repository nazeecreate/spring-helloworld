import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld hwbean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld hwbean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat cbean1 =
                (Cat) applicationContext.getBean("cat");
        Cat cbean2 =
                (Cat) applicationContext.getBean("cat");
        System.out.println(hwbean1 == hwbean2);
        System.out.println(cbean1 == cbean2);
    }
}