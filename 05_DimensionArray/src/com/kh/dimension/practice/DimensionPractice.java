package com.kh.dimension.practice;
import java.util.Arrays;
import java.util.Scanner;
public class DimensionPractice {
    public void practice1() {
        int arr[][] = new int[4][4];
        int n = 1;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                arr[i][j] = n++;
            }
        }
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.printf("%2d ", arr[i][j]);
            }
            System.out.println();
        }
    }
    
    public void practice2() {
        int arr[][] = new int[4][4];
        int n = 16;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                arr[i][j] = n--;
            }
        }
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.printf("%2d ", arr[i][j]);
            }
            System.out.println();
        }
    }
    
    public void practice3() {
        char arr[][] = new char[3][3];
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print("(" + i + ", " + j + ")");
            }
            System.out.println();
        }
    }
    
    public void practice4() {
        int arr[][] = new int[4][4];
        for(int i = 0; i < arr.length - 1; i++) {
            int sum = 0;
            for(int j = 0; j < arr[i].length - 1; j++) {
                arr[i][j] = (int)(Math.random() * 10 + 1);
                sum += arr[i][j];
            }
            arr[i][3] = sum;
        }
        for(int i = 0; i < arr[i].length - 1; i++) {
            int sum = 0;
            for(int j = 0; j < arr.length - 1; j++) {
                sum += arr[j][i];
            }
            arr[3][i] = sum;
        }
        int total = 0;
        for(int i = 0; i < arr[i].length - 1; i++) {
            total += arr[i][3];
        }
        arr[arr.length-1][arr.length-1] = total;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                System.out.printf("%2d ", arr[i][j]);
            }
            System.out.println();
        }
    }
    
    public void practice5() {
        Scanner sc = new Scanner(System.in);
        int row;
        int col;
        char arr[][];
        while(true) {
            System.out.print("�� ũ�� : ");
            row = sc.nextInt();
            System.out.print("�� ũ�� : ");
            col = sc.nextInt();
            if (row < 1 || col < 1 || row > 10 || col > 10) {
                System.out.println("�ݵ�� 1 ~ 10 ������ ������ �Է��ؾ� �մϴ�.");
            }else { 
                arr = new char[row][col];
                for(int i = 0; i < row; i++) {
                    for(int j = 0; j < col; j++) {
                        arr[i][j] = (char)(Math.random()*26 + 65);
                    }
                }
                break;
            }
        }
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public void practice6() {
        String[][] strArr = new String[][] {{"��", "��", "��", "��", "��"}, {"��", "��", "��", "��", "��"}, {"��",
            "��", "��", "��", "��"}, {"��", "��", "��", "��", "��"}, {"��", "��", "! ", "��", "!! "}};
        for(int i = 0; i < strArr.length; i++) {
            for(int j = 0; j < strArr.length; j++) {
                System.out.print(strArr[j][i] + " ");
            }
            System.out.println();
        }
    }
    
    public void practice7() {
        Scanner sc = new Scanner(System.in);
        System.out.print("���� ũ�� : ");
        int row = sc.nextInt();
        int col[] = new int[row];
        
        for(int i = 0 ; i < row; i++) {
            System.out.print(i + "���� ũ�� : ");
            col[i] = sc.nextInt();
        }
        char arr[][] = new char[row][];
        char ch = 'a';
        
        for(int i = 0; i < row; i++) {
            arr[i] = new char[col[i]];
            for(int j = 0; j < col[i]; j++) {
                arr[i][j] = ch++;
            }
        }
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col[i]; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public void practice8() {
        String str[] = {"�迹��", "�迵��", "����", "������", "������", "������",
                "�̿���", "�ӽ�ȯ", "������", "������", "���¿�", "������"};
        
        String arr[][] = new String[6][2];
        int index = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                arr[i][j] = str[index++];
            }
        }
        
        System.out.println("== 1�д� ==");
        for(int i = 0; i < arr.length / 2; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("== 2�д� ==");
        for(int i = arr.length / 2; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public void practice9() {
        Scanner sc = new Scanner(System.in);
        String str[] = {"�迹��", "�迵��", "����", "������", "������", "������",
                "�̿���", "�ӽ�ȯ", "������", "������", "���¿�", "������"};
        
        String arr[][] = new String[6][2]; // �д� �迭
        int index = 0;   // arr �迭�� �ֱ� ���� str�迭 �ε��� ������
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                arr[i][j] = str[index++];
            }
        }
        
        System.out.println("== 1�д� ==");
        for(int i = 0; i < arr.length / 2; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("== 2�д� ==");
        for(int i = arr.length / 2; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("========================");
        System.out.print("�˻��� �л� �̸��� �Է��ϼ��� : ");
        String name = sc.nextLine();  //�˻��� �̸�
        int pos[] = new int[2];
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(arr[i][j].equals(name)) {
					pos[0] = i + 1;
					pos[1] = j;
				}
			}
		}
		if(pos[0] <= arr.length / 2) {  // 1�д�
			System.out.print("�˻��Ͻ� " + name + "�л��� 1�д� ");
			if(pos[1] == 1) {  // ������
				System.out.print(pos[0] + "��° �� �����ʿ� �ֽ��ϴ�.");
			}else { // ����
				System.out.print(pos[0] + "��° �� ���ʿ� �ֽ��ϴ�.");
			}
		}else {  // 2�д�
			System.out.print("�˻��Ͻ� " + name + "�л��� 2�д� ");
			if(pos[1] == 1) {
				System.out.print(pos[0]-arr.length/2 + "��° �� �����ʿ� �ֽ��ϴ�.");
			}else {
				System.out.print(pos[0]-arr.length/2 + "��° �� ���ʿ� �ֽ��ϴ�.");
			}
		}
        /*
        int pos = 0;      //�˻��� ����� ��ġ������ ���� ����
        for(int i = 0; i < str.length; i++) {
            if(name.equals(str[i])) {
                pos = i + 1;  // i �� + 1�� ���־����ϴ�. ���ϼŵ� �˴ϴ�. ��� �ؿ� �κп��� ������ ������ ���� �ݴ�� �ؾ��մϴ�.
            }
        }
        int line = 2;   // �� �ٿ� ����� 2�� �־ �� ����Ϸ��� ���� ����
        int count = 1;  // ���° ������ ������ ����
        for(int i = line; i < pos; i+=2) { // �˻��� ��� ��ġ ���
            count++;   
        }
        
        if(pos <= str.length / 2) {  // 1�д�
            System.out.print("�˻��Ͻ� " + name + "�л��� 1�д� ");
            if(pos % 2 == 0) {  // ������
                System.out.print(count + "��° �� �����ʿ� �ֽ��ϴ�.");
            }else { // ����
                System.out.print(count + "��° �� ���ʿ� �ֽ��ϴ�.");
            }
        }else {  // 2�д�
            count -= 3;
            System.out.print("�˻��Ͻ� " + name + "�л��� 2�д� ");
            if(pos % 2 == 0) {
                System.out.print(count + "��° �� �����ʿ� �ֽ��ϴ�.");
            }else {
                System.out.print(count + "��° �� ���ʿ� �ֽ��ϴ�.");
            }
        }*/
    }
    
    public void bingo() {
        int arr[][] = new int[5][5];
        int number[] = new int[5*5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < number.length; i++) {
            boolean tf = true;
            int n = (int)(Math.random() * 50 + 1); // 1 ~ 50 ������ ����
            for(int j = 0; j < i; j++) {
                if(n == number[j]) {
                    tf = false;
                    i--;
                    break;
                }
            }
            if(tf == true) {
                number[i] = n; // 1 ~ 50 ���� �ߺ� ���� ���� ���� �� ����
            }
        }
        int index = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                arr[i][j] = number[index++]; // ���� �ǿ� ���� �ֱ�
            }
        }
        int bingo = 0; // ���� ����
        while(true) {
            for(int i = 0; i < arr.length; i++) {
                for(int j = 0; j < arr[i].length; j++) {
                    System.out.printf("%2d ", arr[i][j]);
                }
                System.out.println();
            }
            System.out.println("==================");
            System.out.print("���� �Է�(0 �Է½� ����) : ");
            int n = sc.nextInt();
            if(n == 0) {
                break;
            }
            //////////// ã�� //////////////
            for(int i = 0; i < arr.length; i++) {
                for(int j = 0; j < arr[i].length; j++) {
                    if(arr[i][j] == n) {
                        arr[i][j] = 0;
                        break;
                    }
                }
            }
        }//while
        for(int i = 0; i < arr.length; i++) {
            int count = 0;
            for(int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == 0) {
                    count++;
                }
            }
            if(count == 5) {
                bingo++;
            }
        } // ����  �˻�
        for(int i = 0; i < arr.length; i++) {
            int count = 0;
            for(int j = 0; j < arr[i].length; j++) {
                if(arr[j][i] == 0) {
                    count++;
                }
            }
            if(count == 5) {
                bingo++;
            }
        } // ���� �˻�
        
        int count1 = 0;
        int count2 = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i][i] == 0) {
                count1++;
            }
            if(arr[arr.length-i-1][i] == 0) {
                count2++;
            }
        }
        if(count1 == 5) {
            bingo++;
        }
        if(count2 == 5) {
            bingo++;
        }// �밢�� �˻�
        System.out.println("���� ���� : " + bingo);
        
    }
}