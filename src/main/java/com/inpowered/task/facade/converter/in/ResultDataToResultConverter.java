package com.inpowered.task.facade.converter.in;

import com.inpowered.task.dao.model.Result;
import com.inpowered.task.facade.data.ResultData;

import java.util.function.Function;

public enum ResultDataToResultConverter implements Function<ResultData, Result> {
    INST;
    @Override
    public Result apply(ResultData data) {
        if(data == null) {
            return null;
        }
        Result result = new Result();
        result.setUrl(data.getUrl());
        result.setPageTitle(data.getPageTitle());
        result.setDescription(data.getDescription());
        result.setAuthor(data.getAuthor());
        result.setPolarity(data.getPolarity());
        result.setSubjectivity(data.getSubjectivity());
        result.setPolarityConfidence(data.getPolarityConfidence());
        result.setSubjectivityConfidence(data.getSubjectivityConfidence());
        result.setText(data.getText());
        return result;
    }
}
