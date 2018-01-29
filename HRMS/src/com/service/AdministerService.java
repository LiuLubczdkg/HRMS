package com.service;

import com.model.Administer;

public interface AdministerService {
    Administer selectAdmin(Administer administer);
    boolean addAdmin(Administer administer);
}
