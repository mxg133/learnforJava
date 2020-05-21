package atguigu.Project02.myWrite;

public class Customer {
    private String m_Name;
    private char m_Gender;
    private int m_Age;
    private String m_Phone;
    private String m_Email;

//    构造函数
    public Customer() {
    }

    public Customer(String m_Name, char m_Gender, int m_Age, String m_Phone, String m_Email) {
        this.m_Name = m_Name;
        this.m_Gender = m_Gender;
        this.m_Age = m_Age;
        this.m_Phone = m_Phone;
        this.m_Email = m_Email;
    }

//    get set方法
    public String getM_Name() {
        return m_Name;
    }

    public void setM_Name(String m_Name) {
        this.m_Name = m_Name;
    }

    public char getM_Gender() {
        return m_Gender;
    }

    public void setM_Gender(char m_Gender) {
        this.m_Gender = m_Gender;
    }

    public int getM_Age() {
        return m_Age;
    }

    public void setM_Age(int m_Age) {
        this.m_Age = m_Age;
    }

    public String getM_Phone() {
        return m_Phone;
    }

    public void setM_Phone(String m_Phone) {
        this.m_Phone = m_Phone;
    }

    public String getM_Email() {
        return m_Email;
    }

    public void setM_Email(String m_Email) {
        this.m_Email = m_Email;
    }

}
