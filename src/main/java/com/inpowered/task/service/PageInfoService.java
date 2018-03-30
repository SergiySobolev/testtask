package com.inpowered.task.service;


import com.inpowered.task.facade.data.RequestData;
import com.inpowered.task.service.info.PageInfo;

public interface PageInfoService {
    PageInfo getPageInfo(RequestData request);
}
