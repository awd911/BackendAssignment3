package com.example.getmesocialservice.repository;

import com.example.getmesocialservice.model.Photo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PhotoRepository {

    List<Photo> photoList = new ArrayList();

    public Photo getPhoto(){
        Photo photo = new Photo(0,0,"PhotoExampleURL","Photo Creator","2021");
        return photo;
    }

    public Photo savePhoto(Photo photo) {
        photo.setId(photoList.size() +1);
        photoList.add(photo);
        return photo;
    }
}
