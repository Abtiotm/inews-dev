package the.eric.admin;
import org.springframework.security.crypto.bcrypt.BCrypt;

public class PWDTest {

    public static void main(String[] args) {
        String pwd = BCrypt.hashpw("Donald T.", BCrypt.gensalt());
        System.out.println(pwd);
    }

}
