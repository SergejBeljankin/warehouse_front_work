package com.warehouse_accounting.services.interfaces;

import com.warehouse_accounting.models.dto.LegalDetailDto;

import java.util.List;

public interface LegalDetailService {

    List<LegalDetailDto> getAll();

    LegalDetailDto getById(Long id);

    void create(LegalDetailDto legalDetailDto);

    void update(LegalDetailDto legalDetailDto);

    void deleteById(Long id);
}
