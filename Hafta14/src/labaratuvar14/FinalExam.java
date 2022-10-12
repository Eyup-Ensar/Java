package labaratuvar14;

public class FinalExam extends GradedActivity implements Relatable {

	private int numQuestions;// toplam soru say�s�
	private double pointsEach; // her bir soru i�in puan
	private int numMissed; // cevaps�z b�rak�lan soru say�s�
	
	public FinalExam(int numQuestions, int numMissed ) {
		
		double numericScore; // net puan� tutan de�i�ken
		
		this.numQuestions=numQuestions;
		this.numMissed=numMissed;
		
		pointsEach = 100.0 /numQuestions; //her soru i�in puan
		
		numericScore=100.0 -(numMissed*pointsEach); //��rencinin net puan� 
		
		setScore(numericScore);
	}

	@Override
	public boolean equals(GradedActivity g) {
		
		boolean status;
		
		if (this.getScore()== g.getScore()) {
			status=true;
		} else {
			status=false;
		}
	
		return status;
	}

	@Override
	public boolean isGreater(GradedActivity g) {
		
		boolean status;
		
		if (this.getScore() > g.getScore()) {
			status=true;
		} else {
			status=false;
		}
		
		return status;
	}

	@Override
	public boolean isLess(GradedActivity g) {
		
		boolean status;
		
		if (this.getScore() < g.getScore()) {
			status=true;
		} else {
			status=false;	
		}
		
		return status;
	}

	
}
