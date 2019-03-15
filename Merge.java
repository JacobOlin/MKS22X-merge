public class Merge {
  public static void mergesort(int[] data) {
  }

  public static void mergesort(int[] data,int lo,int hi) {
    if (lo >= hi) {
      return;
    }
    mergesort(data,lo,(lo+hi)/2);
    mergesort(data,(lo+hi)/2+1,hi);
    merge(data,lo,hi);
  }

  public static void merge(int[] data,int lo,int hi) {
    
  }
}
