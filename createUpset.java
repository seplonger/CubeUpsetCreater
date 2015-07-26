//用于生成打乱
class createUpset {
	public String[] sc3(int c){
		String[] a={"R","R'","R2","L","L'","L2","U","U'","U2","F","F'","F2","D","D'","D2","B","B'","B2"};
		String[] z=new String[c];
		for(int i=0;i<c;i++){
			int d=(int)(Math.random() * 18);
			z[i]=a[d];
		}
		for(int i=0;i<c-1;i++){
			while(z[i].charAt(0)==z[i+1].charAt(0)){
				int e=(int)(Math.random() * 18);
				z[i]=a[e];
			}
		}
		return z;
	}
	public String[] sc2(int c){
		//二阶打乱和三阶基本一样，但是R，L；U，D；F，B这样的变成了相邻的层，不能同时出现，去除这样的思路和去重一样，最后替换回来。
		String[] a={"R","R'","R2","RL","RL'","RL2","U","U'","U2","F","F'","F2","UD","UD'","UD2","FB","FB'","FB2"};
		String[] z=new String[c];
		for(int i=0;i<c;i++){
			int d=(int)(Math.random() * 18);
			z[i]=a[d];
		}
		for(int i=0;i<c-1;i++){
			while(z[i].charAt(0)==z[i+1].charAt(0)){
				int e=(int)(Math.random() * 18);
				z[i]=a[e];
			}
		}
		for(int i=0;i<c-1;i++){
			if(z[i]=="RL"){
				z[i]="L";
			}else
				if(z[i]=="RL'"){
					z[i]="L'";
				}else
					if(z[i]=="RL2"){
						z[i]="L2";
					}else
						if(z[i]=="UD"){
							z[i]="D";
						}else
							if(z[i]=="UD'"){
								z[i]="D'";
							}else
								if(z[i]=="UD2"){
									z[i]="D2";
								}else
									if(z[i]=="FB"){
										z[i]="B";
									}else
										if(z[i]=="FB'"){
											z[i]="B'";
										}else
											if(z[i]=="FB2"){
												z[i]="B2";
											}
		}
		return z;
	}
	public String[] sc4(int c){
		String[] a={"R","R'","R2","L","L'","L2","U","U'","U2","F","F'","F2","D","D'","D2","B","B'","B2","MR'","MU'","ML'","MD'","MF'","MB'","MR","MU","ML","MD","MF","MB","MR2","MU2","ML2","MD2","MF2","MB2"};
		String[] z=new String[c];
		for(int i=0;i<c;i++){
			int d=(int)(Math.random() * 36);
			z[i]=a[d];
		}
		for(int i=0;i<c-1;i++){
			while(z[i].charAt(0)==z[i+1].charAt(0)){
				int e=(int)(Math.random() * 36);
				z[i]=a[e];
			}
		}
		return z;
	}
	public String[] sc5(int c){
		String[] a={"R","R'","R2","L","L'","L2","U","U'","U2","F","F'","F2","D","D'","D2","B","B'","B2","MR'","MU'","ML'","MD'","MF'","MB'","MR","MU","ML","MD","MF","MB","MR2","MU2","ML2","MD2","MF2","MB2"};
		String[] z=new String[c];
		for(int i=0;i<c;i++){
			int d=(int)(Math.random() * 36);
			z[i]=a[d];
		}
		for(int i=0;i<c-1;i++){
			while(z[i].charAt(0)==z[i+1].charAt(0)){
				int e=(int)(Math.random() * 36);
				z[i]=a[e];
			}
		}
		return z;
	}
	public String[] sc6(int c){
		String[] a={"R","R'","R2","L","L'","L2","U","U'","U2","F","F'","F2","D","D'","D2","B","B'","B2","MR'","MU'","ML'","MD'","MF'","MB'","MR","MU","ML","MD","MF","MB","MR2","MU2","ML2","MD2","MF2","MB2","MR'3","MU'3","ML'3","MD'3","MF'3","MB'3","MR3","MU3","ML3","MD3","MF3","MB3","MR23","MU23","ML23","MD23","MF23","MB23"};
		String[] z=new String[c];
		for(int i=0;i<c;i++){
			int d=(int)(Math.random() * 54);
			z[i]=a[d];
		}
		for(int i=0;i<c-1;i++){
			while(z[i].charAt(0)==z[i+1].charAt(0)){
				int e=(int)(Math.random() * 54);
				z[i]=a[e];
			}
		}
		for(int i=0;i<c-1;i++){
			if(z[i]=="MR'3"){
				z[i]="3MR'";
			}else
				if(z[i]=="MR23"){
					z[i]="3MR2'";
				}else
					if(z[i]=="MR3"){
						z[i]="3MR";
					}else
						if(z[i]=="MU'3"){
							z[i]="3MU'";
						}else
							if(z[i]=="MU3"){
								z[i]="3MU";
							}else
								if(z[i]=="MU23"){
									z[i]="3MU2";
								}else
									if(z[i]=="ML'3"){
										z[i]="3ML'";
									}else
										if(z[i]=="ML3"){
											z[i]="3ML";
										}else
											if(z[i]=="ML23"){
												z[i]="3ML2";
											}else
												if(z[i]=="MU'3"){
													z[i]="3MU'";
												}else
													if(z[i]=="MU3"){
														z[i]="3MU";
													}else
														if(z[i]=="MU23"){
															z[i]="3MU2";
														}else
															if(z[i]=="MD'3"){
																z[i]="3MD'";
															}else
																if(z[i]=="MD3"){
																	z[i]="3MD";
																}else
																	if(z[i]=="MD23"){
																		z[i]="3MD2";
																	}else
																		if(z[i]=="MF'3"){
																			z[i]="3MF'";
																		}else
																			if(z[i]=="MF3"){
																				z[i]="3MF";
																			}else
																				if(z[i]=="MF23"){
																					z[i]="3MF2";
																				}else
																					if(z[i]=="MB'3"){
																						z[i]="3MB'";
																					}else
																						if(z[i]=="MB3"){
																							z[i]="3MB";
																						}else
																							if(z[i]=="MB23"){
																								z[i]="3MB2";
																							}

		}
		return z;
	}
	public String[] sc7(int c){
		String[] a={"R","R'","R2","L","L'","L2","U","U'","U2","F","F'","F2","D","D'","D2","B","B'","B2","MR'","MU'","ML'","MD'","MF'","MB'","MR","MU","ML","MD","MF","MB","MR2","MU2","ML2","MD2","MF2","MB2","MR'3","MU'3","ML'3","MD'3","MF'3","MB'3","MR3","MU3","ML3","MD3","MF3","MB3","MR23","MU23","ML23","MD23","MF23","MB23"};
		String[] z=new String[c];
		for(int i=0;i<c;i++){
			int d=(int)(Math.random() * 54);
			z[i]=a[d];
		}
		for(int i=0;i<c-1;i++){
			while(z[i].charAt(0)==z[i+1].charAt(0)){
				int e=(int)(Math.random() * 54);
				z[i]=a[e];
			}
		}
		for(int i=0;i<c-1;i++){
			if(z[i]=="MR'3"){
				z[i]="3MR'";
			}else
				if(z[i]=="MR23"){
					z[i]="3MR2'";
				}else
					if(z[i]=="MR3"){
						z[i]="3MR";
					}else
						if(z[i]=="MU'3"){
							z[i]="3MU'";
						}else
							if(z[i]=="MU3"){
								z[i]="3MU";
							}else
								if(z[i]=="MU23"){
									z[i]="3MU2";
								}else
									if(z[i]=="ML'3"){
										z[i]="3ML'";
									}else
										if(z[i]=="ML3"){
											z[i]="3ML";
										}else
											if(z[i]=="ML23"){
												z[i]="3ML2";
											}else
												if(z[i]=="MU'3"){
													z[i]="3MU'";
												}else
													if(z[i]=="MU3"){
														z[i]="3MU";
													}else
														if(z[i]=="MU23"){
															z[i]="3MU2";
														}else
															if(z[i]=="MD'3"){
																z[i]="3MD'";
															}else
																if(z[i]=="MD3"){
																	z[i]="3MD";
																}else
																	if(z[i]=="MD23"){
																		z[i]="3MD2";
																	}else
																		if(z[i]=="MF'3"){
																			z[i]="3MF'";
																		}else
																			if(z[i]=="MF3"){
																				z[i]="3MF";
																			}else
																				if(z[i]=="MF23"){
																					z[i]="3MF2";
																				}else
																					if(z[i]=="MB'3"){
																						z[i]="3MB'";
																					}else
																						if(z[i]=="MB3"){
																							z[i]="3MB";
																						}else
																							if(z[i]=="MB23"){
																								z[i]="3MB2";
																							}

		}
		return z;
	}
}