public class Assignment {
    public static void main(String[] args){
        shouldWakeUp(true, 1);
        shouldWakeUp(false, 2);
        shouldWakeUp(true, 8);
        shouldWakeUp(true, -1);

    }

    public static void shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay > 3 && hourOfDay < 22)
            System.out.println("True");
        else 
            System.out.println("False");

    }
}
