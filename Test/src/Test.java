import java.util.Scanner;

public class Test {
	
	public String category;
	public int price;	
	
	public static void main(String[] args) {
		System.out.println("Choose Category Number. 1.Book 2.Pencil 3.Ruler");
		Scanner input=new Scanner(System.in);
		int chooseCategory=input.nextInt();
		if(chooseCategory==1) {
			System.out.println("Book Price is 500 kyats");
		}else if(chooseCategory==2) {
			System.out.println("Pencil Price is 200 kyats");
		}else {
			System.out.println("Ruler Price is 300 kyats");
		}
	}
}
