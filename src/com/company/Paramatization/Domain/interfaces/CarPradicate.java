package com.company.Paramatization.Domain.interfaces;

import com.company.Paramatization.Domain.CarParam;
@FunctionalInterface
public interface CarPradicate {
    boolean test(CarParam car);
}
