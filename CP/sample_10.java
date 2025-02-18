import java.util.Random;
public class sample_10-2-25 {
    public static void main(String args[]){
        System.out.println(new Random(10));

        Random r=new Random(10);
        System.out.println(r.nextInt(100));
        System.out.println(r.nextInt());

    }
}


//2,1,3 : find all possible sums:
//ans: 2,3(=1+2),1,3+1,1+2+3. 
//binary search
//position k=4 input
//1,2,3,3,4,6 (2+3 not valid since it is not in seq.)
