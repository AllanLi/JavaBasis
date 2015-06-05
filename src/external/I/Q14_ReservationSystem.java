package external.I;

/*
 * 此程式為航空公司之訂位系統，座位容量10,當使用者輸入1或2，系統會為其劃位
 * 使用者輸入1，表示頭等艙(1-5)
 * 使用者輸入2，表示經濟艙(6-10)
 */

 
import java.util.Random;
import java.util.Scanner;
 
/**
 *
 * @author Fred
 */
public class Q14_ReservationSystem {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean seats[]=new boolean[10];    //0-4頭等艙，5-9經濟艙
        Scanner input=new Scanner(System.in);
        int id=0;
        int choice;
        String yes_no;
        boolean flag1;  //頭等艙
        boolean flag2;  //經濟艙
        
        while(true){
            System.out.println("歡迎使用本系統，很高興能為您服務");
            System.out.println("Please type 1 for First Class");
            System.out.println("Please type 2 for Economy");
            System.out.print("Please choice:");
            choice=input.nextInt();
            flag1=check(seats,0);
            flag2=check(seats,5);
            switch(choice){
                case 1:
                    if(flag1){
                        setSeat(seats,0);
                        //id=setSeat(seats,0);
                        //System.out.println("座位編號"+id+",屬於頭等艙");
                    }
                    else if(flag2){
                        System.out.print("很抱歉，頭等艙座位已滿，是否願意換經濟艙[y/n]:");
                        yes_no=input.next();
                        if(yes_no.equals("Yes")||yes_no.equals("yes")||yes_no.equals("y")||yes_no.equals("Y"))
                            setSeat(seats,5);
                        else
                            System.out.println("Next flight leaves in 3 hours.");
                    }
                    else
                        System.out.println("很抱歉，目前機位已全滿。");
                    break;
                case 2:
                    if(flag2){
                        setSeat(seats,5);
                        //id=setSeat(seats,5);
                        //System.out.println("座位編號"+id+"屬於經濟艙");
                    }
                    else if(flag1){
                        System.out.print("很抱歉，頭等艙座位已滿，是否願意換頭等艙[y/n]:");
                        yes_no=input.next();
                        if(yes_no.equals("Yes")||yes_no.equals("yes")||yes_no.equals("y")||yes_no.equals("Y"))
                            setSeat(seats,0);
                        else
                            System.out.println("Next flight leaves in 3 hours.");
                    }
                    else
                        System.out.println("很抱歉，目前機位已全滿。");
            }
            System.out.println("感謝您使用本航空之訂票系統!\n");
        }
    }
    public static boolean check(boolean[] array,int size){
        for(int i=0;i<size+5;i++){
            if(!array[i])
                return true;
        }
        return false;
    }
    public static void setSeat(boolean[] array,int init){
        Random random=new Random();
        int index;
        while(true){      
            index=init+random.nextInt(5);
            if(!array[index])
            {
                array[index]=true;
                break;
            }
        }
        //return index+1;
        if(init<5)
            System.out.println("座位編號"+(index+1)+",屬於頭等艙");
        else
            System.out.println("座位編號"+(index+1)+"屬於經濟艙");
    }
}
