public class MaximumVal {
public static void main (String args[]){
int a = 250;
int b = 10;
int c = 30;
int max;

int[] vals = {250,2100,300};

if ((a>=b)&&(a>=c)){
max = a;
}
else if ((b>=a)&&(b>=c)){
max = b;
}
else {max = c;}
System.out.println("Maximum number : " + max);

max = 0;

for(int i=0;i<=2;i++){
if (vals[i]>= max){
max = vals[i];
}
}
System.out.println("Maximum number : " + max);
} 
}