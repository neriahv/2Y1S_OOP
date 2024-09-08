public class Suite extends HotelRoom {
    public double surcharge;
    public double total;

    public Suite(int roomNum) {
        super(roomNum);
        this.surcharge = 40.00;
        this.total = getNightRate() + surcharge;
    }
}