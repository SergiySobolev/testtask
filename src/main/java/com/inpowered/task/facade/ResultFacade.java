package com.inpowered.task.facade;


import com.inpowered.task.facade.data.RequestData;
import com.inpowered.task.facade.data.ResultData;

import java.util.Optional;

public interface ResultFacade {
    Optional<ResultData> parseRequest(RequestData data);
    void parseRequestAsync(RequestData data);
    Optional<ResultData> findResultByUrl(String url);
}
