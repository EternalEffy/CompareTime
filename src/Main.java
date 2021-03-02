public class Main {
    public static void main(String[] args) {
        EFFY_CompareTime myTry = new EFFY_CompareTime("HH:mm:ss");
        System.out.println(myTry.getTimeNow());
        System.out.println(myTry.diffTime("16:00:00"));
    }
}
