package com.abhishek.topgithub.data;


import com.abhishek.topgithub.model.Repository;

import java.util.List;

import javax.inject.Inject;

import rx.Observable;

public class RepoRepository {

    private final RepoApi repoApi;

    @Inject
    public RepoRepository(RepoApi repoApi) {
        this.repoApi = repoApi;
    }

    public Observable<List<Repository>> getRepositories() {
        return repoApi.getRepositories();
    }

}
