package com.cg.thuchanh_md4.api;

import com.cg.thuchanh_md4.model.Video;
import com.cg.thuchanh_md4.service.IVideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/videos")
public class VideoAPI {
@Autowired
private IVideoService videoService;
    @GetMapping("")
    public ResponseEntity<?> getAllVideos() {

        List<Video> videos = videoService.findAll();

        return new ResponseEntity<>(videos, HttpStatus.OK);
    }

//    @PostMapping
//    public ResponseEntity<?> create(@RequestBody CustomerCreReqDTO customerCreReqDTO) {
//
//        String email = customerCreReqDTO.getEmail().trim();
//
//        Boolean emailExists = customerService.existsByEmail(email);
//
//        if (emailExists) {
//            throw new EmailExistsException("Email đã tồn tại");
//        }
//
//        CustomerCreResDTO customerCreResDTO = customerService.create(customerCreReqDTO);
//
//        return new ResponseEntity<>(customerCreResDTO, HttpStatus.CREATED);
//    }



}
