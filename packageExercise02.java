package idea.chapter08.encapsulation;

/**
 * 封装例题2
 */
public class packageExercise02 {
    public static void main(String[] args) {

        /*
        创建程序，在其中定义类：Account和体会Java的封装性。
        1.Account类要求具有属性：姓名(长度为2位3位或4位)、余额(必须>20)、密码(必须是六位)，如果不满足，则给出提示信息，并给默认值
        2.通过setXxx的方法给Account的属性赋值。
        3.在AccountTest中测试
         */

        Account account = new Account();
        account.setBalance(1);
        account.setName("jack");
        account.setPwd("1");
        System.out.println(account);
    }
}


