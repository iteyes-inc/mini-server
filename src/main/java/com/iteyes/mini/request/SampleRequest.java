package com.iteyes.mini.request;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class SampleRequest {

    private String sampleString;

    private Long sampleNumber;

    @Builder
    public SampleRequest(String sampleString, Long sampleNumber) {
        this.sampleString = sampleString;
        this.sampleNumber = sampleNumber;
    }
}
