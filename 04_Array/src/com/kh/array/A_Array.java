package com.kh.array;

import java.util.Random;
import java.util.Scanner;

public class A_Array {
	/*
	 * 배열 : 같은 자료형의 변수를 하나의 묶음으로 다루는 것
	 *       저장 된 값마다 인덱스가 지정되며 인덱스는 0부터 시작함
	 */
	
	public void method1() {
		// 배열을 왜 쓰는가?
		// 배열을 안 쓰는 경우
		int num1 = 0;
		int num2 = 1;
		int num3 = 2;
		int num4 = 3;
		int num5 = 4;
		
		// 이런 식으로 계속해서 수백개의 변수가 있다면?
		// 위의 변수를 모두 출력하기 위해서는 각각의 출력문을
		// 작성해 주어야 함
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		
		// 합계를 구할 때도 일일히 더해줘야 함
		int sum = num1 + num2 + num3 + num4 + num5;
		
		// 위 변수들은 같은 자료형이므로 배열을 사용하여 훨씬
		// 간단하게 프로그래밍 할 수 있음
		
		// 1. 배열 선언
		// 자료형[] 배열명;
		// 자료형 배열명[];
		
		int[] arr; // -> 자료형 뒤에 대괄호가 있는 편이 바로 배열임을 알 수 있음
		int arr2[];
		
		// 2. 배열 할당
		// 배열명 = new 자료형[배열크기];
		arr = new int[5];
		
		// 선언과 할당을 동시에
		int[] arr3 = new int[5];
		
		// 3. 초기화
		// 배열명[인덱스] = 값;
		
		arr3[0] = 0;
		arr3[1] = 1;
		arr3[2] = 2;
		arr3[3] = 3;
		arr3[4] = 4;
		
		// 배열의 장점 : 대입할 때 인덱스의 위치나 값이 일정한 규칙이 있다면
		// 반복문 사용 가능
		// 0번 인덱스부터 배열길이-1 인덱스까지 반복
		for(int i = 0; i < arr3.length; i++) {
			arr3[i] = i;
		}
		
		// 출력도 마찬가지로 0번 인덱스부터 배열길이-1 인덱스까지
		for(int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}
	}
	public void method2() {
		// 변수 선언
		int i; // 메모리 공간에 값을 담을 박스를 만드는 과정
			   // 이 때 메모리의 stack이라는 영역에 할당
		
		// 1. 배열 선언
		int[] iArr; // 배열을 선언하게 되면 변수 선언과 똑같이
					// stack영역에 공간이 생김. 이 공간은
					// 값을 담을 용도가 아니라 주소값을 담는 공간
		char cArr[];
		// 값을 담는 변수는 그냥 변수, 주소 값을 담는 변수는 레퍼런스!
		// 기본 자료형(boolean, char, byte, short, int, long, float, double)
		// 으로 선언된 애는 -> 변수
		// 그 외로 선언된 애들은 -> 레퍼런스(String, 배열)
		
		// 2. 배열 할당
		// 배열 할당 시 반드시 크기를 지정해주어야함
		// iArr = new int[];
		iArr = new int[5];
		cArr = new char[10];
		// new 연산자를 통해 배열을 할당하게 되면 메모리의 heap영역에
		// 해당 배열의 크기만큼 공간이 만들어지고 그 공간의 주소값을
		// stack 영역의 레퍼런스 변수에 저장
		// 따라서 해당 배열에 값을 넣거나 수정할 때 해당 주소를 참조해서 사용
		
		// 위의 배열 선언과 할당을 동시에
		int[] iArr2 = new int[5];
		char[] cArr2 = new char[10];
		
		System.out.println("iArr : " + iArr);
		System.out.println("cArr : " + cArr);
		System.out.println("iArr2 : " + iArr2);
		System.out.println("cArr2 : " + cArr2);
		
		// heap영역의 메모리에는 변수를 만든다거나 직접적으로
		// 접근을 하지 못하는 영역
		// -> 주소를 통해서만 찾아갈 수 있음
		
	}
	public void method3() {
		char[] cArr = new char[5];
		int[] iArr = new int[3];
		// -> 여기까지는 배열을 선언하고 할당한 것
		// 아직 실제 값을 넣지 않음(초기화X)
		
		// 해당 인덱스들을 출력하면 어떤 값이 나오는지 for문으로 테스트
		for(int i = 0; i < cArr.length; i++) {
			System.out.println(cArr[i]);
		}
		System.out.println("=========="); 
		for(int i = 0; i < iArr.length; i++) {
			System.out.println(iArr[i]);
		}
		
		/*int num;
		System.out.println(num);*/ //-> 지역변수 초기화 안하면 에러
		
		// 지역변수와 달리 아직 초기화를 안했는데 오류 없이 잘 출력
		// 배열을 따로 초기화 하지 않는다면 JVM이 정한 기본 값으로 배열 초기화
		// 왜냐면 heap영역은 값이 없는 공간이 존재할 수 없기 때문
		
		// 어떤 문자열에서 문자열의 길이를 알기 위해 length() 메소드 이용
		// String의 문자열 길이는 메소드로 제공하고 있기 때문에
		// 배열의 길이를 알 수 있는 방법은 메소드가 아닌 어떤 변수로 제공
		// 따라서 .length로 알 수 있음
		
		System.out.println("iArr의 길이 : " + iArr.length);
		System.out.println("cArr의 길이 : " + cArr.length);
		
	}
	
	public void method4() {
		int[] iArr = new int[10];
		
		// 초기화
		for(int i = 0; i < iArr.length; i++) {
			iArr[i] = i+1;
		}
		
		// 출력
		for(int i = 0; i < iArr.length; i++) {
			System.out.println("iArr[" + i + "] : " + iArr[i]);
		}
		
	}
	
	public void method5() {
		// 사용자에게 입력 받은 정수로 배열의 길이를 지정해보기
		Scanner sc = new Scanner(System.in);
		System.out.print("새로 할당할 배열의 길이 : ");
		int size = sc.nextInt();
		
		// double형 배열 dArr을 사용자가 입력한 size만큼 할당
		double[] dArr = new double[size];
		
		System.out.println(dArr);
		System.out.println("dArr의 길이 : " + dArr.length);
		
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
		
		// 주소값을 해쉬 연산을 통해 만든 10진수 값
		System.out.println("iArr의 해쉬코드 값 : " + iArr.hashCode());
		System.out.println("iArr의 길이 : " + iArr.length);
		
		// 인덱스를 넘어가는 값을 입력하게 되면 에러 발생
		// iArr[5] = 12;
		
		// 가장 큰 배열의 단점?
		// 한번 지정한 크기는 변경이 불가능
		// 따라서 크기를 바꾸려면 다시 배열 크기를 지정해서 할당
		iArr = new int[10];
		// 10이라는 크기의 배열을 다시 heap영역에 새로 생성
		// 그 새로 생성한 주소 값을 iArr이라는 레퍼런스 변수에
		// 덮어 쓴것
		System.out.println("===== 변경 후의 iArr =====");
		System.out.println("iArr의 해쉬코드 값 : " + iArr.hashCode());
		System.out.println("iArr의 길이 : " + iArr.length);
		
		// 주소값이 바뀐 것은 기존에 참조하고 있던 연결이 끊기고
		// 새로운 곳을 참조하고 있음
		
		// 그러면 에전 배열은 어느 곳에도 참조되지 않고 heap영역에
		// 둥둥 떠다니는 상태가 됨
		// -> 일정 시간이 지나면 가비지 컬렉터가 더 이상 쓸모 없다고
		// 판단하여 지워줌 -> 자동 메모리 관리
		
		// 자 그러면 지금 당장 할당 된 배열을 지우려면?
		iArr = null;
		// 레퍼런스 변수에 null 값이 들어가게 되면 주소값이 null로 바뀜
		// 즉 참조하고 있는 주소가 없다는 소리
		// -> heap에 있는 공간이랑 연결되어 있는 고리가 끊어짐
		// -> heap에서는 참조 되는게 사라지면 일정시간이 지난 후에
		// 가비지 컬렉터가 쓸모 없다고 판단하여 삭제
		
		System.out.println("===== 삭제 후의 iArr =====");
		System.out.println("iArr의 해쉬코드 값 : " + iArr.hashCode());
		System.out.println("iArr의 길이 : " + iArr.length);
		
		// NullPointerException 발생
		// 아무것도 참조하지 않고 null이라는 특수한 값을 참조하고 있을 때 발생
		
	}
	
	public void method7() {
		// 배열 선언 및 할당과 동시에 초기화
		int[] iArr = {1, 2, 3, 4};
		// 중괄호 블럭을 사용하는 경우 new 연산자를 사용하지 않아도 되며
		// 값의 갯수만큼 자동으로 크기가 할당
		
		int[] iArr2 = new int[] {1, 2, 3, 4};
		// 이 방법으로도 사용 가능
		
		System.out.println("iArr의 길이 : " + iArr.length);
		System.out.println("iArr2의 길이 : " + iArr2.length);
		
		// iArr이랑 iArr2랑 들어가 있는 값이 같으므로 동등 비교 해보기
		System.out.println(iArr == iArr2);
		// 레퍼런스 변수들의 주소값을 비교
		// 각각 heap 영역에 할당되어 있는 다른 배열이므로
		// 주소는 같을 수 없음
	
	}
	public void method8() {
		//String 문자열도 배열 사용 가능
		String[] sArr = new String[5];
		
		for(int i = 0; i < sArr.length; i++) {
			System.out.println(sArr[i]);
		}
		
		Scanner sc = new Scanner(System.in);
		// 0번 인덱스부터 마지막까지 반복하며
		// 사용자에게 문자열을 입력 받아 해당 인덱스에
		// 사용자가 입력한 값 넣기
		for(int i = 0; i < sArr.length; i++) {
			System.out.print("과일 : ");
			sArr[i] = sc.nextLine();
		}
		
		// 잘 입력 되었는지 출력
		for(int i = 0; i < sArr.length; i++) {
			System.out.println(sArr[i]);
		}
		
	}
	public void method9() {
		// 사용자에게 5명의 키의 정보를 입력 받아 배열에 담아두고
		// 반복문을 통해 5명의 키의 총합, 평균 값 구하기
		Scanner sc = new Scanner(System.in);
		
		double[] height = new double[5];
		double sum = 0;
		
		for(int i = 0; i < height.length; i++) {
			System.out.print("키 입력 : ");
			height[i] = sc.nextDouble();
			sum += height[i];
		}
		
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + sum / height.length);
		
	}
	public void method10() {
		// 사용자에게 한개의 정수를 입력받고 그 크기의 배열 만들어
		// 1~100사이의 랜덤값 발생시켜서 넣기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		// 랜덤 값(난수) 발생 시키는 방법
		// 1. java.lang.Math 클래스의 random() 메소드
		// 2. java.util.Random 클래스
		Random ran = new Random();
		System.out.println("int 범위의 난수 : " + ran.nextInt());
		System.out.println("1 ~ 100 범위의 난수 : " + (ran.nextInt(100) + 1));

		// 입력
		for(int i = 0; i < arr.length; i++) {
			// arr[i] = (int)(Math.random() * 100 + 1);
			arr[i] = ran.nextInt(100) + 1;
		}
		
		// 출력
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public void method11() {
		// 사용자에게 문자열을 입력 받아 해당 문자열의
		// 각 문자를 문자 배열에 차례로 넣기
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
		char[] arr = new char[str.length()];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
			System.out.println(arr[i]);
		}
		
	}
	public void method12() {
		// 최대값 최소값 구하기
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		
		//각 인덱스에 사용자로부터 값 입력 받기
		for(int i = 0; i < arr.length; i++) {
			System.out.print(i+1 + "번째 입력 : ");
			arr[i] = sc.nextInt();
		}
		
		// arr[0]으로 최대값과 최소값을 담을 변수를 초기화
		int max = arr[0]; 
		int min = arr[0];
		
		// 1번 인덱스부터 배열 끝까지 비교하기
		for(int i = 1; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
