package com.tma.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.tma.model.Song;

public interface ISongService extends PagingAndSortingRepository<Song, String>{
	public Page<Song> findAll(Pageable pageable);
	public Page<Song> findByName(String namesong, Pageable pageable);
//	public List<Song> getAll();
//	public List<Song> getQueryPaging();
//	public List<Song> findBySongName(String songname, Pageable pageable);
//	public Song getWithId(String id);
	public void addSong(Song song);
//	public void deleteSong(String id);
	public void updateSong(String id, Song song);
}
