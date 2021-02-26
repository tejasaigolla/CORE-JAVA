import java.util.Scanner;
class leap{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int a=sc.nextInt();
boolean leap=false;
if(a>=1){
	if (a % 4 == 0){
		if (a % 100 == 0) {
        		if (a % 400 == 0)
          			leap = true;
        		else
          			leap = false;
      		}
      		else
        		leap = true;
	}
	else
		leap = false;

if (leap)
	System.out.println("Yes");
else
      	System.out.println("No");
}
else
	System.out.print("invalid option");
}
}
