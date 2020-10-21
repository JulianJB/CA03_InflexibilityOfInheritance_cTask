/*
 * No Change here
 */
abstract class Duck {

    Duck() {
        //System.out.println(" a " + this.getClass().getName()); Uncomment me when finish
        System.out.println(" a " + this.getClass().getSimpleName());
    }

    void quack() {
        //System.out.println("<<" + this.getClass().getName() + " quack sound>>"); Uncomment me when finish
        System.out.println("<<" + this.getClass().getSimpleName() + " quack sound>>");
    }

    void swim() {
        //System.out.println("<<" + this.getClass().getName() + " swim style>>"); Uncomment me when finish
        System.out.println("<<" + this.getClass().getSimpleName() + " swim style>>");
    }

    void fly() {
        //System.out.println("<<" + this.getClass().getName() + " fly style>>"); Uncomment me when finish
        System.out.println("<<" + this.getClass().getSimpleName() + " fly style>>");
    }

    //Force sub-classes to implement a display() method
    abstract void display();
}