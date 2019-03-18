public class Merge {
  public static void mergesort(int[] data) {
    mergesort(data,0,data.length - 1);
  }

  public static void mergesort(int[] data,int lo,int hi) {
    if (lo >= hi) {
      return;
    }
    /*for (int i = lo;i <= hi;i += 1) {
      System.out.print(data[i] + " ");
    }
    System.out.println();*/
    mergesort(data,lo,(lo+hi)/2);
    mergesort(data,(lo+hi)/2+1,hi);
    merge(data,lo,hi);
  }

  public static void merge(int[] data,int lo,int hi) {
    int[]data1 = new int[(lo+hi+1)/2 - lo];
    int[]data2 = new int[hi - (lo+hi+1)/2 + 1];
    for (int i = 0;i < data1.length;i += 1) {
      data1[i] = data[i + lo];
    }
    for (int i = 0;i < data2.length;i += 1) {
      data2[data2.length - 1 - i] = data[hi - i];
    }
    int m = 0;
    int n = 0;
    for (int i = 0;i < data1.length + data2.length;i += 1) {
      //System.out.println(n + " " + m + " " + lo + " " + hi + " " + data1.length + " " + data2.length);
      if (n >= data2.length || (m < data1.length && data1[m] < data2[n])) {
        /*System.out.print(data[m] + " q ");
        if (n < data.length) {
          System.out.print(data[n]);
        }
        System.out.println();*/
        data[i] = data1[m];
        m += 1;
      }
      else {
        data[i] = data2[n];
        n += 1;
      }
    }
  }
}
