package br.com.acadinho.singleton;

public class DemoSinglePropriedade {

    public static void main(String[] args) {
        SingletonPropriedade singleton = SingletonPropriedade.getInstance("teste");
        System.out.println(singleton.getValue());
    }

}
