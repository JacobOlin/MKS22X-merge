public class Merge {
  public static void mergesort(int[] data) {
    mergesort(data,0,data.length - 1);
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
    int[]data1 = new int[(lo+hi)/2 - lo + 1];
    int[]data2 = new int[hi - (lo+hi)/2 + 1];
    for (int i = 0;i < data1.length;i += 1) {
      data1[i] = data[i + lo];
    }
    for (int i = 0;i < data2.length;i += 1) {
      data2[data2.length - 1 - i] = data[hi - i];
    }
    int m = 0;
    int n = 0;
    for (int i = 0;i < data1.length + data2.length;i += 1) {
      if (n >= data.length || (m < data1.length && data1[m] < data2[n])) {
        data[i] = data[m];
        m += 1;
      }
      else {
        data[i] = data[n];
        n += 1;
      }
    }
  }
}
