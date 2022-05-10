import java.util.Scanner;

public class BFPCalculator extends HealthCalculator {
	//상속받은 변수 외에 필요한 변수 선언
	double neck;
	double waist;
	double hip;
	
	
		// // BFPCalculator클래스의 멤버필드는 매개변수가 있는 constructor로 선언함.
		public void BFPCalculator(Gender gender, double height, double neck, double waist, double hip) {

			this.gender = gender;
			this.height = height;
			this.neck = neck;
			this.waist = waist;
			this.hip = hip;
		}
		// getter/setter
		public Gender getGender() {
			return gender;
		}

		public void setGender(Gender gender) {
			//클래스 멤버인 boolean형의 Gender값을 조건으로 변경하도록 했다.
			if (Gender == false)
				return;
			this.gender = gender;
		}

		public double getHeight() {
			return height;
		}

		public void setHeight(double height) {
			this.height = height;
		}

		public double getNeck() {
			return neck;
		}

		public void setNeck(double neck) {
			this.neck = neck;
		}

		public double getWaist() {
			return waist;
		}

		public void setWaist(double waist) {
			this.waist = waist;
		}

		public double getHip() {
			return hip;
		}

		public void setHip(double hip) {
			this.hip = hip;
		}

		//public String toString() 메서드: BFP 출력
		@Override
		public String toString() {
			return "당신 성별은" + gender + "이고, 이에 따른 BFP지수는" + calculate() + " 입니다.";
		}
	/* 본인의 메소드와 클래스 작성*/
	// 성별을 가를 수 있는 클래스 메서드 작성
	// 입력한 성별에 따라 논리값을 반환한다.
	// 멤버필드 입력 전, 성별을 먼저 입력받는다.
	// Gender메서드를 호출해 클래스변수인 boolean Gender에 값을 저장한다.

		static Scanner scan = new Scanner(System.in);
		public static boolean Gender() {
			System.out.println("성별이 남자면 1을, 여자면 2를 입력해주세요. ");
			String gen = scan.nextLine();
			if (gen.contentEquals("1"))
				return true;
			else
				return false;
		}
		static boolean Gender = Gender();
		//.scan이 널값이라는 에러가 떴었는데, gender변수에 입력받지 않은 스캐너값을 먼저 대입하려고 하니, null에러가 뜬 것. 코드 순서를 바꿔줌

	@Override
	// calculateBFP 메서드, 멤버필드로 계산
	public double calculate() {
		if (Gender == true) {
			return 495 / (1.29579 - .35004 * Math.log10(waist - neck) + 0.22100 * Math.log10(height)) - 450;
		} else {
			return 495 / (1.29579 - .35004 * Math.log10(waist + hip - neck) + 0.22100 * Math.log10(height)) - 450;
		}
	}

	@Override
	// public void getUserInputBFP(): 사용자 입력값을 멤버필드로 쓸 수 있는 메서드
	// 입력한 성별에 따라 논리값을 조건으로 입력을 다르게 했다.
	public void getUserInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("키(cm)를 입력해주세요.");
		height = scanner.nextDouble();
		System.out.println("목(cm)를 입력해주세요.");
		neck = scanner.nextDouble();
		System.out.println("허리(cm)를 입력해주세요. ");
		waist = scanner.nextDouble();
		if (Gender != true) {
			System.out.println("엉덩이(cm)를 입력해주세요.");
			hip = scanner.nextDouble();
		}

	}

}
