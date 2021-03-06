package com.warehouse_accounting.services.interfaces;

import com.warehouse_accounting.models.dto.ContractorGroupDto;

import java.util.List;

public interface ContractorGroupService {

    List<ContractorGroupDto> getAll();

    ContractorGroupDto getById(Long id);

    void create(ContractorGroupDto dto);

    void update(ContractorGroupDto dto);

    void deleteById(Long id);
}
