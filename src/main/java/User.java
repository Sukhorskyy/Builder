import lombok.Builder;
import lombok.Singular;
import lombok.ToString;

import java.util.List;

@Builder @ToString
public class User {
    public String name;
    public int age;
    public int height;
    private String gender;
    private int weight;
    @Singular private List<String> occupations;
}
