package one;

public class Calculator {
	public double findAverage(double a,double b,double c) {
		double sum = a + b+ c;
		double avg = sum/(double)3;
		double roundOff = Math.round(avg * 100.0) / 100.0;
		return roundOff;
	}
	public double findAverage(double a,double b,double c,double d) {
		double sum = a + b+ c+d;
		double avg = sum/(double)4;
		double roundOff = Math.round(avg * 100.0) / 100.0;
		return roundOff;
	}

	public double findAverage(double a,double b,double c,double d,double e) {
		double sum = a + b+ c+ d+ e;
		double avg = sum/(double)5;
		double roundOff = Math.round(avg * 100.0) / 100.0;
		return roundOff;
	}


}
