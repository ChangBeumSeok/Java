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
            System.out.print("행 크기 : ");
            row = sc.nextInt();
            System.out.print("열 크기 : ");
            col = sc.nextInt();
            if (row < 1 || col < 1 || row > 10 || col > 10) {
                System.out.println("반드시 1 ~ 10 사이의 정수를 입력해야 합니다.");
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
        String[][] strArr = new String[][] {{"이", "까", "왔", "앞", "힘"}, {"차", "지", "습", "으", "냅"}, {"원",
            "열", "니", "로", "시"}, {"배", "심", "다", "좀", "다"}, {"열", "히", "! ", "더", "!! "}};
        for(int i = 0; i < strArr.length; i++) {
            for(int j = 0; j < strArr.length; j++) {
                System.out.print(strArr[j][i] + " ");
            }
            System.out.println();
        }
    }
    
    public void practice7() {
        Scanner sc = new Scanner(System.in);
        System.out.print("행의 크기 : ");
        int row = sc.nextInt();
        int col[] = new int[row];
        
        for(int i = 0 ; i < row; i++) {
            System.out.print(i + "행의 크기 : ");
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
        String str[] = {"김예수", "김영해", "방명수", "손은희", "송종기", "윤은애",
                "이영지", "임시환", "전지연", "정중하", "차태연", "하이유"};
        
        String arr[][] = new String[6][2];
        int index = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                arr[i][j] = str[index++];
            }
        }
        
        System.out.println("== 1분단 ==");
        for(int i = 0; i < arr.length / 2; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("== 2분단 ==");
        for(int i = arr.length / 2; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public void practice9() {
        Scanner sc = new Scanner(System.in);
        String str[] = {"김예수", "김영해", "방명수", "손은희", "송종기", "윤은애",
                "이영지", "임시환", "전지연", "정중하", "차태연", "하이유"};
        
        String arr[][] = new String[6][2]; // 분단 배열
        int index = 0;   // arr 배열에 넣기 위한 str배열 인덱스 증가값
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                arr[i][j] = str[index++];
            }
        }
        
        System.out.println("== 1분단 ==");
        for(int i = 0; i < arr.length / 2; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("== 2분단 ==");
        for(int i = arr.length / 2; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("========================");
        System.out.print("검색할 학생 이름을 입력하세요 : ");
        String name = sc.nextLine();  //검색할 이름
        int pos[] = new int[2];
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(arr[i][j].equals(name)) {
					pos[0] = i + 1;
					pos[1] = j;
				}
			}
		}
		if(pos[0] <= arr.length / 2) {  // 1분단
			System.out.print("검색하신 " + name + "학생은 1분단 ");
			if(pos[1] == 1) {  // 오른쪽
				System.out.print(pos[0] + "번째 줄 오른쪽에 있습니다.");
			}else { // 왼쪽
				System.out.print(pos[0] + "번째 줄 왼쪽에 있습니다.");
			}
		}else {  // 2분단
			System.out.print("검색하신 " + name + "학생은 2분단 ");
			if(pos[1] == 1) {
				System.out.print(pos[0]-arr.length/2 + "번째 줄 오른쪽에 있습니다.");
			}else {
				System.out.print(pos[0]-arr.length/2 + "번째 줄 왼쪽에 있습니다.");
			}
		}
        /*
        int pos = 0;      //검색한 사람의 위치정보를 담을 변수
        for(int i = 0; i < str.length; i++) {
            if(name.equals(str[i])) {
                pos = i + 1;  // i 값 + 1을 해주었습니다. 안하셔도 됩니다. 대신 밑에 부분에서 나머지 연산자 계산시 반대로 해야합니다.
            }
        }
        int line = 2;   // 각 줄에 사람이 2명씩 있어서 줄 계산하려고 만든 변수
        int count = 1;  // 몇번째 줄인지 저장할 변수
        for(int i = line; i < pos; i+=2) { // 검색한 사람 위치 계산
            count++;   
        }
        
        if(pos <= str.length / 2) {  // 1분단
            System.out.print("검색하신 " + name + "학생은 1분단 ");
            if(pos % 2 == 0) {  // 오른쪽
                System.out.print(count + "번째 줄 오른쪽에 있습니다.");
            }else { // 왼쪽
                System.out.print(count + "번째 줄 왼쪽에 있습니다.");
            }
        }else {  // 2분단
            count -= 3;
            System.out.print("검색하신 " + name + "학생은 2분단 ");
            if(pos % 2 == 0) {
                System.out.print(count + "번째 줄 오른쪽에 있습니다.");
            }else {
                System.out.print(count + "번째 줄 왼쪽에 있습니다.");
            }
        }*/
    }
    
    public void bingo() {
        int arr[][] = new int[5][5];
        int number[] = new int[5*5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < number.length; i++) {
            boolean tf = true;
            int n = (int)(Math.random() * 50 + 1); // 1 ~ 50 랜덤수 생성
            for(int j = 0; j < i; j++) {
                if(n == number[j]) {
                    tf = false;
                    i--;
                    break;
                }
            }
            if(tf == true) {
                number[i] = n; // 1 ~ 50 까지 중복 되지 않은 랜덤 수 저장
            }
        }
        int index = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                arr[i][j] = number[index++]; // 빙고 판에 숫자 넣기
            }
        }
        int bingo = 0; // 빙고 개수
        while(true) {
            for(int i = 0; i < arr.length; i++) {
                for(int j = 0; j < arr[i].length; j++) {
                    System.out.printf("%2d ", arr[i][j]);
                }
                System.out.println();
            }
            System.out.println("==================");
            System.out.print("숫자 입력(0 입력시 종료) : ");
            int n = sc.nextInt();
            if(n == 0) {
                break;
            }
            //////////// 찾기 //////////////
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
        } // 가로  검사
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
        } // 세로 검사
        
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
        }// 대각선 검사
        System.out.println("빙고 개수 : " + bingo);
        
    }
}