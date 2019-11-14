package test8;

import java.util.Random;

public class BinaryOperation_1 {
	String[] Equations=new String[50];//存放算式
	 int[] values=new int[50];//存放算式结果
	 public static void printHeader() {
		 System.out.println("本程序将分为四个部分，说明部分，算式生成部分，算式输出部分，结果输出部分。");
	 }
	 public void generateEquations() {
		 int left_operand,right_operand,flag,value;
		 Random random=new Random();
		 for(int i=0;i<50;i++) {
			 left_operand=random.nextInt(101);//生成算式所需随机数
			 right_operand=random.nextInt(101);//生成算式所需随机数
			 flag=random.nextInt(2);//生成算式符号
			 if(flag==1) {
				 Equations[i]="left_oprand+'+'+right_operand+'='";
				 values[i]=left_operand+right_operand;
			 }
			 else {
				 Equations[i]="left_oprand+'-'+right_oprand+'='";
			 }
		 }
	 }

}
