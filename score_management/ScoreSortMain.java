package TestScoreSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ScoreSortMain {

	public static void main(String[] args) {
//		list�� �ְ� ����
		List scoreList = new ArrayList();
		
		for (int i = 0; i < 10; i++) {
			ScoreSort score = new ScoreSort();
			int[] tempScores = new int[4];
//			random score �� ����
			for (int j = 0; j < tempScores.length; j++) {
				tempScores[j] = (int)(Math.random() * 101);
				}
			score.scores = tempScores;
			score.total();
			
			scoreList.add(score);
		}
		
		Collections.sort(scoreList, Collections.reverseOrder());
		System.out.println(scoreList);
		
	
		
	}

}
