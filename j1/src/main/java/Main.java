import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.stud.person.Config;


public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        context.close();
    }
}
