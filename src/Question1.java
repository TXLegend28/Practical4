public class Question1 {

    public static void main(String[] args) {

        // a) Set the 10 elements of integer array counts to zero.
        int[] counts = new int[10];


        // b) Add one to each of the 15 elements of integer array bonus.
        int[] bonus = new int[15];
        for (int i = 0; i < bonus.length; i++) {
            bonus[i] += 1;
        }

        // c) Display the five values of integer array bestScores in column format.
        int[] bestScores = {95, 88, 76, 92, 85};

        System.out.println("Best Scores:");
        for (int score : bestScores) {
            System.out.println(score);
        }
    }
}