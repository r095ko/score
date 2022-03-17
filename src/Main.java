public class Main {
    public static void main(String[] args) {
        int onTheAccount = 200; //на счету
        int depositAmount = 1000; //сумма полнения

        int bonus = 0;
        if (depositAmount >= 1000) {
            bonus = depositAmount / 100;
        }

        int inTotal = onTheAccount + depositAmount + bonus;
        System.out.println(inTotal);

    }
}


