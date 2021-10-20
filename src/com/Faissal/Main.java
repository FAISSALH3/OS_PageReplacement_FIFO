package com.Faissal;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        FIFO( 15 , 5);//page replacement using FIFO
    }

    public static void FIFO(int NumberOFreference , int pageframes ) {
        LinkedList<Integer>  queue = new LinkedList<>();//Queue is a linkedlist ; the recent reference is inserted in tail , and the head element is removed when is full.
        int count = 0 , pageFault =0;
        boolean FIFO = false;
        while (!FIFO) { //To ensure that the FIFO algorithm will be implemented

            if (queue.size() <= pageframes) {

                Scanner sc = new Scanner(System.in); //Insert the reference
                int p = sc.nextInt();
                if(!queue.contains(p)) pageFault +=1;//each time we reference a value for the first time we get a page fault
                queue.addLast(p);
                count += 1;


            }
            if (count == NumberOFreference) {
                FIFO = true; //So the number of references is satisfied
            }

            else if(queue.size() == pageframes ){
                queue.removeFirst() ; //each time the queue is full , we remove the element at the head of queue
            }



        }
        System.out.println("the Number of page faults occurred is: "+pageFault);//Output the result
    }
}
