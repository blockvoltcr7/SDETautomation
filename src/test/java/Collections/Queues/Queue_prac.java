package Collections.Queues;
import  java.util.*;
public class Queue_prac {


    public static void main(String[] args) {
        List<Number> list = new LinkedList<>();
        for (int i = 10; i <= 15; i++) {
            list.add(i);
        }
        for (int i = 16; i <= 20; i++) {
            list.add(new Float(i));
        }
        System.out.println(list);
        Queue < Number > que = (LinkedList)list;
        que.remove();
        que.offer(88);
                System.out.println(que);
//        que.poll();

//        que.remove();

        que.remove(11);
        System.out.println("after remove 11 \n"+que);

//        for (Number i : que)  {
//            System.out.print(i + " ");
//        }
    }
}
