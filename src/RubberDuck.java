class RubberDuck extends Duck {

    // override fly() and implement it to do nothing
    @Override
    void fly() {
        ;	// do nothing
    }

    @Override
    void display() {
        System.out.println("RubberDuck floats on the water");
    }
}