package com.dao;

import com.model.Administer;

public interface AdministerMpper {
    Administer selectAdmin(Administer administer);
    boolean addAdmin(Administer administer);
}
