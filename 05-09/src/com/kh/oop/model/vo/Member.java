package com.kh.oop.model.vo;

public class Member {
	private String memberId, memberPw, memberName, memberGender, memberHobby, memberAddress, memberJob,
			memberPersonality;
	private int memberNo;

	public Member() {
	}

	public void printInfo() {
		System.out.println(
				memberNo + memberId + memberPw + memberName + memberAddress + memberGender + memberHobby + memberJob);
	}
}
