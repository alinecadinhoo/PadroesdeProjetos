package br.com.acadinho.singleton;

public class DemoSingletonPropriedadeThread {

    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadFoo());
            t1.start();
        }


        static class ThreadFoo implements Runnable {
            public void run() {
                SingletonPropriedade singleton = SingletonPropriedade.getInstance("teste");
                System.out.println(singleton.getValue());
            }
        }
    }