package pkgQuiz;

import java.util.Scanner;

public class quiz1 {
	
	Scanner sc = new Scanner(System.in);

	public int battingAverage() {
		System.out.println("Please enter Hits");
		int H = sc.nextInt();
		System.out.println("Please enter At Bats");
		int AB = sc.nextInt();
		return H/AB;
	}
	int BA=battingAverage();
	
	public int totalBases() {
		System.out.println("Please enter Runs");
		int R = sc.nextInt();
		System.out.println("Please enter Doubles");
		int D = sc.nextInt();
		System.out.println("Please enter Triples");
		int T = sc.nextInt();
		System.out.println("Please enter Home Runs");
		int HR = sc.nextInt();
		return R + 2*D + 3*T +4*HR;
	}
	int TB=totalBases();
	
	public int slugging() {
		System.out.println("Please enter At Bats");
		int AB = sc.nextInt();
		return TB/AB;
	}
	int SLG = slugging();
	
	}