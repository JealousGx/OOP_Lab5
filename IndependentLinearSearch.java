public class IndependentLinearSearch {
    public static void main(String[] args) {
        System.out.println("------------------");
        System.out.println("Author: JealousGx");
        System.out.println("------------------");
        
        int list[] = {5, 6, 7, 8, 9, 2, 3, 4};
        int key = 4;
        for (int i = 0; i < list.length; i++) {
            if (key == list[i]) {
                System.out.println(i);
            }
        }
   }
}