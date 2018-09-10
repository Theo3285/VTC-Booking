package com.kata.bdd.adapters;

import com.kata.bdd.domain.VTC;
import com.kata.bdd.domain.repositories.VTCRepository;

import java.util.LinkedHashSet;
import java.util.Set;

public class InMemoryVTCRepository implements VTCRepository {

    private Set<VTC> vtcs = new LinkedHashSet<>();

    public void add(VTC vtc) {
        vtcs.add(vtc);
    }
}
