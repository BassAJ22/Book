package practice;

public class BookDatabse {
	static int counting = 0;
	static int shelfLength = 2;
	static Book shelf[ ]= new Book[shelfLength];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book a = new Book( "Shrek", "Sam", "horror", 500);
		Book b = new Book( "Shrek", "Pam", "horror", 500);
		Book c = new Book( "Shrek", "Bam", "horror", 500);
		Book d = new Book( "Shrek", "Lam", "horror", 500);
		addBook(a);
		addBook(c);
		addBook(d);
		addBook(b);
		addBook(a);
		addBook(d);
		addBook(b);
		addBook(a);
		addBook(c);
		addBook(a);
		System.out.println("The count of Book A is: " + Integer.toString(getCount(a)));
		System.out.println("The count of Book B is: " + Integer.toString(getCount(b)));
		System.out.println("The count of Book C is: " + Integer.toString(getCount(c)));
		System.out.println("The count of Book D is: " + Integer.toString(getCount(d)));
		System.out.println("The count of Book E is: " + Integer.toString(getCount(new Book("i","want", "cake" , 421))));
		
		
	}
	static void addBook(Book b){
		for(int i = 0; i < counting; i++) {
			if (shelf[i].compare(b)==0) {
				shelf [i].add();
				return;
			}
		}
		
		if (counting >= shelfLength) {
			Book hold[] = new Book [shelfLength * 2];
			for(int i = 0; i < shelfLength; i++) {
				hold [i] = shelf [i];
				
			}
			shelf = hold;
			shelfLength = shelfLength * 2;
		
			
		}
		
		shelf[counting] = (b);
		counting ++;		
	}
	static int getCount(Book b) {
		
		for(int i = 0; i < counting; i++) {
			if (shelf[i].compare(b) == 0) {
				return shelf[i].getCount();
			}
		}
		return 0;
	}
	
}			
	

	


