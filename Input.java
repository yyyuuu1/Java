import java.util.Scanner;//��ʾ��java.util�µ�Scanner�ർ�� 
public class Input { 

	//��дһ��main����
	public static void main(String[] args) {
		//����һ��scanner ����
		Scanner myScanner=new Scanner(System.in);
		System.out.println("�������û�������");
		String name=myScanner.next();
		System.out.println("�������û�������");
		int age=myScanner.nextInt();
		System.out.println("�������û��Ĺ���");
		double sal =myScanner.nextDouble();

		System.out.println("�û�������Ϊ"+name+"�û�������Ϊ"+age+"�û��Ĺ���Ϊ"+sal);


	}
}