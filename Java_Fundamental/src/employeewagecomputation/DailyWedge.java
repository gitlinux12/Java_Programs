package employeewagecomputation;

public class DailyWedge {
	
	static final int IS_PRESENT = 1;
	static final int IS_HALF_DAY = 2;
	static int WAGE_PER_HOUR = 20;
	static int FULL_DAY_HOUR = 8;
	static int HALF_DAY_HOUR = 4;
	static int WORKING_DAYS_IN_MONTH = 20;
	static int MONTHLY_HOUR_LIMIT = 100;
	
	public static void main(String[] args) {
		int attendance;
		int empWage = 0;
		int totalMonthWage = 0;
		int totalMonthHour = 0;
		int day = 1;
		
		System.out.println("Welcome to Employee Wage Computation");
		while (day <= WORKING_DAYS_IN_MONTH && totalMonthHour <= MONTHLY_HOUR_LIMIT) {
			attendance = (int) (Math.floor(Math.random() * 10) % 3);
			switch (attendance) {
				case IS_PRESENT:
					System.out.println("Employee is present");
					totalMonthHour = totalMonthHour + FULL_DAY_HOUR;
					empWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
					break;
				case IS_HALF_DAY:
					System.out.println("Employee is on half day");
					totalMonthHour = totalMonthHour + HALF_DAY_HOUR;
					empWage = WAGE_PER_HOUR * HALF_DAY_HOUR;
					break;
				default:
					System.out.println("Employee is absent");
					empWage = 0;
			}
			totalMonthWage = totalMonthWage + empWage;
			day++;
		}
		
		System.out.println("Employee wage for month is "+totalMonthWage);
	}
	}


