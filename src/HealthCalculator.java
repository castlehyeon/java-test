//추상클래스 작성-변수와 메서드중 중복되는 부분 고려.
public abstract class HealthCalculator {
	//변수가 필요한가?
	protected static double weight;
	protected static double height;
	protected static Gender gender;
	//생성자를 따로 작성해야하나?
	//어떤 계산방법을 사용할 것인가.
	public abstract double calculate();
	//사용자 정보 받아오기.
	public abstract void getUserInput();
}
