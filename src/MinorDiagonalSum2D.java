import java.util.Scanner;

public class MinorDiagonalSum2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[][] = new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println(minorDiagonal(array,n));
    }
    public static int minorDiagonal(int array[][],int n)
    {
        int sum = 0;
        int i=0,j=n-1;
        while(i<n && j>=0)
        {
            sum+=array[i][j];
            i++;j--;
        }
        return sum;
    }
}
//You are given a N X N integer matrix. You have to find the sum of all the minor diagonal elements of A.
//Minor diagonal of a M X M matrix A is a collection of elements A[i, j]
// such that i + j = M + 1 (where i, j are 1-based).
//Input
//[  [1, -2, -3],
//   [-4, 5, -6],
//   [-7, -8, 9]  ]
//
//Output
//-5

//approch (0,2)+(1,1)(2,0)