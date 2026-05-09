package com.example.zad5;
import com.example.zad5.repo.AuthorDto;
import com.example.zad5.repo.AuthorRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AuthorRestApi {
    private AuthorRepo authorRepo;

    public AuthorRestApi(AuthorRepo authorRepo) {
        this.authorRepo = authorRepo;
    }

    @GetMapping("/getAuthorInfo")
    public List<AuthorDto> get() {
        return authorRepo.getCategoryCount();
    }
}
