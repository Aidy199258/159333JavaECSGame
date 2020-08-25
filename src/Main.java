import Entities.Puppy;
import Systems.GameControl;

public class Main {
    public static void main(String[] args) {
        //This is a 2D java game called The Flying Puppy written with ECS framework
        System.out.println("The Flying Puppy");

        Puppy puppy = new Puppy();
        GameControl.StartGame(puppy);

        boolean RestartGame = false;
        //......Codes for choices to restart game

        while(true) {
            //If puppy has no life left, Game Over.
            if (puppy.getLife()) {
                System.out.println("Game Over :( ");
                if (RestartGame) {
                    GameControl.StartGame(puppy);
                    RestartGame = false;
                }
            }else if (RestartGame){
                //If player clicks Restart Game button any time
                GameControl.StartGame(puppy);
                RestartGame = false;
                
                
            }
        }

    }
}
