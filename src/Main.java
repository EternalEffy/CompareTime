public class Main {
    public static void main(String[] args) {
        EFFY_CompareTime myTry = new EFFY_CompareTime("dd/MM/yyyy HH:mm:ss");
        System.out.println(myTry.getTimeNow());
        EFFY_CompareTime mySecondTry = new EFFY_CompareTime("HH:mm:ss");
        System.out.println(mySecondTry.diffTime("18:34:00"));
        System.out.println(myTry.diffTimeAndDate("02/03/2021 18:34:00"));
    }
}
