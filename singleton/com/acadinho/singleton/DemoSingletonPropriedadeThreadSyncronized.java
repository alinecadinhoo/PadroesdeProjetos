package br.com.acadinho.singleton;

public class DemoSingletonPropriedadeThreadSyncronized {

    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadFoo());
        t1.start();
    }


    static class ThreadFoo implements Runnable {
        public void run() {
            SingletonPropriedadeSyncronized singleton = SingletonPropriedadeSyncronized.getInstance("teste");
            System.out.println(singleton.getValue());
        }
    }
}

