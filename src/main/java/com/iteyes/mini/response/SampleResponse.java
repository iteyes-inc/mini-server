package com.iteyes.mini.response;

import com.iteyes.mini.entity.Sample;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class SampleResponse {

    private Long id;

    private String sampleString;

    private Long sampleNumber;

    @Builder
    public SampleResponse(Long id, String sampleString, Long sampleNumber) {
        this.id = id;
        this.sampleString = sampleString;
        this.sampleNumber = sampleNumber;
    }

    public static SampleResponse from(Sample sample) {
        return SampleResponse.builder()
                .id(sample.getId())
                .sampleString(sample.getSampleString())
                .sampleNumber(sample.getSampleNumber())
                .build();
    }
}
