package com.inpowered.task.facade.converter.out;

import com.inpowered.task.dao.model.Result;
import com.inpowered.task.facade.data.ResultData;

import java.util.function.Function;

public enum ResultToResultDataConverter implements Function<Result, ResultData> {
    INST;
    @Override
    public ResultData apply(Result result) {
        if(result == null) {
            return null;
        }
        ResultData data = new ResultData();
        data.setUrl(result.getUrl());
        data.setPageTitle(result.getPageTitle());
        data.setDescription(result.getDescription());
        data.setAuthor(result.getAuthor());
        data.setPolarity(result.getPolarity());
        data.setSubjectivity(result.getSubjectivity());
        data.setPolarityConfidence(result.getPolarityConfidence());
        data.setSubjectivityConfidence(result.getSubjectivityConfidence());
        data.setText(result.getText());
        return data;
    }
}
