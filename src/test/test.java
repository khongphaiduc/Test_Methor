package test;

import java.util.ArrayList;
import java.util.Scanner;

public class test {
   static ArrayList<nguoi>list=new ArrayList<>();
    Scanner duc = new Scanner(System.in);
    public test(){
        nguoi t1=new nguoi("duc",20);
        nguoi t2 = new nguoi("minh",20);
        nguoi t3=new nguoi("hue",20);
list.add(t1);
list.add(t2);
list.add(t3);
    }


    public void check() {

        String name = duc.nextLine();
        int age= duc.nextInt();
        nguoi t= new nguoi(name,age);
        if(list.contains(t)){
            System.out.printf("thong tin đã tồn tại ");
        }else{
            list.add(t);
            System.out.println("thêm đối tượng thành công !");
        }

        System.out.println("After");
        for(nguoi s:list){
            System.out.println(s);
        }
    }

}
