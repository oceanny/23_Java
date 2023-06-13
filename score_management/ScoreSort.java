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
		label[0]="번호";
		label[1]="이름";
		label[label.length-2]="총점";
		label[label.length-1]="평균";
		
		scores = new int[subjectNum];
	}
	
	// 총점 메소드
	public void total() {
		for (int i = 0; i < SUBJECT_NUM; i++) {
			total = total + scores[i];
		}
	}

	// 평균 메소드
	public void avg() {
		avg = total * 10 / SUBJECT_NUM / 10f;
	}

	@Override
//	총점을 내림차순으로 정렬
	public int compareTo(Object o) {
		int result = -1;
		if (o instanceof ScoreSort) {
			ScoreSort other = (ScoreSort) o;
//			compareTo : 크면 1, 같으면 0, 작으면 -1을 리턴하는 함수이므로
//			total에서 입력된 total을 빼서 음수인지 체크
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
