public class Main {
    public static void main(String[] args) {
        EFFY_CompareTime myTry = new EFFY_CompareTime("HH:mm:ss");
        System.out.println(myTry.getTimeNow());
        System.out.println(myTry.diffTime("18:02:00"));
        System.out.println(myTry.diffTimeOfDate("02/03/2021 18:03:00"));
    }
}
