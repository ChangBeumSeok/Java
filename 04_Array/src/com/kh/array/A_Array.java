package com.kh.array;

import java.util.Random;
import java.util.Scanner;

public class A_Array {
	/*
	 * �迭 : ���� �ڷ����� ������ �ϳ��� �������� �ٷ�� ��
	 *       ���� �� ������ �ε����� �����Ǹ� �ε����� 0���� ������
	 */
	
	public void method1() {
		// �迭�� �� ���°�?
		// �迭�� �� ���� ���
		int num1 = 0;
		int num2 = 1;
		int num3 = 2;
		int num4 = 3;
		int num5 = 4;
		
		// �̷� ������ ����ؼ� ���鰳�� ������ �ִٸ�?
		// ���� ������ ��� ����ϱ� ���ؼ��� ������ ��¹���
		// �ۼ��� �־�� ��
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		
		// �հ踦 ���� ���� ������ ������� ��
		int sum = num1 + num2 + num3 + num4 + num5;
		
		// �� �������� ���� �ڷ����̹Ƿ� �迭�� ����Ͽ� �ξ�
		// �����ϰ� ���α׷��� �� �� ����
		
		// 1. �迭 ����
		// �ڷ���[] �迭��;
		// �ڷ��� �迭��[];
		
		int[] arr; // -> �ڷ��� �ڿ� ���ȣ�� �ִ� ���� �ٷ� �迭���� �� �� ����
		int arr2[];
		
		// 2. �迭 �Ҵ�
		// �迭�� = new �ڷ���[�迭ũ��];
		arr = new int[5];
		
		// ����� �Ҵ��� ���ÿ�
		int[] arr3 = new int[5];
		
		// 3. �ʱ�ȭ
		// �迭��[�ε���] = ��;
		
		arr3[0] = 0;
		arr3[1] = 1;
		arr3[2] = 2;
		arr3[3] = 3;
		arr3[4] = 4;
		
		// �迭�� ���� : ������ �� �ε����� ��ġ�� ���� ������ ��Ģ�� �ִٸ�
		// �ݺ��� ��� ����
		// 0�� �ε������� �迭����-1 �ε������� �ݺ�
		for(int i = 0; i < arr3.length; i++) {
			arr3[i] = i;
		}
		
		// ��µ� ���������� 0�� �ε������� �迭����-1 �ε�������
		for(int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}
	}
	public void method2() {
		// ���� ����
		int i; // �޸� ������ ���� ���� �ڽ��� ����� ����
			   // �� �� �޸��� stack�̶�� ������ �Ҵ�
		
		// 1. �迭 ����
		int[] iArr; // �迭�� �����ϰ� �Ǹ� ���� ����� �Ȱ���
					// stack������ ������ ����. �� ������
					// ���� ���� �뵵�� �ƴ϶� �ּҰ��� ��� ����
		char cArr[];
		// ���� ��� ������ �׳� ����, �ּ� ���� ��� ������ ���۷���!
		// �⺻ �ڷ���(boolean, char, byte, short, int, long, float, double)
		// ���� ����� �ִ� -> ����
		// �� �ܷ� ����� �ֵ��� -> ���۷���(String, �迭)
		
		// 2. �迭 �Ҵ�
		// �迭 �Ҵ� �� �ݵ�� ũ�⸦ �������־����
		// iArr = new int[];
		iArr = new int[5];
		cArr = new char[10];
		// new �����ڸ� ���� �迭�� �Ҵ��ϰ� �Ǹ� �޸��� heap������
		// �ش� �迭�� ũ�⸸ŭ ������ ��������� �� ������ �ּҰ���
		// stack ������ ���۷��� ������ ����
		// ���� �ش� �迭�� ���� �ְų� ������ �� �ش� �ּҸ� �����ؼ� ���
		
		// ���� �迭 ����� �Ҵ��� ���ÿ�
		int[] iArr2 = new int[5];
		char[] cArr2 = new char[10];
		
		System.out.println("iArr : " + iArr);
		System.out.println("cArr : " + cArr);
		System.out.println("iArr2 : " + iArr2);
		System.out.println("cArr2 : " + cArr2);
		
		// heap������ �޸𸮿��� ������ ����ٰų� ����������
		// ������ ���� ���ϴ� ����
		// -> �ּҸ� ���ؼ��� ã�ư� �� ����
		
	}
	public void method3() {
		char[] cArr = new char[5];
		int[] iArr = new int[3];
		// -> ��������� �迭�� �����ϰ� �Ҵ��� ��
		// ���� ���� ���� ���� ����(�ʱ�ȭX)
		
		// �ش� �ε������� ����ϸ� � ���� �������� for������ �׽�Ʈ
		for(int i = 0; i < cArr.length; i++) {
			System.out.println(cArr[i]);
		}
		System.out.println("=========="); 
		for(int i = 0; i < iArr.length; i++) {
			System.out.println(iArr[i]);
		}
		
		/*int num;
		System.out.println(num);*/ //-> �������� �ʱ�ȭ ���ϸ� ����
		
		// ���������� �޸� ���� �ʱ�ȭ�� ���ߴµ� ���� ���� �� ���
		// �迭�� ���� �ʱ�ȭ ���� �ʴ´ٸ� JVM�� ���� �⺻ ������ �迭 �ʱ�ȭ
		// �ֳĸ� heap������ ���� ���� ������ ������ �� ���� ����
		
		// � ���ڿ����� ���ڿ��� ���̸� �˱� ���� length() �޼ҵ� �̿�
		// String�� ���ڿ� ���̴� �޼ҵ�� �����ϰ� �ֱ� ������
		// �迭�� ���̸� �� �� �ִ� ����� �޼ҵ尡 �ƴ� � ������ ����
		// ���� .length�� �� �� ����
		
		System.out.println("iArr�� ���� : " + iArr.length);
		System.out.println("cArr�� ���� : " + cArr.length);
		
	}
	
	public void method4() {
		int[] iArr = new int[10];
		
		// �ʱ�ȭ
		for(int i = 0; i < iArr.length; i++) {
			iArr[i] = i+1;
		}
		
		// ���
		for(int i = 0; i < iArr.length; i++) {
			System.out.println("iArr[" + i + "] : " + iArr[i]);
		}
		
	}
	
	public void method5() {
		// ����ڿ��� �Է� ���� ������ �迭�� ���̸� �����غ���
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Ҵ��� �迭�� ���� : ");
		int size = sc.nextInt();
		
		// double�� �迭 dArr�� ����ڰ� �Է��� size��ŭ �Ҵ�
		double[] dArr = new double[size];
		
		System.out.println(dArr);
		System.out.println("dArr�� ���� : " + dArr.length);
		
	}
	public void method6() {
		int[] iArr = new int[5];
		iArr[0] = 2;
		iArr[1] = 4;
		iArr[2] = 6;
		iArr[3] = 8;
		iArr[4] = 10;
		
		int num = 2;
		for(int i = 0; i < iArr.length; i++) {
			iArr[i] = num;
			num += 2;
		}
		
		for(int i = 0; i < iArr.length; i++) {
			System.out.println(iArr[i]);
		}
		
		// �ּҰ��� �ؽ� ������ ���� ���� 10���� ��
		System.out.println("iArr�� �ؽ��ڵ� �� : " + iArr.hashCode());
		System.out.println("iArr�� ���� : " + iArr.length);
		
		// �ε����� �Ѿ�� ���� �Է��ϰ� �Ǹ� ���� �߻�
		// iArr[5] = 12;
		
		// ���� ū �迭�� ����?
		// �ѹ� ������ ũ��� ������ �Ұ���
		// ���� ũ�⸦ �ٲٷ��� �ٽ� �迭 ũ�⸦ �����ؼ� �Ҵ�
		iArr = new int[10];
		// 10�̶�� ũ���� �迭�� �ٽ� heap������ ���� ����
		// �� ���� ������ �ּ� ���� iArr�̶�� ���۷��� ������
		// ���� ����
		System.out.println("===== ���� ���� iArr =====");
		System.out.println("iArr�� �ؽ��ڵ� �� : " + iArr.hashCode());
		System.out.println("iArr�� ���� : " + iArr.length);
		
		// �ּҰ��� �ٲ� ���� ������ �����ϰ� �ִ� ������ �����
		// ���ο� ���� �����ϰ� ����
		
		// �׷��� ���� �迭�� ��� ������ �������� �ʰ� heap������
		// �յ� ���ٴϴ� ���°� ��
		// -> ���� �ð��� ������ ������ �÷��Ͱ� �� �̻� ���� ���ٰ�
		// �Ǵ��Ͽ� ������ -> �ڵ� �޸� ����
		
		// �� �׷��� ���� ���� �Ҵ� �� �迭�� �������?
		iArr = null;
		// ���۷��� ������ null ���� ���� �Ǹ� �ּҰ��� null�� �ٲ�
		// �� �����ϰ� �ִ� �ּҰ� ���ٴ� �Ҹ�
		// -> heap�� �ִ� �����̶� ����Ǿ� �ִ� ���� ������
		// -> heap������ ���� �Ǵ°� ������� �����ð��� ���� �Ŀ�
		// ������ �÷��Ͱ� ���� ���ٰ� �Ǵ��Ͽ� ����
		
		System.out.println("===== ���� ���� iArr =====");
		System.out.println("iArr�� �ؽ��ڵ� �� : " + iArr.hashCode());
		System.out.println("iArr�� ���� : " + iArr.length);
		
		// NullPointerException �߻�
		// �ƹ��͵� �������� �ʰ� null�̶�� Ư���� ���� �����ϰ� ���� �� �߻�
		
	}
	
	public void method7() {
		// �迭 ���� �� �Ҵ�� ���ÿ� �ʱ�ȭ
		int[] iArr = {1, 2, 3, 4};
		// �߰�ȣ ���� ����ϴ� ��� new �����ڸ� ������� �ʾƵ� �Ǹ�
		// ���� ������ŭ �ڵ����� ũ�Ⱑ �Ҵ�
		
		int[] iArr2 = new int[] {1, 2, 3, 4};
		// �� ������ε� ��� ����
		
		System.out.println("iArr�� ���� : " + iArr.length);
		System.out.println("iArr2�� ���� : " + iArr2.length);
		
		// iArr�̶� iArr2�� �� �ִ� ���� �����Ƿ� ���� �� �غ���
		System.out.println(iArr == iArr2);
		// ���۷��� �������� �ּҰ��� ��
		// ���� heap ������ �Ҵ�Ǿ� �ִ� �ٸ� �迭�̹Ƿ�
		// �ּҴ� ���� �� ����
	
	}
	public void method8() {
		//String ���ڿ��� �迭 ��� ����
		String[] sArr = new String[5];
		
		for(int i = 0; i < sArr.length; i++) {
			System.out.println(sArr[i]);
		}
		
		Scanner sc = new Scanner(System.in);
		// 0�� �ε������� ���������� �ݺ��ϸ�
		// ����ڿ��� ���ڿ��� �Է� �޾� �ش� �ε�����
		// ����ڰ� �Է��� �� �ֱ�
		for(int i = 0; i < sArr.length; i++) {
			System.out.print("���� : ");
			sArr[i] = sc.nextLine();
		}
		
		// �� �Է� �Ǿ����� ���
		for(int i = 0; i < sArr.length; i++) {
			System.out.println(sArr[i]);
		}
		
	}
	public void method9() {
		// ����ڿ��� 5���� Ű�� ������ �Է� �޾� �迭�� ��Ƶΰ�
		// �ݺ����� ���� 5���� Ű�� ����, ��� �� ���ϱ�
		Scanner sc = new Scanner(System.in);
		
		double[] height = new double[5];
		double sum = 0;
		
		for(int i = 0; i < height.length; i++) {
			System.out.print("Ű �Է� : ");
			height[i] = sc.nextDouble();
			sum += height[i];
		}
		
		System.out.println("���� : " + sum);
		System.out.println("��� : " + sum / height.length);
		
	}
	public void method10() {
		// ����ڿ��� �Ѱ��� ������ �Է¹ް� �� ũ���� �迭 �����
		// 1~100������ ������ �߻����Ѽ� �ֱ�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		// ���� ��(����) �߻� ��Ű�� ���
		// 1. java.lang.Math Ŭ������ random() �޼ҵ�
		// 2. java.util.Random Ŭ����
		Random ran = new Random();
		System.out.println("int ������ ���� : " + ran.nextInt());
		System.out.println("1 ~ 100 ������ ���� : " + (ran.nextInt(100) + 1));

		// �Է�
		for(int i = 0; i < arr.length; i++) {
			// arr[i] = (int)(Math.random() * 100 + 1);
			arr[i] = ran.nextInt(100) + 1;
		}
		
		// ���
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public void method11() {
		// ����ڿ��� ���ڿ��� �Է� �޾� �ش� ���ڿ���
		// �� ���ڸ� ���� �迭�� ���ʷ� �ֱ�
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ� �Է� : ");
		String str = sc.nextLine();
		
		char[] arr = new char[str.length()];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
			System.out.println(arr[i]);
		}
		
	}
	public void method12() {
		// �ִ밪 �ּҰ� ���ϱ�
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		
		//�� �ε����� ����ڷκ��� �� �Է� �ޱ�
		for(int i = 0; i < arr.length; i++) {
			System.out.print(i+1 + "��° �Է� : ");
			arr[i] = sc.nextInt();
		}
		
		// arr[0]���� �ִ밪�� �ּҰ��� ���� ������ �ʱ�ȭ
		int max = arr[0]; 
		int min = arr[0];
		
		// 1�� �ε������� �迭 ������ ���ϱ�
		for(int i = 1; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		
		System.out.println("�ִ밪 : " + max);
		System.out.println("�ּҰ� : " + min);
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
