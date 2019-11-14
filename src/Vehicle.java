public abstract class Vehicle {

    private int wheels;
    private String colour;
    private int mass;
    private int velocity;
    public Vehicle(int w, String c, int m, int v)
    {
        wheels = w;
        colour = c;
        mass = m;
        velocity = v;
    }
    
    public abstract void accelerate();
    public abstract void brk();
    public void stopEngine(){
        System.out.println("The engine has been stopped.");
    }
    public void startEngine(){
        System.out.println("The engine has been started.");
    }
    
    public int getWheels()
    {
        return wheels;
    }
    public String getColour()
    {
        return colour;
    }
    public int getMass()
    {
        return mass;
    }
    public int getVelocity()
    {
        return velocity;
    }
    
    public void setColour(String c)
    {
        colour = c;
    }
}
