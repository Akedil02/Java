package Day22_Inheritance.AccessingFeatures;

class Father {

    String name;
    private int Money;


    void Show1(){
        System.out.println("This is a non-private method");
    }

    private void Show2(){
        System.out.println("This is a private method.");
    }

    static void Show3(){
        System.out.println("This is a static method.");
    }
}

class Son extends Father {
}

class Test{
    public static void main(String[] args) {

    }
}