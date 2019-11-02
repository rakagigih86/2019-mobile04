package id.ac.polinema.intent.model;

public class User {
    private String username;
    private String name;
    private int age;

    public User(String username, String name, int age) {
        User user = new User(username, name, age);

        this.username = username;
        this.name = name;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
