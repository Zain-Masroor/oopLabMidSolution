package dexter;

public class Book {
	
	
	private String bookName, author, publisher, rno;
	private int yor, price, nod, d, m, y, num;
	
	Book(String bookName, String author, String publisher, int yor, int price){
		this.bookName = bookName;
		this.author = author;
		this.publisher = publisher;
		this.yor = yor;
		this.price = price;
	}
	
	public void setIssuedOn(int d, int m, int y) {
		this.d = d;
		this.m = m;
		this.y = y;
	}
	
	public void setIssuedFor(int k){
		this.nod = k;
	}
	
	public void setIssuedTo(String t) {
		this.rno = t;
	}
	
	public boolean calculateAvailability(int m, int n, int o){
		if(m<=(d+nod)) {
			System.out.println("False");
			return false;
		}else 
			System.out.println("True");
			return true;
	}
	
	public String calculateRemainingPeriod(int dd, int mm, int yy){
		if(dd-d<=nod) {
			System.out.println((dd-d)+" days used and "+ (nod-(dd-d)) +" days left");
			return "";
		}else
			System.out.println("Not issued yet");
			return "";
	}

	
}
