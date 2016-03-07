import java.util.Scanner;

public class SalesAmount {
  public static void main(String[] args){
    final int COMMISSION_SOUGHT = 25000;
    double commission = 0;
    double sales = 0;
    double salary = 0;
    
    do{
      if (sales <= 5000)
        commission = 5000 * .08;
      if (sales <= 10000)
        commission = 5000 * 0.08 + (sales - 5000) * 0.1;
      if (sales > 10000)
        commission = 5000 * 0.08 + 5000 * 0.1 + (sales - 10000) * .12;
      sales += 0.01;
    } while (commission < COMMISSION_SOUGHT);
    
    System.out.printf("$%.2f in sales needs to be generated \n", sales);
  }  // main
} // SalesAmount