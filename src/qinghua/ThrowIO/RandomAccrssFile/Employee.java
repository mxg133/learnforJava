package qinghua.ThrowIO.RandomAccrssFile;

public class Employee {
//    姓名不能超过8个字符
    char m_name[] = {'\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000', '\u0000', '\u0000', '\u0000', };
    int m_age;
    public Employee(String m_name, int m_age)throws Exception{
        if (m_name.toCharArray().length > 8){
            System.arraycopy(m_name.toCharArray(), 0, this.m_name, 0, 8);
        }else {
            System.arraycopy(m_name.toCharArray(), 0, this.m_name, 0, m_name.toCharArray().length);
            this.m_age = m_age;
        }
    }






}
