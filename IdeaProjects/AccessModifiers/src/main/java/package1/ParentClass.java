package package1;

public class ParentClass {

    public int publicSayi1 = 1;
    protected int yas = 2;
    int defaultSayi3 = 3;
    private int privateSayi4 = 4;

    public ParentClass(int a){
       yas=a;
    }


    public void publicMethod1(){
        System.out.println("method1");

    }
    protected void protectedMethod2(){
        System.out.println("method2");
    }
    void defaultMethod3(){
        System.out.println("method3");
    }
    private void privateMethod4(){
        System.out.println("method4");
    }





}




