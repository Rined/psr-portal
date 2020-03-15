package com.rined.psr.portal.controller;

import com.rined.psr.portal.dto.brief.VolunteerBriefDto;
import com.rined.psr.portal.dto.SimpleResponse;
import com.rined.psr.portal.dto.SimpleRequest;
import com.rined.psr.portal.dto.fully.VolunteerFullyDto;
import com.rined.psr.portal.model.Volunteer;
import com.rined.psr.portal.services.VolunteerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
public class VolunteerController {
    private final VolunteerService volunteerService;

    @ResponseStatus(HttpStatus.OK)
    @PostMapping("/volunteers/exists/phone")
    public SimpleResponse<Boolean> isVolunteerExistsByPhone(@Valid @RequestBody SimpleRequest<String> phone) {
        return SimpleResponse.of(volunteerService.isVolunteerExistsByPhone(phone.getData()));
    }

    @ResponseStatus(HttpStatus.OK)
    @PostMapping("/volunteers/exists/telegram")
    public SimpleResponse<Boolean> isVolunteerExistsByTelegram(@Valid @RequestBody SimpleRequest<String> login) {
        return SimpleResponse.of(volunteerService.isVolunteerExistsByTelegram(login.getData()));
    }

    @PostMapping("/volunteers/brief")
    @ResponseStatus(HttpStatus.CREATED)
    public void addBriefVolunteer(@Valid @RequestBody VolunteerBriefDto volunteerBrief) {
        volunteerService.addVolunteer(volunteerBrief);
    }

    @PostMapping("/volunteers")
    @ResponseStatus(HttpStatus.CREATED)
    public void addFullyVolunteer(@Valid @RequestBody VolunteerFullyDto volunteer) {
        volunteerService.addVolunteer(volunteer);
    }

    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("/volunteers/{id}")
    public void deleteVolunteer(@PathVariable("id") long id){
        volunteerService.deleteVolunteer(id);
    }

    @ResponseStatus(HttpStatus.OK)
    @PutMapping("/volunteers/{id}")
    public void updateVolunteer(@PathVariable("id") long id, @Valid @RequestBody VolunteerFullyDto volunteer){
        volunteerService.updateVolunteer(id, volunteer);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/volunteers/{id}")
    public VolunteerFullyDto getVolunteerById(@PathVariable("id") long id){
        return volunteerService.getVolunteerById(id);
    }

    @GetMapping("/volunteers")
    @ResponseStatus(HttpStatus.OK)
    public List<VolunteerFullyDto> getAllFullyVolunteers() {
        return volunteerService.getAllVolunteers();
    }
}
