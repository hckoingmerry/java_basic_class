package beginner_class_211229;

import java.util.Calendar;
import java.time.*; //신버전
import java.time.format.DateTimeFormatter;

public class CDateExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/* Calendar: 추상클래스이기 때문에 객체를 생성할 수 없고 메서드를 통해서만 사용한다.
 * Calendar cal = new Calendar(); //이러면 에러
 * Calendar cal = Calendar.getInstance();
 */
		
		Calendar today = Calendar.getInstance();
		System.out.println("올해의 연도는: " + today.get(Calendar.YEAR)); //2021
		System.out.println("현재의 월은: " + today.get(Calendar.MONTH)); //11
		//12월인데 11월로 나옴. 왜냐하면 MONTH는 0부터 시작하기 때문
		System.out.println("올해 중 몇번째 주: " + today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("이달 중 몇번째 주: " + today.get(Calendar.WEEK_OF_MONTH));
		System.out.println("이달 중 며칠: " + today.get(Calendar.DATE));
		System.out.println("이달 중 며칠: " + today.get(Calendar.DAY_OF_MONTH));
		System.out.println("올해의 며칠: " + today.get(Calendar.DAY_OF_YEAR));
		System.out.println("요일: " + today.get(Calendar.DAY_OF_WEEK)); //4
		//수요일인데 4가 나왔다. 왜냐하면 일요일부터 시작했기 때문
		
		int day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
		String yoyil = "";
		switch (day) {
			case 1: yoyil = "일요일";
			case 2: yoyil = "월요일";
			case 3: yoyil = "화요일";
			case 4: yoyil = "수요일";
			case 5: yoyil = "목요일";
			case 6: yoyil = "금요일";
			case 7: yoyil = "토요일";
		}
		System.out.println("요일: " + yoyil); //토요일로 잘못 뜨니까 확인 바람
		
		String[] yi = {"","일","월","화","수","목","금","토"};
		System.out.println("요일: " + yi[today.get(Calendar.DAY_OF_WEEK)] + "요일");
		
		
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		date1.set(2000,3,1);
		
//		String str1 = toString(date1);
//		System.out.println("date1은 " + toString(date1));
		long diff = (date2.getTimeInMillis() - date1.getTimeInMillis())/1000;
		System.out.println("date1부터 date2까지 " + diff + "초 지났습니다.");
		System.out.println("date1부터 date2까지 " + diff/60/60/24 + "일 지났습니다.");
		
		
		
		//////////////////////////신버전///////////////
		LocalDate now = LocalDate.now();
		System.out.println(now); //현재날짜(컴의 날짜)
		
		LocalDate paris = LocalDate.now(ZoneId.of("Europe/Paris"));
		System.out.println(paris); //현재 날짜(파리 날짜)
		
		//날짜표기방법 바꾸기
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yy/MM/dd");
		String formatedNow = now.format(formatter);
		System.out.println(formatedNow);
		
		int dofy = now.getDayOfYear();
		System.out.println("현재의 일수는 " + dofy + "일입니다.");
		
		String mon = now.getMonth().toString();
		System.out.println("현재의 월은 " + mon + "입니다.");
		int monVal = now.getMonthValue();
		System.out.println("현재의 월은 " + monVal + "월입니다.");
		
		String dofw = now.getDayOfWeek().toString();
		int dofwVal = now.getDayOfWeek().getValue();
		System.out.println("오늘은 " + dofwVal + "입니다.");
		
		LocalTime ntime = LocalTime.now();
		System.out.println(ntime);
		
		DateTimeFormatter form = DateTimeFormatter.ofPattern("HH시 mm분 ss초");
		String formatedTime = ntime.format(form);
		System.out.println(formatedTime);
		
		int hour = ntime.getHour();
		int minute = ntime.getMinute();
		int second = ntime.getSecond();
		System.out.println("현재 시각은 " + hour + "입니다.");
		System.out.println("현재 시각은 " + minute + "입니다.");
		System.out.println("현재 시각은 " + second + "입니다.");
		
		int year = now.getYear();
		System.out.println(year);
		int dofm = now.getDayOfMonth();
		System.out.println(dofm);
		
		LocalDateTime curr = LocalDateTime.now();
		System.out.println(curr);

		DateTimeFormatter newdate = DateTimeFormatter.ofPattern("yy년 MM월 dd일 HH시 mm분 ss초");
		String formateddate = curr.format(newdate);
		System.out.println(formateddate);
		
		System.out.println("오늘의 연도는 " + year + "년입니다.");
		System.out.println("오늘의 월은 " + monVal + "월입니다.");
		System.out.println("오늘의 일수는 " + dofm + "일입니다.");
		System.out.println("현재의 시는 " + hour + "입니다.");
		System.out.println("현재의 분은 " + minute + "입니다.");
		System.out.println("현재의 초는 " + second + "입니다.");
		System.out.println("오늘의 요일은 " + yi[today.get(Calendar.DAY_OF_WEEK)] + "요일입니다.");
	}

}
