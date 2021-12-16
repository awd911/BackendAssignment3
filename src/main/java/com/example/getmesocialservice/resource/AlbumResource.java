package com.example.getmesocialservice.resource;

import com.example.getmesocialservice.model.Album;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.getmesocialservice.resource.AlbumService;

@RestController
@RequestMapping("/api")
public class AlbumResource {

    @Autowired
    private  AlbumService albumService;

    @PostMapping("/album")
    public Album saveAlbum(@RequestBody Album album){
        return albumService.saveAlbum(album);
    }
}
