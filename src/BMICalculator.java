import java.util.Scanner;

public class BMICalculator extends HealthCalculator {
	// getter/setter
		public double getWeight() {
			return BMICalculator.weight;
		}

		public void setWeight(double weight) {
			if (weight <= 0 || weight > 150)
				return; // 무게(kg) 값의 범위 지정
			BMICalculator.weight = weight;
		}

		public double getHeight() {
			return BMICalculator.height;
		}

		public void setHeight(double height) {
			if (height <= 0 || height > 200)
				return; // 키(cm) 값의 범위 지정
			BMICalculator.height = height;
		}
		// public String toString() 메서드: BMI출력
		@Override
		public String toString() {
			return "당신의 BMI지수는 " + calculate() + " 입니다.";
		}

	@Override
	public double calculate() {
		return weight / (height * 0.01) / (height * 0.01);
	}

	@Override
	public void getUserInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("몸무게를 입력해주세요. ");
		weight = scanner.nextDouble();
		System.out.println("키를 입력해주세요.");
		height = scanner.nextDouble();

	}

}
