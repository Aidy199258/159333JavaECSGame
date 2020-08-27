import Entities.Puppy;
import Systems.GameControl;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //This is a 2D java game called The Flying Puppy written with ECS framework
        System.out.println("The Flying Puppy");

        System.out.print("Testing Testing");

        Puppy puppy = new Puppy();
        GameControl.StartGame(puppy);

        new Window();
        boolean RestartGame = false;
        //......Codes for choices to restart game

        Boolean ExitGame = false;
        while(true) {
            if (ExitGame){ break;}//Break the loop if Exit Button is pressed

            //Codes running program
            
            if (!puppy.getLife()) {//Puppy died - Game over
                System.out.println("Game Over :( ");

            }
            if (RestartGame) {
                //If player clicks Restart Game button any time
                GameControl.StartGame(puppy);
                RestartGame = false;


            }
        }

    }

}
