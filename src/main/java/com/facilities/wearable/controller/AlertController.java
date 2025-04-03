package com.facilities.wearable.controller;

import com.facilities.wearable.IService.AlertService;
import com.facilities.wearable.constant.WearableServiceConstants;
import com.facilities.wearable.entity.Alert;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/alert")
//@RequiredArgsConstructor
@Slf4j
public class AlertController {

//    private static final Logger log = LoggerFactory.getLogger(AlertController.class);
    @Autowired
    private AlertService alertService;

    @Operation(summary = "Get all alerts", description = "Returns all alerts details")
    @GetMapping("/getAllAlerts")
    public ResponseEntity<List<Alert>> getAllAlerts(){
        log.info(WearableServiceConstants.METHOD_ENTRY);
        return ResponseEntity.ok(alertService.getAllAlerts());
    }

    @Operation(summary = "Save alert", description = "Saves the alert details")
    @PostMapping("/saveAlert")
    public Alert saveAlert(@RequestBody Alert alert) {
        return alertService.saveAlerts(alert);
    }
}
