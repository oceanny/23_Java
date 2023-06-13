package TestScoreSort;

public class ScoreSort implements Comparable {
	
	public static String school;
	public static String[] label;
	public String stuNum;
	public String name;
	public int[] scores;
	
	private final int SUBJECT_NUM;
	private int total;
	private float avg;
	
	public int getSUBJECT_NUM() {
		return SUBJECT_NUM;
	}

	public int getTotal() {
		return total;
	}

	public float getAvg() {
		return avg;
	}

	public ScoreSort() {
		this(4);
	}
	
	public ScoreSort(int subjectNum) {
		
		SUBJECT_NUM = subjectNum;
		
		label = new String[subjectNum + 4];
		label[0]="��ȣ";
		label[1]="�̸�";
		label[label.length-2]="����";
		label[label.length-1]="���";
		
		scores = new int[subjectNum];
	}
	
	// ���� �޼ҵ�
	public void total() {
		for (int i = 0; i < SUBJECT_NUM; i++) {
			total = total + scores[i];
		}
	}

	// ��� �޼ҵ�
	public void avg() {
		avg = total * 10 / SUBJECT_NUM / 10f;
	}

	@Override
//	������ ������������ ����
	public int compareTo(Object o) {
		int result = -1;
		if (o instanceof ScoreSort) {
			ScoreSort other = (ScoreSort) o;
//			compareTo : ũ�� 1, ������ 0, ������ -1�� �����ϴ� �Լ��̹Ƿ�
//			total���� �Էµ� total�� ���� �������� üũ
			result = total - other.getTotal();
		}
		return result;
	}
	
	@Override
	public String toString() {
		String output = "";
		for (int i = 0; i < SUBJECT_NUM; i++) {
			output += scores[i] + "\t";
		}
		output += total + "\t" + avg + "\n";
		return output;
	}
	
	
}
