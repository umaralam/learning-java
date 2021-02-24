package stream;

public class Movie {
	public String title;
	public int likes;
	private Genre genre;
	
	public Movie(String title, int likes, Genre genre) {
		this.title = title;
		this.likes = likes;
		this.genre = genre;
	}
	
	public String getTitle() {
		return title;
	}
	
	public int getLikes() {
		return likes;
	}

	public Genre getGenre() {
		return genre;
	}
	 
	public String toString() {
		return title;
		
	}
	
}
