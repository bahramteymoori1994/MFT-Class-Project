package com.example.mftclassproject.attach.service.impl;

import com.example.mftclassproject.attach.model.entity.Attach;
import com.example.mftclassproject.attach.repository.AttachRepository;
import com.example.mftclassproject.attach.service.AttachService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttachServiceImpl implements AttachService
{
    private final AttachRepository attachRepository;

    public AttachServiceImpl(AttachRepository attachRepository) {
        this.attachRepository = attachRepository;
    }

    @Override
    public Attach save(Attach attach) {
        return null;
    }

    @Override
    public Attach update(Attach attach) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public Attach getById(Long id) {
        return null;
    }

    @Override
    public List<Attach> getAll() {
        return List.of();
    }
}