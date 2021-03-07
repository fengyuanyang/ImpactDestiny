package com.ordestiny.impact.service;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.api.errors.InvalidRemoteException;
import org.eclipse.jgit.api.errors.TransportException;
import org.eclipse.jgit.lib.Ref;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.storage.file.FileRepositoryBuilder;
import org.eclipse.jgit.transport.FetchResult;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;

@Component
public class GitService {
    public void cloneRepository(String cloneFromUrl, String cloneToDirectory) throws GitAPIException {
        File theDir = new File(cloneToDirectory);
        if (!theDir.exists()){
            theDir.mkdirs();
        }
        Git.cloneRepository()
                .setURI(cloneFromUrl)
                .setDirectory(theDir)
                .call();
    }

//    public void fetchRepository(String repositoryDirectory){
//        File repoDir = new File(repositoryDirectory);
//
//        // now open the resulting repository with a FileRepositoryBuilder
//        FileRepositoryBuilder builder = new FileRepositoryBuilder();
//        try (Repository repository = builder.setGitDir(repoDir)
//                .readEnvironment() // scan environment GIT_* variables
//                .findGitDir() // scan up the file system tree
//                .build()) {
//            System.out.println("Having repository: " + repository.getDirectory());
//
//            // the Ref holds an ObjectId for any type of object (tree, commit, blob, tree)
////            Ref head = repository.exactRef("refs/heads/master");
////            System.out.println("Ref of refs/heads/master: " + head);
//
//            System.out.println("Starting fetch");
//            try (Git git = new Git(repository)) {
//                FetchResult result = git.fetch().call();
//                System.out.println("Messages: " + result.getMessages());
//            } catch (InvalidRemoteException e) {
//                e.printStackTrace();
//            } catch (TransportException e) {
//                e.printStackTrace();
//            } catch (GitAPIException e) {
//                e.printStackTrace();
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
