package app;

public class Student {
    private String name;
    private String hauptfach;

    public Student (String name, String hauptfach) {
        this.name = name;
        this.hauptfach = hauptfach;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHauptfach() {
        return hauptfach;
    }

    public void setHauptfach(String hauptfach) {
        this.hauptfach = hauptfach;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", hauptfach='" + hauptfach + '\'' +
                '}';
    }
}
