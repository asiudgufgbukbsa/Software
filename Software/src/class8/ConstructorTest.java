package class8;

class ParentClass {  //定义父类
    public ParentClass() {  //构造方法
        System.out.println("这是父类的构造方法。");
    }  

}
class ChildClass extends ParentClass {  //继承父类
    public ChildClass() {  //构造方法  
    	
    	System.out.println("这是子类的构造方法。");
    	
    }
    
    void test()
    {
    	
    }
}

public class ConstructorTest {
    public static void main(String[] args) {
        ChildClass cc = new ChildClass(); 
    }
}
