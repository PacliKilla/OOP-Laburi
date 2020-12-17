package com.company.lab;
import java.util.Objects;
public class Main {

    public static void main(String[] args) {
    Box myBox1 = new Box();
        myBox1.Param();
        myBox1.Surface();
        myBox1.Volume();
    Box myBox2 = new Box(4);
        myBox2.Param();
        myBox2.Volume();
        myBox2.Surface();
    Box myBox3 = new Box(4, 3, 7);
        myBox3.Param();
        myBox3.Surface();
        myBox3.Volume();
        Queue myQueueP = new Queue(34);
        myQueueP.afis();
        Queue myQueueNP = new Queue();
        System.out.println("Elements  1: " + myQueueP.myQueue1);
        myQueueP.sz();
        myQueueP.checkk();
        System.out.println("Elements 2: " + myQueueNP.myQueue1);
    myQueueNP.sz();
    myQueueNP.checkk();
    Objects.isNull(myQueueNP);
    if(Objects.isNull(myQueueNP) == true) {
        System.out.println("Never full");
    }
    }
}
