//this works I swear
public class SemmleClass {
    private int counter;

    //constructor
    public SemmleClass() {
        this.counter = 0;
    }

    //TODO call
    public void NotCalled(){
        this.Called();
    }

    public void Called() {
        this.counter++;
    }
}
