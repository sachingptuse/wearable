package com.facilities.wearable.IService;

import com.facilities.wearable.entity.Alert;

import java.util.List;

public interface AlertService {
    List<Alert> getAllAlerts();
    Alert saveAlerts(Alert alert);
}
