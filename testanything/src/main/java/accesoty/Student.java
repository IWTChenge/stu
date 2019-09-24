package accesoty;

public class Student {
    String name;
    String classname;
    String fenshu;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public String getFenshu() {
        return fenshu;
    }

    public void setFenshu(String fenshu) {
        this.fenshu = fenshu;
    }

    @Override
    public String toString() {
        return "姓名"+name+" "+"课程"+classname+" "+"分数"+fenshu;
    }
}
