package Author;
import java.lang.*;
public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Ivan Popov", "ivPopov@somewhere.com", 'm');
        System.out.println(a1.getName());
        System.out.println(a1.getEmail());
        a1.setEmail("IvanPopov@somewhere.com");
        System.out.println(a1.getEmail());
        System.out.println(a1.getGender());
        System.out.println(a1);
    }
}
