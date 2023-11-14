package com.chongyan.service;

import com.chongyan.entity.vo.UserBorrowDetail;

public interface BorrowService {

    UserBorrowDetail getUserBorrowDetailByUid(int uid);
}
