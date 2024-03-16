package FunctionInterfaceStream.Streams.execise;

public class User {
    private String name;
    private Long age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public User(String name, Long age){
        this.name = name;
        this.age = age;
    }
}
