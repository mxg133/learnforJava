package Driver;

public abstract class Vehicle {
    private String m_tyoe;
    public Vehicle(){}
    public Vehicle(String m_tyoe){
        this.m_tyoe = m_tyoe;
    }
    public abstract void drivedByMaleDriver();
    public abstract void drivedByFemaleDriver();
}
