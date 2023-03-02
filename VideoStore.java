import java.util.*;
class VideoStore{
    static Video[] store=new Video[1000];
    static int i=0;
    static int max=20;
    static int j=0;

public void addVideo(String name){
                   System.out.println("Video \""+name+"\" added successfully.");  
                   Video v=new Video(name);
                    store[i]=v;
                    i++;
                   max=name.length()>max?name.length():max;
                     }

public void doChkout(String name){
                  int f=0;
                 for(j=0;j<i;j++)
                       {
             if(store[j].getName().equals(name)) {
                                                f=1;
                                               store[j].doChkout();
                                           }
                       }
               if(f==1)	
              System.out.println("Video \""+name+"\" checked out successfully.");
                else
             System.out.println("Video is not present in the inventory.");
                        }

public void doReturn(String name){
                              int f=0;
                             for(j=0;j<i;j++)
                              {
                      if(store[j].getName().equals(name)) {
                                                          f=1;
                                                          store[j].doReturn();
                                                          }
                               }
                           if(f==1)
                          System.out.println("Video \""+name+"\" returned out successfully.");
                           else
                          System.out.println("Video is not present in the inventory.");
                                   }

public void receiveRating(String name,int rating){
                                                int f=0;
                                                for(j=0;j<i;j++)
                                                 {
                                                if(store[j].getName().equals(name)) {
                                                                                      f=1;
                                                                                  store[j].receiveRate(rating);
                                                                     }
                                                    }
                                               if(f==1)
                                              System.out.println("Rating \""+rating+"\" has been mapped to the Video \""+name+"\".");
                                                else
                                             System.out.println("Video is not present in the inventory.");

                                                     }

public void listInventory(){
                     j=0;
                    for(int k=0;k<max;k++)
                       System.out.print("-");
                     System.out.println("------------------------------------------------------");
                     System.out.print("Video Name");
                     for(int k=0;k<max-10;k++)
                       System.out.print(" ");
                     System.out.println("|\t Checkout Status \t\t|\t Rating");

                     while(j<i)
                       {
            System.out.print(store[j].getName());
            for(int k=0;k<max-store[j].getName().length();k++)
             System.out.print(" ");
             System.out.println("|\t"+store[j].getChkout()+"\t\t\t\t|\t  "+store[j].getRating());
              j++;
                        }
                   for(int k=0;k<max;k++)
                       System.out.print("-");
                   System.out.println("------------------------------------------------------");
                       }
}
