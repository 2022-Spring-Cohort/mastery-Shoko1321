package com.survivingcodingbootcamp.blog.controller;

import com.survivingcodingbootcamp.blog.repository.HashtagRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HashTagController {
    private HashtagRepository hashtagrepo;

    public HashTagController(HashtagRepository hashtagrepo) {
        this.hashtagrepo = hashtagrepo;
    }

    @RequestMapping("/hashtags")
    public String showHashtagsPage(Model model) {
        model.addAttribute("hashtags", hashtagrepo.findAll());
        return "all-hashtags-template";
    }

    @RequestMapping("/hashtag/{ID}")
    public String showHashtagPage(Model model, @PathVariable long ID) {
        model.addAttribute("hashtag", hashtagrepo.findById(ID).get());
        return "single-hashtag-template";
    }

}
