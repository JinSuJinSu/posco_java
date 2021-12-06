package com.javaex.oop.Song.v2;

public class SongApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Song info1 = new Song();
//		info1.setArtist("아이유");
//		info1.setTitle("좋은날");
//		info1.setAlbum("Real");
//		info1.setYear(2010);
//		info1.setTrack(3);
//		info1.setComposer("이민수");
//		
		Song info1 = new Song("아이유","좋은날","Real",2010,3,"이민수");
		info1.showInfo();
		
//		Song info2 = new Song();
//		info2.setArtist("BINGBANG");
//		info2.setTitle("거짓말");
//		info2.setAlbum("Always");
//		info2.setYear(2007);
//		info2.setTrack(2);
//		info2.setComposer("G-DRAGON");
		Song info2 = new Song("BINGBANG","거짓말","Always",2007,2,"G-DRAGON");
		
		info2.showInfo();
		
		
//		Song info3 = new Song();
//		info3.setArtist("버스커버스커");
//		info3.setTitle("벚꽃엔딩");
//		info3.setAlbum("버스커버스커 1집");
//		info3.setYear(2012);
//		info3.setTrack(4);
//		info3.setComposer("장범준");
		Song info3 = new Song("버스커버스커","벚꽃엔딩","버스커버스커 1집\"",2012,4,"장범준");
		
		info3.showInfo();
		
		
		
		

	}

}
