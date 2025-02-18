// import java.util.*;
// class sample_12{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//     }
// }

import java.util.*;
class sample_12{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int tar=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        find_elmt(n,arr,tar);
    }
    public static void find_elmt(int n, int[] arr, int tar){
        int[] res=new int[2];
        int left=0;
        int right=n-1;
        int c_sum=0;
        while(left<=right){ 
            c_sum=arr[left]+arr[right];
            if(tar==c_sum){
                res[0]=left+1;
                res[1]=right+1;
                break;
            }
            else if(c_sum<tar){
                left++;
            }
            else if(c_sum>tar){
                right--;
            }
        }       
        System.out.println(Arrays.toString(new int[]{left + 1, right + 1}));

    }
}