
class Student {

    private int rollNo;
    private String name;
    private String address;

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}

public class getterSetter {

    public static void main(String[] args) {
        Student a = new Student();
        a.setRollNo(10);
        a.setName("johan");
        a.setAddress("Delhi");
        System.out.println("Roll No  : " + a.getRollNo());
        System.out.println("Name     : " + a.getName());
        System.out.println("Address  : " + a.getAddress());

    }
}
