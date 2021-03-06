package com.rined.psr.portal.controller;

import com.rined.psr.portal.model.converters.PsrStateConverter;
import com.rined.psr.portal.model.dto.brief.PsrStateBrief;
import com.rined.psr.portal.model.dto.fully.PsrStateDto;
import com.rined.psr.portal.model.PsrState;
import com.rined.psr.portal.repositories.PsrStateRepository;
import com.rined.psr.portal.services.PsrStateService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/psr/api/psr-state")
public class PsrStateController extends BaseController<PsrStateDto, PsrStateBrief, PsrState, Long, PsrStateRepository,
        PsrStateConverter, PsrStateService> {

    public PsrStateController(PsrStateService service) {
        super(service);
    }

}