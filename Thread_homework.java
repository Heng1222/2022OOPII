import java.util.Random;
class sellClass implements Runnable{
    static int totalTickets = 10000;
    int Tickets;
    Thread r;
    public sellClass(String name){
        Tickets = 0;//該機器賣出之總票數
        r = new Thread(this,name);
        r.start();
    }
    public void run(){
        Random random = new Random();
        int howManyTickets = random.nextInt(1,5);//此次賣出票數
        while(getTickets(howManyTickets) == true){
            Tickets+=howManyTickets;
            System.out.printf("%s此次賣出%d張票，目前%s共賣出%d張，還剩%d張%n", r.getName(), howManyTickets, r.getName(), Tickets, sellClass.totalTickets);
            howManyTickets = random.nextInt(1,5);
        }
        System.out.println(r.getName()+"總共賣出"+Tickets+"張票");
    }
    synchronized private static boolean getTickets(int number){
        if(totalTickets >= number){
            totalTickets-= number;
            return true;
        }
        else{
            return false;
        }
    }


}

public class Thread_homework {
    public static void main(String[] args){
        sellClass seller1 = new sellClass("機器1");
        sellClass seller2 = new sellClass("機器2");
        sellClass seller3 = new sellClass("機器3");
        sellClass seller4 = new sellClass("機器4");

    }
}
