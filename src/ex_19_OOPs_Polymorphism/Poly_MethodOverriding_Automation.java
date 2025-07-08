package ex_19_OOPs_Polymorphism;

import ex_18_OOPs_Inheritance.CommonToAll;

public class Poly_MethodOverriding_Automation {
    public static void main(String[] args) {
    chromeTC c1 = new chromeTC();
    c1.openBrowser();

    Firefox f1 = new Firefox();
    f1.openBrowser();

    commonToAll commonToAll = new commonToAll();
    commonToAll.openBrowser();

    //Dynamic Dispatch
        commonToAll c2 = new chromeTC();
    c2.openBrowser();

    commonToAll c3 = new Firefox();
    c3.openBrowser();
    }
}


class commonToAll{
    void openBrowser(){
        System.out.println("Starting IE Browser!!");
    }
}

class chromeTC extends commonToAll {
    @Override
    void openBrowser(){
        System.out.println("Starting chrome Browser!!");
    }
}

class Firefox extends commonToAll{
    @Override
    void openBrowser(){
        System.out.println("Firefox will start!!");
    }
}
