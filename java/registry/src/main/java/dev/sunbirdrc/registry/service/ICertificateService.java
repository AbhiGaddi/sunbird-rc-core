package dev.sunbirdrc.registry.service;

import com.fasterxml.jackson.databind.JsonNode;

public interface ICertificateService {
    Object getPdf(JsonNode certificateData, String entityName);
}
