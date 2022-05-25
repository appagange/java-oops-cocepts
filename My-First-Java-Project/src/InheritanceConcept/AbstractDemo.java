package InheritanceConcept;

abstract class A2
{
    abstract void a();
    abstract void b();
    abstract void c();
    
}

abstract class B2 extends A2
{

    @Override
    void a() {
        System.out.println("This is method a");
        
    }

    @Override
    void b() {
        System.out.println("This is method b");
        
    }

    
    
}

class C2 extends B2
{

    @Override
    void c() {
        System.out.println("This is method c");
        
    }
    
}

public class AbstractDemo {

    public static void main(String[] args) {
        
        C2 c=new C2();
        c.a();
        c.b();
        c.c();

    }

}
