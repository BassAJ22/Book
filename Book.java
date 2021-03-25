package practice;

public class Book { 
	String title;
	String author;
	String genre;
	int page;
	int count;	
	Book ( String titlex, String authorx, String genrex, int pagex){
		title = titlex;
		author = authorx;
		genre = genrex;
		page = pagex;
		count = 1;		
	}
	int getCount() {
		return count;
	}
	void add() {
		count ++;
	}
	 int compare(Book B){		 
		 if (title.compareTo(B.title) != 0) return title.compareTo(B.title);
		 if (author.compareTo(B.author) != 0) return author.compareTo(B.author);
		 if (genre.compareTo(B.genre) != 0) return genre.compareTo(B.genre);
		 return page - B.page;
	}
}
