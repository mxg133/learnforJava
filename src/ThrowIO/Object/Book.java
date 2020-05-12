package ThrowIO.Object;

public class Book implements Serializable {
    int m_id;
    String m_name;
    String m_auhtor;
    float m_price;
    public Book(int m_id, String m_name, String m_auhtor, float m_price){
        this.m_id = m_id;
        this.m_name = m_name;
        this.m_auhtor = m_auhtor;
        this.m_price = m_price;
    }
}
