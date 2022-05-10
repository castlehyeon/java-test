import java.util.Scanner;

public class BMRCalculator extends HealthCalculator {
    protected static int age;

    public BMRCalculator() { //매개변수를 따로 받지 않아도 되는구나!
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.age = age;
    }

// getter/setter

    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        BMRCalculator.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        //클래스 멤버인 boolean형의 Gender값을 조건으로 변경하도록 했다.
        if (Gender == false)
            return;
        this.gender = gender;
    }
    public double getWeight() {
        return BMRCalculator.weight;
    }

    public void setWeight(double weight) {
        if (weight <= 0 || weight > 150)
            return; // 무게(kg) 값의 범위 지정
        BMRCalculator.weight = weight;
    }

    public double getHeight() {
        return BMRCalculator.height;
    }

    public void setHeight(double height) {
        if (height <= 0 || height > 200)
            return; // 키(cm) 값의 범위 지정
        BMRCalculator.height = height;
    }
    //성별 선택에 대한 클래스. (이건 BMR, BFP 중복코드니까 따로 클래스로 두면 간결해질 것이다.)

    static Scanner scan = new Scanner(System.in);
    public static boolean Gender() {
        System.out.println("성별이 남자면 1을, 여자면 2를 입력해주세요. ");
        String gen = scan.nextLine();
        if (gen.contentEquals("1"))
            return true;
        else
            return false;
    }
    // public String toString() 메서드: BMR출력
    static boolean Gender = Gender();
    @Override
    public String toString() {
        return "당신 성별은" + gender + "이고, 이에 따른 BMR지수는" + calculate() + " 입니다.";
    }

    @Override
    public double calculate() {

        if (Gender == true) {
            return 66.4730 + (13.7516 * weight) + (5.0033 * height) - (6.7550 * age);
        } else {
            return 655.0955 + (9.5634 * weight) + (1.8496 * height) - (4.6756 * age);
        }
    }

    @Override
    public void getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("몸무게를 입력해주세요. ");
        weight = scanner.nextDouble();
        System.out.println("나이를 입력해주세요.");
        age = scanner.nextInt();

    }

}

