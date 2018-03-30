package com.inpowered.task.controller;

import com.inpowered.task.facade.ResultFacade;
import com.inpowered.task.facade.data.RequestData;
import com.inpowered.task.facade.data.ResultData;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;
import java.util.Optional;

import static org.springframework.http.HttpStatus.NOT_FOUND;
import static org.springframework.http.HttpStatus.OK;
import static org.springframework.http.HttpStatus.SERVICE_UNAVAILABLE;
import static org.springframework.web.bind.annotation.RequestMethod.*;

@RestController
public class MainController {

    private final ResultFacade resultFacade;

    public MainController(ResultFacade resultFacade) {
        this.resultFacade = resultFacade;
    }

    @RequestMapping(value = "/result", method = GET)
    public Object getResult(@RequestParam String url) {
        Optional<ResultData> resultData = resultFacade.findResultByUrl(url);
        return resultData.map(r -> ResponseEntity.status(OK).body(r))
                .orElseGet(() -> ResponseEntity.status(NOT_FOUND).body(null));
    }

    @RequestMapping(value = "/request", method = POST)
    public Object parseRequest(@RequestBody RequestData requestData) {
        if(Objects.isNull(requestData.getCallbackUrl())) {
            resultFacade.parseRequestAsync(requestData);
            return ResponseEntity.status(OK).body(null);
        } else {
            Optional<ResultData> resultData = resultFacade.parseRequest(requestData);
            return resultData.map(r -> ResponseEntity.status(OK).body(r))
                    .orElseGet(() -> ResponseEntity.status(SERVICE_UNAVAILABLE).body(null));
        }
    }
}
