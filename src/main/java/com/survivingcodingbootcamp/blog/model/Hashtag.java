package com.survivingcodingbootcamp.blog.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Collection;

@Entity
public class Hashtag {
    @Id
    @GeneratedValue
    private long ID;
    private String hashtag;

    @ManyToMany(mappedBy = "hashtags")
    private Collection<Post> posts;


    public Hashtag() {
    }

    public Hashtag(String hashtag) {
        this.hashtag = hashtag;
    }

    public String getHashtag() {
        return hashtag;
    }

    public long getID() {
        return ID;
    }

    public Collection<Post> getPosts() {
        return posts;
    }
}
