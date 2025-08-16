  import java.util.Scanner;
    import java.util.*;
    public class spairal_matrix_left {
        public static List<Integer> bottom_left(int[][] mat,int m,int n) {
            List<Integer> result = new ArrayList<>();
            int top=0,bottom=m-1;
            int left=0,right=n-1;
            while(top<=bottom && left<=right)
            {
                for(int i=bottom;i>=top;i--){
                    result.add(mat[i][left]);
                }
                left++;
    
                for(int i=left;i<=right;i++)
                {
                    result.add(mat[top][i]);
                }
                top++;
                if(left<=right)
                {
                    for(int i=top;i<=bottom;i++)
                    {
                        result.add(mat[i][right]);
                    }
                    right--;
                }
                if(top<=bottom)
                {
                    for(int i=right;i>=left;i--)
                    {
                        result.add(mat[bottom][i]);
                    }
                    bottom--;
                } 
            }
            return result;
            
        }
        public static void main(String args[])
        {
            int m;
            int n;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number of rows:");
            m=sc.nextInt();
            System.out.println("Enter the number of columns:");
            n=sc.nextInt();
            int mat[][]=new int[m][n];
            System.out.println("Enter the elements of the matrix:");
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    mat[i][j]=sc.nextInt();
                }
            }
            List<Integer> result_mat=bottom_left(mat,m,n);
            System.out.println(result_mat);
            sc.close();
        }
    }
