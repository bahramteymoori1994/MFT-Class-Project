package com.example.mftclassproject.attach.service;

import com.example.mftclassproject.attach.model.entity.Attach;

import java.util.List;

public interface AttachService
{
    void save(Attach attach);
    void update(Attach attach);
    void deleteById(Long id);
    Attach getById(Long id);
    List<Attach> getAll();
}