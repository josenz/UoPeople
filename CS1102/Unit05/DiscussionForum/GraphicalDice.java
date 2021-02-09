public class GraphicalDice extends PairOfDice {

    public void roll() {
        // Roll the dice, and redraw them.
        super.roll(); // Call the roll method from PairOfDice.
        redraw(); // Call a method to draw the dice.
    }
    // .
    // . More stuff, including definition of redraw().
    // .

    public void redraw() {
        System.out.println("Redrawing the dices!");
    }
}