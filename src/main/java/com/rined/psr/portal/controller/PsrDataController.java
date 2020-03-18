package com.rined.psr.portal.controller;

import com.rined.psr.portal.converters.PsrDataConverter;
import com.rined.psr.portal.dto.brief.PsrDataBrief;
import com.rined.psr.portal.dto.fully.PsrDataDto;
import com.rined.psr.portal.model.PsrData;
import com.rined.psr.portal.repositories.PsrDataRepository;
import com.rined.psr.portal.services.PsrDataService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/psr-data")
public class PsrDataController extends BaseController<PsrDataDto, PsrDataBrief, PsrData, Long, PsrDataRepository,
        PsrDataConverter, PsrDataService> {

    public PsrDataController(PsrDataService service) {
        super(service);
    }

}