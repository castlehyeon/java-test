import java.util.Scanner;

public class CalorieIntakeCalculator extends BMRCalculator {
    protected static Activity activity;

    public CalorieIntakeCalculator() { //매개변수를 따로 받지 않아도 되는구나!
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.age = age;
    }
//

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

    @Override
    public String toString() {
        return "당신 성별은" + gender + "이고, 이에 따른 BMR지수는" + calculate() + " 입니다.\n" +
                "*******CalorieIntakeCalculator*******\n"+
                "SEDENTARY: " + calculate() * 1.2 + "\n" +
                "LIGHTLY_ACTIVE: " + calculate() * 1.375 + "\n" +
                "MODERATELY_ACTIVE: " + calculate() * 1.55 + "\n" +
                "VERY_ACTIVE: " + calculate() * 1.725 + "\n" +
                "EXTRA_ACTIVE: "+ calculate() * 1.9;
    }//enum을 선언하고도 쓰지 않아서, 코드가 길어진다.
//0517수정
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
