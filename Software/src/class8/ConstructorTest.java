package class8;

class ParentClass {  //���常��
    public ParentClass() {  //���췽��
        System.out.println("���Ǹ���Ĺ��췽����");
    }  

}
class ChildClass extends ParentClass {  //�̳и���
    public ChildClass() {  //���췽��  
    	
    	System.out.println("��������Ĺ��췽����");
    	
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
