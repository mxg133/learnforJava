package atguigu.day16.java1.my;

public class my {
    public static void main(String[] args) {


        String str = "1ad";

        //
        try {
            int num = Integer.parseInt(str);
        }catch (NumberFormatException e){
            System.out.println("NumberFormatException了");
            System.out.println(e.getMessage());
            System.out.println();
        }catch (Exception e){
            System.out.println("Exception了");
        }
    }
    }