package com.kh.hw1.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileDao {
	Scanner sc = new Scanner(System.in);

	public FileDao() {}

	public void fileSave() {
		StringBuilder sb = new StringBuilder();
		System.out.println("파일에 저장할 내용을 반복해서 입력하시오." + "(exit)을 입력하면 내용 입력 끝 : ");
		while (true) {
			String str = sc.nextLine();
			if (str.equals("exit")) {
				break;
			}
			sb.append(str + "\n");
		}
		System.out.print("저장하시겠습니까?(y/n)");
		String yn = sc.nextLine();
		if (yn.equalsIgnoreCase("y")) {
			BufferedWriter bw = null;
			try {
				System.out.print("파일명 입력 : ");
				String name = sc.nextLine() + ".txt";
				bw = new BufferedWriter(new FileWriter(name));
				bw.write(sb.toString());
				System.out.println(name + " 파일에 성공적으로 저장하였습니다.");
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					bw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} else {
			System.out.println("다시 메뉴로 돌아갑니다.");
		}
	}

	public void fileOpen() {
		System.out.print("열기 할 파일명 : ");
		String name = sc.nextLine() + ".txt";
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(name));
			String read = "";
			while ((read = br.readLine()) != null) {
				System.out.println(read);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void fileEdit() {
		System.out.print("수정 할 파일명 : ");
		String name = sc.nextLine() + ".txt";
		try (BufferedReader br = new BufferedReader(new FileReader(name));
				BufferedWriter bw = new BufferedWriter(new FileWriter(name, true))) {
			String read = "";
			StringBuilder sb = new StringBuilder();
			while ((read = br.readLine()) != null) {
				System.out.println(read);
			}
			System.out.print("파일에 추가할 내용을 입력하시오 : ");
			while (true) {
				String write = sc.nextLine();
				if (write.equals("exit")) {
					break;
				} else {
					sb.append(write + "\n");
				}
			}
			System.out.print("변경된 내용을 파일에 추가하시겠습니까?(y/n) : ");
			String yn = sc.nextLine();
			if (yn.equalsIgnoreCase("y")) {
				bw.write(sb.toString() + "\n");
				System.out.println(name + " 파일의 내용이 변경되었습니다.");
			} else {
				System.out.println("취소하셨습니다.");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
