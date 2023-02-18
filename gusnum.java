
import java.util.*;
import javax.swing.*;
import java.util.Random;
public class gusnum {
      public static void main(String args[]) {
          Random random = new Random();
          Scanner sc = new Scanner(System.in);
          int compunumber = random.nextInt(50) + 1;
          int trails = 0;
          boolean probs = false;
          int usernum;
          //System.out.println("I will give you only 10 trails");
          JOptionPane.showMessageDialog(null, "You have only 10 trails " , "Guess the number I have generated", JOptionPane.INFORMATION_MESSAGE);
          while (probs == false) {
              String num = JOptionPane.showInputDialog(null, "Enter number between 1 to 50", "Guess the number I have generated", JOptionPane.INFORMATION_MESSAGE);
              usernum = Integer.parseInt(num);
              trails++; //first trail of user.
              if (trails <= 10) {
                  //check for equality of computer and user guess
                  if (usernum == compunumber) {
                      probs = true;
                      JOptionPane.showMessageDialog(null, "Yup you got it in " + trails + "trails", "Guess the number I have generated", JOptionPane.INFORMATION_MESSAGE);
                      //displaying message of winning or guessing the game
                      System.out.println("Hurray !!! you got it.........");
                      System.out.println("Thankyou!!");
                      System.out.println("see you next time Bye ....");
                      break;
                  }
                  //if the user guess is less than the computer number
                  else if (usernum < compunumber)
                      JOptionPane.showMessageDialog(null, "Your guess is low", "Guess the number I have generated", JOptionPane.INFORMATION_MESSAGE);
                      //System.out.println("Your guess is low");
                      //if the user guess is more than the computer number
                  else
                      JOptionPane.showMessageDialog(null, "Your guess is high", "Guess the number I have generated", JOptionPane.INFORMATION_MESSAGE);
                  //System.out.println("Your guess is high");


              }
              else {
                  JOptionPane.showMessageDialog(null, "Your are out of trails", "Guess the number I have generated", JOptionPane.INFORMATION_MESSAGE);
                  probs = true;
                  break;
              }

          }

              sc.close();
          }

}
