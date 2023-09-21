package autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
    @Autowired
    @Qualifier("octopusHeart")
    private Heart heart;


  //  public Human(){}

   //public Human(Heart heart) {
     // this.heart = heart;}
    //public void setHeart(Heart heart) {
      //  this.heart = heart;
   // }

    public void startPumping() {

        if (heart != null) {
            heart.pump();
            System.out.println("The name of the heart is: " + heart.getNameOfHeart() +
                    " and the value of the human heart is: " + heart.getNoOfHeart());
        }else {
             System.out.println("You are dead");
        }
    }
}
