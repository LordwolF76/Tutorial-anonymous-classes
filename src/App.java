/**
 * Created by LordwolF on 8/8/2016.
 */
class Machine {
    public void start(){
        System.out.println("Starting Machine......");
    }
}

interface Plant {
    public void grow();
}

public class App {
    public static void main(String[] args) {


        //because of the override this is a subclass but anonymous one shot
        Machine machine1 = new Machine() {
            @Override public void start(){
                System.out.println("Camera Snapping");
            }
        };

        machine1.start();

        Plant plant1 = new Plant() {
            @Override
            public void grow() {
                System.out.println("Growing growing");
            }
        };

        plant1.grow();
    }
}
