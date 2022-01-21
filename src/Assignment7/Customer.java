package Assignment7;


public class Customer {

    private String name;
    private int line;
    private double waitTime;

    public Customer(String name, int line, double waitTime) {
        this.name = name;
        this.line = line;
        this.waitTime = waitTime;
    }
        public String getName () {
            return this.name;
        }

        public double getWaitTime () {
            return this.waitTime;
        }

        @Override
        public String toString () {
            return "Name: " + this.name + " " + "Line: " + this.line + " " + "Wait Time: " + this.waitTime;
        }
    }

