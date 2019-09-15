import java.util.Scanner;
public class count{
	public static void main(String[] args){
		int count=0,a;
		Scanner reader=new Scanner(System.in);
		a=reader.nextInt();
		if(a==0)
			count=1;
		while(a!=0){
			a=a/10;
			count=count+1;
		}
		System.out.println(count);
	}
}