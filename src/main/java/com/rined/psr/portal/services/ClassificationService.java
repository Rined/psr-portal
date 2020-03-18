package com.rined.psr.portal.services;

import com.rined.psr.portal.converters.ClassificationConverter;
import com.rined.psr.portal.dto.brief.ClassificationBrief;
import com.rined.psr.portal.dto.fully.ClassificationDto;
import com.rined.psr.portal.model.Classification;
import com.rined.psr.portal.repositories.ClassificationRepository;
import org.springframework.stereotype.Service;

@Service
public class ClassificationService extends BaseService<ClassificationDto, ClassificationBrief, Classification, Long,
        ClassificationRepository, ClassificationConverter> {
    public ClassificationService(ClassificationConverter converter, ClassificationRepository repository) {
        super(converter, repository);
    }
}

