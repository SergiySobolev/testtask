package com.inpowered.task.service.impl;

import com.inpowered.task.facade.data.RequestData;
import com.inpowered.task.service.PageInfoService;
import com.inpowered.task.service.info.PageInfo;
import com.inpowered.task.service.info.PageInfoBuilder;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class PageInfoServiceImpl implements PageInfoService {
    @Override
    public PageInfo getPageInfo(RequestData request) {
        //TODO get page by request url and parse necessary fields
        return new PageInfoBuilder()
                .setAuthor("Mock Author_" + new Random().nextInt())
                .setDescription("Mock Description_" + new Random().nextInt())
                .setPageTitle("Mock Page Tile_" + new Random().nextInt())
                .createPageInfo();
    }
}
