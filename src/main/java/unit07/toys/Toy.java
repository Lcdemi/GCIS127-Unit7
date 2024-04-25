package unit07.toys;
import unit07.products.*;

public abstract class Toy extends Product {

    public Toy(String name, double msrp) {
        super(name, msrp);
    }

    public abstract void play();

    @Override
    public String toString() {
        return "A toy with the product code " + getProductCode() + ", the name " + getName() 
        + ", and a price of $" + getMsrp() + ".";
    }

    public static void main(String[] args) {
        Robot robot1 = new Robot(4.99, "WEE WOO"); //robot with no charge
        System.out.println(robot1);
        robot1.play();

        Robot robot2 = new Robot(4.99, "BEEP BOOP"); //robot with full charge
        robot2.charge();
        System.out.println(robot2);
        robot2.play();

        Doll doll = new Doll(2.99, "Red", "Blue", new String[]{"I love you.", "Let's be friends!", "Feed Me.", "Best Friends Forever!"});
        System.out.println(doll); //new doll
        doll.play();

        for(int i = 0; i < 10; i++) { //doll break
            doll.play();
        }

        //actionfigure without kungfugrip
        ActionFigure actionfigure1 = new ActionFigure(8.99, "Black", "Green", new String[]{"Let's do this!", "Teamup Time!", "Destroy Evil!", "Let's Fight!", "I believe in us."}, false);
        System.out.println(actionfigure1); //new action figure
        actionfigure1.play();

        for(int i = 0; i < 10; i++) { //action figure break
            actionfigure1.play();
        }

        //actionfigure with kungfugrip
        ActionFigure actionfigure2 = new ActionFigure(8.99, "Orange", "Blue", new String[]{"Let's do this!", "Teamup Time!", "Destroy Evil!", "Let's Fight!", "I believe in us."}, true);
        System.out.println(actionfigure2); //new action figure
        actionfigure2.play();
    }
}
