package test8;

import java.util.Random;

public class BinaryOperation_1 {
	String[] Equations=new String[50];//�����ʽ
	 int[] values=new int[50];//�����ʽ���
	 public static void printHeader() {
		 System.out.println("�����򽫷�Ϊ�ĸ����֣�˵�����֣���ʽ���ɲ��֣���ʽ������֣����������֡�");
	 }
	 public void generateEquations() {
		 int left_operand,right_operand,flag,value;
		 Random random=new Random();
		 for(int i=0;i<50;i++) {
			 left_operand=random.nextInt(101);//������ʽ���������
			 right_operand=random.nextInt(101);//������ʽ���������
			 flag=random.nextInt(2);//������ʽ����
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
