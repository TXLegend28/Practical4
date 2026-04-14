public class Question3_2 {
    public static void main(String[] args) {
        Question3_1[] salesPeople = new Question3_1[10];

        for (int i = 0; i < salesPeople.length; i++) {
            salesPeople[i] = new Question3_1(9999, 0.0);
        }

        System.out.println("Question3_1 Objects:");
        for (int i = 0; i < salesPeople.length; i++) {
            salesPeople[i].display();
        }
    }
}