import java.util.*;
public class VideoLauncher {
                     public static void main(String args[]){
                    Scanner sc=new Scanner(System.in);
                    VideoStore v=new VideoStore();
                     int ch=0;
                     String name;
                      int rate;
                  while(true)
                  {
                     System.out.println("MAIN MENU\n=========");
                     System.out.println("1.Add Videos :");
                     System.out.println("2.Check Out Video :");
                     System.out.println("3.Return Video :");
                     System.out.println("4.Receive Rating :");
                     System.out.println("5.List Inventory :");
                     System.out.println("6.Exit :");
                     System.out.print("Enter your choice(1..6) : "); 
                     ch=sc.nextInt();
                     switch(ch)
                     {
                       case 1: 
                                  System.out.print("Enter the name of the video you want to add: ");
                                  name=sc.next();
                                  v.addVideo(name);
                                  break;
                       case 2:
                               System.out.print("Enter the name of the video you want to check out: ");
                               name=sc.next();
                               v.doChkout(name);
                               break;
                       case 3:
                             System.out.print("Enter the name of the video you want to Return: ");
                             name=sc.next();
                             v.doReturn(name);
                             break;
                       case 4:
                                System.out.print("Enter the name of the video you want to Rate: ");
                                name=sc.next();
                                System.out.print("Enter the rating for this video: ");
                                rate=sc.nextInt();
                                 v.receiveRating(name,rate);
                                 break;
                       case 5: 
	                   v.listInventory();
	                    break;
                       case 6:
	                    System.out.println("Exiting...!! Thanks for using the application.");
                                     sc.close();
                                     System.exit(0);
                                     break;
                      default:
	                       System.out.println("Wrong choice.....Please choose again!!!!:");
                    }

              } 
       }
}