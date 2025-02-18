public class 14-2-25 {
    if(x){//compilation error bcoz java does not assume x to be x==1
        SOpln;
    }
    if(x==1){//valid
        sopln;
    }

}

/*
 can switch-case have cases without breaks
 can default in above be at middle or starting of cases

 
switch(i=5){
    default: sopln(default)//default can be anywhere but it gets processed only f no matching case, it should not have break if kept in top or middle
    case 2:sopln(2)
    case 5:sopln(5)//case matched and no break hence fall through
    case 7:sopln(7)
//switch-case cannot have continu in case blocks or default bcoz no break means continue only. it wd give compilation error

}
output: 5 7

if(i=15) for above output: default 2 5 7
//go-to is bad coding approach since coder not clear abt task


int i=5;
case 0:
sopln()//not printed
default:
sopln()//gets printed
case 5:
sopln()//gets printed
break

//'final' different meanings based on context:

//final classes cannot be sub-classed via inheritance (where changing behaviour wd happen)
//final method cannot be over ridden but it can be over loaded
final int a=10;
sopln(a++)//answer is not 10 but compilation error bcoz final can't be modifiedfina
final string[] str={"s","t","r"}
str[0]="y"
sopln(str)//output: ytr i.e. we can change addr i.e. referece of variables bcoz size still remains same for string[] array

String[] names={"Ram","sita","mohan"}
for(s:name){
sopln(s);}//instead of r,a,m we get error since string r not iterable type , arraylists are.


*/
