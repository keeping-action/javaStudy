package com.cool.study.thread;

class SubRunnable implements Runnable{

        private int a;

        public SubRunnable(int a){
            this.a=a;
        }

        public void run() {

            int b=0;
            for (int i=0 ;i<1000;i++){
                a++;
                b++;
            }
            System.out.println(Thread.currentThread().getName()+" a ====  "+a);
            System.out.println(Thread.currentThread().getName()+" b ====  "+b);

        }
    }


