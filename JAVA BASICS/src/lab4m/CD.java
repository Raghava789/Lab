package lab4m;

public class CD extends MediaItem{
	private String artist,genre;

	@Override
	public int getRuntime() {
		return super.runtime;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public void setRuntime(int runtime) {
		super.runtime=runtime;
	}
}
