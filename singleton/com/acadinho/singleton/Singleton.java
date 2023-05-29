package br.com.acadinho.singleton;

import static java.util.Collections.singleton;

public class Singleton {

    private static Singleton singleton;

        private Singleton() {

        }

            public static Singleton getInstance() {
                if (singleton == null) {
                    singleton = new Singleton();
                }
                return singleton;

        }

}
