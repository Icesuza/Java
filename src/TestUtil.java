import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
class Util<T, U, V>{
    private final T content;
    private final U number;
    private final V word;
}
enum UserRole{
    ROLE_ADMIN,
    ROLE_USER,
    ROLE_PROGRAMMER
}
public class TestUtil {
    public static void main(String [] args) {
        Util<UserRole, Integer, String> util = new Util<>(UserRole.ROLE_ADMIN,23,"ISTAD");
        System.out.println(util.getContent());
    }
}
