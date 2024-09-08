import java.util.*;

public class UseHotelRoom {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            System.out.println("Enter Hotel Details");
            System.out.print("Enter Room Number: ");
            int roomInput = input.nextInt();

            validateInput(roomInput);

            HotelRoom room = new HotelRoom(roomInput);
            System.out.println("\nDisplaying Hotel Room Details");
            System.out.println("Room Number: " + room.getRoomNum());
            System.out.println("Rental Fee: $ " + room.getNightRate());

            Suite suite = new Suite(roomInput);
            System.out.println("\nDisplaying Suite Room Details");
            System.out.println("Room Number: " + suite.getRoomNum());
            System.out.println("Rental Fee: $ " + suite.total);
            System.out.println("Plus Surcharge: $ " + suite.surcharge);
        } 
        catch (InputMismatchException e) {
            System.out.println(DataMessages.errorMessage[0]);
        } 
        catch (DataException e) {
            System.out.println("Some data are out of range");
            System.out.println(e.getMessage());
        }
    }

    public static void validateInput(int roomInput) throws DataException {
        if (roomInput < 1) {
            throw new DataException(DataMessages.errorMessage[1]);
        } else if (roomInput > 500) {
            throw new DataException(DataMessages.errorMessage[2]);
        }
    }
}