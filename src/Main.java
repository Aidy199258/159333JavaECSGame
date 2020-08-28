
import javax.swing.JFrame;


public class Main {

    public static  Game_Panel game_panel;

    public Main() {

        //Testing

        JFrame frame = new JFrame();
        game_panel = new Game_Panel();



        frame.add(game_panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Puppy Run");

        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }


    public static void main(String[] args) {
        new Main();
    }

    //This is a 2D java game called The Flying Puppy written with ECS framework
    /*System.out.println("The Flying Puppy");

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


        }*/
}