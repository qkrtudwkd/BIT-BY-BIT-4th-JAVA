import java.time.LocalDateTime;

class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
    
        LocalDateTime dateTime = LocalDateTime.of(2024,01,01,0,0,0,0);
        LocalDateTime futureDateTime = dateTime.plusYears(1).plusMonths(2).plusDays(3).plusHours(4);
        System.out.println("기준 시각: "+dateTime);
        System.out.println("1년 2개월 3일 4시간 후의 시각: "+futureDateTime);
    }
}