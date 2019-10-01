package com.kh.chap01_list.part03_sort.controller;

import java.util.ArrayList;
import java.util.Collections;

import com.kh.chap01_list.part03_sort.model.comparator.AscName;
import com.kh.chap01_list.part03_sort.model.comparator.AscScore;
import com.kh.chap01_list.part03_sort.model.comparator.DescName;
import com.kh.chap01_list.part03_sort.model.comparator.DescScore;
import com.kh.chap01_list.part03_sort.model.vo.Student;

public class StudentController {
	public void testSort(){
		ArrayList<Student> s1 = new ArrayList<Student>();
		s1.add(new Student("박영희", 80));
		s1.add(new Student("김영희", 60));
		s1.add(new Student("한영희", 100));
		
		System.out.println("=== 전체 리스트 출력 ===");
		for(Student st : s1){
			System.out.println(st);
		}
		
		// java.util.Comparator의 compare()
		// 새로운 vo를 생성하여 Compartor를 상속받아
		// compare() 메소드를 오버라이딩 하여
		// 정렬 기준을 입력 -> 여러 개의 정렬 가능
		System.out.println("==== Comparator ====");
		System.out.println("==== 점수 오름차순 정렬 ====");
		// AscScore 클래스 만들기
		Collections.sort(s1, new AscScore());
		for(Student st : s1){
			System.out.println(st);
		}
		// DescScore 클래스 만들기
		System.out.println("==== 점수 내림차순 정렬 ====");
		Collections.sort(s1, new DescScore());
		for(Student st : s1){
			System.out.println(st);
		}
		System.out.println("==== 이름 오름차순 정렬 ====");
		Collections.sort(s1, new AscName());
		for(Student st : s1){
			System.out.println(st);
		}
		System.out.println("==== 이름 내림차순 정렬 ====");
		Collections.sort(s1, new DescName());
		for(Student st : s1){
			System.out.println(st);
		}
		
		// java.lang.comparable의 compareTo()
		// 정렬하고자 하는 객체에 Comparable 상속받아
		// compareTo() 메소드 오버라이딩하여
		// 정렬 기준 작성 -> 한 개의 정렬 기준만 가능
		System.out.println("===== Comparable =====");
		System.out.println("===== 등수 ====="); // -> 점수 내림차순
		Collections.sort(s1);
		for(int i = 0; i < s1.size(); i++){
			System.out.println(i+1 + "등 : " + s1.get(i));
		}
		// **** 주의 할 점 ****
		// sort() 메소드를 실행하면 원본 리스트가 변경되므로
		// 원본 리스트의 변경 없이 sort()를 하고 싶다면
		// 반드시 사본 리스트를 만들어서 사본 리스트에 sort()를 
		// 적용해야함
		
	}
}
