public class Main {

    public static void main(String[] args) {
        TramStop tramStop = new TramStop("1",new int[]{1, 3, 4},new Hour[]{
                new Hour(73,"0:00"),
                new Hour(23,"1:00"),
                new Hour(57,"2:00"),
                new Hour(9,"3:00"),
                new Hour(14,"4:00"),
                new Hour(73,"5:00.01"),
                new Hour(9,"6:00")
        });
        System.out.println(tramStop.getAllPassenger()); // 249
        System.out.println(tramStop.getHourMinPassenger()); //3:00 6:00
        System.out.println(tramStop.getMaxComment()); //"5:00.01"
    }
}
