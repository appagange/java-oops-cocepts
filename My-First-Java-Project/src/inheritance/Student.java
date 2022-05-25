package inheritance;

public class Student {
    
    private String name;
    private int age;
    private String address;
    
    Student()
    {
        this.name="Unknown";
        this.age=0;
        this.address="Not available";
    }

    public void setinfo(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    

    public void setinfo(String name,int age,String address)
    {
        this.name=name;
        this.age=age;
        this.address=address;
    }
    
    
    
    
    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", address=" + address + "]";
    }

    public static void main(String[] args) {
        
        Student s1=new Student();
        
        System.out.println(s1);
        
        Student s2=new Student();
        s2.setinfo("Swathi", 23);
        
        System.out.println(s2);
        
        
        Student s3=new Student();
        s3.setinfo("Swathi", 23,"Delhi");
        System.out.println(s3);

    }

}
