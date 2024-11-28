package com.example.mftclassproject.attach.service.impl;

import com.example.mftclassproject.attach.model.entity.Attach;
import com.example.mftclassproject.attach.repository.AttachRepository;
import com.example.mftclassproject.attach.service.AttachService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttachServiceImpl implements AttachService {
    private final AttachRepository attachRepository;

    public AttachServiceImpl(AttachRepository attachRepository) {
        this.attachRepository = attachRepository;
    }

    @Override
    public void save(Attach attach) {
        attachRepository.save(attach);
    }

    @Override
    public void update(Attach attach) {
        attachRepository.save(attach);
    }

    @Override
    public void deleteById(Long id) {
        attachRepository.deleteById(id);
    }

    @Override
    public Attach findById(Long id) {
        return attachRepository.findById(id).get();
    }

    @Override
    public List<Attach> findAll() {

        return attachRepository.findAll();
    }
}