/*
 * ADDED: this class to represent a DecoyDuck
 * Note: a DecoyDuck is an imitation duck used by hunters
 *		to lure real ducks. A DecoyDuck should not be able to
 *		fly, or quack.
 *		It can only float, which could be thought of as
 *		a kind of "swim" behaviour (well, kind of)?.
 */
class DecoyDuck extends Duck {

    @Override
    void quack() {
        ;	//do nothing
    }

    @Override
    void fly() {
        ;	//do nothing
    }

    @Override
    void display() {
        System.out.println("DecoyDuck floats on the water");
    }
}