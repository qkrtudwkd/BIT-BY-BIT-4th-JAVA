public class WrapperTest2 {
    public static void main(String[] args) {
        String[] array = {"1.5", "2.5", "3.0"};
        // 코드 작성
        double sm = 0;
        for(String a : array){
            sm+=Double.parseDouble(a);
        }
        System.out.println("sum = " + sm);
    }
}