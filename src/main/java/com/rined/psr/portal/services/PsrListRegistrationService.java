package com.rined.psr.portal.services;

import com.rined.psr.portal.converters.PsrListRegistrationConverter;
import com.rined.psr.portal.dto.brief.PsrListRegistrationBrief;
import com.rined.psr.portal.dto.fully.PsrListRegistrationDto;
import com.rined.psr.portal.model.PsrListRegistration;
import com.rined.psr.portal.repositories.PsrListRegistrationRepository;
import org.springframework.stereotype.Service;

@Service
public class PsrListRegistrationService extends BaseService<PsrListRegistrationDto, PsrListRegistrationBrief,
        PsrListRegistration, Long, PsrListRegistrationRepository, PsrListRegistrationConverter> {

    public PsrListRegistrationService(PsrListRegistrationConverter converter, PsrListRegistrationRepository repository) {
        super(converter, repository);
    }

}
