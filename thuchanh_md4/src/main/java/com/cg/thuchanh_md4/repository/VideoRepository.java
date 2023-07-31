package com.cg.thuchanh_md4.repository;

import com.cg.thuchanh_md4.model.Video;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VideoRepository extends JpaRepository<Video,Long> {
    List<Video> findAll();
}
