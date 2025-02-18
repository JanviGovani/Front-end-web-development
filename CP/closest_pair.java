import java.util.*;
class closest_pair{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int[]arr1=new int[n1];
        for(int i=0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }
        int n2=sc.nextInt();
        int[]arr2=new int[n2];
        for(int i=0;i<n2;i++){
            arr2[i]=sc.nextInt();
        }
        int tar=sc.nextInt();
        closest(n1,arr1,n2,arr2,tar);
    }
    public static void closest(int n1,int[] arr1,int n2,int[]arr2,int tar){
        int c_sum=0;
        c_sum+=arr1[0]+arr2[n2-1];
        int check;
        check=tar-c_sum;
        int a1=1;
        int a2=n2-2;
        int l_elmt=arr1[0];
        int r_elmt=arr2[n2-1];
        
        while(a1<n1-1 && a2>0){
            c_sum=arr1[a1]+arr2[a2];
            if(tar-c_sum<check){
                l_elmt=arr1[a1];
                r_elmt=arr2[a2];
            }
            a1++;
            a2--;
        }
        System.out.println(l_elmt+","+r_elmt);
    }
}