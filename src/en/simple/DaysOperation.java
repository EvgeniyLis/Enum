package en.simple;

public class DaysOperation {
	
	Day day;

	public DaysOperation(Day day) {
		super();
		this.day = day;
	}

	public void tellAboutDay() {
		switch (day) {
		case SUNDAY:
			System.out.println("Today is Sunday");
			break;
			
		case MONDAY:
			System.out.println("Today is Monday");
			break;
			
		case TUESDAY:
			System.out.println("Today is Tuesday");
			break;
			
		case WEDNESDAY:
			System.out.println("Today is Wednesday");
			break;
			
		case THURSDAY:
			System.out.println("Today is Thursday");
			break;
			
		case FRIDAY:
			System.out.println("Today is Friday");
			break;
			
		case SATURDAY:
			System.out.println("Today is Saturday");
			break;

		}
	}


	public static void main(String[] args) {
		DaysOperation daysOp=new DaysOperation(Day.MONDAY);
		daysOp.tellAboutDay();
		daysOp.day=Day.WEDNESDAY;
		daysOp.tellAboutDay();
	}

}
