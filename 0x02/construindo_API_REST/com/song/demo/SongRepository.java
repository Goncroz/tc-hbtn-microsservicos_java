package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class SongRepository{

	private List<Song> list = new ArrayList<Song>();

    public List<Song> getAllSongs() {
    	return list;
    }

    public Song getSongById(Integer id) {
    	for(Song songs : list) {
    		if(songs.getId().equals(id)) {
    			return songs;
    		}
    	}
		return null;
		
    }

    public void addSong(Song s) {
      for(Song songs : list) {
    	  if(songs.getId().equals(null)) {
    		  list.add(s);
    	  }
      }
    }

    public void updateSong(Song s) {
      for(Song songs : list) {
    	  if(songs.getId().equals(s)) {
    		  //list.remove(s);
    		  //list.add(s);
    		  list.replaceAll(t -> s);;
    	  }
      }
    }

    public void removeSong(Song s) {
       for(Song songs : list) {
    	   if(songs.getId().equals(s)) {
    		   list.remove(s);
    	   }
       }
    }
	
}

