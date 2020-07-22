package main;

import java.util.*;

import dto.Num;
import dto.User;

public class SubClass {
	
	Random rnd;
	Scanner sc;
	private Num nm;
	int o;
	
	public SubClass() {
		rnd = new Random();
		sc = new Scanner(System.in);
		nm = new Num();
	}
	
	public Num num() {
		for (;;) {
			int numa = rnd.nextInt(89) + 10;
			int numb = rnd.nextInt(89) + 10;
			if(ddul(numa, numb)) {
				nm.setNum1(numa);
				nm.setNum2(numb);
				break;
			}
		}
		for (;;) {
			int numc = rnd.nextInt(89) + 10;
			int numd = rnd.nextInt(89) + 10;
			if(ddul(numc, numd)) {
				nm.setNum3(numc);
				nm.setNum4(numd);
				break;
			}
		}
		for (;;) {
			int nume = rnd.nextInt(89) + 10;
			int numf = rnd.nextInt(89) + 10;
			if(ddul(nume, numf)) {
				nm.setNum5(nume);
				nm.setNum6(numf);
				break;
			}
		}
		
		change(nm.getNum1(), nm.getNum2());
		change1(nm.getNum3(), nm.getNum4());
		change2(nm.getNum5(), nm.getNum6());
		
		return nm;
	}
	
	public void addition(Num nm) {
		
		System.out.println(nm.getNum1() + " + " + nm.getNum2() + " = ? ");
		System.out.println(nm.getNum3() + " + " + nm.getNum4() + " = ? ");
		System.out.println(nm.getNum5() + " + " + nm.getNum6() + " = ? ");
		int input1 = sc.nextInt();
		int input2 = sc.nextInt();
		int input3 = sc.nextInt();
		
		if (input1 == (nm.getNum1() + nm.getNum2())){
			System.out.println("첫번째 문제는 정답 입니다.");
			o++;
		}else {
			System.out.println("첫번째 문제를 틀렸습니다.");
		}
		if (input2 == (nm.getNum3() + nm.getNum4())){
			System.out.println("두번째 문제는 정답 입니다.");
			o++;
		}else {
			System.out.println("두번째 문제를 틀렸습니다.");
		}
		if (input3 == (nm.getNum5() + nm.getNum6())){
			System.out.println("세번째 문제는 정답 입니다.");
			o++;
		}else {
			System.out.println("세번째 문제를 틀렸습니다.");
		}
		System.out.println("정답수 : " + o);
	}
	
	public void subtraction(Num nm) {
		
		System.out.println(nm.getNum1() + " - " + nm.getNum2() + " = ? ");
		System.out.println(nm.getNum3() + " - " + nm.getNum4() + " = ? ");
		System.out.println(nm.getNum5() + " - " + nm.getNum6() + " = ? ");
		int input1 = sc.nextInt();
		int input2 = sc.nextInt();
		int input3 = sc.nextInt();
		
		if (input1 == (nm.getNum1() - nm.getNum2())){
			System.out.println("첫번째 문제는 정답 입니다.");
			o++;
		}else {
			System.out.println("첫번째 문제를 틀렸습니다.");
		}
		if (input2 == (nm.getNum3() - nm.getNum4())){
			System.out.println("두번째 문제는 정답 입니다.");
			o++;
		}else {
			System.out.println("두번째 문제를 틀렸습니다.");
		}
		if (input3 == (nm.getNum5() - nm.getNum6())){
			System.out.println("세번째 문제는 정답 입니다.");
			o++;
		}else {
			System.out.println("세번째 문제를 틀렸습니다.");
		}
		System.out.println("정답수 : " + o);
	}
	
	public void multiplication(Num nm) {
		
		System.out.println(nm.getNum1() + " * " + nm.getNum2() + " = ? ");
		System.out.println(nm.getNum3() + " * " + nm.getNum4() + " = ? ");
		System.out.println(nm.getNum5() + " * " + nm.getNum6() + " = ? ");
		int input1 = sc.nextInt();
		int input2 = sc.nextInt();
		int input3 = sc.nextInt();
		
		if (input1 == (nm.getNum1() * nm.getNum2())){
			System.out.println("첫번째 문제는 정답 입니다.");
			o++;
		}else {
			System.out.println("첫번째 문제를 틀렸습니다.");
		}
		if (input2 == (nm.getNum3() * nm.getNum4())){
			System.out.println("두번째 문제는 정답 입니다.");
			o++;
		}else {
			System.out.println("두번째 문제를 틀렸습니다.");
		}
		if (input3 == (nm.getNum5() * nm.getNum6())){
			System.out.println("세번째 문제는 정답 입니다.");
			o++;
		}else {
			System.out.println("세번째 문제를 틀렸습니다.");
		}
		System.out.println("정답수 : " + o);
	}
	
	public void division(Num nm) {
		
		System.out.println(nm.getNum1() + " / " + nm.getNum2() + " = ? ");
		System.out.println(nm.getNum3() + " / " + nm.getNum4() + " = ? ");
		System.out.println(nm.getNum5() + " / " + nm.getNum6() + " = ? ");
		int input1 = sc.nextInt();
		int input2 = sc.nextInt();
		int input3 = sc.nextInt();
		
		if (input1 == (nm.getNum1() / nm.getNum2())){
			System.out.println("첫번째 문제는 정답 입니다.");
			o++;
		}else {
			System.out.println("첫번째 문제를 틀렸습니다.");
		}
		if (input2 == (nm.getNum3() / nm.getNum4())){
			System.out.println("두번째 문제는 정답 입니다.");
			o++;
		}else {
			System.out.println("두번째 문제를 틀렸습니다.");
		}
		if (input3 == (nm.getNum5() / nm.getNum6())){
			System.out.println("세번째 문제는 정답 입니다.");
			o++;
		}else {
			System.out.println("세번째 문제를 틀렸습니다.");
		}
		System.out.println("정답수 : " + o);
	}
	
	public User user() {
		
		System.out.println("이름을 입력하시오 : ");
		String name = sc.next();
		System.out.println("아이디를 입력하시오 : ");
		String id = sc.next();
		int grade = 1;
		
		User us = new User();
		us.setId(id);
		us.setName(name);
		us.setGrade(grade);
		
		System.out.println(name + "님 환영합니다.");
		
		return us;
	}
		public void change(int a, int b) {
			nm.setNum1(Math.max(a, b));
			nm.setNum2(Math.min(a, b));
		}
		
		public void change1(int a, int b) {
			nm.setNum3(Math.max(a, b));
			nm.setNum4(Math.min(a, b));
		}
		
		public void change2(int a, int b) {
			nm.setNum5(Math.max(a, b));
			nm.setNum6(Math.min(a, b));
		}
		
		// 나누기를 무조건 떨어지게 만들기
		public boolean ddul(int a, int b) {
			if (a % b == 0) {
				return true;
			}
				return false;
			
		}
}
