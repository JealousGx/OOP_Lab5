//Code
public class BinarySearch {
    /** Use binary search to find the key in the list */
    public static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
    
        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid])
            high = mid - 1;
            else if (key == list[mid])
            return mid;
            else
            low = mid + 1;
        }
    
        return -low - 1; // Now high < low
        }
  

    public static void main (String[] args) {
        System.out.println("------------------");
        System.out.println("Author: JealousGx");
        System.out.println("------------------");
        
        int [] list={1,2,3,4,5,6,7};
        int key=7;
        System.out.println(BinarySearch.binarySearch(list, key));
        }
  }

  
  
  /*
  public class IndependentBinarySearch {
  
      public static void main(String[] args) {
          int[] list = {-90,1,5,6,88};
          int key = 5;
          int low = 0;
          int high = list.length - 1;
  
          if (key < list[low] || key > list[high]) {
              System.out.println("Key does not exist");
          }
          while (low <= high) {
              int mid = (low + high) / 2;
              if (key == list[mid]) {
                  System.out.println(mid);
                  break;
              } else if (key < list[mid]) {
                  high = mid - 1;
              } else {
                  low = mid + 1;
              }
          }
      }
  }
  */
  