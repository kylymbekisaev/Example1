package example1;

public class User {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) throws IllegalNameLengthException {
        if (name.length() > 20) {
            throw new IllegalNameLengthException("Имя не должно быть длинее чем 20 символов");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IllegalAgeException {
        if (age < 1 || age > 100) {
            throw new IllegalAgeException("Возрат не должен быть меньше 1 и больше 100");
        }
        this.age = age;
    }
}
