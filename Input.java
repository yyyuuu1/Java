import java.util.Scanner;//表示把java.util下的Scanner类导入 
public class Input { 

	//编写一个main方法
	public static void main(String[] args) {
		//创建一个scanner 对象
		Scanner myScanner=new Scanner(System.in);
		System.out.println("请输入用户的名字");
		String name=myScanner.next();
		System.out.println("请输入用户的年龄");
		int age=myScanner.nextInt();
		System.out.println("请输入用户的工资");
		double sal =myScanner.nextDouble();

		System.out.println("用户的名字为"+name+"用户的年龄为"+age+"用户的工资为"+sal);


	}
}