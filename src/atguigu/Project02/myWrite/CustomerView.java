package atguigu.Project02.myWrite;

public class CustomerView {
    CustomerList customerList = new CustomerList(10);

    public CustomerView() {
        Customer customer = new Customer("王涛", '男', 23, "12345678", "wangtao@qq.com");
        customerList.addCustomer(customer);
    }

    public void enterMainMenu() {
        boolean isFlag = true;
        while (isFlag){
        System.out.println("\n---------我的客户信息管理软件---------\n");
        System.out.println("           1 添 加 客 户");
        System.out.println("           2 修 改 客 户");
        System.out.println("           3 删 除 客 户");
        System.out.println("           4 客 户 列 表");
        System.out.println("           5 退       出\n");
        System.out.print("           请选择(1-5)：");
        char menu = CMUtility.readMenuSelection();
        switch (menu){
            case '1':
                addNewCustomer();
                break;
            case '2':
                modifyCustomer();
                break;
            case '3':
                deleteCustomer();
                break;
            case '4':
                listAllCustomer();
                break;
            case '5':
                System.out.println("确认是否退出（Y/N）:");
                char isExit = CMUtility.readConfirmSelection();
                if (isExit == 'Y'){
                    isFlag = false;
                }
        }
        }
    }

    private void addNewCustomer(){
        System.out.println("-------------添加客户----------");
        System.out.print("姓名：");
        String m_name = CMUtility.readString(10);
        System.out.print("性别：");
        char m_grnder = CMUtility.readChar();
        System.out.print("年龄：");
        int m_age = CMUtility.readInt();
        System.out.print("电话：");
        String m_phone = CMUtility.readString(13);
        System.out.print("邮箱：");
        String m_email = CMUtility.readString(30);

        Customer customer = new Customer(m_name, m_grnder, m_age, m_phone, m_email);
        boolean isSuccess = customerList.addCustomer(customer);
        if (isSuccess){
            System.out.println("好");
        }else {
            System.out.println("不能添加");
        }
    }

    private void modifyCustomer(){
        System.out.println("-------------修改客户---------");
        Customer cust;
        int number;
        for (;;){
            System.out.print("请选择要修改的编号（-1推出）：");
            number = CMUtility.readInt();
            if (number == -1){
                return;
            }
            cust = customerList.getCustomer(number - 1);
            if (cust == null){
                System.out.println("没有这个客湖！");
            }else {
                break;
            }
        }

        System.out.print("姓名(" + cust.getM_Name() + "):");
        String m_name = CMUtility.readString(10, cust.getM_Name());

        System.out.print("性别(" + cust.getM_Gender() + "):");
        char m_gender = CMUtility.readChar(cust.getM_Gender());

        System.out.print("年龄(" + cust.getM_Age() + "):");
        int m_age = CMUtility.readInt(cust.getM_Age());

        System.out.print("电话(" + cust.getM_Phone() + "):");
        String m_phone = CMUtility.readString(13, cust.getM_Phone());

        System.out.print("邮箱(" + cust.getM_Email()+ "):");
        String m_email = CMUtility.readString(30, cust.getM_Email());

        Customer newcustomer = new Customer(m_name, m_gender, m_age, m_phone, m_email);
        boolean isRepalaces = customerList.replaceCustomer(number - 1, newcustomer);
        if (isRepalaces){
            System.out.println("修改成功");
        }else {
            System.out.println("修改失败");
        }
    }

    private void deleteCustomer(){
        System.out.println("-----删除客户------------");
        Customer customer;
        int number;
        for (;;) {
            System.out.print("请选择要删除的编号（-1推出）：");
            number = CMUtility.readInt();
            if (number == -1) {
                return;
            }
            customer = customerList.getCustomer(number - 1);
            if (customer == null){
                System.out.println("没有这个客湖！");
            }else {
                break;
            }
        }
        System.out.print("确认是否删除(Y/N)：");
        char isDelete = CMUtility.readConfirmSelection();
        if (isDelete == 'Y'){
            boolean deleteSuccess = customerList.deleteCustomer(number - 1);
            if(deleteSuccess){
                System.out.println("---------------------删除完成---------------------");
            }else{
                System.out.println("---------------------删除失败---------------------");
            }
        }else {
            return;
        }
    }

    private void listAllCustomer(){
        System.out.println("-----------客户列表-----------\n");
        int total = customerList.getM_Total();
        if (total == 0){
            System.out.println("无记录！");
        }else {
            System.out.println("编号\t姓名\t性别\t年龄\t电话\t\t\t邮箱");
            Customer custs[] = customerList.getAllCustomer();
            for (int i = 0; i < custs.length; i++) {
                System.out.println((i + 1) + "\t" +
                        custs[i].getM_Name() + "\t" +
                        custs[i].getM_Gender() + "\t" +
                        custs[i].getM_Age() + "\t" +
                        custs[i].getM_Phone() + "\t" +
                        custs[i].getM_Email());
            }
        }
    }

    public static void main(String[] args) {
        CustomerView view = new CustomerView();
        view.enterMainMenu();
    }
}
