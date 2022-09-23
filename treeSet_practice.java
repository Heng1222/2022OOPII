import java.util.*;
public class treeSet_practice{
    public static void main(String[] args){
        TreeSet<Integer> tset = new TreeSet<Integer>();
        Random random = new Random();
        int randomNumber = random.nextInt(1,101);
        int tsetSize = tset.size();
        System.out.println("電腦從1~100的整數中,亂數取出10個不重複的號碼...");
        while(tset.size() != 10){
            tset.add(randomNumber);
            if((tset.size() - tsetSize) == 1){//tset元素個數增加才算新的號碼
                System.out.println("第"+tset.size()+"個號碼:"+randomNumber);
            }
            randomNumber = random.nextInt(1,101);
            tsetSize = tset.size();
        }
        System.out.println("物件內元素個數為:"+tset.size());
        System.out.println("物件內元素的內容:"+tset);
        System.out.println("第一個元素內容為:"+tset.first());
        System.out.println("最後一個元素內容:"+tset.last());
        System.out.println("內容介於30~70者:"+tset.subSet(30, 70));
    }
}
