package com.rined.psr.portal.controller;

import com.rined.psr.portal.dto.brief.ShuttleBriefDto;
import com.rined.psr.portal.dto.fully.ShuttleDto;
import com.rined.psr.portal.services.ShuttleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class ShuttleController {
    private final ShuttleService shuttleService;

    @PostMapping("/shuttle")
    @ResponseStatus(HttpStatus.CREATED)
    public void addShuttle(@Valid @RequestBody ShuttleBriefDto brief) {
        shuttleService.addShuttle(brief);
    }

    @GetMapping("/shuttle")
    @ResponseStatus(HttpStatus.OK)
    public List<ShuttleDto> getAllShuttles() {
        return shuttleService.getAllShuttles();
    }

    @PutMapping("/shuttle/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void updateShuttle(@PathVariable("id") long id, @Valid @RequestBody ShuttleDto dto){
        shuttleService.updateShuttle(id, dto);
    }

    @GetMapping("/shuttle/{id}")
    public ShuttleDto getShuttleById(@PathVariable("id") long id){
        return shuttleService.getShuttleById(id);
    }

}
