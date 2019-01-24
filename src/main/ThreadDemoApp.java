package main;

import lib.ThreadExample;

public class ThreadDemoApp {
    public static void main(String [ ] args) throws InterruptedException {

          Thread threadTest = new Thread(new ThreadExample());
          threadTest.start();
          threadTest.join();





    }
}
