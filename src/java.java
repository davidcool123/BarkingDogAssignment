@SuppressWarnings("ALL")
public class java {

    public static void main(String[] args) {
        System.out.println(shouldWake(true, 1));
        System.out.println(shouldWake(false, 2));
        System.out.println(shouldWake(true, 8));
        System.out.println(shouldWake(true, -1));
    }

    private static boolean shouldWake(boolean isBarking, int hourOfDay) {

        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }
        if(isBarking && hourOfDay < 8 || isBarking && hourOfDay > 22) {
            return false;
        }
        return false;

        // if statements check for less than 0 or greater than 23:  return false

        // if statement check for isBarking and (hour < 8 or hour > 22:  return true

        // return false

    }

}
