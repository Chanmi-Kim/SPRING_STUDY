package com.test.spring.aop;

public class Memo implements IMemo {

	public void add(String memo) {
		
		//1. 주업무 실행 - 메모 쓰기(DB)
		System.out.printf("메모 쓰기 : %s\n", memo);
		
	}

	@Override
	public void read(int seq) throws Exception {
		// TODO Auto-generated method stub
		
		if (seq != 5) {
			System.out.printf("메모 읽기 : %d번\n", seq);
		} else {
			throw new Exception("존재하지 않은 메모");
		}
	}

	@Override
	public void edit(String memo) {
		// TODO Auto-generated method stub
		System.out.printf("메모 수정 : %s\n", memo);
	}

	@Override
	public void del(int seq) {
		// TODO Auto-generated method stub
		System.out.printf("메모 삭제 : %d번\n", seq);
	}

	@Override
	public int search(String word) {
		
		if (word.indexOf("메모") > -1) {
			return 3;
		} else if (word.indexOf("길동") > -1) {
			return 10;
		}
		
		return -1;
	}

}









