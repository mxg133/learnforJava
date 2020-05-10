package Ball;

public class MovingBall extends Ball {
    private double m_speed;

    public MovingBall(){}

    public MovingBall(double x, double y, double r, String c, double m_speed){
        super(x, y, r, c);
        this.m_speed = m_speed;
    }

    public String toString(){
        return super.toString() + ", and speed is " + Double.toString(m_speed);
    }
}
