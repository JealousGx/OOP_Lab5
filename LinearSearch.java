//Code
public class LinearSearch {
    /** The method for finding a key in the list */
    public static int linearSearch(int[] list, int key) {
      for (int i = 0; i < list.length; i++) {
        if (key == list[i])
          return i;
      }
      return -1; 
    }
    public static void main (String[] args) {
      int [] list={1,2,3,4,5,6,7};
      int key=5;
      System.out.println(LinearSearch.linearSearch(list, key));
    }
  }

  //output: 4
  
  /*
  public class IndependentLinearSearch {
  
      public static void main(String[] args) {
          int list[] = {5, 6, 7, 8, 9, 2, 3, 4};
          int key = 4;
          for (int i = 0; i < list.length; i++) {
              if (key == list[i]) {
                  System.out.println(i);
              }
          }
     }
  }
  */
  //output: 7
  