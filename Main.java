//主程序
import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner smy=new Scanner(System.in);
		createUpset a=new createUpset();
		upsetCase b=new upsetCase();
		Detection c=new Detection();
		String ask="";
		do{
			System.out.println("正在运行生成魔方方打乱程序，目前打乱图案有bug待修复                 ----------by zean");
			System.out.println("请输入需要的打乱阶数，目前支持2~7");
			int js=smy.nextInt();
			System.out.println("请输入需要的打乱步数");
			int sl=smy.nextInt();
			String[] z;
			z=c.performUpset(sl,js);
			for(int i=0;i<sl;i++){
				System.out.print(z[i]);
			}
			System.out.println();
			if(js==3){
				b.Arithmetic(z);
			}
			System.out.print("是否继续？(y/n)");
			ask=smy.next();
		}while(!ask.equals("n"));
	}
}