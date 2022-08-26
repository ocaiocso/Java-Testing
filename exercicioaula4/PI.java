package exercicioaula4;

public class PI {

    Double pi = 3.14159;

    public double getDouble() {
        return pi;
    }

    public int getInt() {
        return this.pi.intValue();
    }

    public float getFloat() {
        return this.pi.floatValue();
    }

    public String getString() {
        return this.pi.toString();
    }
}
