import java.util.*;
class Video{
                    String vName;
                    boolean chkout;
                    int rate;

                Video(String name){
                            vName=name;
                               }

               public String getName(){
                            return vName; 
                              }
               public void doChkout(){
                           if(chkout==false)
	                chkout=true;
                             }

              public void doReturn(){
	              if(chkout==true)
	                    chkout=false;
                             }



              public void receiveRate(int rating){
                                       rate=rating;
                            }

                public int getRating(){
                                     return rate;
                              }

                  public boolean getChkout(){
                                          return chkout;
                                       }
             }
