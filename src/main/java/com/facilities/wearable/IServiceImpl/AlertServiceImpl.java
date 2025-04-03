package com.facilities.wearable.IServiceImpl;

import com.facilities.wearable.IService.AlertService;
import com.facilities.wearable.constant.WearableServiceConstants;
import com.facilities.wearable.entity.Alert;
import com.facilities.wearable.repository.AlertRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class AlertServiceImpl implements AlertService {

//    private static final Logger log = LoggerFactory.getLogger(AlertServiceImpl.class);

    private final AlertRepository alertRepository;

    @Override
    public List<Alert> getAllAlerts() {
        log.info(WearableServiceConstants.METHOD_ENTRY);
        return alertRepository.findAll();
    }

    @Override
    public Alert saveAlerts(Alert alert) {
        log.info("Saving alert: {}", alert);
        return alertRepository.save(alert);
    }

}