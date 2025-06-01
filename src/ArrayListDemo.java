import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Builder
@Getter
@ToString
class UserInfo{
    private Integer id;
    private String name;
    private String uuid;
    private String email;
}
public class ArrayListDemo {
    public static void main(String [] args){
        List<UserInfo> user = new ArrayList<>(
                List.of(UserInfo.builder()
                                .id(1)
                                .name("Mimi")
                                .uuid(UUID.randomUUID().toString())
                                .email("mimi@gmail.com")
                        .build(),UserInfo.builder()
                                .id(2)
                                .name("Nini")
                                .uuid(UUID.randomUUID().toString())
                                .email("nini@gmail.com")
                        .build())
        );
        user.stream().filter(e->e.getId().equals(1)).forEach(System.out::println);
    }
}
