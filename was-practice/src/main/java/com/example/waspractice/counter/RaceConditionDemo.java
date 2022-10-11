package com.example.waspractice.counter;

public class RaceConditionDemo {
    // RaceCondition
    // 여러프로세스,여러쓰레드가 동시에 하나의 리소스에 접근하기 위해서 경쟁함
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread t1 = new Thread(counter,"Thread1");
        Thread t2 = new Thread(counter,"Thread2");
        Thread t3 = new Thread(counter,"Thread3 ");

        t1.start();
        t2.start();
        t3.start();


    }
}
