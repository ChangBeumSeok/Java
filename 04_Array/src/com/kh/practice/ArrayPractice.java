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
		// 1. 길이가 5인 String 배열 선언
		String[] arr = new String[5];

		// 2. 각 인덱스별 값 초기화
		arr[0] = "사과";
		arr[1] = "귤";
		arr[2] = "포도";
		arr[3] = "복숭아";
		arr[4] = "참외";

		// 위의 1번 2번 과정을 동시에 진행 할 수도 있다. 아래와 같이
		// String[] arr = {"사과", "귤", "포도", "복숭아", "참외"};

		// 3. 배열 인덱스를 활용해서 귤 출력
		System.out.println(arr[1]);
	}

	public void practice5() {
		// 1. 사용자에게 문자열과 문자 입력받기
		Scanner sc = new Scanner(System.in);

		System.out.print("문자열 : ");
		String str = sc.nextLine();

		System.out.println("문자 : ");
		char ch = sc.nextLine().charAt(0);

		// 2. 사용자가 입력한 문자열(str)을 문자 하나하나를 char배열에 넣기

		// 먼저 사용자가 입력한 문자열 길이만큼의 char배열을 할당
		char[] arr = new char[str.length()];

		// 반복문을 통해 str.charAt(i) 값을 arr[i] 에 담는 과정
		for (int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
		}

		// 3. 검색할 문자가 문자열에 몇개 들어있는지, 어느 인덱스에 있는지
		int count = 0; // 검색할 문자가 문자열에 몇개 들어있는지 세어줄 변수

		System.out.print(str + "에 " + ch + "가 존재하는 위치 : ");

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ch) { // 해당 인덱스 값이 검색될 문자 와 같은 경우
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println(); // 개행
		System.out.println(ch + " 개수 : " + count);

	}

	public void practice6() {
	}

	public void method7() {
		// 1. 사용자에게 값을 입력받고 그 값만큼의 배열 선언 및 할당
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 : ");
		int num = sc.nextInt();

		int[] arr = new int[num];

		// 2. 그 배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화
		for (int i = 0; i < arr.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
		}

		// 3. 전체 값 나열 및 총 합 출력
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}

		System.out.println();
		System.out.println("총 합 : " + sum);

	}

	public void method8() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("정수 : ");
			int num = sc.nextInt();

			if (num >= 3 && num % 2 == 1) { // 3이상 홀수
				int[] arr = new int[num];

				int count = 1;
				// 중간까지 증가
				for (int i = 0; i < arr.length / 2; i++) {
					arr[i] = count++;
				}
				// 중간부터 감소
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
				System.out.println("다시 입력하세요.");
			}
		}

	}

	public void method9() {
		String[] chickens = { "후라이드", "양념", "파닭", "치즈" };
		Scanner sc = new Scanner(System.in);
		System.out.print("치킨 이름을 입력하세요 : ");
		String menu = sc.nextLine();

		boolean flag = false;

		for (int i = 0; i < chickens.length; i++) {
			if (chickens[i].equals(menu)) {
				flag = true;
				break;
			}
		}

		if (flag) {
			System.out.println(menu + "치킨 배달 가능");
		} else {
			System.out.println(menu + "치킨은 없는 메뉴입니다.");
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
		// 중복 제거 응용 문제
		// 1. 사용자에게 문자열 입력받기
		Scanner sc = new Scanner(System.in);

		System.out.print("문자열 : ");
		String str = sc.nextLine();

		// 2. 해당 문자열의 문자들을 char[]에 담기
		char[] arr = new char[str.length()];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
		}

		int count = 0; // 들어있는 문자 개수
		System.out.print("문자열에 있는 문자 : ");

		for (int i = 0; i < arr.length; i++) {
			// 외부 for문 - 문자 하나씩 검사하는 for문
			boolean flag = true; // -> 중복 되지 않은 문자

			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					flag = false; // 중복인 경우 false로 변경
				}
			}

			if (flag) { // 중복이 발생하지 않았을 경우 출력
				if (i == 0) {
					System.out.print(arr[i]);
				} else {
					System.out.print(", " + arr[i]);
				}
				count++; // 문자 개수 1 증가
			}

			System.out.println();
			System.out.println("문자 개수 : " + count);

		}
	}

	public void practice15() {
		// 복사 응용 문제
		// 깊은 복사 + 얕은 복사

		// 1. 사용자에게 배열의 길이 입력받기
		Scanner sc = new Scanner(System.in);

		System.out.print("배열의 크기를 입력하시오 : ");
		int size = sc.nextInt();
		sc.nextLine();

		// 2. 입력받은 길이 만큼의 문자열 배열 선언 및 할당
		String[] arr = new String[size];

		// 3. 각 인덱스별 값을 사용자에게 입력받기
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + 1 + "번째 문자열 : ");
			arr[i] = sc.nextLine();
		}
		
		while(true) {
			System.out.println("더 값을 입력하시겠습니까?(Y/N) : ");
			char ch = sc.nextLine().charAt(0);
			
			// String str = sc.nextLine();
			// 1. str.toUpperCase().equals("Y")
			// 2. str.equalsIgnoreCase("Y")
			
			if(ch == 'Y' || ch == 'y') {
				System.out.print("더 입력하고 싶은 개수 : ");
				int addSize = sc.nextInt();
				sc.nextLine();
				
				String[] newArr = new String[arr.length + addSize];
				
				for(int i = 0; i < newArr.length; i++) {
					if(i < arr.length) { // 기존 배열 먼저 복사
						newArr[i] = arr[i];
					}else { // 그 이후 내용 입력 받기
						System.out.print(i+1 + "번째 문자열 : ");
						newArr[i] = sc.nextLine();
					}
				}
				arr = newArr; // 기존 배열에 새로운 배열의 주소값 대입
				// -> 기존 배열은 사라지게 됨
				
			}else {
				break;
			}
			
		}
		
		System.out.println(Arrays.toString(arr));
		

	}

}
