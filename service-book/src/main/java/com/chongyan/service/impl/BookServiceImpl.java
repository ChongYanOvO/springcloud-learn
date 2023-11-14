package com.chongyan.service.impl;


import com.chongyan.mapper.BookMapper;
import com.chongyan.entity.Book;
import com.chongyan.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class BookServiceImpl implements BookService {

    @Resource
    BookMapper mapper;

    @Override
    public Book getBookById(int bid) {
        return mapper.getBookById(bid);
    }
}