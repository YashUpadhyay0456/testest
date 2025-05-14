import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();
    while (t > 0){
      t--;
      int n, m, l, r;
      n = scanner.nextInt();
      m = scanner.nextInt(); 
      l = scanner.nextInt();
      r = scanner.nextInt();
      if(n == m){
        System.out.println(l + " " + r);
        continue;
      }
      else {
        int ll = 0 ;
        int rr = 0 ;
        if (m <= Math.abs(l)){
            ll = - m ;
        }
        else if (m <= Math.abs(r)){
          rr = m ;
        }
        else{
          ll = l ;
          rr = m-(Math.abs(l));
        }
        System.out.println(ll + " " + rr);
      }
    }
    scanner.close();
  }
}

// 1
// 1899 1099 -1265 634