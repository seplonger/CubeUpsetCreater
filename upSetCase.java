//用于生成打乱图案
//极笨且低效率的方法，我智商太低啊...用六个数组模拟转动，只支持三阶目前不知是输出部分还是模拟过程有问题，输出的图案全是错的= =，留待以后研究吧
class upsetCase {
	String[] w={"白","白","白","白","白","白","白","白","白"};
	String[] y={"黄","黄","黄","黄","黄","黄","黄","黄","黄"};
	String[] g={"绿","绿","绿","绿","绿","绿","绿","绿","绿"};
	String[] b={"蓝","蓝","蓝","蓝","蓝","蓝","蓝","蓝","蓝"};
	String[] r={"红","红","红","红","红","红","红","红","红"};
	String[] o={"橙","橙","橙","橙","橙","橙","橙","橙","橙"};
	public void Arithmetic(String[] z){
		int times;
		for(int i=0;i<z.length-1;i++){
			if(z[i].length()==2){
				char manner=z[i].charAt(0);
				if(z[i].charAt(1)=='2'){
					times=2;
				}else{
					times=3;
				}
				this.doUpSet(manner,times, w, y, g, b, r, o);
			}else{
				char manner=z[i].charAt(0);
				this.doUpSet(manner,1, w, y, g, b, r, o);
			}
		}
		this.printUpsetCase();
	}
	public void doUpSet(char manner,int times,String[] w,String[] y,String[] g,String[] b,String[] r,String[] o){
		if(manner=='R'){
			for(int i=0;i<times;i++){
				//复制1
				String a_a=b[2];
				String a_b=b[5];
				String a_c=b[8];
				//1=4
				b[2]=w[2];
				b[5]=w[5];
				b[8]=w[8];
				//复制2
				String b_a=y[2];
				String b_b=y[5];
				String b_c=y[8];
				//2=复制1
				y[2]=a_a;
				y[5]=a_b;
				y[8]=a_c;
				//复制3
				String c_a=g[0];
				String c_b=g[3];
				String c_c=g[6];
				//3=复制2
				g[6]=b_a;
				g[3]=b_b;
				g[0]=b_c;
				//4=复制3
				w[8]=c_a;
				w[5]=c_b;
				w[2]=c_c;
			}
		}else if(manner=='U'){
			for(int i=0;i<times;i++){
				//复制1
				String a_a=b[0];
				String a_b=b[1];
				String a_c=b[2];
				//1=4
				b[0]=r[0];
				b[1]=r[1];
				b[2]=r[2];
				//复制2
				String b_a=o[0];
				String b_b=o[1];
				String b_c=o[2];
				//2=复制1
				o[0]=a_a;
				o[1]=a_b;
				o[2]=a_c;
				//复制3
				String c_a=g[0];
				String c_b=g[1];
				String c_c=g[2];
				//3=复制2
				g[0]=b_a;
				g[1]=b_b;
				g[2]=b_c;
				//4=复制3
				r[0]=c_a;
				r[1]=c_b;
				r[2]=c_c;
			}
		}else if(manner=='F'){
			for(int i=0;i<times;i++){
				//复制1
				String a_a=y[6];
				String a_b=y[7];
				String a_c=y[8];
				//1=4
				y[6]=o[8];
				y[7]=o[5];
				y[8]=o[2];
				//复制2
				String b_a=r[0];
				String b_b=r[3];
				String b_c=r[6];
				//2=复制1
				r[0]=a_a;
				r[3]=a_b;
				r[6]=a_c;
				//复制3
				String c_a=w[0];
				String c_b=w[1];
				String c_c=w[2];
				//3=复制2
				w[2]=b_a;
				w[1]=b_b;
				w[0]=b_c;
				//4=复制3
				o[2]=c_a;
				o[5]=c_b;
				o[8]=c_c;
			}
		}else if(manner=='B'){
			for(int i=0;i<times;i++){
				//复制1
				String a_a=y[0];
				String a_b=y[1];
				String a_c=y[2];
				//1=4
				y[0]=r[2];
				y[1]=r[5];
				y[2]=r[8];
				//复制2
				String b_a=o[0];
				String b_b=o[3];
				String b_c=o[6];
				//2=复制1
				r[6]=a_a;
				r[3]=a_b;
				r[0]=a_c;
				//复制3
				String c_a=w[6];
				String c_b=w[7];
				String c_c=w[8];
				//3=复制2
				w[6]=b_a;
				w[7]=b_b;
				w[8]=b_c;
				//4=复制3
				r[8]=c_a;
				r[5]=c_b;
				r[2]=c_c;
			}
		}else if(manner=='D'){
			for(int i=0;i<times;i++){
				//复制1
				String a_a=b[6];
				String a_b=b[7];
				String a_c=b[8];
				//1=4
				b[6]=r[6];
				b[7]=r[7];
				b[8]=r[8];
				//复制2
				String b_a=o[6];
				String b_b=o[7];
				String b_c=o[8];
				//2=复制1
				o[6]=a_a;
				o[7]=a_b;
				o[8]=a_c;
				//复制3
				String c_a=g[6];
				String c_b=g[7];
				String c_c=g[8];
				//3=复制2
				g[6]=b_a;
				g[7]=b_b;
				g[8]=b_c;
				//4=复制3
				r[6]=c_a;
				r[7]=c_b;
				r[8]=c_c;
			}
		}
	}
	public void printUpsetCase(){
		//黄色在最上边，左边空出一些距离
		System.out.print("\t"+y[0]);
		System.out.print(y[1]);
		System.out.print(y[2]);
		System.out.println();
		System.out.print("\t"+y[3]);
		System.out.print(y[4]);
		System.out.print(y[5]);
		System.out.println();
		System.out.print("\t"+y[6]);
		System.out.print(y[7]);
		System.out.print(y[8]);
		System.out.println();
		

		System.out.print(o[0]);
		System.out.print(o[1]);
		System.out.print(o[2]);
		System.out.print("     ");//五个空格
		System.out.print(b[0]);
		System.out.print(b[1]);
		System.out.print(b[2]);
		System.out.print("     ");
		System.out.print(r[6]);
		System.out.print(r[7]);
		System.out.print(r[8]);
		System.out.print("     ");
		System.out.print(g[0]);
		System.out.print(g[1]);
		System.out.print(g[2]);
		System.out.println();
		
		
		
		System.out.print(o[3]);
		System.out.print(o[4]);
		System.out.print(o[5]);
		System.out.print("     ");//五个空格
		System.out.print(b[3]);
		System.out.print(b[4]);
		System.out.print(b[5]);
		System.out.print("     ");
		System.out.print(r[3]);
		System.out.print(r[4]);
		System.out.print(r[5]);
		System.out.print("     ");
		System.out.print(g[3]);
		System.out.print(g[4]);
		System.out.print(g[5]);
		System.out.println();
		
		
		
		System.out.print(o[6]);
		System.out.print(o[7]);
		System.out.print(o[8]);
		System.out.print("     ");//五个空格
		System.out.print(b[6]);
		System.out.print(b[7]);
		System.out.print(b[8]);
		System.out.print("     ");
		System.out.print(r[6]);
		System.out.print(r[7]);
		System.out.print(r[8]);
		System.out.print("     ");
		System.out.print(g[6]);
		System.out.print(g[7]);
		System.out.print(g[8]);
		System.out.println();
		
		
		
		//白色在最下边,左边空出一点距离
		
		System.out.print("\t"+w[0]);
		System.out.print(w[1]);
		System.out.print(w[2]);
		System.out.println();
		System.out.print("\t"+w[3]);
		System.out.print(w[4]);
		System.out.print(w[5]);
		System.out.println();
		System.out.print("\t"+w[6]);
		System.out.print(w[7]);
		System.out.print(w[8]);
		System.out.println();
	}
}