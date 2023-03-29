import java.util.Scanner;
public class forloop{
  public static void main(String args[]){
    int n,i,sum,count=0;
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter which table you want to print");
    n=sc.nextInt();
    for(i=1;i<=10;i++){
      sum=n*i;
      count++;
      System.out.println(n+" * "+i+" = "+sum);
    }
    System.out.println("total count is= "+count);
  }
}
      
