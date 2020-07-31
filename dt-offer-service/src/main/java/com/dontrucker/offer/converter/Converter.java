package com.dontrucker.offer.converter;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface Converter<T, U> {
    public T toObject(U dto);
    public U toDTO(T object);
    public List<T> toObjectList(List<U> dtoList);
    public List<U> toDTOList(List<T> objectList);
}
