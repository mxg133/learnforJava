package atguigu.Project02.myWrite;

public class CustomerList {
    private Customer m_Customers[];
    private int m_Total;

    /**
     *
     * @param totalCustomer
     */
    public CustomerList(int totalCustomer) {
        m_Customers = new Customer[totalCustomer];
    }

    public boolean addCustomer(Customer customer){
        if(m_Total >= m_Customers.length){
            return false;
        }else {
            m_Customers[m_Total] = customer;
            m_Total++;
            return true;
        }
    }

    public boolean replaceCustomer(int index, Customer customer){
        if(index < 0 || index >= m_Total){
            return false;
        }else {
            m_Customers[index] = customer;
            return true;
        }
    }

    public boolean deleteCustomer(int index){
        if(m_Total >= m_Customers.length){
            return false;
        }else{
            for (int i = index; i < m_Total - 1; i++) {
                m_Customers[i] = m_Customers[i + 1];
            }
            m_Customers[m_Total - 1] = null;
            m_Total--;
            return true;
        }
    }

    public Customer[] getAllCustomer(){
        Customer[] custs = new Customer[m_Total];
        for (int i = 0; i < m_Total; i++) {
            custs[i] = m_Customers[i];
        }
        return custs;
    }

    public Customer getCustomer(int index){
        if(index < 0 || index >= m_Total){
            return null;
        }else {
            return m_Customers[index];
        }
    }

    public int getM_Total(){
        return m_Total;
    }
}
