package com.iteyes.mini.entity;

import com.iteyes.mini.request.SampleRequest;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@Table(name = "sample")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Sample {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "sample_string")
    private String sampleString;

    @Column(name = "sample_number")
    private Long sampleNumber;

    @Builder
    public Sample(String sampleString, Long sampleNumber) {
        this.sampleString = sampleString;
        this.sampleNumber = sampleNumber;
    }

    public static Sample from(SampleRequest sampleRequest) {
        return Sample.builder()
                .sampleString(sampleRequest.getSampleString())
                .sampleNumber(sampleRequest.getSampleNumber())
                .build();
    }
}
