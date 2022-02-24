package lab4m;

public class Exc3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b=new Book();
		b.setId("1234");
		b.setAuthor("P M K");
		b.setCopies(245);
		b.setTitle("Book1");
		
		JournalPaper jp=new JournalPaper();
		jp.setId("1235");
		jp.setAuthor("M N K");
		jp.setYear("2009");
		jp.setTitle("Book2");
		
		System.out.println(b.getId()+" "+b.getAuthor()+" "+b.getTitle()+" "+b.getCopies());
		System.out.println(jp.getId()+" "+jp.getAuthor()+" "+jp.getTitle()+" "+jp.getYear());
		
		CD cd=new CD();
		cd.setArtist("M M");
		cd.setGenre("sad");
		cd.setRuntime(4);
		System.out.println(cd.getArtist()+" "+ cd.getGenre()+" "+cd.getRuntime());
	}

}
