import java.util.*;
class sample_12_2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        rev_vow(str);
    }
    public static void rev_vow(String str){
        int left=0;
        int right=str.length()-1;
        StringBuilder sb=new StringBuilder(str);
        ArrayList<Character> vow=new ArrayList<>();
        vow.add('a');
        vow.add('e');
        vow.add('i');
        vow.add('o');
        vow.add('u');
        vow.add('A');
        vow.add('E');
        vow.add('I');
        vow.add('O');
        vow.add('U');
        while(left<right){
            while(!vow.contains(sb.charAt(left))){
                left++;
                if(left==right){
                    break;
                }
            }
            while(!vow.contains(sb.charAt(right))){
                right--;
                if(left==right){
                    break;
                }
            }
            if(vow.contains(sb.charAt(left)) && vow.contains(sb.charAt(right))){
                char temp=sb.charAt(left);
                sb.setCharAt(left,sb.charAt(right));
                sb.setCharAt(right,temp);
                left++;
                right--;
            }
            

        }
        System.out.println(sb);
    }
}