import java.util.Scanner;
public class forloop{
  public static void main(String args[]){
    int n,i,sum;
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter which table you want to print");
    n=sc.nextInt();
    for(i=1;i<10;i++){
      sum=n*i;
      System.out.println(n+" * "+i+" = "+sum);
    }
  }
}
      
