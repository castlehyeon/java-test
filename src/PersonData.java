
public record PersonData(
		int age, 
		Gender gender, 
		double weight, 
		double height, 
		double neck, 
		double waist, 
		double hip, 
		Activity activity
		) {
	static PersonData[] data = {
			new PersonData(23, Gender.FEMALE, 54.25, 167.75, 36.2, 85.2, 94.5, Activity.EXTRA_ACTIVE),
			new PersonData(74, Gender.MALE, 94.1, 177.8, 40.8, 108.5, 107.1, Activity.LIGHTLY_ACTIVE),
			new PersonData(34, Gender.FEMALE, 63.49, 169.07, 36.0, 83.4, 89.6, Activity.VERY_ACTIVE),
			new PersonData(54, Gender.MALE, 94.1, 177.8, 40.8, 108.5, 107.1, Activity.MODERATELY_ACTIVE),
			new PersonData(35, Gender.MALE, 57.03, 166.37, 34.0, 75.0, 89.2, Activity.EXTRA_ACTIVE),
			new PersonData(35, Gender.MALE, 80.38, 180.34, 38.4, 90.3, 98.7, Activity.MODERATELY_ACTIVE),
			new PersonData(56, Gender.FEMALE, 59.93, 161.61, 38.7, 90.3, 99.9, Activity.MODERATELY_ACTIVE),
			new PersonData(47, Gender.MALE, 102.83, 182.25, 41.5, 108.8, 114.4, Activity.SEDENTARY),
			new PersonData(69, Gender.FEMALE, 63.72, 165.72, 35.8, 79.4, 89.0, Activity.LIGHTLY_ACTIVE),
			new PersonData(55, Gender.MALE, 90.03, 188.59, 38.3, 96.7, 106.6, Activity.LIGHTLY_ACTIVE)
			};
}
