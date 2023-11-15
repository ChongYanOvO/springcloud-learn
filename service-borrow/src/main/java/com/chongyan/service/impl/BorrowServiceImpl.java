package com.chongyan.service.impl;

import com.chongyan.service.client.BookClient;
import com.chongyan.service.client.UserClient;
import com.chongyan.entity.Book;
import com.chongyan.entity.Borrow;
import com.chongyan.entity.User;
import com.chongyan.entity.vo.UserBorrowDetail;
import com.chongyan.mapper.BorrowMapper;
import com.chongyan.service.BorrowService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BorrowServiceImpl implements BorrowService {

    @Resource
    BorrowMapper mapper;

    @Resource
    UserClient userClient;

    @Resource
    BookClient bookClient;

    @Override
    public UserBorrowDetail getUserBorrowDetailByUid(int uid) {
        List<Borrow> borrow = mapper.getBorrowsByUid(uid);

        User user = userClient.getUserById(uid);
        List<Book> bookList = borrow
                .stream()
                .map(b -> bookClient.findBookById(b.getBid()))
                .collect(Collectors.toList());
        return new UserBorrowDetail(user, bookList);
    }
}
