
//Java22_Lab3_2분반_32160707_김성현
import java.util.Scanner;

/* 본인의 메소드와 클래스 작성*/
//getUserInput 클래스: BMI/BFP 선택메서드와 중단 선택메서드를 포함.
class UserInput {
	static Scanner scan = new Scanner(System.in);

	// 계산법 선택 1번, 2번, 3번, 4번을 반환하는 메서드:
	public static int getChoiceKey() {
		System.out.print("******* 연산메뉴 *******BMI측정을 원하시면 1번키를, BFP측정을 원하시면 2번키를 입력하세요.: \n");
		System.out.print("1. BMI\n");
		System.out.print("2. BFP \n");
		System.out.print("3. BMR \n");
		System.out.print("4. CI\n");

		String num = scan.nextLine();
		if (num.contentEquals("1"))
			return 1;
		else if (num.contentEquals("2"))
			return 2;
		else if (num.contentEquals("3"))
			return 3;
		else if (num.contentEquals("4"))
			return 4;
		else
			System.out.println("다시 수를 입력해주세요");
		return 0;
	}

	// 중단 메서드
	public static boolean getExitKey() {
		System.out.print("Press q-key to exit or enter-key to continue: ");
		String s = scan.nextLine();
		if (s.contentEquals("q"))
			return true;
		else
			return false;
	}

//0519 레코드 활용과 모든 모드 계산 구현
	public class Lab3 {
//		static PersonData[] data = {
//			new PersonData(23, Gender.FEMALE, 54.25, 167.75, 36.2, 85.2, 94.5, Activity.EXTRA_ACTIVE),
//			new PersonData(74, Gender.MALE, 94.1, 177.8, 40.8, 108.5, 107.1, Activity.LIGHTLY_ACTIVE),
//			new PersonData(34, Gender.FEMALE, 63.49, 169.07, 36.0, 83.4, 89.6, Activity.VERY_ACTIVE),
//			new PersonData(54, Gender.MALE, 94.1, 177.8, 40.8, 108.5, 107.1, Activity.MODERATELY_ACTIVE),
//			new PersonData(35, Gender.MALE, 57.03, 166.37, 34.0, 75.0, 89.2, Activity.EXTRA_ACTIVE),
//			new PersonData(35, Gender.MALE, 80.38, 180.34, 38.4, 90.3, 98.7, Activity.MODERATELY_ACTIVE),
//			new PersonData(56, Gender.FEMALE, 59.93, 161.61, 38.7, 90.3, 99.9, Activity.MODERATELY_ACTIVE),
//			new PersonData(47, Gender.MALE, 102.83, 182.25, 41.5, 108.8, 114.4, Activity.SEDENTARY),
//			new PersonData(69, Gender.FEMALE, 63.72, 165.72, 35.8, 79.4, 89.0, Activity.LIGHTLY_ACTIVE),
//			new PersonData(55, Gender.MALE, 90.03, 188.59, 38.3, 96.7, 106.6, Activity.LIGHTLY_ACTIVE)
//	};
//
//	static void calculate(Mode mode, PersonData person) {
//		HealthCalculator calculator = null;
//		switch (mode) {
//			case BMI:
//				calculator = new BMICalculator(person.weight(), person.height());
//				break;
//			case BFP:
//				calculator = new BFPCalculator(person.gender(), person.height(), person.neck(), person.waist(), person.hip());
//				break;
//			case BMR:
//				calculator = new BMRCalculator(person.age(), person.gender(), person.weight(), person.height());
//				break;
//			case CI:
//				calculator = new CalorieIntakeCalculator(person.age(), person.gender(), person.weight(), person.height(), person.activity());
//				break;
//			default:
//				System.out.println("default");
//				break;
//		}
//		System.out.println(calculator);
//	}
		public static void main(String[] args) {


			//1. foreach문을 이용해서 모든 data를 사용해서 모든 모드(BMI, BFP, BMR, CI)를 계산
			//static void calculate(Mode mode, PersonData person)
		System.out.println("\n foreach calculator");

//		class calculateAll { //1번은 구현X
//
//			static void calculate(Mode mode, PersonData person) {
//				//이중 for문? mode(0부터 3까지 4개의 계산)에 따라 각 PersonData
//				//foreach구문을 제대로 이해못한거 같다.
//				for (Mode i : mode.values()) {
//					System.out.println(i);
//					for (PersonData j : PersonData.data) {
//						System.out.println(j);
//					}
//				}
//			}
//
//		}

//			calculateAll all = new calculateAll();
			System.out.println("1번은 구현하지 못했습니다.");
			//2. 유저입력값에 따라 계산
			//계산법 초기값을 설정. 원래 초기값이 false라 의미없는 코드인가
			boolean exitChoice = false;
			/* 계산방법 선택 메서드와 작업중지 선택메서드를 사용하기 위해 인스턴스 생성 */
			UserInput info = new UserInput();
			/*작업중지 선택기능을 위해 전체를 do-while로 감쌌다. */
			do {
				//계산방법 선택 메서드. Lab2에서는 이를 booliean값으로 줬으나, 계산방법이 많아져 int로 주게됨.
				int choice = info.getChoiceKey();
				//1일 경우 BMI 계산
				if (choice == 1) {
					BMICalculator bmi1 = new BMICalculator();
					bmi1.getUserInput();
					System.out.println(bmi1.toString());

				} else if (choice == 2) {
					BFPCalculator bfp1 = new BFPCalculator();
					bfp1.getUserInput();
					//성별이 남자일 경우, setter로 값을 변경
					bfp1.setGender(Gender.MALE);
					System.out.println(bfp1.toString());

				} else if (choice == 3) {
					BMRCalculator bfp1 = new BMRCalculator();
					bfp1.getUserInput();
					//성별이 남자일 경우, setter로 값을 변경
					bfp1.setGender(Gender.MALE);
					System.out.println(bfp1.toString());

				} else if (choice == 4) {
					CalorieIntakeCalculator bfp1 = new CalorieIntakeCalculator();
					bfp1.getUserInput();
					//성별이 남자일 경우, setter로 값을 변경
					bfp1.setGender(Gender.MALE);
					System.out.println(bfp1.toString());
				} else
					break;
				//main함수 내 연산을 계속 반복할 것인지에 대한 continue 구문.
				//조건식처럼 false일 경우 작업을 반복하고, 만약 값이 true라면 반복구문을 빠져나와 시스템을 종료.
				exitChoice = info.getExitKey();
				if (exitChoice == true)
					continue;
			} while (exitChoice == false);

			System.out.println("시스템을 종료합니다.");
		}
	}
}