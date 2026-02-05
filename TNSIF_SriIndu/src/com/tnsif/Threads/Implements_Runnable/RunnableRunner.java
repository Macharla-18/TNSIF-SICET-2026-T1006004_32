package com.tnsif.Threads.Implements_Runnable;
public class RunnableRunner {
    public static void main(String[] args) {
        RunnableTask task = new RunnableTask();
        Thread t1 = new Thread(task); // Pass the task to a Thread object
        t1.start();
    }
}