package Entities;

public class Student {
    private int id;
    private String name;
    private String _class;

    public Student() {
    }

    public Student(int id, String name, String _class) {
        this.id = id;
        this.name = name;
        this._class = _class;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String get_class() {
        return _class;
    }

    public void set_class(String _class) {
        this._class = _class;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", _class='" + _class + '\'' +
                '}';
    }
}
