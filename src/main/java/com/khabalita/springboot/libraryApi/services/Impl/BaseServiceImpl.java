package com.khabalita.springboot.libraryApi.services.Impl;

import com.khabalita.springboot.libraryApi.dto.BaseDto;
import com.khabalita.springboot.libraryApi.entities.Base;
import com.khabalita.springboot.libraryApi.mapper.BaseMapper;
import com.khabalita.springboot.libraryApi.repository.BaseRepository;
import com.khabalita.springboot.libraryApi.services.BaseService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

@Service
public abstract class BaseServiceImpl<
        E extends Base,
        D extends BaseDto,
        ID extends Serializable>
        implements BaseService<D, ID> {


    protected final BaseRepository<E, ID> baseRepository;
    protected final BaseMapper<E, D> baseMapper;

    public BaseServiceImpl(BaseRepository<E, ID> repository,
                            BaseMapper<E, D> mapper){
        this.baseRepository = repository;
        this.baseMapper     = mapper;
    }

    @Override
    @Transactional(readOnly = true)
    public List<D> findAll() {
        return baseMapper.toDtoList(baseRepository.findAll());
    }

    @Override
    @Transactional(readOnly = true)
    public D findById(ID id) {
        E entity = baseRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Not found"));
        return baseMapper.toDto(entity);
    }

    @Override
    @Transactional
    public D save(D dto) {
        E entity = baseMapper.toEntity(dto);
        return baseMapper.toDto(baseRepository.save(entity));
    }

    @Override
    @Transactional
    public D update(ID id, D dto) {
        E existing = baseRepository.findById(id)
                .orElseThrow(()-> new EntityNotFoundException("Not found"));
        E entity = baseMapper.toEntity(dto);
        entity.setId(existing.getId());

        E updatedEntity = baseRepository.save(entity);
        return baseMapper.toDto(updatedEntity);
    }

    @Override
    @Transactional
    public void delete(ID id) {
        if (!baseRepository.existsById(id)) {
            throw new EntityNotFoundException("Not found");
        }
        baseRepository.deleteById(id);
    }

}
