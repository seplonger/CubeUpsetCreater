
public class Detection {
	createUpset a=new createUpset();
	//有参有返回 方法  根据提供的阶数返回打乱
	public String[] performUpset(int sl,int js){  //int是返回值的类型，这时候就不用写"void"了。
		String[] z=new String[sl];
		if(js==3){
			z=a.sc3(sl);
		}
		if(js==2){
			z=a.sc2(sl);
		}
		if(js==4){
			z=a.sc4(sl);
		}
		if(js==5){
			z=a.sc5(sl);
		}
		if(js==6){
			z=a.sc6(sl);
		}
		if(js==7){
			z=a.sc7(sl);
		}
		return z;
	}
}
