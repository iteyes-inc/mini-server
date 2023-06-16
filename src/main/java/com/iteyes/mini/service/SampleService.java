package com.iteyes.mini.service;

import com.iteyes.mini.entity.Sample;
import com.iteyes.mini.repository.SampleRepository;
import com.iteyes.mini.request.SampleRequest;
import com.iteyes.mini.response.SampleResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SampleService {

    private final SampleRepository sampleRepository;

    public Sample addSample(SampleRequest sampleRequest) {
        Sample sample = Sample.from(sampleRequest);
        return sampleRepository.save(sample);
    }

    public SampleResponse getSample(Long id) {
        Sample sample = sampleRepository.findById(id).orElseThrow(
                () -> new RuntimeException("데이터가 존재하지 않습니다."));
        return SampleResponse.from(sample);
    }
}
