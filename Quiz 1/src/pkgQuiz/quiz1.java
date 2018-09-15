package pkgQuiz;

import java.util.Scanner;

public class quiz1 {
	
	static Scanner sc = new Scanner(System.in);
	public static void BA(double H, double AB) {
		double battingAverage=H/AB;
		System.out.println("The Batting Average is " + battingAverage);
	}
	public static void TB(double R, double D, double T, double HR) {
		double totalBases= R+D*2+T*3+HR*4;
		System.out.println("The Total Bases is " + totalBases);
	}
	public static void SLG(double R, double D, double T, double HR, double AB) {
		double slugging=(R+D*2+T*3+HR*4)/AB;
		System.out.println("The Slugging Percentage is " + slugging);
	}
	public static void OBP(double H, double BB, double AB) {
		double onBase=(H+BB)/(AB+BB);
		System.out.println("The On-Base Percentage is " + onBase);
	}
	public static void OBS(double R, double D, double T, double HR, double H, double BB, double AB) {
		double baseSlugging = ((R+D*2+T*3+HR*4)/AB)+((H+BB)/(AB+BB));
		System.out.println("The On-Base + Slugging Percentage is " +baseSlugging);
	}
	public static void main(String[] args) {
		System.out.println("Please enter player's name");
		String playerName = sc.next();
		System.out.println("Please enter At Bats");
		double AB=sc.nextInt();
		System.out.println("Please enter Hits");
		double H=sc.nextInt();
		System.out.println("Please enter Runs");
		double R=sc.nextInt();
		System.out.println("Please enter Doubles");
		double D=sc.nextInt();
		System.out.println("Please enter Triples");
		double T=sc.nextInt();
		System.out.println("Please enter HomeRuns");
		double HR=sc.nextInt();
		System.out.println("Please enter Walks");
		double BB=sc.nextInt();
		System.out.println("Here are the statistics for " + playerName);
		quiz1.BA(H, AB);
		quiz1.TB(R, D, T, HR);
		quiz1.SLG(R,D,T,HR,AB);
		quiz1.OBP(H,BB,AB);
		quiz1.OBS(R,D,T,HR,H,BB,AB);
	}
}