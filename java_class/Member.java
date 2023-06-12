package com.java.classes;

public class Member {
	
	private String id;
	private String pwd;
	
	
	@Override
//	id 값이 같으면 true가 나오도록 함
	public boolean equals(Object obj) {
		boolean result = false;
		if(obj instanceof Member) {
//		Object type obj를 Member로 바꿈 -> getID 사용 가능
//		if문에서 검증했기 때문에 에러 발생 X
		Member other = (Member)obj;
			if(other.getId().equals(id)) result = true;
		}
		return result;
	}
	
	@Override
	public int hashCode() {
		return id.hashCode();
	}

	@Override
//	주소값 대신 id값이 출력되도록 함
	public String toString() {
		return id;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
}
