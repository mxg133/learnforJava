package Ball;

public class Point {
    private double m_xCoordinate;
    private double m_yCoordinate;

    public Point(){}

    public Point(double m_xCoordinate, double m_yCoordinate){
        this.m_xCoordinate = m_xCoordinate;
        this.m_yCoordinate = m_yCoordinate;
    }

    public String toString(){
        return "(" + Double.toString(m_xCoordinate) + ", "
                + Double.toString(m_yCoordinate) + ")";
    }
}
