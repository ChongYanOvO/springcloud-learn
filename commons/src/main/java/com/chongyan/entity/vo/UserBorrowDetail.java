package com.chongyan.entity.vo;

import com.chongyan.entity.Book;
import com.chongyan.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class UserBorrowDetail {
    User user;
    List<Book> bookList;
}
