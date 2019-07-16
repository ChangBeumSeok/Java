package com.kh.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	public void practice1() {
	}

	public void practice2() {
	}

	public void practice3() {
	}

	public void practice4() {
		// 1. ���̰� 5�� String �迭 ����
		String[] arr = new String[5];

		// 2. �� �ε����� �� �ʱ�ȭ
		arr[0] = "���";
		arr[1] = "��";
		arr[2] = "����";
		arr[3] = "������";
		arr[4] = "����";

		// ���� 1�� 2�� ������ ���ÿ� ���� �� ���� �ִ�. �Ʒ��� ����
		// String[] arr = {"���", "��", "����", "������", "����"};

		// 3. �迭 �ε����� Ȱ���ؼ� �� ���
		System.out.println(arr[1]);
	}

	public void practice5() {
		// 1. ����ڿ��� ���ڿ��� ���� �Է¹ޱ�
		Scanner sc = new Scanner(System.in);

		System.out.print("���ڿ� : ");
		String str = sc.nextLine();

		System.out.println("���� : ");
		char ch = sc.nextLine().charAt(0);

		// 2. ����ڰ� �Է��� ���ڿ�(str)�� ���� �ϳ��ϳ��� char�迭�� �ֱ�

		// ���� ����ڰ� �Է��� ���ڿ� ���̸�ŭ�� char�迭�� �Ҵ�
		char[] arr = new char[str.length()];

		// �ݺ����� ���� str.charAt(i) ���� arr[i] �� ��� ����
		for (int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
		}

		// 3. �˻��� ���ڰ� ���ڿ��� � ����ִ���, ��� �ε����� �ִ���
		int count = 0; // �˻��� ���ڰ� ���ڿ��� � ����ִ��� ������ ����

		System.out.print(str + "�� " + ch + "�� �����ϴ� ��ġ : ");

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ch) { // �ش� �ε��� ���� �˻��� ���� �� ���� ���
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println(); // ����
		System.out.println(ch + " ���� : " + count);

	}

	public void practice6() {
	}

	public void method7() {
		// 1. ����ڿ��� ���� �Է¹ް� �� ����ŭ�� �迭 ���� �� �Ҵ�
		Scanner sc = new Scanner(System.in);

		System.out.print("���� : ");
		int num = sc.nextInt();

		int[] arr = new int[num];

		// 2. �� �迭�� ũ�⸸ŭ ����ڰ� ���� ���� �Է��Ͽ� ������ �ε����� ���� �ʱ�ȭ
		for (int i = 0; i < arr.length; i++) {
			System.out.print("�迭 " + i + "��° �ε����� ���� �� : ");
			arr[i] = sc.nextInt();
		}

		// 3. ��ü �� ���� �� �� �� ���
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}

		System.out.println();
		System.out.println("�� �� : " + sum);

	}

	public void method8() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("���� : ");
			int num = sc.nextInt();

			if (num >= 3 && num % 2 == 1) { // 3�̻� Ȧ��
				int[] arr = new int[num];

				int count = 1;
				// �߰����� ����
				for (int i = 0; i < arr.length / 2; i++) {
					arr[i] = count++;
				}
				// �߰����� ����
				for (int i = arr.length / 2; i < arr.length; i++) {
					arr[i] = count--;
				}

				for (int i = 0; i < arr.length; i++) {
					if (i < arr.length - 1) {
						System.out.print(arr[i] + ", ");
					} else {
						System.out.print(arr[i]);
					}
				}
				break;
			} else {
				System.out.println("�ٽ� �Է��ϼ���.");
			}
		}

	}

	public void method9() {
		String[] chickens = { "�Ķ��̵�", "���", "�Ĵ�", "ġ��" };
		Scanner sc = new Scanner(System.in);
		System.out.print("ġŲ �̸��� �Է��ϼ��� : ");
		String menu = sc.nextLine();

		boolean flag = false;

		for (int i = 0; i < chickens.length; i++) {
			if (chickens[i].equals(menu)) {
				flag = true;
				break;
			}
		}

		if (flag) {
			System.out.println(menu + "ġŲ ��� ����");
		} else {
			System.out.println(menu + "ġŲ�� ���� �޴��Դϴ�.");
		}

	}

	public void practice10() {
	}

	public void practice11() {
	}

	public void practice12() {
	}

	public void practice13() {
	}

	public void practice14() {
		// �ߺ� ���� ���� ����
		// 1. ����ڿ��� ���ڿ� �Է¹ޱ�
		Scanner sc = new Scanner(System.in);

		System.out.print("���ڿ� : ");
		String str = sc.nextLine();

		// 2. �ش� ���ڿ��� ���ڵ��� char[]�� ���
		char[] arr = new char[str.length()];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
		}

		int count = 0; // ����ִ� ���� ����
		System.out.print("���ڿ��� �ִ� ���� : ");

		for (int i = 0; i < arr.length; i++) {
			// �ܺ� for�� - ���� �ϳ��� �˻��ϴ� for��
			boolean flag = true; // -> �ߺ� ���� ���� ����

			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					flag = false; // �ߺ��� ��� false�� ����
				}
			}

			if (flag) { // �ߺ��� �߻����� �ʾ��� ��� ���
				if (i == 0) {
					System.out.print(arr[i]);
				} else {
					System.out.print(", " + arr[i]);
				}
				count++; // ���� ���� 1 ����
			}

			System.out.println();
			System.out.println("���� ���� : " + count);

		}
	}

	public void practice15() {
		// ���� ���� ����
		// ���� ���� + ���� ����

		// 1. ����ڿ��� �迭�� ���� �Է¹ޱ�
		Scanner sc = new Scanner(System.in);

		System.out.print("�迭�� ũ�⸦ �Է��Ͻÿ� : ");
		int size = sc.nextInt();
		sc.nextLine();

		// 2. �Է¹��� ���� ��ŭ�� ���ڿ� �迭 ���� �� �Ҵ�
		String[] arr = new String[size];

		// 3. �� �ε����� ���� ����ڿ��� �Է¹ޱ�
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + 1 + "��° ���ڿ� : ");
			arr[i] = sc.nextLine();
		}
		
		while(true) {
			System.out.println("�� ���� �Է��Ͻðڽ��ϱ�?(Y/N) : ");
			char ch = sc.nextLine().charAt(0);
			
			// String str = sc.nextLine();
			// 1. str.toUpperCase().equals("Y")
			// 2. str.equalsIgnoreCase("Y")
			
			if(ch == 'Y' || ch == 'y') {
				System.out.print("�� �Է��ϰ� ���� ���� : ");
				int addSize = sc.nextInt();
				sc.nextLine();
				
				String[] newArr = new String[arr.length + addSize];
				
				for(int i = 0; i < newArr.length; i++) {
					if(i < arr.length) { // ���� �迭 ���� ����
						newArr[i] = arr[i];
					}else { // �� ���� ���� �Է� �ޱ�
						System.out.print(i+1 + "��° ���ڿ� : ");
						newArr[i] = sc.nextLine();
					}
				}
				arr = newArr; // ���� �迭�� ���ο� �迭�� �ּҰ� ����
				// -> ���� �迭�� ������� ��
				
			}else {
				break;
			}
			
		}
		
		System.out.println(Arrays.toString(arr));
		

	}

}
