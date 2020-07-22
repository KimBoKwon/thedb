package main;

import java.util.*;

import db.DBClass;
import dto.Num;
import dto.User;

public class MainClass {

	public static void main(String[] args) {
		
		SubClass sc = new SubClass();
		Num nm = sc.num();
		Scanner sn = new Scanner(System.in);
		
		DBClass.conTest();
		DBClass.numinsert(nm.getNum1(), nm.getNum2());
		DBClass.numinsert(nm.getNum3(), nm.getNum4());
		DBClass.numinsert(nm.getNum5(), nm.getNum6());
		
		User us = sc.user();
		DBClass.userinsert(us.getId(), us.getName(), us.getGrade());
		
		for (;;) {
			try {
				System.out.println("김보권의 연산의 달인!");
				System.out.println("어떤 기능을 사용하시겠습니까?");
				System.out.println("1. 더하기  2. 빼기  3. 곱하기  4. 나누기  0. 종료");
				int choice = sn.nextInt();
				if (choice == 1) {
					sc.addition(nm);
				} else if (choice == 2) {
					sc.subtraction(nm);
				} else if (choice == 3) {
					sc.multiplication(nm);
				} else if (choice == 4) {
					sc.division(nm);
				} else if (choice == 0) {
					System.out.println("김보권의 연산의 달인을 종료합니다!");
					break;
				}
			} catch (Exception e) {
				System.out.println("잘못 입력 하였습니다.");
			}
		}
	}

}
