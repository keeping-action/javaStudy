package com.cool.study.thread;



/**
 * Created by cool on 16/4/2.
 */
public class TestOfPrintAandBandC implements Runnable{


    private String character;

    private String prevCharacter;


    public TestOfPrintAandBandC(String character,String prevCharacter) {

        this.character = character;
        this.prevCharacter = prevCharacter;
    }

    public static void main(String[] args) {

        Thread thread1= new Thread(new TestOfPrintAandBandC("a","c"));
        thread1.start();

        Thread thread2= new Thread(new TestOfPrintAandBandC("b","a"));
        thread2.start();

        Thread thread3= new Thread(new TestOfPrintAandBandC("c","b"));
        thread3.start();

    }


    public void run() {

        for (int i=0;i<10;i++){
            synchronized (prevCharacter){
                    synchronized (character){
                        System.out.println(Thread.currentThread().getName() + "========" + character);
                        character.notify();
                        try {

                            Thread.sleep(1);
                        }catch (InterruptedException e){
                            e.printStackTrace();
                        }

                    }

                try {
                    prevCharacter.wait();

                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }

        }
    }
}