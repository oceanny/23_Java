package com.java.classes;

public class Member {
	
	private String id;
	private String pwd;
	
	
	@Override
//	id ���� ������ true�� �������� ��
	public boolean equals(Object obj) {
		boolean result = false;
		if(obj instanceof Member) {
//		Object type obj�� Member�� �ٲ� -> getID ��� ����
//		if������ �����߱� ������ ���� �߻� X
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
//	�ּҰ� ��� id���� ��µǵ��� ��
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
