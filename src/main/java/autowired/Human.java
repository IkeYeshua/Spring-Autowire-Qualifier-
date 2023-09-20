package autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {
    private Heart heart;


    public Human(){}
@Autowired
   public Human(Heart heart) {
      this.heart = heart;}

    public void setHeart(Heart heart) {
        this.heart = heart;
    }

    public void startPumping() {

        if (heart != null) {
            heart.pump();
        }else {
            System.out.println("You are dead");
        }
    }
}
