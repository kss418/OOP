class Course{
    private String name, code;
    public Course(String c, String n){
        name = n; code = c;
    }

    public String getCode(){ return code; }
    public String getName(){ return name; }
}

class OnlineCourse extends Course{
    public OnlineCourse(String n, String c){ super(n, c); }
    public String toString() {
        String ret = "Code: " + getCode();
        ret += ", Name: " + getName() + ", ";
        ret += "Type: Online";
        return ret;
    }
}

class OfflineCourse extends Course{
    public OfflineCourse(String n, String c){ super(n, c); }
    public String toString() {
        String ret = "Code: " + getCode();
        ret += ", Name: " + getName() + ", ";
        ret += "Type: Offline";
        return ret;
    }
}

public class Homework6 {
    public static void main(String[] args) {
        OfflineCourse course1 = new OfflineCourse("HAEA9201", "Object Oriented Programming");
        OnlineCourse course2 = new OnlineCourse("HAEA0012", "C Programming 1");
        System.out.println(course1);
        System.out.println(course2);
    }
}
