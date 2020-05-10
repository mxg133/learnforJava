package Ball;

public class Ball {
    private Point m_center;
    private double m_radius;
    private String m_color;

    public Ball(){}

    public Ball(double x, double y, double m_radius){
        m_center = new Point(x, y);
        this.m_center = m_center;
    }

    public Ball(double x, double y, double m_radius, String m_color){
        this(x, y, m_radius);
        this.m_color = m_color;
    }

    public String toString(){
        return "This ball center is " + m_center.toString() + " and radius is "
                + Double.toString(m_radius) + " and its color is " + m_color;
    }
}
