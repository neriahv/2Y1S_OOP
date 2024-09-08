public class HotelRoom {
    private int roomNum;
    private double nightRate;

    public HotelRoom(int roomNum) {
        this.roomNum = roomNum;
        if (roomNum >= 1 && roomNum <= 299) {
            nightRate = 69.95;
        } else if (roomNum >= 300 && roomNum <= 500) {
            nightRate = 89.95;
        }
    }

    public int getRoomNum() {
        return roomNum;
    }

    public double getNightRate() {
        return nightRate;
    }
}