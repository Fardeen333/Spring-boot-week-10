package com.springlearning.CachingApplication.services;

import com.springlearning.CachingApplication.entities.Employee;
import com.springlearning.CachingApplication.entities.SalaryAccount;

public interface SalaryAccountService {
    void createAccount(Employee employee);

    SalaryAccount incrementBalance(Long accountId);
}
