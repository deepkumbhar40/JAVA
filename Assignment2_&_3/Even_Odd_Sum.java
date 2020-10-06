import java.util.Scanner;
class Even_Odd_Sum{
	public static void main(String[] args) {
		int n, sum_Even = 0, sum_Odd = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in array:");
        n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++)
        {
            if(a[i] % 2 == 0)
            {
                sum_Even = sum_Even + a[i];
            }
            else
            {
                sum_Odd = sum_Odd + a[i];
            }
        }
        System.out.println("Sum of Even Numbers:"+sum_Even);
        System.out.println("Sum of Odd Numbers:"+sum_Odd);
	
sc.close();
}
}