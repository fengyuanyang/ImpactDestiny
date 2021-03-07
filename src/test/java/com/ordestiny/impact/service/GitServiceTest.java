package com.ordestiny.impact.service;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GitServiceTest {
    GitService service = new GitService();

    @Test
    void cloneRepository() throws GitAPIException {
        String url = "https://github.com/eclipse/jgit.git";
        String path = "../tempImpact/jgit";
        service.cloneRepository(url, path);
    }

//    @Test
//    void fetchRepository() {
//        service.fetchRepository("/Users/fengyuanyang/Documents/opensource/tempImpact/jgit/");
//    }
}

